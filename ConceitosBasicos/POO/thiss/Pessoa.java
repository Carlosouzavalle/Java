package POO.thiss;

public class Pessoa {
    String name;

    public void apresentar() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.name = "Cadu";

        pessoa.apresentar();
    }
}
