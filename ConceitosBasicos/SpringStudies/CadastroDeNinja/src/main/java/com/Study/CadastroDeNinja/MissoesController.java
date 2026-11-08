package com.Study.CadastroDeNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController // Sem ele, o Spring não trata essa classe como Controller REST.
@RequestMapping("/missoes")
public class MissoesController {

    public final MissoesServices missoesServices;

    public MissoesController(MissoesServices missoesServices) {
        this.missoesServices = missoesServices;
    }

    @GetMapping
    public List<Missoes> lista_Missoes() {
        return missoesServices.lista_Missoes();
    }

   @PostMapping
    public Missoes cadastrar_Missoes(@RequestBody Missoes missoes) {
        return missoesServices.cadastrar_Missoes(missoes);
    }


    @PutMapping 
    public Missoes atualizar_missoes(@RequestBody Missoes missoes) {
        return missoesServices.atualiza_missoes(missoes);
    }

}


// Classe       → MissoesServices
// objeto       → missoesServices


// @PostUpdate não é a anotação para criar uma rota HTTP de atualização.
// No Service, você pode usar save() para atualizar, desde que o objeto tenha um id existente.


// @PutMapping utilizado para atualizar 