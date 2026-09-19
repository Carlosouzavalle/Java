package keywords.staticc;

public class Pessoa {
    String titularConta;
    static int totalContas = 0;

    Pessoa(String titularConta) {
        this.titularConta = titularConta;
        totalContas++;
    }
}
