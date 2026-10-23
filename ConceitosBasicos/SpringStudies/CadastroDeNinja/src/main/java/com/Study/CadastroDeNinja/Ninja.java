package com.Study.CadastroDeNinja;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Ninja {

    @NotBlank(message = "O nome do ninja é obrigatório")
    private String nome;
    @Min(value = 1, message = "A idade deve ser maior que zero")
    private int idade;
    @NotBlank(message = "O rank do ninja é obrigatório")
    private String rank;


    public Ninja(String nome, int idade, String rank) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRank() 
    {
        return rank;
    }



}
