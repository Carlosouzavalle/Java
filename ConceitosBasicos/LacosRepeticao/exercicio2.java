package LacosRepeticao;

public class exercicio2 {
    public static void main(String[] args) {
        double valorCarro = 50000.0;


        for (int parcela = 1; parcela <= 24; parcela++) {
       
                double valorParcela = valorCarro / parcela;

                if (valorParcela < 1000) {
                    break;
                }

                // System.out.printf("Parcela %dx: R$ %.2f%n", parcela, valorParcela);
                System.out.println("Parcela " + parcela + "x: R$ " + Math.round(valorParcela));
   
        }

    }
}
