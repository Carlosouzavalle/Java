package DesafiosDIO;
import java.util.Scanner;



public class desafio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // type your height
        System.out.println("Type your height: ");
        double height = scanner.nextDouble();
        System.out.println("type your weight: ");
        // type your weight
        double weight = scanner.nextDouble();

        
        double IMC = weight / (height * height);

        System.out.printf("%.2f\n", IMC);

        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else if (IMC >= 40.0) {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}


// Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

//     Se for menor ou igual a 18,5 "Abaixo do peso";
//     se for entre 18,6 e 24,9 "Peso ideal";
//     Se for entre 25,0 e 29,9 "Levemente acima do peso";
//     Se for entre 30,0 e 34,9 "Obesidade Grau I";
//     Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//     Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
