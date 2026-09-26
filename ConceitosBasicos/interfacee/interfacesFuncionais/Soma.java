package interfacee.interfacesFuncionais;

public class Soma {
    public static void main(String[] args) {

        Operacao soma = (a, b) -> a + b;
        Operacao subtracao = (a, b) -> a - b;
        Operacao multiplicacao = (a, b) -> a * b;


        System.out.println(soma.calcular(10, 5));
        System.out.println(subtracao.calcular(10, 5));
        System.out.println(multiplicacao.calcular(10, 5));
        soma.mostrarMensagem();
       
    }
}

// lambda expression is a way to implement a functional interface in Java. A functional interface is an interface that has only one abstract method. In this case, the `Operacao` interface has a single method `calcular(int a, int b)`, which takes two integers as parameters and returns an integer result.

// functional interfaces can also have another methods since it does not violate the single abstract method rule


// As quatro principais são:

// Predicate<T>: serve para fazer uma pergunta/teste.
// Consumer<T>: recebe um valor e não retorna nada.
// Function<T, R>: recebe um valor e retorna outro.
// Supplier<T>: não recebe nenhum valor, mas retorna um valor.