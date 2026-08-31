package Desafios_eudoria_faculdade.aventureiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class desafio {
    static class Personagem {
        private String nome;
        private String classe;
        private int nivel;
        private int pontosDeVida;
        private double poderBase;


        public Personagem(String _nome, String _classe, int _nivel, int _pontosDeVida, double _poderBase) 
        {
            this.nome = _nome;
            this.classe = _classe;
            this.nivel = _nivel;
            this.pontosDeVida = _pontosDeVida;
            this.poderBase = _poderBase;
        }

        // geters
        public String getNome() {
            return nome;
        }

        public String getClasse() {
            return classe;
        }

        public int getNivel() {
            return nivel;
        }

        public int getPontosDeVida() {
            return pontosDeVida;
        }

        public double getPoderBase() {
            return poderBase;
        }

        // seters
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setClasse(String classe) {
            this.classe = classe;
        }

        public void setNivel(int nivel) {
            if (nivel <= 0) {
                System.out.println("Nivel invalido!");
                return;
            }

            this.nivel = nivel;
        }

        public void setPontosDeVida(int pontosDeVida) {
            if(pontosDeVida <= 0) {
                System.out.println("Valor Invalido!");
                return;
            }

            this.pontosDeVida = pontosDeVida;
        }

        public void setPoderBase(double podebase) {
            if(podebase <= 0) {
                System.out.println("Valor Invalido!");
                return;
            }

            this.poderBase = podebase;
        }

        // usar habilidade 
        public void usarHabilidade() {
            if (this.classe == null) return;
            String c = this.classe.toLowerCase();
            if (c.contains("mago")) {
                mago();
            } else if (c.contains("guerreiro") || c.contains("guerreiro")) {
                guerreiro();
            } else {
                System.out.println(getNome() + " usa uma habilidade desconhecida.");
            }
        }

        @Override
        public String toString() {
            return "Personagem{" +
                    "nome='" + nome + '\'' +
                    ", classe='" + classe + '\'' +
                    ", nivel=" + nivel +
                    ", pontosDeVida=" + pontosDeVida +
                    ", poderBase=" + poderBase +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Personagem outro = (Personagem) obj;
            return nome.equals(outro.nome) && classe.equals(outro.classe);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, classe);
        }

        public void mago() {
            System.out.println(getNome() + " conjura um feitiço de proteção!");
        }

        public void guerreiro() {
            System.out.println(getNome() + " golpe de escudo!");
        }

    }

    public static void main(String[] args) {
        Personagem mago = new Personagem("alfred", "mago", 10, 1000, 400);
        Personagem guerreiro = new Personagem("Artemis", "Guerreiro", 18, 10000, 800);


        List<Personagem> personagems = new ArrayList<>();
        personagems.add(mago);
        personagems.add(guerreiro);

        for (Personagem personagem : personagems) {
            System.out.println("\n");
            System.out.println(personagem.toString());
            System.out.println("\n");
            personagem.usarHabilidade();
        }
    }
}
