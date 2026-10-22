package com.Study.CadastroDeNinja;

// import para nossa list
import java.util.ArrayList;
import java.util.List;

// imports do spring boot
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    // passar a lista como atributo da classe evita vc ter que repassar a lista dentro
    // do outro medoto
    // Aqui, final impede que o atributo ninjas passe a apontar para outra lista, mas não impede que adicionemos ou removamos elementos da lista atual.
    private final List<Ninja> ninjas = new ArrayList<>();


    public NinjaController() {
        ninjas.add(new Ninja("Naruto", 17, "Genin"));
        ninjas.add(new Ninja("KaKashi", 35, "Jounin"));
    }

    // Como a gente cria uma rota?
    // é seguindo essa logica aqui
    @GetMapping("/ninjas")
    public List<Ninja> mostrarNinjas() {

        return ninjas;

        // A diferença principal é o tipo de retorno: String representa texto, enquanto
        // Ninja representa um objeto da nossa classe.
    }

    @GetMapping("/ninjas/buscar")
    public Ninja buscarNinja(@RequestParam String nome) {
        for (Ninja ninja : ninjas) {
            if (ninja.getNome().equalsIgnoreCase(nome)) {
                return ninja;
            }
        }

        return null;
    }





    @GetMapping("aldeias")
    public String mostrarAldeias() {
        return "Lista de aldeias";
    }
}
