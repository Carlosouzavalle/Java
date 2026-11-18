package Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] codes = {123, 456};
        System.out.println(codes.length);
        // System.out.println(codes[0]);
        // System.out.println(codes[1]);
        List<Integer> codes2 = new ArrayList<>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
    
        codes2.forEach(System.out::println);
    }



    

}
