package exceptiion;

public class exceptionPersona extends Exception {
    public exceptionPersona(String mensage) {
        super(mensage);
    }

    public static void sacar(double saldo, double valor) throws exceptionPersona {
        if (valor > saldo) { 
            throw new exceptionPersona("Saldo insuficiente para saque de R$ " + valor); 
        } 
            System.out.println("Saque realizado com sucesso!");
    }


    public static void main(String[] args) {
        try {
            sacar(100, 150);
        } catch (exceptionPersona e) {
            System.err.println("Erro capturado: " + e.getMessage());
        }
    }
}
