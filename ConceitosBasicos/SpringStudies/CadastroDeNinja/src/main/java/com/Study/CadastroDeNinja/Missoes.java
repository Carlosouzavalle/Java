package com.Study.CadastroDeNinja;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Missoes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String nome;
    private String dificuldade;


    @ManyToOne
    @JoinColumn(name = "ninja_id") // strangery key
    public Ninja ninja;


    public Missoes(){}


    // construtor
    public Missoes(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    // geters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }


    // seters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }



}
