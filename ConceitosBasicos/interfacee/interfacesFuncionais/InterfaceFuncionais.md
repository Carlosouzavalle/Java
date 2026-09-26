1. O que é uma interface funcional?
É uma interface que possui exatamente um método abstrato.

A anotação: @FunctionalInterface não é obrigatória, mas é recomendada. Ela faz o compilador verificar se sua interface realmente possui apenas um método abstrato.


2. Antes das interfaces funcionais
Sem lambda, você poderia implementar assim:


public class Soma implements Operacao {

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}

E usar:

public class Main {
    public static void main(String[] args) {

        Operacao operacao = new Soma();

        System.out.println(operacao.calcular(10, 5));
    }
}



lambda expression is a way to implement a functional interface in Java. A functional interface is an interface that has only one abstract method. In this case, the `Operacao` interface has a single method `calcular(int a, int b)`, which takes two integers as parameters and returns an integer result.

functional interfaces can also have another methods since it does not violate the single abstract method rule


As quatro principais são:

Predicate<T>: serve para fazer uma pergunta/teste.
Consumer<T>: recebe um valor e não retorna nada.
Function<T, R>: recebe um valor e retorna outro.
Supplier<T>: não recebe nenhum valor, mas retorna um valor.