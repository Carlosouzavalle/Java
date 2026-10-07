Os **Generics** (tipos genéricos) foram introduzidos no Java 5 para permitir que classes, interfaces e métodos operem com parâmetros de tipo[1]. Essa funcionalidade foi desenvolvida especialmente para fortalecer o *Java Collections Framework*

O Problema Anterior vs. A Solução com Generics

**Antes dos Generics (Java 1.4 e anteriores):** Coleções armazenavam referências genéricas do tipo `Object`[6][7]. O desenvolvedor precisava lembrar qual tipo de objeto havia inserido e realizar coerções explícitas (*casts*) ao extrair os elementos[6][7]. Erros de conversão só apareciam em tempo de execução na forma de `ClassCastException`[8].

**Com Generics (Java 5+):** É possível especificar o tipo exato de objeto contido na coleção, como List<string> ou Lis<Integer> O compilador assume a responsabilidade de verificar os tipos no momento da compilação, prevenindo erros de conversão no código executável e dispensando o *cast* manual


Principais Conceitos

A. Parâmetros de Tipo (*Type Parameters*) e Argumentos de Tipo

Ao declarar uma classe ou método genérico, utilizam-se letras entre colchetes angulares como marcadores de posição

**T** (*Type*): Usado para representar um tipo geral
**E** (*Element*): Usado em coleções para indicar o tipo do elemento (ex: `List
**K, V** (*Key, Value*): Usados em mapas para representar chave e valor (ex: `Map

Ao instanciar a estrutura, fornece-se o argumento de tipo concreto, como `ArrayList

B. Apagamento de Tipo (*Type Erasure*)

O Java implementa os Generics através do processo de **apagamento de tipo** (*erasure*)

O compilador utiliza as informações de tipo para verificar a segurança do código e inserir os *casts* necessários, mas remove os parâmetros de tipo ao gerar o *bytecode*[17]

Isso garante **compatibilidade binária** com bibliotecas e códigos legados criados para versões mais antigas do Java[19][20]. Em tempo de execução, instâncias como `List<Integer> e `List<String> são representadas pelo mesmo tipo bruto (*raw type*) `List`[17][21].

C. Curingas (*Wildcards*) e Limites (*Bounds*)


Para permitir flexibilidade com polimorfismo em estruturas genéricas, o Java utiliza o caractere curinga **?**

**? extends T** **(Limite Superior):** Permite ler elementos do tipo `T` ou de qualquer uma de suas subclasses[23][24]. Segue o princípio de leitura (*Get Principle*

**? super T** **(Limite Inferior):** Permite inserir elementos do tipo `T` ou de qualquer uma de suas superclasses[24][26]. Segue o princípio de escrita (*Put Principle*)

**?** **(Curinga Não Limitado):** Representa `? extends Object`

3\. Restrições Importantes

**Tipos Primitivos Não São Aceitos Diretamente:** Parâmetros de tipo devem ser sempre tipos de referência (classes, interfaces ou arrays)[28][29]. Por isso, usa-se `List<Integer> em vez de `List<int> contando com o *autoboxing* para converter os valores primitivos[14].

**Criação Direta de Arrays Genéricos**: Não é permitido instanciar um array de tipo genérico direto (como new T ou new List<String>). Como os tipos genéricos sofrem apagamento e os arrays mantêm a informação do seu tipo em tempo de execução (reification), o compilador bloqueia essa criação para evitar falhas de tipagem.

