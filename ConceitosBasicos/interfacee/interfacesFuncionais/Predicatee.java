package interfacee.interfacesFuncionais;

import java.util.function.Predicate;

public class Predicatee {
    public static void main(String[] args) {
        
        Predicate<Integer> maiorDeIdade = idade -> idade >= 18;

        System.out.println(maiorDeIdade
            .test(20)
        );
        System.out.println(maiorDeIdade
            .test(15)
        );
    }
}

// o metodo test() da interface Predicate recebe um argumento e retorna um booleano, indicando se o argumento atende a condição definida no predicado. No exemplo acima, o predicado verifica se a idade é maior ou igual a 18, retornando true ou false conforme o caso.
