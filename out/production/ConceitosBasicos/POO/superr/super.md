The super method basically call the constructor of the class

ex:

`public class Animal {

    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}`

`public class Cachorro extends Animal {

    Cachorro(String nome) {
        super(nome);
    }
}`

this vs super

Guarde esta imagem mental:

this
↓
EU / objeto atual

super
↓
MEU PAI / classe pai