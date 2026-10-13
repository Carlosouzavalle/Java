**A classe Optional<T>** (disponível no pacote java.util a partir do Java 8) foi criada para gerenciar valores que podem estar ausentes ou nulos de maneira segura e explícita, servindo como uma solução para evitar exceções de ponteiro nulo (NullPointerException).


1\. O Problema da Referência Nula

Ao tentar acessar métodos ou propriedades a partir de uma variável com valor nulo (`null`), a aplicação lança uma **NullPointerException**[2][4]. Além de interromper a execução do programa, a ocorrência desse erro pode ser difícil de depurar em sistemas complexos[2][4].

2\. Funcionamento e Vantagens do `Optional`

O `Optional` funciona como um recipiente (*container*) que encapsula o objeto e possui dois estados possíveis[1][3]:

**Contendo um valor não nulo**[3].

**Vazio** (representado por `Optional.empty()`)[3].

Principais Benefícios:

**Prevenção de Erros**: Elimina a ocorrência inadvertida de `NullPointerException` ao garantir que os valores nulos sejam tratados adequadamente[3][5].

**Programação Defensiva e Clareza**: Sinaliza explicitamente para outros desenvolvedores que determinado valor pode estar ausente, forçando o tratamento prévio dessa condição[1][3].

**Melhor Legibilidade**: Torna o código mais limpo e organizado ao padronizar a checagem de nulos[3][5].


3\. Principais Métodos da Classe

**Optional.ofNullable(valor)**: Cria uma instância de `Optional` contendo o valor passado, ou uma instância vazia caso o valor seja `null`[6][7].

**isPresent()**: Retorna um booleano confirmando se há um valor presente no recipiente[6][7].

**get()**: Recupera o valor armazenado no `Optional`[6][7].

**orElse(outroValor)**: Retorna o valor armazenado ou um valor alternativo padrão (`outroValor`) caso o `Optional` esteja vazio[7].

**orElseGet(supplier)**: Semelhante ao `orElse`, mas aceita um fornecedor (*supplier*) para gerar o valor alternativo[7].

**orElseThrow(exceptionSupplier)**: Retorna o valor armazenado ou lança uma exceção fornecida caso o valor esteja ausente[7].