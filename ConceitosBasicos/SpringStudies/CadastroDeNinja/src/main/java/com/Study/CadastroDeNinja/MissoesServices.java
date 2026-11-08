package com.Study.CadastroDeNinja;

import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class MissoesServices {

    private final MissoesRepository missoesRepository;

    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // responsavel pela lista de missoes
    public List<Missoes> lista_Missoes() {
        return missoesRepository.findAll();
    }


    // responsavel por cadastrar missoes
    public Missoes cadastrar_Missoes(Missoes missoes) {
        return missoesRepository.save(missoes);
    }

    // responsavel por atualizar missoes
    public Missoes atualiza_missoes(Missoes missoes) {
        return missoesRepository.save(missoes);
    }

}
