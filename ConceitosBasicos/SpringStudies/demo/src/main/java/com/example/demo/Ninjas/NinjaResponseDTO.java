package com.example.demo.Ninjas;

import com.example.demo.Missoes.MissoesDTO;

/**
 * O que o CLIENTE RECEBE (GET / POST / PUT).
 *
 * Repare no campo "missoes": ele é um MissoesDTO, NÃO um MissoesModel.
 * E o MissoesDTO (abaixo) NÃO tem a lista de ninjas. Essa é a chave que corta o
 * ciclo ninja -> missoes -> ninjas -> ninja -> ...
 *
 * A entidade JAMAIS sai do Service. Ela é detalhe de persistência.
 */
public record NinjaResponseDTO(
        Long id,
        String nome,
        String email,
        int idade,
        MissoesDTO missoes) {
}
