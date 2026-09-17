package POO.Heranca;

public class heranca {
    
    
    public static class Pai {
        String name;
        String sobrenome;
        String corPele;
        String corOlhos;
    }



    public static class Filho extends Pai {
        String corCabelos;
        
    }


    public static void main(String[] args) {
        Pai pai = new Pai();
        pai.name = "Jose";
        pai.sobrenome = "Souza";
    
    
        Filho filho = new Filho();
        filho.name = "Carlos";
        filho.sobrenome = "Souza";
        filho.corCabelos = "Preto";


        System.out.print(filho.name + " " + filho.sobrenome + " cor do cabelo: " + filho.corCabelos);
    
    }
}
