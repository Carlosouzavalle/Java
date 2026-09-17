package POO.abstracao;

public class abstracao1 {

    public static abstract class Carro {
        public abstract void correr();
    }

    public static class Ferrari extends Carro{

        @Override
        public void correr() {
            System.out.println("Carro correndo");
        }
    }
 
    
    public static void main(String[] args) {


        Ferrari ferrari = new Ferrari();
        ferrari.correr();
        
    }
}


//Abstração é o processo mental de isolar o que é essencial em um objeto ou ideia, 
// todo metodo abstrato precisa de classe abstrata
// as classes abstratas nos permitem criar tanto metodos abstratos como metodos com alguma implementacao

