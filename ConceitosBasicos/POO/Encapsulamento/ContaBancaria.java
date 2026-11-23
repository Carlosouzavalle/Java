package POO.Encapsulamento;

public class ContaBancaria {

    private double saldo;

    public String getSaldo() {
        return "\n" + saldo;
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor >= saldo) {
            throw new IllegalArgumentException("Se você sacar um valor maior que seu saldo sua conta pode fechar");
        }
        saldo -= valor;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(100.0);
        conta.sacar(88);
        System.out.print(conta.getSaldo());
        conta.depositar(2);
        System.out.print(conta.getSaldo());
    }
}
