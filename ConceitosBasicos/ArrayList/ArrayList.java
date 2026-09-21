package ArrayList;


import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // pegar o elemento pelo indice
        String firstFruit = fruits.get(1);
        System.out.println("First fruit: " + firstFruit);

        // atualizar a lista

        fruits.set(1, "Blueberry");
        String firstFruit2 = fruits.get(1);
        System.out.println("First fruit: " + firstFruit2);


        // remover o elemento pelo indice
        fruits.remove(1);
        System.out.println(fruits);

    }
}
