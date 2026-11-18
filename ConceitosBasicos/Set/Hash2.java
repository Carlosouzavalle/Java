package Set;

import java.util.HashSet;

public class Hash2 {

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();


        nomes.add("Carlos");
        nomes.add("Patricia");
        nomes.add("Bia");
        nomes.add("Fernanda");
        nomes.add("Carlos");


        // boolean add = nomes.add("Katia");
        // System.out.println(add);
        // System.out.println(nomes);
        // boolean add2 = nomes.add("Katia");
        // System.out.println(add2);

        // System.out.println(nomes.contains("Carlos"));
        // System.out.println(nomes.contains("Pedro"));
        // nomes.remove("Bia");
        // System.out.println(nomes);


        // System.out.println(nomes.size());

        // System.out.println(nomes.isEmpty());


        // for(String nome : nomes) {
        //     System.out.println(nome);
        // }


        // utilizando lambda tbm funciona
        // nomes.forEach(nome -> System.out.println(nome));


        // assim também funciona
        nomes.forEach(System.out::println);
    }
}


// O add ele nos retorna um boolean
// não aceita duplica
// ordem 
// contains: verifica se um elemento especifico existe lá dentro
// remove: remove um elemento do hashset
// size: quantidade de elementos
// isEmpty: verifica se esta vazio e retorna um boolean