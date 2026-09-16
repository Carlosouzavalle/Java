package DesafiosDIO;

import java.util.Scanner;


public class desafio5 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // type a value
        System.out.print("Type a value: ");
        int typeValue = scanner.nextInt();

        System.out.println("A tabuada de " + typeValue);

        for(int i = 1; i < 11; i++) 
        {
            System.out.println(typeValue + " x " + i + " = " + (typeValue * i));
        }


        // para fechar o scanner
        scanner.close();
    }
}


// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;