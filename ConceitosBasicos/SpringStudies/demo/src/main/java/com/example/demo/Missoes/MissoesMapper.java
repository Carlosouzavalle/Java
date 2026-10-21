package com.example.demo.Missoes;

import java.util.List;

/**
 * Tradutor entre MissoesModel (entidade) e MissoesDTO (API).
 */
public final class MissoesMapper {

    private MissoesMapper() {
    }

    public static MissoesDTO toDTO(MissoesModel model) {
        if (model == null) {
            return null;
        }
        // Repare no que NÃO é copiado: a lista "ninjas". Ela não existe no DTO
        // justamente para o Jackson não seguir o ciclo de volta.
        return new MissoesDTO(
                model.getId(),
                model.getNomeDaMissao(),
                model.getDificuldadeMissao());
    }

    public static List<MissoesDTO> toDTOList(List<MissoesModel> models) {
        return models.stream()
                .map(MissoesMapper::toDTO)
                .toList();
    }

    public static MissoesModel toModel(MissoesDTO dto) {
        MissoesModel model = new MissoesModel();
        model.setNomeDaMissao(dto.nomeDaMissao());
        model.setDificuldadeMissao(dto.dificuldadeMissao());
        return model;
    }
}
