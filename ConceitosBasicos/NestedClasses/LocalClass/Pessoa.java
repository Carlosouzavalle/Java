package NestedClasses.LocalClass;

public class Pessoa {
    void apresentar() {
        class Mensagem {
            void mostrar() {
                System.out.println("Hey");
            }
        }

        Mensagem mensagem = new Mensagem();

        mensagem.mostrar();
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.apresentar();
    }
}

// mensagem só existe dentro de apresentar
// vc não pode fazer 
// Mensagem mensagem = new Mensagem();