package MaisDesafios.desafio12;

public class desafio12 {
    public static void main(String[] args) {
        double precoProduto = 100.0;
        double desconto = 0.05;
        double precoComDesconto = precoProduto * (1 - desconto);
        System.out.println("O Preço do produto com desconto é: " + precoComDesconto);
    }
}
