package NestedClasses.AnonimousClass;

public class Animais implements Animal {

    @Override
    public void fazerSom() {
        System.out.println();
    }

public static void main(String[] args) {

        // anonymous class  
        new Animal() {

            @Override
            public void fazerSom() {
                System.out.println("Miau!");
            }
        }.fazerSom();


        Animal duck = new Animal() {
            @Override 
            public void fazerSom() {
                System.out.println("QUACK");
            }
        };

        duck.fazerSom();

        
    }
}

// diferença entre eles 
// a primeira cria o objeto e chama o método imediatamente 

// a segunda cria uma variavel de referencia

// Anonymous Classes aparecem principalmente quando precisamos criar uma implementação pequena e rápida