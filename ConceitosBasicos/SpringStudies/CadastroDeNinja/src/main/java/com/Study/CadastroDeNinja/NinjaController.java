package com.Study.CadastroDeNinja;

// import para nossa list
import java.util.List;

// imports do spring boot
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    // antigo
    // passar a lista como atributo da classe evita vc ter que repassar a lista
    // dentro
    // do outro medoto
    // Aqui, final impede que o atributo ninjas passe a apontar para outra lista,
    // mas não impede que adicionemos ou removamos elementos da lista atual.

    // novo
    // a lista foi passada em um arquivo separado e só estamos usando ele aqui com
    // os dados que temos lá
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
    @GetMapping("/ninjas")
    public List<Ninja> mostrarNinjas() {
        return ninjaService.listarNinjas();
        // A diferença principal é o tipo de retorno: String representa texto, enquanto
        // Ninja representa um objeto da nossa classe.
    }

    @GetMapping("/ninjas/buscar")
    public Ninja buscarNinja(@RequestParam String nome) {
        Ninja ninja = ninjaService.buscarPorNome(nome);

        if (ninja == null) {
            throw new RuntimeException("Ninja não encontrado");
        }

        return ninja;
    }
}

// Action:

// Consider defining a bean of type 'com.Study.CadastroDeNinja.NinjaService' in
// your configuration.