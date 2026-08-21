package SwitchCase;

public class Aula05Switch {
    public static void main(String[] args) {
        // byte dia = 4;
        // // char, byte, short, int, String, enum
        // switch (dia) {
        //     case 1:
        //         System.out.println("Domingo");
        //         break;
        //     case 2:
        //         System.out.println("Segunda-feira");
        //         break;
        //     case 3:
        //         System.out.println("Terça-feira");
        //         break;
        //     case 4:
        //         System.out.println("Quarta-feira");
        //         break;
        //     case 5:
        //         System.out.println("Quinta-feira");
        //         break;
        //     case 6:
        //         System.out.println("Sexta-feira");
        //         break;
        //     case 7:
        //         System.out.println("Sábado");
        //         break;
        //     default:
        //         System.out.println("Dia inválido");
        // }



        String sexo = "S";
        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo inválido");
        }
    }
}
