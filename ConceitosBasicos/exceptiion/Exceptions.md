1\. Estrutura Fundamental: `try`, `catch` e `finally`

**try**: Engloba o bloco de código que pode vir a lançar uma exceção durante a sua execução[4][5]. Se uma exceção ocorrer dentro dele, o restante do bloco `try` é interrompido imediatamente

**catch**: Bloco responsável por receber e tratar a exceção disparada[5][6]. É possível definir múltiplos blocos `catch` para tratar diferentes tipos específicos de erro

**finally**: Bloco opcional que **sempre é executado**, ocorra uma exceção ou não[8][9]. É o local ideal para colocar código de liberação de recursos (como fechar conexões e arquivos), evitando vazamentos na aplicação[8][10].

2\. Comandos `throw` e `throws`

**throw**: Palavra-chave utilizada para lançar explicitamente um objeto de exceção a partir do código do programa

**throws**: Cláusula adicionada ao cabeçalho de um método para declarar as exceções que ele pode lançar, alertando quem chamar o método sobre a necessidade de tratá-las[13]


3\. Hierarquia das Exceções em Java

Todas as exceções no Java fazem parte de uma hierarquia de classes que tem como raiz a classe **Throwable**

**Exception**: Representa situações excepcionais que ocorrem no aplicativo e das quais o programa pode razoavelmente se recuperar[16].

**Error**: Indica condições anormais e graves da própria JVM (como falta de memória) das quais o programa normalmente não consegue se recuperar


Exceções Verificadas (*Checked*) vs. Não-Verificadas (*Unchecked*)

**Verificadas (** **Checked Exceptions** **)**: São subclasses de `Exception` que não herdam de `RuntimeException`[17]. O compilador impõe estritamente a regra de **"capturar ou declarar"** (`throws`)[17].


**Não-Verificadas (** **Unchecked Exceptions** **)**: Herdam de `RuntimeException` ou `Error` (exemplos: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`)[18][19]. O compilador não exige a declaração ou captura obrigatória, pois geralmente representam falhas de lógica que podem ser evitas com uma boa codificação




