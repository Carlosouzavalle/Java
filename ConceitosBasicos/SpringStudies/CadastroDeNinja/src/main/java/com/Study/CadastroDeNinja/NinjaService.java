package com.Study.CadastroDeNinja;

import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import jakarta.persistence.Id;

@Service 
public class NinjaService {

//    private final List<Ninja> ninjas = new ArrayList<>();

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        //ninjas.add(new Ninja("Naruto", 17, "Genin"));
        //ninjas.add(new Ninja("KaKashi", 35, "Jounin"));
        this.ninjaRepository = ninjaRepository;
    }

    public Ninja listarNinjas(Long id) {
         return ninjaRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Ninja não encontrado"
            ));
    }

    public List<Ninja> listarNinjas() {
        return ninjaRepository.findAll();
    }


    public Ninja cadastrarNinja(Ninja ninja) {
        boolean nameExist = ninjaRepository.findAll()
            .stream()
            .anyMatch(n -> n.getNome().equalsIgnoreCase(ninja.getNome()));

        if(nameExist) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT, "Já existe um ninja com esse nome"
            );
        }

        return ninjaRepository.save(ninja);
    }

}


// O que mudou?
// - Removemos o ArrayList.
// - Removemos o construtor que adicionava Naruto e Kakashi manualmente.
// - O listarNinjas() agora busca os registros do banco.
// - O cadastrarNinja() usa save() para persistir o ninja.
// - Mantivemos a verificação de nomes duplicados e o erro HTTP 409.