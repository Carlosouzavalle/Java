package Desafios_eudoria_faculdade.Mestre;

import java.util.ArrayList;

import Desafios_eudoria_faculdade.Mestre.MestreCorrigido.Personagem.Guerreiro;
import Desafios_eudoria_faculdade.Mestre.MestreCorrigido.Personagem.Mago;

public class MestreCorrigido {
    public static abstract class Personagem {
        private String nome;
        private String classe;
        private int nivel;
        private int pontosDeVida;
        private double poderBase;

        // aqui vai o construtor
        public Personagem(
                String nome,
                String classe,
                int nivel,
                int pontosDeVida,
                double poderBase) {
            this.nome = nome;
            this.classe = classe;
            this.nivel = nivel;
            this.pontosDeVida = pontosDeVida;
            this.poderBase = poderBase;
        }

        // metodo abstrato
        public abstract void usarHabilidade();

        public void exibirStatus() {
            System.out.println("Nome: " + nome);
            System.out.println("Classe: " + classe);
            System.out.println("Nível: " + nivel);
            System.out.println("Pontos de Vida: " + pontosDeVida);
            System.out.println("Poder Base: " + poderBase);
            System.out.println();
        }

        // atribuição da benção
        protected void atribuirBencao(double Valor) {
            this.poderBase += Valor;
        }

        public interface Auditavel {
            void registrarAcao(String acao);

            void auditarAcoes();
        }

        public static class Mago extends Personagem implements Auditavel {
            private ArrayList<String> acoes;

            public Mago(
                    String nome,
                    String classe,
                    int nivel,
                    int pontosDeVida,
                    double poderBase) {
                super(nome, classe, nivel, pontosDeVida, poderBase);

                this.acoes = new ArrayList<>();
            }

            @Override
            public void usarHabilidade() {
                System.out.println("Mago lança magia!");
            }

            @Override
            public void registrarAcao(String acao) {
                acoes.add(acao);
            }

            @Override
            public void auditarAcoes() {
                System.out.println("Ações do Mago");

                for (String acao : acoes) {
                    System.out.println("- " + acao);
                }
            }
        }

        // Guerreiro
        public static class Guerreiro extends Personagem {
            public Guerreiro(
                    String nome,
                    String classe,
                    int nivel,
                    int pontosDeVida,
                    double podebase) {
                super(nome, classe, nivel, pontosDeVida, podebase);
            }

            @Override
            public void usarHabilidade() {
                System.out.println("Guerreiro usa Habilidade fisica");
            }
        }

    }

            public static void main(String[] args) {
            ArrayList<Personagem> listaPersonagens = new ArrayList<>();

            listaPersonagens.add(new Mago("Valir", "Mago", 201, 200, 50));

            listaPersonagens.add(new Mago("Gandolf", "Mago", 120, 200, 50));

            listaPersonagens.add(new Guerreiro("Garen", "Guerreiro", 200, 200, 50));

            listaPersonagens.add(new Guerreiro("Darius", "Gurreiro", 205, 200, 50));

            for (Personagem mestreCorrigido : listaPersonagens) {
                mestreCorrigido.exibirStatus();
                mestreCorrigido.usarHabilidade();

                if (mestreCorrigido instanceof Mago) {
                    Mago mago = (Mago) mestreCorrigido;

                    mago.registrarAcao("Usou habilidade!");
                    mago.auditarAcoes();
                }

                System.out.println("-----------------------");
            }
        }
}
