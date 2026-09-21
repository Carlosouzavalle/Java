package keywords.finall;

public class finall2 {
    // 2. final em atributo
    final String titularConta;

    finall2(String titular) {
        this.titularConta = titular;
    }


    public static void main(String[] args) {
        finall2 conta = new finall2("Carlos");
        // conta.titularConta = "João"; // ERRO
    }
    // O titularConta foi definido uma vez e não pode ser atribuído novamente.
}
