package Desafios_eudoria_faculdade.novato;

import java.util.ArrayList;
import java.util.List;

public class desafioEudoria {
    // nossa abstract class aqui
    abstract static class Personagem {
        String Nome;
        String Classe;
        int Nivel;
        double PontosDvida;

        // construtor
        public Personagem(String nome, String classe, int nivel, double pontoDvida) {
            this.Nome = nome;
            this.Classe = classe;
            this.Nivel = nivel;
            this.PontosDvida = pontoDvida;
        }

        // metodo abstrato
        public abstract void usarHabilidade(String habilidade);

        // metodo lançar habilidade 
        public void exibirStatus() {
            System.out.println("Nome: " + Nome + "\nClasse: " + Classe + "\nNivel: " + Nivel + "\nPonto De Vida: " + PontosDvida);
        }
    }

    // static class para sobreescrever
    static class Mago extends Personagem {
        public Mago(String nome, int nivel, double pontoDvida) {
            super(nome, "Mago", nivel, pontoDvida);
        }

        @Override
        public void usarHabilidade(String habilidade) {
            System.out.println("O mago " + Nome + " lançou: " + habilidade);
        }
    }

    // static class para sobreescrever
    static class Guerreiro extends Personagem {
        public Guerreiro(String nome, int nivel, double pontosDvida) {
            super(nome, "Guerreiro", nivel, pontosDvida);
            
        }

        @Override
        public void usarHabilidade(String habilidade) {
            System.out.println("O Guerreiro " + Nome + " lançou: " + habilidade);
        }
    }


    public static void main(String[] args) {

        
        Personagem mago = new Mago("Merlin", 10, 100.0);
        Personagem guerreiro = new Guerreiro("Arthur", 20, 400.0);

        mago.usarHabilidade("Bola de fogo");
        System.out.println("\n");
        guerreiro.usarHabilidade("Golpe Cortante");
        System.out.println("\n");
        

        // arraylist
        List<Personagem> personageArrayList = new ArrayList<>();
        personageArrayList.add(mago);
        personageArrayList.add(guerreiro);


        // foreach
        for (Personagem personagem : personageArrayList) {
            personagem.exibirStatus();
            System.out.println();
            // mago.usarHabilidade("Bola de fogo");
            // guerreiro.usarHabilidade("Golpe Cortante");
        }
    }
}
