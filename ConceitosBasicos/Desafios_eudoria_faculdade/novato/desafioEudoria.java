package Desafios_eudoria_faculdade.novato;

public class desafioEudoria {
    abstract static class Personagem {
        String Nome;
        String Classe;
        int Nivel;
        double PontosDvida;

        public Personagem(String nome, String classe, int nivel, double pontoDvida) {
            this.Nome = nome;
            this.Classe = classe;
            this.Nivel = nivel;
            this.PontosDvida = pontoDvida;
        }

        public abstract void usarHabilidade(String habilidade);

        public void exibirStatus() {
            System.out.println("Nome: " + Nome + "\nClasse: " + Classe + "\nNivel: " + Nivel + "\nPonto De Vida: " + PontosDvida);
        }
    }

    static class Mago extends Personagem {
        public Mago(String nome, int nivel, double pontoDvida) {
            super(nome, "Mago", nivel, pontoDvida);
        }

        @Override
        public void usarHabilidade(String habilidade) {
            System.out.println("O mago " + Nome + " lançou: " + habilidade);
        }
    }

    static class Guerreiro extends Personagem {
        public Guerreiro(String nome, int nivel, double pontosDvida) {
            super(nome, "Guerreiro", nivel, pontosDvida);
            
        }

        @Override
        public void usarHabilidade(String habilidade) {
            System.out.println("O mago " + Nome + " lançou: " + habilidade);
        }
    }


    public static void main(String[] args) {
        Personagem mago = new Mago("Merlin", 10, 100.0);
        mago.exibirStatus();
        mago.usarHabilidade("Bola de fogo");

        System.out.println("\n");
        Personagem guerreiro = new Guerreiro("Arthur", 20, 400.0);
        guerreiro.exibirStatus();
        guerreiro.usarHabilidade("Golpe Cortante");
    }
}
