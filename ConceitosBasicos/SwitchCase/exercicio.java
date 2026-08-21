package SwitchCase;

public class exercicio {
    public static void main(String[] args) {

        byte dia = 4;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("dia não util");
                break;
            case 2:
                System.out.println("Segunda-feira");
                System.out.println("dia util");
                break;
            case 3:
                System.out.println("Terça-feira");
                System.out.println("dia util");
                break;
            case 4:
                System.out.println("Quarta-feira");
                System.out.println("dia util");
                break;
            case 5:
                System.out.println("Quinta-feira");
                System.out.println("dia util");
                break;
            case 6:
                System.out.println("Sexta-feira");
                System.out.println("dia util");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("FDS");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
