package NestedClasses.InnerClass2;

public class Pessoa {
    private String nome = "Carlos";

    class Documento {
        void mostrarNome() {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Pessoa.Documento documento = pessoa.new Documento();

        documento.mostrarNome();
    }
}
