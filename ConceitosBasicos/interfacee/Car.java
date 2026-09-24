package interfacee;

public class Car implements Vehicicle {

    @Override
    public void startEngine() {
        System.out.println("Engine started Vrooooom!");
    }

    @Override 
    public void stopEngine() {
        System.out.println("Engine stoppped");
    }


    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();
    }
}


// Definição de Pacote (Package):Se no topo do seu arquivo Car.java estiver escrito package interfacee;, o Java exige que você execute o comando a partir da pasta de fora (Java/ConceitosBasicos). Se você entrar na pasta interfacee e tentar rodar, o Java se perde na estrutura de diretórios do pacote.