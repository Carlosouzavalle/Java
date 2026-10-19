package com.example.demo.Missoes;

import java.util.List;

import com.example.demo.Ninjas.NinjaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String dificuldadeMissao;
    // private NinjaModel ninja;
    
    // uma missão pode ter varios ninjas
    @OneToMany (mappedBy = "missoes")
    
    private List<NinjaModel> ninjas;

}
