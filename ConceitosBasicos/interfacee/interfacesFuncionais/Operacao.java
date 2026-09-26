package interfacee.interfacesFuncionais;

@FunctionalInterface
public interface Operacao {

    int calcular(int a, int b);

    default void mostrarMensagem() {
        System.out.println("Operação realizada!");
    }
}