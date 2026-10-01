package HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import  java.util.Arrays;

public class ExemploHashSet {

    
        public static void main(String[] args) {
            // 1\. Criando um HashSet de Strings
        Set<String> linguagens = new HashSet<>();

        // 2\. Adicionando elementos com add()
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");

        // Tentativa de adicionar elemento duplicado (retorna false e é ignorado)
        boolean jaTem = linguagens.add("Java");
        System.out.println("Conteudo do HashSet: " + linguagens);
        System.out.println("'Java'foi adicionado? " + jaTem);

        // 3\. Verificação de presença com contains() - Busca O(1)
        if(linguagens.contains("Python")) {
            System.out.println("Contem a linguagem");
        }

        // 4\. Removendo um elemento com remove()
        linguagens.remove("C++");
        System.out.println("Removeu C++: " + linguagens);

        // 5\. Aplicação prática: Eliminando duplicatas de uma lista
        List<String> frutasDuplicadas = Arrays.asList("Maçã", "Banana", "Maçã", "Laranja", "Banana");
        Set<String> frutasUnicas = new HashSet<>(frutasDuplicadas);


        System.out.println("Frutas duplicadas: " +frutasDuplicadas);
        System.out.println("Frutas Unicas: " + frutasUnicas);
    }
}
