package Obejto;

public class RetornoDoMetodo {
    // public void oi(int idade) {
    //         if (idade < 18) {
    //         return;
    //     }

    //     System.out.println("Maior de idade");
    // }


    public int somar(int a, int b) {
        return  a + b;
    }

    public void mostrar() {
        somar(10, 20);
        return;
    }


    public static void main(String[] args) {
        RetornoDoMetodo retornoDoMetodo = new RetornoDoMetodo();
        retornoDoMetodo.mostrar();   
    }
}

// void
//  ↓
// não devolve valor

// return;
//  ↓
// apenas encerra o método

// Por que void existe?
// Porque muitas vezes queremos que um método execute uma ação, e não que calcule e devolva alguma coisa.