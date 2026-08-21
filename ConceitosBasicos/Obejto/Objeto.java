package Obejto;

public class Objeto {

    public static class Pessoa {
        String nome;
        int idade;


        public void Apresentar()
        {
            System.out.println("meu nome é " + nome + " e tenho " + idade);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Carlos";
        pessoa1.idade = 27;


        // muito massante
        // System.out.println("meu nome é " + pessoa1.nome + " e tenho " + pessoa1.idade);System.out.println("meu nome é " + pessoa1.nome + " e tenho " + pessoa1.idade);
        

        pessoa1.Apresentar();
 
    }
}
