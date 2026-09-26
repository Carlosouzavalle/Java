package interfacee.interfacesFuncionais;

import java.util.function.Supplier;

public class Suppliier {
    public static void main(String[] args) {
        Supplier<String> msg = () -> "Hi, Whazzup buddy!";
        System.out.println(msg.get());
    }
}

//  package. Its single abstract method is get(), which takes no arguments and returns a value of a specified type.

