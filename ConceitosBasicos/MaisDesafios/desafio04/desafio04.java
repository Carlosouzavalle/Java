package MaisDesafios.desafio04;

public class desafio04 {
    public static void main(String[] args) {
        String valor  = "Exercicio de Java";
        // se tem espaços
        System.out.println(valor.contains(" "));
        // se tem numeros
        System.out.println(valor.matches(".*\\d.*"));
        // se é alfabetico
        System.out.println(valor.matches(".[A-Za-z]+"));
        // se esta em maiusculo
        System.out.println(valor.equals(valor.toUpperCase()));
        // se esta em minusculo
        System.out.println(valor.equals(valor.toLowerCase()));
    }
}
