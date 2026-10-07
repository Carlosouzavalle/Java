O **HashMap** é uma classe concreta do *Java Collections Framework* que implementa a interface **Map



### 1. Principais Características e Funcionamento

* **Pares Chave-Valor**: Cada entrada é composta por uma chave única mapeada para o seu valor correspondente.

* **Chaves Únicas**: As chaves não podem ser duplicadas. Se você tentar associar um novo valor a uma chave já existente através do método `put()`, o valor antigo será sobrescrito pelo novo. No entanto, os valores associados podem se repetir normalmente.

* **Valores Nulos**: Permite armazenar **uma chave nula** (`null`) e **múltiplos valores nulos**.

* **Sem Garantia de Ordem**: O `HashMap` não mantém nem garante uma ordem específica para a iteração dos seus elementos



### 2. Estrutura de Memória e Desempenho Interno

* **Tabela Hash**: Por baixo dos panos, o `HashMap` utiliza uma **tabela hash** (*hash table*) como estrutura base de dados.

* **Cálculo de Posição (** **Hash Code** **)**: A posição de cada elemento na tabela é calculada por uma função de espalhamento (*hash code*) aplicada à chave.

* **Tratamento de Colisões**: Quando duas chaves distintas geram o mesmo índice na tabela (uma colisão), os elementos são mantidos encadeados em uma lista dentro do mesmo compartimento (*bucket*).

* **Relação com o** **HashSet**: A classe `HashSet` utiliza internamente um `HashMap` para realizar o armazenamento dos seus elementos.


### 3. Principais Métodos

* `put(K key, V value)`: Adiciona um novo par ou atualiza o valor da chave existente.

* `get(Object key)`: Recupera o valor associado à chave ou retorna `null` caso a chave não esteja presente.

* `remove(Object key)`: Remove do mapa o par correspondente à chave.

* `containsKey(Object key)` / `containsValue(Object value)`: Retornam um booleano confirmando a existência da chave ou do valor.

* `keySet()`: Retorna um conjunto (`Set`) com todas as chaves do mapa, usado para percorrer os elementos


### 4. Complexidade Temporal


| Operação | Complexidade Média | Comportamento |
| :--- | :---: | :--- |
| **Busca por Chave** `(get)` | \(O(1)\) | Localização rápida calculando o hash da chave. |
| **Inserção/Atualização** `(put)` | \(O(1)\) | Insere o par ou substitui o valor no bucket calculado. |
| **Remoção** `(remove)` | \(O(1)\) | Localiza e remove a associação correspondente à chave. |
| **Verificação de Chave** `(containsKey)` | \(O(1)\) | Checa em tempo constante se a chave existe. |
| **Pior Caso** | \(O(N)\) | Ocorre quando há um número excessivo de colisões no mesmo bucket. |



Aplicações do HashMap no Mundo Real:

O **HashMap** é utilizado quando existe a necessidade de relacionar duas informações através do formato **chave-valor**, permitindo encontrar um dado específico a partir do seu identificador em tempo constante

**Catálogo de Produtos e Carrinho de Compras**: Em e-commerces, o mapa é aplicado para associar o nome ou código de barras de um produto (chave) ao seu preço ou objeto de detalhes (valor).

**Sistemas de Faturamento e Mapeamento**: Associar uma tarefa realizada, ordem de serviço ou contrato (chave) ao cliente responsável pela conta (valor) para geração de cobranças.

**Sistemas de Cache e Sessão de Usuários**: Guardar dados de acesso frequente na memória. O token de sessão ou ID do usuário funciona como a chave para resgatar instantaneamente o perfil ou as preferências do usuário (valor).

**Contagem de Frequência e Estatísticas**: Mapear palavras ou eventos para a quantidade de vezes que ocorreram (por exemplo, palavra $\rightarrow$ número de ocorrências) em relatórios de análise de dados.