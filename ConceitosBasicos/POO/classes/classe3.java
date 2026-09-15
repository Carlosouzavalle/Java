package POO.classes;

public record classe3(String name, int age) {




    public static void main(String[] args) {
        classe3 pessoa = new classe3("carlos", 28);
        System.out.println(pessoa);
        System.out.println(pessoa.name());
    }
}


// O Record é apenas para leitura
// ele é imutavel 
// não permite o construtor sem argumentos
// só permite propriedades staticas em seu corpo
// a gente pode trabalhar com mais de um construtor nos records