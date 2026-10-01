package keywords.staticc;

public class PessoaTest  {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos");
        Pessoa p2 = new Pessoa("Julia");
        Pessoa p3 = new Pessoa("Fernanda");
        System.out.print(Pessoa.totalContas);
    }
}


// static → pertence à CLASSE
// não static → pertence ao OBJETO