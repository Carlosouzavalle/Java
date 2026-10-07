package HashMape;

import java.util.Map;
import java.util.HashMap;

public class ExemploHashMap {
    
    public static void main(String[] args) {
        // Criando um HashMa (Chave: String, Valor: Double)
        Map<String, Double> tabelaPrecos = new HashMap<>();

        // inserindo elementos no HashMap
        tabelaPrecos.put("Maça", 2.50);
        tabelaPrecos.put("Banana", 1.80);
        tabelaPrecos.put("Laranja", 3.00);

        System.out.println("Tabela de Preços: " + tabelaPrecos);

        // Atualizando um valor: se a chave já existe, o valor antigo é sobrescrito
        tabelaPrecos.put("Maça", 2.99);
        System.out.println("Após atualizar a 'Maçã': " + tabelaPrecos);

        // Recuperando um valor com get()
        double precoBanana = tabelaPrecos.get("Banana");
        System.out.println("Preço da Banana: R$ " + precoBanana);

        // Verificando a existência de uma chave com containsKey()
        if (tabelaPrecos.containsKey("Laranja")) {
            System.out.println("O produto 'Laranja' está presente na tabela.");
        }

        // Removendo uma chave com remove()
        tabelaPrecos.remove("Banana");
        System.out.println("Após remover 'Banana': " + tabelaPrecos);

        // Percorrendo todos os pares chave-valor utilizando entrySet()
        System.out.println("Lista de produtos Cadastrados: ");
        for(Map.Entry<String, Double> produto : tabelaPrecos.entrySet()) {
            System.out.println(produto.getKey() + ": R$ " + produto.getValue());
        }
    }
}



// O que acontece no código:

// Pares Chave-Valor (Map<K, V>): A chave representa o nome do produto (String) e o valor representa o preço (Double).

// Método put(): Adiciona uma nova chave ou sobrescreve o valor anterior caso a chave já exista no mapa

// Método get(): Localiza e retorna o valor associado à chave consultada

// Método containsKey(): Realiza uma verificação em tempo constante $O(1)$ para checar se uma determinada chave está cadastrada

// Iteração via entrySet(): O método entrySet() fornece uma visualização em conjunto (Set) de todos os pares Map.Entry<K, V>, permitindo percorrer tanto as chaves quanto os valores de forma organizada.