package NestedClasses.InnerClass;

public class Pessoa {
    class Endereco {
        String rua;
    }

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Pessoa.Endereco endereco = pessoa.new Endereco();

        endereco.rua = "Rua123";

        System.out.println(endereco.rua);
    }
}


// A diferença é importante:

// Static Nested Class

// Pessoa.Documento documento = new Pessoa.Documento();


// Inner Class

// Pessoa pessoa = new Pessoa();
// Pessoa.Endereco endereco = pessoa.new Endereco();


// Quando usar?
// Quando a classe interna tem relação com a classe externa, mas não precisa acessar um objeto específico da classe externa.
