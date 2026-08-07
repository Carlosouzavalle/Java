package aula02;

public class aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos em Java

        int idade = (int)2500000000000L; // inteiro
        // double salario = 2500.0; // ponto flutuante de precisão dupla
        float salariofloat = (float)2500.0D; // ponto flutuante de precisão simples
        // boolean estudante = true; // booleano
        // char letra = 'A'; // caractere
        // byte pequenoNumero = 10; // byte
        // short numeroCurto = 10; // short
        // long numeroLongo = 100000L; // long
        String nome = "Carlos"; // String (não é um tipo primitivo, mas é comumente usado)
        var nomeVar = "Carlos2"; // apartir do Java 10, podemos usar o var para declarar variáveis, o compilador infere o tipo da variável com base no valor atribuído a ela.





        System.out.println("Idade: " + idade);
        System.out.println("Salário (float): " + salariofloat);
        System.out.print(nome);
        System.out.println(nomeVar);
    }
}


/*
    data type    size (bits)    default value
    byte         8              0
    short        16             0
    int          32             0
    long         64             0L
    float        32             0.0f
    double       64             0.0d
    char         16             '\u0000'
    boolean      1              false


    #  double and float are used for decimal numbers, but double has double the precision of float. 

    #  double 2000 is working fine, but if you want to use float the same way goes wrong cause the default type for decimal numbers in Java is double. So, to use float you need to add an 'f' at the end of the number like 2000.0f.


    #  some values of the primitive types in Java are:
        byte: -128 to 127
        short: -32,768 to 32,767
        int: -2,147,483,648 to 2,147,483,647
        long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float: approximately ±3.40282347E+38F (6-7 significant decimal digits)
        double: approximately ±1.79769313486231570E+308 (15 significant decimal digits)


        casting primitive types in Java is done using parentheses and the desired type. For example, to cast a double to an int, you would write:
        double myDouble = 9.78;
        int myInt = (int) myDouble; // myInt will be 9

    





*/