package com.Study.CadastroDeNinja;

public class Ninja {
    private String nome;
    private int idade;
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
