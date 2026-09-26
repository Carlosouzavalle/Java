package Arrrays;

import java.util.Arrays;

public class Arrayas {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4,5}; 

        int[] valores2 = {6,7,8,9,10};

        int[] valores3 = Arrays.copyOf(valores, valores.length + valores2.length);

        for (int i : valores3) {
            System.out.println(i);
        }
    
        // for (int i : valores) {
        //     System.out.println(i);
        // }



        // int[] idades = new int[5];
        // System.out.println(idades);


        // for (int i : idades) {
        //     System.out.println(i);
        // }


        // descobrir o tamanho de um array o length
        //System.out.println(idades.length);

        // for(int i = 0; i < idades.length; i++) 
        // {
        //     System.out.println(idades[i]);
        // }
    }
}
