package interfacee.interfacesFuncionais;

import java.util.function.Consumer;

public class Consumeer {
    public static void main(String[] args) {
        Consumer<String> imprimir = nome -> System.out.println(nome);

        imprimir.accept("Carlos");
    }

}
