package interfacee.interfacesFuncionais;

import java.util.function.Function;

public class Functioon {
    public static void main(String[] args) {
        Function<String, Integer> tamanho = texto -> texto.length();

        System.out.println(tamanho.apply("Java"));
    }
}

// apply() method. The java.util.function.Function<T, R> interface takes an input of type T and returns a result of type R