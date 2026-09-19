package sobrecargaDeMetodos;

public class Calcular {
    public static void somar(int a, int b) {
        System.out.println(a + b);
    }

    public  static void somar(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void somar(double a, double b) {
        System.out.println(a + b);
    }
}
