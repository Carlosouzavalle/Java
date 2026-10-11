A Stream API (java.util.stream.Stream<T>), introduzida no Java 8, é uma extensão do Java Collections Framework criada para fornecer uma abordagem funcional no processamento de sequências de dados.

1\. Conceito Fundamental

**Sem Armazenamento de Dados**: Uma **Stream não armazena elementos**; ela funciona como um adaptador ou visão (*view*) sobre uma fonte de dados existente (como uma coleção ou array)[3].

**Iteração Interna**: Em vez de gerenciar loops manuais (*iteração externa*), a Stream transfere o controle de iteração para a biblioteca do Java[1][4].

**Separação de Responsabilidades**: Há uma clara divisão entre **"o que fazer"** (a funcionalidade/lógica que você passa via expressões lambda ou *method references*) e **"como fazer"** (a execução interna gerenciada pelo framework)[4][5].


2\. Estágios do Pipeline de Operações

O processamento com Streams é estruturado em uma cadeia de chamadas no estilo de programação fluente (*fluent programming*)[6]. Essa cadeia é composta por dois tipos de operações[7]:

A. Operações Intermediárias (*Intermediate Operations*)

**Retorno**: Sempre retornam uma nova `Stream`, permitindo o encadeamento de múltiplos métodos (ex: `filter()`, `map()`, `flatMap()`)[7].

