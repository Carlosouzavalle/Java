package com.Study.CadastroDeNinja;

// import para nossa list
import java.util.List;

// esse import vai nos ajudar a verificar o status code
import org.springframework.http.HttpStatus;

// imports do spring boot
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

// validação
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    // O Spring cria o NinjaService e o fornece ao controller pelo construtor. Esse
    // mecanismo é chamado de injeção de dependência.
    // Em vez de o controller criar seu próprio service usando new NinjaService(), o
    // Spring gerencia o objeto e o entrega ao controller.
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Como a gente cria uma rota?
    // é seguindo essa logica aqui
    @GetMapping
    public List<Ninja> listarNinjas() {
        return ninjaService.listarNinjas();
        // A diferença principal é o tipo de retorno: String representa texto, enquanto
        // Ninja representa um objeto da nossa classe.
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ninja cadastrarNinja(@Valid @RequestBody Ninja ninja)
    {
        return ninjaService.cadastrarNinja(ninja);
    }
}



// Action:
// Consider defining a bean of type 'com.Study.CadastroDeNinja.NinjaService' in
// your configuration.