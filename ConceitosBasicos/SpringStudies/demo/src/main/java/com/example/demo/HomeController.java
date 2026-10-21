package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint de boas-vindas. Fica separado porque não pertence a nenhum recurso.
 */
@RestController
public class HomeController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Bem-vindo a pagina!";
    }
}
