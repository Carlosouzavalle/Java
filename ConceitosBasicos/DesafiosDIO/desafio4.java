// package DesafiosDIO;

// public class desafio4 {
    
    


//     public static void main(String[] args) {
//         String nome1 = "Leticia";
//         int idade = 10;


//         String nome2 = "Jenifer";
//         int idade2 = 30;

//         int diferencaIdade = idade - idade2;
    
//         if(diferencaIdade < 0) {
//             diferencaIdade = idade2 - idade;
//         }


//         System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + diferencaIdade + " anos de idade");
    
//     }
// }


// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas




// logica da IA
package DesafiosDIO;

public class desafio4 {

    public static void main(String[] args) {
        String nome1 = "Leticia";
        int idade1 = 10;

        String nome2 = "Jenifer";
        int idade2 = 30;

        int diferencaIdade = Math.abs(idade1 - idade2);

        System.out.println(
            "A diferença de idade entre " + nome1 +
            " e " + nome2 +
            " é: " + diferencaIdade + " anos de idade"
        );
    }
}


// O que Math.abs() faz?

// Ou seja, ele transforma o número em seu valor positivo.

// Seu código original demonstra mais lógica de programação porque você pensou no problema e resolveu com if. A versão com Math.abs() é apenas uma forma mais idiomática e curta de fazer a mesma coisa.

// Nota: 9/10. A lógica está certa; só vale melhorar os nomes idade/idade2 para idade1/idade2, porque fica mais claro que são duas pessoas diferentes.