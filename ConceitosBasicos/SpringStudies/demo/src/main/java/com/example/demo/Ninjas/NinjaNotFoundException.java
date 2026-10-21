package com.example.demo.Ninjas;

/**
 * Exceção de domínio: o ninja pedido não existe.
 *
 * Herda de RuntimeException (unchecked) para não obrigar o chamador a usar try/catch.
 * O Controller vai converter isso em HTTP 404 na Etapa de tratamento de erros.
 */
public class NinjaNotFoundException extends RuntimeException {

    public NinjaNotFoundException(String message) {
        super(message);
    }
}
