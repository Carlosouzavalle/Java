package POO.polimorfismo;

class Animal {

    public void fazerSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerSom();
        animal2.fazerSom();
    }
}