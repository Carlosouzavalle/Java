package Generics;

public class exemploGenerics<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public static void main(String[] args) {
        exemploGenerics<String> exemploGenerics = new exemploGenerics<>();
        exemploGenerics.setItem("Olá Generics");
    }
}
