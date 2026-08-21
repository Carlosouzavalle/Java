package Arrrays;

// import java.util.Arrays;

public class ArraysMultidimesionais {
    public static void main(String[] args) {
        int[][] numeros = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        // System.out.println(numeros[0][0]);

        //  percorendo todo o array
        // for (int[] linha : numeros) {
        //     System.out.println(Arrays.toString(linha));
        // }


        int[][] matriz = new int[3][3];
        // Isso cria:
        //     0  0  0
        //     0  0  0
        //     0  0  0

        // for(int[] lc : matriz) {
        //     System.out.println(Arrays.toString(lc));
        // }


        // for(int row = 0; row < matriz.length; row++) {
        //     for(int col = 0; col < matriz.length; col++) {
        //         System.out.println(matriz[row][col]);
        //     }
        // }

        // matriz[0][0] = 10;
        // matriz[1][1] = 20;
        // matriz[2][2] = 30;

        // for(int row = 0; row < numeros.length; row++) {
        //     for(int col = 0; col < numeros.length; col++) {
        //         System.out.println(numeros[row][col] + " ");
        //     }

        //     System.out.println();
        // }

        // for(int[] lc : matriz) {
        //     System.out.println(Arrays.toString(lc));
        // }
    
    
        for (int[] is : numeros) {
            for (int is2 : is) {
                System.out.println(is2 + " ");
            }

            System.out.println();
        }
    
    
    
    
    }

}
