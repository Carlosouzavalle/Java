package com.Study.CadastroDeNinja;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Ninja {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do ninja é obrigatório")
    private String nome;
    @Min(value = 1, message = "A idade deve ser maior que zero")
    private int idade;
    @NotBlank(message = "O rank do ninja é obrigatório")
    private String rank;

    // Esse construtor vazio é necessário para o JPA instanciar a entidade.
    public Ninja() {

    }

    public Ninja(String nome, int idade, String rank) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
    }

    public Long getId() {
        return id;
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



// @Entity	Informa que a classe representa uma entidade persistida no banco.
// @Id	Define qual campo será a identificação única do registro.
// @GeneratedValue	Permite que o banco gere o identificador automaticamente.
// GenerationType.IDENTITY	Usa a estratégia de geração de ID suportada pelo banco.
// Long id	Armazena o identificador do ninja.
// Ninja()	Construtor vazio que permite ao JPA criar objetos durante a leitura do banco.