package MaisDesafios.desafio19;

import java.util.List;
import java.util.Random;

public class desafio19 {
    public static void main(String[] args) {
        List<String> lista = List.of("banana", "abacaxi", "laranja", "uva", "melancia");

        int i = new Random().nextInt(lista.size());

        String frutaSorteada = lista.get(i);
        System.out.println("Fruta sorteada: " + frutaSorteada);
    }
}

// Em Java, existem dois métodos comuns na classe Random:

// random.nextDouble(): Funciona igual ao Math.random(), gerando um decimal de 0 a 1.

// random.nextInt(limite): Esquece os números quebrados e gera direto um número inteiro de 0 até o limite - 1.

// random.nextDouble(): Esse sim gera um número quebrado (decimal) entre 0.0 e 1.0. Para usá-lo com listas, você precisaria multiplicar pelo tamanho da lista e depois arredondar para baixo (truncar).

// random.nextInt(int bound): Esse método já foi criado especificamente para gerar diretamente um número inteiro, eliminando qualquer necessidade de arredondamento.