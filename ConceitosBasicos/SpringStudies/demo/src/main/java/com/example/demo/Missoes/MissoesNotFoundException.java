package com.example.demo.Missoes;

/**
 * Erro de domínio: a missão pedida não existe.
 */
public class MissoesNotFoundException extends RuntimeException {

    public MissoesNotFoundException(String message) {
        super(message);
    }
}
