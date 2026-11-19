package NestedClasses;

public class Pessoa {
    static class Documento {
        String numero;
    }

    public static void main(String[] args) {
        Pessoa.Documento documento = new Pessoa.Documento();

        documento.numero = "1234";

        System.out.println(documento.numero);
    }
}


// Quando usar?
// Quando a classe interna tem relação com a classe externa, mas não precisa acessar um objeto específico da classe externa.