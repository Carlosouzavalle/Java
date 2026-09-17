package DesafiosDIO;

import java.util.Scanner;

public class desafio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // type the first number
        System.out.println("type the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("type the secondNumber");
        int secondNumber = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("type 'par' or 'impar': ");
        String choice = scanner.nextLine().trim();

        if ("par".equalsIgnoreCase(choice)) {
            if (firstNumber % 2 == 0) {
                System.out.println("numeros pares");
                for (int i = firstNumber; i >= 0; i -= 2) {
                    System.out.println(i);
                }
            }
        } else if ("impar".equalsIgnoreCase(choice)) {
            if (secondNumber % 2 != 0) {
                System.out.println("=".repeat(10));
                System.out.println("numeros impares");
                for (int i = secondNumber; i >= 0; i -= 2) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
