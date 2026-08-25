package Desafio_Iniciante_FACUL;

public class Personagem {
    static class Personagem2 {
        String nome;
        String classe;
        int nivel;
        int pontosDeVida;
        double poderBase;



        public void exibirStatus(String nome, String classe, int nivel, int pontosDeVida, double poderBase)
        {
            System.out.println("Personagem criado: " + nome +"\n"+ " Classe: " + classe + "\n" + " nivel: " + nivel + "\n" + " Pontos de vida: " + pontosDeVida + "\n" + " Poder base: " + poderBase);
        }
    }

    public static void main(String[] args) {
        Personagem2 personagem2 = new Personagem2();
        personagem2.exibirStatus("Carlos", "Tank", 1, 200, 30.2);
    }
}
