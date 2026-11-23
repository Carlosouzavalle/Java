package varargs;

public class varargss {
    public static void somar(int... numeros) {
        int resultado = 0;

        for(int numero : numeros) {
            resultado += numero;
        }

        System.out.println(resultado);
    }



    public static void main(String[] args) {
        somar(10,20);
        somar(10,20,40);
    }
}
