package varargs;

public class VarArgs2 {
    int[] numeros = {10, 20, 30};

    public void somar(int... numeros) {
        int resultado = 0;

        for(int numero : numeros) {
            resultado += numero;
        }

        System.out.println(resultado);
    }

    public static void main(String[] args) {
        VarArgs2 varArgs2 = new VarArgs2();
        VarArgs2 varArgs2_2 = new VarArgs2();
        
        varArgs2.somar(varArgs2.numeros);
        
        varArgs2_2.somar(varArgs2_2.numeros);
    }



}



// Use varargs quando você não sabe de antemão quantos argumentos serão passados para um método, mas todos eles são do mesmo tipo e você quer facilitar a vida de quem vai chamar esse método.

// Em vez de obrigar o programador a criar um array ou uma lista manualmente antes de chamar a função, você permite que ele passe os valores separados por vírgula.



// Quando EVITAR o uso:

// • Quando o método exige um número mínimo de argumentos: Se a regra exige pelo menos 1 ou 2 valores, o varargs sozinho permite que o método seja chamado vazio (somar()), o que pode gerar bugs se você não tratar isso. (Dica: se precisar de pelo menos um, declare somar(int primeiro, int... outros)).

// • Em código crítico de altíssima performance: Por baixo dos panos, o Java cria um novo array toda vez que o método com varargs é chamado. Em loops executados milhões de vezes por segundo, isso pode pesar na memória.

// • Quando você já tem uma coleção (List, Set): Se os dados já vêm de um banco de dados dentro de uma List, prefira r