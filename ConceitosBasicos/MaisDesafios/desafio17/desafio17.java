package MaisDesafios.desafio17;

public class desafio17 {
    public static void main(String[] args) {
        double catetoOposto = 3;
        double catetoAdjacente = 4;
        double hipotenusa = Math.sqrt(
            Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2)
        );

        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}
