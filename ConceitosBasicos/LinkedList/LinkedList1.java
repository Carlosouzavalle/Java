package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList1 {
    public static void main(String[] args) {
        List<String> frutas = new LinkedList<>();
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");


        // System.out.println("Lista de frutas: " + frutas);
        // System.out.println("Elemento no indice 1: " + frutas.get(1));

        // 2\. Uso como Fila (Queue - Ordem FIFO: Primeiro a entrar, primeiro a sair)
        Queue<String> filaAtendimento = new LinkedList<>();
        filaAtendimento.add("Cliente A"); // 2
        filaAtendimento.add("Cliente B"); // 2
        filaAtendimento.add("Cliente C"); // 2
        filaAtendimento.add("Cliente D"); // 2
        filaAtendimento.add("Cliente E"); // 2
        filaAtendimento.add("Cliente F"); // 2
        filaAtendimento.add("Cliente G"); // 2



        String atendido = filaAtendimento.poll(); // Remove e retorna o primeiro ("Cliente A") [2]
        
        System.out.println("Atendido agora: " + atendido); 
        System.out.println("Fila restante: " + filaAtendimento);
    }
}
