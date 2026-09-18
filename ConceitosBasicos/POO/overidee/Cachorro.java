package POO.overidee;

import POO.overidee.Animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("AU AU!");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
    }
}
