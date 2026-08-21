package EstruturasCondicionais;

public class Aula4EstruturasCondicionais {
    public static void main(String[] args) {
        // if , else if , else

        
        double isSalario = 17000.00;
        double isGastos = 17000.00;
        if(isSalario > isGastos) {
            System.out.println("Você gastou: " + isGastos + "R$" + " e seu salário é: " + isSalario + "R$ " + ". Você está no azul!");
        } else if(isSalario < isGastos) {
            System.out.println("CUIDADO! você gastou: " + isGastos + "R$" + " e seu salário é: " + isSalario + "R$ " + ". Você está no vermelho!");
        } else {
            System.out.println("Você gastou: " + isGastos + "R$" + " e seu salário é: " + isSalario + "R$ " + ". Você está sem grana!");
        }

        /* 
            Utilizamos apenas os operadores de comparação para fazer comparações entre valores, como por exemplo: >, <, >=, <=, ==, !=
            E utilizamos os operadores lógicos para fazer comparações entre expressões booleanas, como por exemplo: &&, ||, !
        */
 

    }
}
