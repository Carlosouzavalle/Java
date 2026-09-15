package POO.classes;

public class classe2 {
    String Nome;
    int Idade;


    public classe2(String nomePessoa, int idadePessoa) {
        this.Nome = nomePessoa;
        this.Idade = idadePessoa;
    }

    public static void main(String[] args) {
        classe2 p1 = new classe2("Carlos Eduardo", 28);
        System.out.println("Nome: " + p1.Nome + " Idade: " + p1.Idade);
    }


}


// Já aqui com o Construtor

// Agora você é obrigado a fornecer os dados:

// classe2 p1 = new classe2("Carlos Eduardo", 28);

// E não pode fazer:
// Pessoa p1 = new Pessoa();

//====================================================

// validação 

// public classes1(String nome, int idade) {

//     if (idade < 0) {
//         throw new IllegalArgumentException("Idade inválida");
//     }

//     this.Nome = nome;
//     this.Idade = idade;
// }

// classes1 p1 = new classes1("Carlos", 28);


//====================================================

// E tem um detalhe importante

// Mesmo com construtor, você ainda poderia fazer:

// Pessoa p = new Pessoa("Carlos", 28);
// p.idade = -500;


// Por isso o construtor não substitui encapsulamento.


// O ideal seria:


// private String nome;
// private int idade;


// e controlar as alterações através de métodos:


// public void setIdade(int idade) {
//     if (idade < 0) {
//         throw new IllegalArgumentException("Idade inválida");
//     }

//     this.idade = idade;
// }


// Construtor não é obrigatório. Ele é uma ferramenta para controlar como os objetos são criados e em qual estado eles começam.