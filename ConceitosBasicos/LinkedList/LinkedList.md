Uma **LinkedList** (lista encadeada ou ligada) no Java é uma classe concreta pertencente ao *Java Collections Framework* que implementa as interfaces **List** e **Deque**

### 1\. Estrutura de Memória e Funcionamento Interno

* **Nós e Ponteiros**: Ao contrário do `ArrayList` (que armazena os elementos em um array contíguo na memória), a `LinkedList` guarda seus elementos espalhados em posições de memória não contíguas.
* Cada elemento é encapsulado em um objeto interno chamado **Nó** (`Node`).
* Por se tratar de uma **lista duplamente encadeada**, cada nó contém três partes: o dado propriamente dito, uma referência (ponteiro) para o nó anterior e uma referência para o próximo nó da sequência.


### 2\. Comparativo: `LinkedList` vs `ArrayList`


Acesso Aleatório: O ArrayList é muito superior para consultas diretas por índice (get(i) é $O(1)). Na LinkedList, a busca por índice é lenta ($O(N))

Inserção/Remoção no Início: No ArrayList, inserir no início exige deslocar todos os outros elementos na memória ($O(N)). Na LinkedList, essa operação é instantânea

Uso de Memória: O `ArrayList` é mais amigável ao cache da CPU por utilizar dados contíguos[4]. A `LinkedList` consome mais memória devido ao overhead de criar e manter objetos `Node` e seus ponteiros.


### 3\. Quando Utilizar a `LinkedList`

A `LinkedList` é indicada principalmente para:

* **Estruturas do tipo Fila (** **Queue** **) ou Deque**: Quando a aplicação precisa inserir e remover elementos constantemente das pontas

* **Recursos de Undo/Redo (Desfazer/Refazer)**: Históricos e filas de tarefas onde inserções e remoções são feitas frequente e diretamente nas extremidades