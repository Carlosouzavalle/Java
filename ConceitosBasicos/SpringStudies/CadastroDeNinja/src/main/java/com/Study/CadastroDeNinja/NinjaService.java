package com.Study.CadastroDeNinja;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service 
public class NinjaService {

    private final List<Ninja> ninjas = new ArrayList<>();

    public NinjaService() {
        ninjas.add(new Ninja("Naruto", 17, "Genin"));
        ninjas.add(new Ninja("KaKashi", 35, "Jounin"));
    }

    public List<Ninja> listarNinjas() {
        return ninjas;
    }

    public Ninja buscarPorNome(String nome) {
        for(Ninja n : ninjas) {
            if(n.getNome().equalsIgnoreCase(nome)) {
                return n;
            }
        }
        return null;
    }


    public Ninja cadastrarNinja(Ninja ninja) {
        for(Ninja existenteNinja : ninjas) {
            if (existenteNinja.getNome().equalsIgnoreCase(ninja.getNome())) {
                throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Já existe um ninja com esse nome"
                );
            }
        }
        
        ninjas.add(ninja);
        return ninja;
    }

}
