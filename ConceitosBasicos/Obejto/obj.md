1. O que é um objeto?

A ideia básica é:

Classe = molde

Objeto = algo criado a partir desse molde

Por exemplo, podemos criar uma classe Pessoa:

public class Pessoa {
    String nome;
    int idade;
}

Essa classe define que uma Pessoa possui:

nome
idade

Agora podemos criar objetos:

Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();

Temos duas pessoas diferentes, criadas a partir da mesma classe.

==========================================================================

2. Atribuindo valores

Podemos fazer:

pessoa1.nome = "Carlos";
pessoa1.idade = 27;


pessoa2.nome = "Maria";
pessoa2.idade = 25;

Agora:

pessoa1
 ├── nome → Carlos
 └── idade → 27


pessoa2
 ├── nome → Maria
 └── idade → 25

E podemos acessar:

System.out.println(pessoa1.nome);
System.out.println(pessoa1.idade);

Resultado:

Carlos
27

=========================================================================

3. Criando métodos

Uma classe também pode ter comportamentos.

public class Pessoa {


    String nome;
    int idade;


    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

Agora:


