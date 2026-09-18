package POO.superr;

import POO.superr.Animal;

public class Cachorro extends Animal {
    Cachorro(String name) {
        super(name);
    }


    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Gigante");
        System.out.println(cachorro.name);
    }

}
