package POO.classes.Metodos.dominio;

import POO.classes.Metodos.Calculadora;

public class calculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,2);
//        double result = calculadora.divideDoisNumeros(4,2);
//        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(4,2));

    }
}
