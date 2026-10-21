package com.example.demo.exceptions;

import java.time.Instant;
import java.util.Map;

import org.springframework.http.HttpStatus;

/**
 * Formato padrão de erro da API.
 *
 * É um record (imutável) e uma classe que NÃO é entidade — é só o formato
 * da resposta de erro. Repare que ela fica num pacote separado das features.
 *
 * "campos" é usado só na validação de DTO (@Valid): mapeia "nome" -> "Nome é obrigatório".
 * Nos demais erros vem vazio.
 */
public record ErroResponse(
        Instant timestamp,
        int status,
        String erro,
        String mensagem,
        String caminho,
        Map<String, String> campos) {

    public static ErroResponse de(HttpStatus status, String mensagem, String caminho) {
        return new ErroResponse(Instant.now(), status.value(), status.getReasonPhrase(),
                mensagem, caminho, Map.of());
    }

    public static ErroResponse de(HttpStatus status, String mensagem, String caminho,
            Map<String, String> campos) {
        return new ErroResponse(Instant.now(), status.value(), status.getReasonPhrase(),
                mensagem, caminho, campos);
    }
}
