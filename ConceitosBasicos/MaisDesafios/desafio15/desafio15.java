package MaisDesafios.desafio15;

import java.util.Scanner;

public class desafio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Digitar a qtd de km
        System.out.println("Digite a quantidade de km percorrido: ");
        double kmPercorrido = scanner.nextDouble();

        // Digitar a qtd de dias
        System.out.print("Digite a quantidade de dias que o carro foi alugado: ");
        int diasAlugado = scanner.nextInt();

        //preço do alugel do carro por dia
        double precoAlugelPorDia = 60;

        // preço do alugel do carro por km
        double precoAlugelPorKm = 0.15;

        double precoTotal = (diasAlugado * precoAlugelPorDia) 
        + (kmPercorrido * precoAlugelPorKm);

        System.out.println("O preço total do alugel do carro é: " + precoTotal);

    }

}


// int * double funciona o que acontence é uma conversão do int para o double por baixo dos panos, agora o inverso não funciona porque você pode perder informações por exxemplo se você tiver um valor de 3.5 você perde a parte decimal e não queremos isso
//  logo temos que fazer uma conversão explicita para o double (double) int variavel = 3.5 agora sim vai funcionar 