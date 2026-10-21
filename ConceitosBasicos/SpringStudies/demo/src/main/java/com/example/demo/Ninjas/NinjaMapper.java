package com.example.demo.Ninjas;

import java.util.List;

import com.example.demo.Missoes.MissoesDTO;
import com.example.demo.Missoes.MissoesModel;

/**
 * Tradutor entre a entidade (JPA) e o DTO (API).
 *
 * Existe para isso: a entidade carrega detalhes de persistência que a API não
 * deve expor (a lista de ninjas dentro de uma missão, por exemplo), e a API
 * recebe dados que a entidade não tem (um missaoId solto).
 *
 * Métodos estáticos numa classe utilitária: não precisa de @Component,
 * não precisa de injeção. (Em projetos maiores se usa MapStruct, que gera
 * esse código por annotation processing — mesma ideia, zero boilerplate.)
 */
public final class NinjaMapper {

    // Impede a instanciação: é uma classe só de métodos estáticos.
    private NinjaMapper() {
    }

    /**
     * Entidade -> DTO de resposta.
     * É aqui que a entidade "vira" JSON sem vazar a lista de ninjas da missão.
     */
    public static NinjaResponseDTO toResponseDTO(NinjaModel model) {
        if (model == null) {
            return null;
        }
        return new NinjaResponseDTO(
                model.getId(),
                model.getNome(),
                model.getEmail(),
                model.getIdade(),
                toMissoesDTO(model.getMissoes()));
    }

    public static List<NinjaResponseDTO> toResponseDTOList(List<NinjaModel> models) {
        return models.stream()
                .map(NinjaMapper::toResponseDTO)
                .toList();
    }

    /**
     * DTO de request -> Entidade.
     * Repare que a missão NÃO é setada aqui: o Service resolve o missaoId
     * numa entidade MissoesModel válida e atribui depois.
     */
    public static NinjaModel toModel(NinjaRequestDTO dto) {
        NinjaModel model = new NinjaModel();
        model.setNome(dto.nome());
        model.setEmail(dto.email());
        model.setIdade(dto.idade());
        return model;
    }

    private static MissoesDTO toMissoesDTO(MissoesModel model) {
        if (model == null) {
            return null;
        }
        return new MissoesDTO(
                model.getId(),
                model.getNomeDaMissao(),
                model.getDificuldadeMissao());
    }
}
