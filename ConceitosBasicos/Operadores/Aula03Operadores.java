package Operadores;

public class Aula03Operadores {
    public static void main(String[] args) {
        // int n1 = 10;
        // int n2 = 20;
        // System.out.println(n1 + n2);
        // System.out.println(n1 - n2);
        // System.out.println(n1 * n2);
        // System.out.println(n1 / n2);
    

        // int resto = 21 % 2;
        // System.out.println(resto);
    
        // Operadores logicos
        // < > maior e menor
        // == igual
        // != diferente
        // && and
        // || or


        // boolean isDezMaiorQueVinte = 10 > 20;
        // boolean isDezMenorQueVinte = 10 < 20;
        // boolean isDezIgualAVinte = 10 == 20;
        // boolean isDezDiferenteDeVinte = 10 != 20;

        // System.out.println(isDezMaiorQueVinte);
        // System.out.println(isDezMenorQueVinte);
        // System.out.println(isDezIgualAVinte);
        // System.out.println(isDezDiferenteDeVinte);


        // no java tem um padrão de nomeclatura chamado camelCase, onde a primeira palavra é toda em minúsculo e as demais palavras começam com letra maiúscula. Exemplo: isDezMaiorQueVinte

        // int idade = 87;
        // String mensagem = idade >= 18 && idade < 55 ? "Você é maior de idade" : "Você é menor de idade";
        // mensagem = idade >= 55 ? "Você é idoso" : mensagem;
        // System.out.println(mensagem + " - " + idade + " anos");

        // int idade = 87;
        // if (idade >= 18 && idade < 55) {
        //     System.out.println("Você é maior de idade");
        // } else if (idade >= 55) {
        //     System.out.println("Você é idoso");
        // } else {
        //     System.out.println("Você é menor de idade");
        // }

        // Operadores de incremento e decremento
        // ++n1; // incrementa 1
        // --n1; // decrementa 1

        int n1 = 10;
        int n2 = 20;
        System.out.println(n1++); // incrementa 1 depois de imprimir
        System.out.println(n1); // imprime 11
        System.out.println(++n2); // incrementa 1 antes de imprimir 
        System.out.println(--n2); // decrementa 1 antes de imprimir
        System.out.println(n2--); // decrementa 1 depois de imprimir
        System.out.println(n2); // imprime 19
    }   
}
