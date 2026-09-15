package POO.classes;

public class classes1 {
    String Nome;
    int Idade;
    public static void main(String[] args) {
        classes1 p1 = new classes1();
        p1.Nome = "Carlos";
        p1.Idade = 28;
        System.out.println("Nome: " + p1.Nome + ", Idade: " + p1.Idade);
    }
}


// classe sem construtor 

// quando você não cria nenhum construtor, o Java fornece automaticamente um construtor padrão sem argumentos 


// por baixo dos panos existe isso:

// public classes1() {
// }


//============================================
// Então qual é a desvantagem?

// A principal é que você permite criar um objeto sem obrigar que ele nasça em um estado válido.


// ex:
// classes1 p1 = new classes1();
// System.out.println(p1.Nome);
// System.out.println(p1.Idade);

// O resultado é nulo Ou seja, o objeto existe, mas seus dados ainda não foram configurados



//=================================================

//Outra desvantagem: validação

// classes1 p1 = new classes1();
// p1.Nome = "";
// p1.Idade = -500;

// O Java permite, porque não existe nenhuma regra impedindo isso.