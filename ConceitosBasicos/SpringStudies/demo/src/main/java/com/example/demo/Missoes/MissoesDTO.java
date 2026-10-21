package com.example.demo.Missoes;

import jakarta.validation.constraints.NotBlank;

/**
 * Representação de uma missão para o cliente.
 *
 * Repare no que NÃO existe aqui: o campo "ninjas" da entidade MissoesModel.
 * Sem ele, quando o Jackson serializa ninja -> missoes, ele para. Sem recursão,
 * sem StackOverflowError, sem LazyInitializationException.
 *
 * O mesmo corte que fazemos no NinjaResponseDTO ("missoes" vira DTO, não entidade)
 * precisa ser feito aqui dentro: "ninjas" simplesmente não existe no DTO.
 */
public record MissoesDTO(

        Long id,

        @NotBlank(message = "Nome da missão é obrigatório")
        String nomeDaMissao,

        @NotBlank(message = "Dificuldade da missão é obrigatória")
        String dificuldadeMissao) {
}
