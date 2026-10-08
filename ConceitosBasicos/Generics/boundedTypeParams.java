package Generics;

import keywords.finall.finall;

public class boundedTypeParams<T extends Comparable<T>> {
    private final T value;
    public boundedTypeParams(T value) {
        this.value = value;
    }

    static class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}

    public T getValue() { return value; }

    public static void main(String[] args) {
        boundedTypeParams<Integer> intValue = new boundedTypeParams<Integer>(10);
        System.out.println("Value: " + intValue.getValue());

        boundedTypeParams<String> strValue = new boundedTypeParams<String>("Carlos");
        System.out.println("Value: " + strValue.getValue());
    
        // boundedTypeParams<Pessoa> pessoa = new boundedTypeParams<Pessoa>(new Pessoa("Carlos"));    erro
    
    }
}


// ### 4\. Parâmetros de Tipo Limitados (*Bounded Type Parameters*)

// Se você precisar restringir os tipos que a classe aceita, utiliza-se a palavra-chave `extends`:

// O Java vai reclamar porque Pessoa não implementa Comparable<Pessoa>.