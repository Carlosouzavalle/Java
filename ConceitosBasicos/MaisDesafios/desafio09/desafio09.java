package MaisDesafios.desafio09;
import java.util.Scanner;


public class desafio09 {
    

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para imprimir o valor da tabuada");
        int tableValue = scanner.nextInt();        

        for(int i = 1; i <= 10; i++) {
            System.out.println(tableValue + " x " + i + " = " + (tableValue * i));
        }

        System.out.println(tableValue);
    
    }



}
