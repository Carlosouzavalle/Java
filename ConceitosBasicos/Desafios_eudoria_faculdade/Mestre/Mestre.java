// package Desafios_eudoria_faculdade.Mestre;

// import java.util.ArrayList;

// public class Mestre {
//     public static abstract class Personagem {
//         private String Nome;
//         private String Classe;
//         private int Nivel;
//         private int PontosDeVida;
//         private double PoderBase;

//         public Personagem(String nomeString, String clString, int nivelInt, int pontosDeVidaint, double podebaseDouble) {
//             this.Nome = nomeString;
//             this.Classe = clString;
//             this.Nivel = nivelInt;
//             this.PontosDeVida = pontosDeVidaint;
//             this.PoderBase = podebaseDouble;
//         }

//         // Declared as abstract so concrete subclasses must implement it
//         public abstract void usarHabilidade();


//         // now we are create a method to show or stats
//         public void exibirStatus() 
//         {
//             System.out.println("Nome: " + Nome + "\n"
//                 + "Classe: " + Classe + "\n" + "Nivel: " + Nivel 
//                 + "\n" + "Pontos De Vida: " + PontosDeVida + "\n" + "Poder Base: "
//                 + PoderBase
//             );
//         }

//         protected double atribuirBencao(double bencao) {
//             bencao = 3;
//             double buff = bencao + this.PoderBase;
//             return buff;
//         }

//     }


//     public interface IAuditavel {
    
//         static String registrarAcao(String acao) {
//             return acao;
//         }

//         static String auditarAcoes(String acaoString) {
//             return "";
//         }
//     }


//     public static class Mago extends Personagem implements IAuditavel {
//         private ArrayList<Double> habilidades;

//         public Mago(String nomeString, String clString, int nivelInt, int pontosDeVidaint, double podebaseDouble) {
//             super(nomeString, clString, nivelInt, pontosDeVidaint, podebaseDouble);


//             this.habilidades = new ArrayList<>();
//             habilidades.add(atribuirBencao(podebaseDouble));
//         }

//         @Override
//         public void usarHabilidade() {
//             System.out.println("Mago lança uma magia!");
//         }
        
//     }

//     public static class Guerreiro extends Personagem {
//         public Guerreiro(String nomeString, String clString, int nivelInt, int pontosDeVidaint, double podebaseDouble) {
//             super(nomeString, clString, nivelInt, pontosDeVidaint, podebaseDouble);
//         }

//         @Override
//         public void usarHabilidade() {
//             System.out.println("Guerreiro usa uma habilidade física!");
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Personagem> listaPersonagens = new ArrayList<>();
//         // create and add a Mago instance
//         listaPersonagens.add(new Mago("Gandalf", "Mago", 10, 100, 50.0));

//         listaPersonagens.add(new Guerreiro("Warlock", "Guerreiro", 100, 1100, 250));

//         // foreach
//         for (Personagem p : listaPersonagens) {
//             p.exibirStatus();
//             p.usarHabilidade();
//             System.out.println();
//         }

//         //registrar uma ação 
//         IAuditavel.registrarAcao("Lança habilidade de proteção");

//         // check for any Mago instances in the list
//         for (Personagem pCheck : listaPersonagens) {
//             if (pCheck instanceof Mago) {
//                 System.out.println("Encontrado um Mago: " + pCheck.getClass().getSimpleName());
//                 IAuditavel.auditarAcoes("Conjurou bola de fogo!!");
//             }
//         }

//         //fazer casting
//         for (Personagem castingPersonagem : listaPersonagens) {
//             // call atribuirBencao with a value (method ignores input and uses 3 internally)
//             double buff = castingPersonagem.atribuirBencao(0.0);
//             System.out.println("Buff aplicado: " + buff);
//         }
        
//     }

// }
