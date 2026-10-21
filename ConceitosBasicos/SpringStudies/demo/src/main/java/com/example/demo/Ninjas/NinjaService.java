package com.example.demo.Ninjas;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Missoes.MissoesNotFoundException;
import com.example.demo.Missoes.MissoesRepository;
import com.example.demo.Missoes.MissoesModel;

/**
 * Camada de negócio. É a única que sabe:
 *   - quais regras valem para um ninja
 *   - que "não encontrado" é um erro de domínio (NinjaNotFoundException)
 *
 * O Controller não fala com o Repository diretamente: ele pede pro Service.
 *
 * REGRA DE OURO: a entidade (NinjaModel) NÃO SAI daqui. O Service devolve DTO.
 * O Controller converte DTO <-> JSON. Ninguém fora do Service toca em entidade.
 */
@Service // = @Component com esterêotipo de "camada de negócio"
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final MissoesRepository missoesRepository;

    /**
     * O Spring injeta o NinjaRepository aqui automaticamente.
     * Não precisa de @Autowired: com um único construtor, o Spring usa ele
     * (regra do Spring 4.3+). Older style seria: @Autowired no parâmetro.
     */
    public NinjaService(NinjaRepository ninjaRepository, MissoesRepository missoesRepository) {
        this.ninjaRepository = ninjaRepository;
        this.missoesRepository = missoesRepository;
    }

    // ---------- LEITURA ----------

    public List<NinjaResponseDTO> listarTodos() {
        return NinjaMapper.toResponseDTOList(ninjaRepository.findAll());
    }

    public NinjaResponseDTO buscarPorId(Long id) {
        return NinjaMapper.toResponseDTO(buscarPorIdOuFalhar(id));
    }

    /**
     * Método INTERNO: devolve a entidade, porque aqui dentro ainda estamos
     * no mundo da persistência. Quem chama de fora recebe DTO.
     */
    private NinjaModel buscarPorIdOuFalhar(Long id) {
        return ninjaRepository.findById(id)
                .orElseThrow(() -> new NinjaNotFoundException(
                        "Ninja com id " + id + " não encontrado"));
    }

    // ---------- ESCRITA ----------

    @Transactional
    public NinjaResponseDTO salvar(NinjaRequestDTO dto) {
        NinjaModel model = NinjaMapper.toModel(dto);
        model.setMissoes(resolverMissao(dto.missaoId()));
        validar(dto, null);
        return NinjaMapper.toResponseDTO(ninjaRepository.save(model));
    }

    /**
     * @Transactional: faz o "buscar + alterar + salvar" virar UMA operação atômica.
     * Se o save falhar no meio, o banco volta ao estado anterior (rollback).
     */
    @Transactional
    public NinjaResponseDTO atualizar(Long id, NinjaRequestDTO dto) {
        NinjaModel existente = buscarPorIdOuFalhar(id);
        validar(dto, id);
        existente.setNome(dto.nome());
        existente.setEmail(dto.email());
        existente.setIdade(dto.idade());
        existente.setMissoes(resolverMissao(dto.missaoId()));
        // 'save' decide entre INSERT ou UPDATE pelo id: se o id existe, é UPDATE.
        return NinjaMapper.toResponseDTO(ninjaRepository.save(existente));
    }

    @Transactional
    public void deletar(Long id) {
        // Garante 404 em vez de "delete silencioso" caso o id não exista.
        buscarPorIdOuFalhar(id);
        ninjaRepository.deleteById(id);
    }

    // ---------- REGRAS DE NEGÓCIO ----------

    /**
     * Converte o missaoId que o cliente mandou numa entidade MissoesModel real.
     * Se o id não existir, é erro — não podemos criar uma missão "órfã" na FK.
     */
    private MissoesModel resolverMissao(Long missaoId) {
        if (missaoId == null) {
            return null;
        }
        return missoesRepository.findById(missaoId)
                .orElseThrow(() -> new MissoesNotFoundException(
                        "Missão com id " + missaoId + " não encontrada"));
    }

    /**
     * Regras de negócio — e NÃO validação de formato.
     *
     * Validação de formato (email tem @, nome não é vazio) é do DTO (@NotBlank/@Email).
     * Regras de negócio (email único, idade mínima) são daqui do Service.
     *
     * As duas camadas se repetem de propósito: o DTO falha rápido com mensagem
     * por campo (vira 400 automático), e o Service garante a invariante do
     * domínio independente de QUEM chamou (API, teste, job agendado...).
     */
    private void validar(NinjaRequestDTO dto, Long idIgnorado) {
        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new IllegalArgumentException("Nome do ninja é obrigatório");
        }
        if (dto.email() == null || dto.email().isBlank()) {
            throw new IllegalArgumentException("Email do ninja é obrigatório");
        }

        // REGRA DE NEGÓCIO: email é único.
        // No update (idIgnorado != null) ignoramos o próprio registro, senão
        // ele colidiria consigo mesmo.
        boolean emailEmUso = (idIgnorado == null)
                ? ninjaRepository.existsByEmail(dto.email())
                : ninjaRepository.existsByEmailAndIdNot(dto.email(), idIgnorado);
        if (emailEmUso) {
            throw new IllegalArgumentException("Já existe um ninja com o email " + dto.email());
        }

        // REGRA DE NEGÓCIO: idade mínima para ser ninja.
        if (dto.idade() < 16) {
            throw new IllegalArgumentException("Ninja deve ter pelo menos 16 anos");
        }
    }
}
