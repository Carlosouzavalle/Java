A Stream API (java.util.stream.Stream<T>), introduzida no Java 8, é uma extensão do Java Collections Framework criada para fornecer uma abordagem funcional no processamento de sequências de dados.

1\. Conceito Fundamental

**Sem Armazenamento de Dados**: Uma **Stream não armazena elementos**; ela funciona como um adaptador ou visão (*view*) sobre uma fonte de dados existente (como uma coleção ou array)[3].

**Iteração Interna**: Em vez de gerenciar loops manuais (*iteração externa*), a Stream transfere o controle de iteração para a biblioteca do Java[1][4].

**Separação de Responsabilidades**: Há uma clara divisão entre **"o que fazer"** (a funcionalidade/lógica que você passa via expressões lambda ou *method references*) e **"como fazer"** (a execução interna gerenciada pelo framework)[4][5].


2\. Estágios do Pipeline de Operações

O processamento com Streams é estruturado em uma cadeia de chamadas no estilo de programação fluente (*fluent programming*)[6]. Essa cadeia é composta por dois tipos de operações[7]:

A. Operações Intermediárias (*Intermediate Operations*)

**Retorno**: Sempre retornam uma nova `Stream`, permitindo o encadeamento de múltiplos métodos (ex: `filter()`, `map()`, `flatMap()`)[7].

**Avaliação Preguiçosa (** **Lazy Evaluation** **)**: Não processam os dados imediatamente no momento em que são declaradas; a execução é postergada até que uma operação terminal seja invocada[8][9].

**Divisão de Comportamento**:

**Sem Estado (** **Stateless** **)**: Operações que avaliam cada elemento de forma isolada, como `filter()` e `map()`[10].

**Com Estado (** **Stateful** **)**: Operações que precisam manter e consultar um estado acumulado dos elementos anteriores, como `distinct()`, `sorted()`, `limit()` e `skip()`[11].


B. Operações Terminais (*Terminal Operations*)

**Consumo e Resultado**: Executam o pipeline e produzem um resultado final não-stream (como um valor acumulado, um booleano ou uma nova coleção) ou um efeito colateral (ex: `forEach()`, `reduce()`, `collect()`)[7].

**Ciclo de Vida**: A invocação de uma operação terminal aciona o processamento e, em seguida, **fecha a Stream**[9]. Tentar reutilizar uma Stream já consumida resultará em uma exceção (`IllegalStateException`)[14].


3\. Paralelismo e `Spliterator`

**Execução Paralela Fácil**: Uma coleção pode ser processada em paralelo chamando o método `parallelStream()` ou encadeando `.parallel()` na Stream[3][15].

**Mecanismo de Divisão**: Para dividir a fonte de dados em partes que possam ser executadas concorrentemente por múltiplas threads, o Java utiliza internamente a interface **Spliterator**[16].

**Atenção ao Desempenho**: Operações intermediárias com estado (como `sorted()` ou `distinct()`) criam barreiras de sincronização que exigem o armazenamento temporário em buffer, o que pode aumentar o custo computacional em Streams paralelas[9].