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


Aplicações do `HashSet` no Mundo Real

O **HashSet** é utilizado quando a prioridade é armazenar uma coleção de **elementos distintos**, garantindo que não existam duplicatas e permitindo checar a existência de um item de forma ultra rápida.

**Processamento de Registros Únicos (CPFs, IDs ou E-mails)**: Ao importar uma lista massiva de cadastros ou logs, o `HashSet` é usado para filtrar e contar quantas pessoas ou identificadores únicos existem no sistema, ignorando automaticamente qualquer entrada repetida.

**Controle de Notificações e Eventos (** **Observer Pattern** **)**: Em sistemas que disparam alertas ou notificações, utiliza-se um conjunto para manter a lista de ouvintes/dispositivos inscritos, garantindo que o mesmo usuário não receba notificações duplicadas do mesmo evento.

**Sistemas de Permissões e Tags**: Armazenar as regras de acesso de um usuário (por exemplo, "ADMIN", "EDITOR", "LEITOR") ou as tags de um artigo, onde a ordem não importa, mas nenhuma permissão ou tag pode estar duplicada.