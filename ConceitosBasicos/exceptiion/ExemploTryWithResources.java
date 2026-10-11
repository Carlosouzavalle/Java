package exceptiion;

import java.util.Scanner;

public class ExemploTryWithResources {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Sua idade é: " + idade);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}


// 3\. Gerenciamento Automático de Recursos (`try-with-resources`)

// Para objetos que implementam a interface `AutoCloseable` (como o `Scanner` ou manipuladores de arquivos), você pode declará-los entre parênteses logo após a palavra `try`[15][16]. O Java garante o fechamento automático desses recursos ao final do bloco, eliminando a necessidade de fechá-los manualmente no `finally`.