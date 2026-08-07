package aula01;

public class aula1 {
    public static void main(String[] args)
    {
        String nome = "Carlos";
        int idade = 20;
        float altura = 1.75f;
        //System.out.println("Meu nome é: " + nome);
        System.out.println("Meu nome é " + nome + " e minha idade é " + idade);
        System.out.println(nome.getClass().getSimpleName());
        System.out.println(((Object)idade).getClass().getSimpleName());
        System.out.println(((Object)altura).getClass().getSimpleName());
    }
}


/*
when you run the line System.out.println(((Object)idade).getClass().getSimpleName()); it will print "Integer" because the primitive int is being cast to an Object, which is then boxed into an Integer object. Similarly, for the float variable altura, it will print "Float" when cast to an Object. The getClass().getSimpleName() method returns the simple name of the class of the object, which in this case are "Integer" and "Float" respectively. 


*/