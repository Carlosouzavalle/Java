package keywords.privatee;

public class examplePrivate {
    private String exibirNome(String nome) {
        return nome;
    }

    public static void main(String[] args) {
        examplePrivate e = new examplePrivate();
        System.out.println(e.exibirNome("Carlos"));
    }

}

// • private: Torna o membro acessível apenas dentro da própria classe.


// • protected: Permite acesso para classes do mesmo pacote ou subclasses (herança).


// troque a palavra private por protected na classe