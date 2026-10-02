package DesafiosDIO.desafio9;

public class CalcularTributos implements TributosProdutos {

    @Override
    public float alimentos(float produto) {
        float tributo = 0.01f;

        CalculoTributo calculo = (p, t) -> p * t;

        return calculo.calcular(produto, tributo);
    }

    @Override
    public float vestuario(float produto) {
        float tributo = 0.025f;

        CalculoTributo calculo = (p, t) -> p * t;

        return calculo.calcular(produto, tributo);
    }

    @Override
    public float saudeEBemEstar(float produto) {
        float tributo = 0.015f;

        CalculoTributo calculo = (p, t) -> p * t;

        return calculo.calcular(produto, tributo);
    }

    @Override
    public float cultura(float produto) {
        float tributo = 0.04f;

        CalculoTributo calculo = (p, t) -> p * t;

        return calculo.calcular(produto, tributo);
    }

    public static void main(String[] args) {
        CalcularTributos tributos = new CalcularTributos();

        System.out.printf("%.2f%n", tributos.alimentos(80));
        System.out.printf("%.2f%n", tributos.vestuario(80));
        System.out.printf("%.2f%n", tributos.saudeEBemEstar(80));
        System.out.printf("%.2f%n", tributos.cultura(80));
    }
}