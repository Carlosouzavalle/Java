package com.example.demo.Ninjas;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * O que o CLIENTE ENVIA (POST / PUT).
 *
 * Repare que NÃO existe campo "id": quem escolhe o id é o banco, não o cliente.
 * E a missão entra só como "missaoId" (um número), não como o objeto Missão inteiro.
 * Isso impede o cliente de mandar dados de uma missão que ele não deveria controlar.
 *
 * record = classe imutável: os campos são final e não há setters.
 * Os getters são os próprios métodos do record: dto.nome(), dto.email()...
 */
public record NinjaRequestDTO(

        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Email inválido")
        String email,

        // @Min valida o valor mínimo. Regra de negócio "precisa ter 16 anos" também
        // é checada no Service — validação de formato é do DTO, regra é do Service.
        @Min(value = 16, message = "Ninja deve ter ao menos 16 anos")
        int idade,

        Long missaoId) {
}
