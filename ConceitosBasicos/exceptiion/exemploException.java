package exceptiion;
import java.util.InputMismatchException;
import java.util.Scanner;


public class exemploException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o numerador: ");
            int numerador = sc.nextInt(); // pode lançar uma InputMismatchException

            System.out.println("Digite o denominador: ");
            int denominador = sc.nextInt(); // mesma coisa do de cima

            int resultado = numerador /  denominador; // pode lançar uma ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: não é possivel dividir por zero.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: você deve digitar numeros validos.");
        } finally {
            System.out.println("Bloco 'finally' executado: fechando recursos.");
            sc.close();
        }
    }
}
