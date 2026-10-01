O **HashSet** é uma classe concreta pertencente ao *Java Collections Framework* que implementa a interface **Set**. Seu objetivo principal é armazenar uma coleção de **elementos únicos**, funcionando como o conceito de conjunto matemático, onde duplicatas não são permitidas

1\. Estrutura de Memória e Funcionamento Interno

**Tabela Hash (** **HashMap** **Interno)**: O `HashSet` é fundamentado em uma tabela hash (*hash table*). Na verdade, a implementação do Java utiliza uma instância de `HashMap` por baixo dos panos, armazenando os elementos do conjunto como chaves desse mapa.


**Tratamento de Colisões**: A posição de armazenamento de cada objeto é calculada a partir de uma função de *hash* aplicada ao seu conteúdo[8]. Caso dois objetos gerem o mesmo índice (colisão), eles são agrupados e mantidos em uma estrutura encadeada dentro do mesmo compartimento (*bucket*).

**Sem Garantia de Ordem**: Por depender dos códigos de hash (*hash codes*) calculados para cada elemento, a ordem de armazenamento e de iteração do `HashSet` não é fixa nem garantida.

2\. Complexidade e Desempenho

3\. Principais Características

**Inserção Única**: Ao chamar o método `add()`, se o elemento já existir no conjunto, a operação é ignorada e o elemento não é duplicado.

**Aceita Nulo**: Permite armazenar no máximo **um** elemento com valor `null`.

**Thread-Safety**: O `HashSet` não é sincronizado (*not thread-safe*) e possui iteradores do tipo *fail-fast* (que lançam exceção se a coleção for modificada estruturalmente durante a iteração).

4\. Comparativo: `HashSet` vs `HashMap`

O **HashSet** armazena apenas **valores/elementos únicos** e implementa a interface `Set`.


O **HashMap** armazena **pares de chave e valor** (`key-value`), onde as chaves são únicas mas os valores podem ser repetidos, implementando a interface `Map`.


