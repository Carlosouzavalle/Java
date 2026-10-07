package Generics;

public class multParams<T, U> {
    private final T first;
    private final U second;

    public multParams(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }


    public static void main(String[] args) {
        multParams<Integer, String> pair = new multParams<Integer,String>(1, "one");
        System.out.println("First: " + pair.getFirst());
    }
}
