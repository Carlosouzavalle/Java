package com.example.demo.Missoes;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mesmo padrão da NinjaService: a entidade não sai daqui, e o DTO é a
 * fronteira com o exterior.
 */
@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesDTO> listarTodos() {
        return MissoesMapper.toDTOList(missoesRepository.findAll());
    }

    public MissoesDTO buscarPorId(Long id) {
        return MissoesMapper.toDTO(buscarPorIdOuFalhar(id));
    }

    @Transactional
    public MissoesDTO salvar(MissoesDTO dto) {
        validar(dto);
        return MissoesMapper.toDTO(missoesRepository.save(MissoesMapper.toModel(dto)));
    }

    @Transactional
    public MissoesDTO atualizar(Long id, MissoesDTO dto) {
        MissoesModel existente = buscarPorIdOuFalhar(id);
        validar(dto);
        existente.setNomeDaMissao(dto.nomeDaMissao());
        existente.setDificuldadeMissao(dto.dificuldadeMissao());
        return MissoesMapper.toDTO(missoesRepository.save(existente));
    }

    @Transactional
    public void deletar(Long id) {
        buscarPorIdOuFalhar(id);
        missoesRepository.deleteById(id);
    }

    private MissoesModel buscarPorIdOuFalhar(Long id) {
        return missoesRepository.findById(id)
                .orElseThrow(() -> new MissoesNotFoundException(
                        "Missão com id " + id + " não encontrada"));
    }

    private void validar(MissoesDTO dto) {
        if (dto.nomeDaMissao() == null || dto.nomeDaMissao().isBlank()) {
            throw new IllegalArgumentException("Nome da missão é obrigatório");
        }
        if (dto.dificuldadeMissao() == null || dto.dificuldadeMissao().isBlank()) {
            throw new IllegalArgumentException("Dificuldade da missão é obrigatória");
        }
    }
}
