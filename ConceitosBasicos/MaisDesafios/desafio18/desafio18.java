package MaisDesafios.desafio18;

public class desafio18 {
    public static void main(String[] args) {
        int angulo = 30;

        double seno = Math.sin(Math.toRadians(angulo));
        double cosseno = Math.cos(Math.toRadians(seno));
        double tangente = Math.tan(Math.toRadians(cosseno));

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
    }
}


// formula manual 

// double radianos = 1.5707963267948966; // Aprox. pi/2
// double graus = radianos * 180.0 / Math.PI;