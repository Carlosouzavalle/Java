Tipos de Dados Primitivos e Retornos

• boolean: Declara uma variável lógica (verdadeiro ou falso).
• byte: Declara um tipo inteiro de 8 bits.
• char: Declara um tipo de caractere Unicode de 16 bits.
• double: Declara um número de ponto flutuante de dupla precisão de 64 bits.
• float: Declara um número de ponto flutuante de precisão simples de 32 bits.
• int: Declara um número inteiro de 32 bits.
• long: Declara um número inteiro de 64 bits.
• short: Declara um número inteiro de 16 bits.
• void: Indica que um método não retorna nenhum valor.

Modificadores de Acesso

• private: Torna o membro acessível apenas dentro da própria classe.

• protected: Permite acesso para classes do mesmo pacote ou subclasses (herança).

• public: Torna a classe ou membro acessível a partir de qualquer outra classe.

Modificadores de Classes, Métodos e Variáveis

• abstract: Cria classes que não podem ser instanciadas ou métodos sem corpo que devem ser sobrescritos.

• final: Define uma variável constante (imutável), impede que um método seja sobrescrito ou que uma classe seja herdada.

• native: Indica que o método foi escrito em outra linguagem (ex: C ou C++) através de JNI.

• static: Vincula um membro (método ou atributo) diretamente à classe e não a uma instância individual.

• strictfp: Garante que os cálculos de ponto flutuante sigam rigorosamente as regras do padrão IEEE 754 em todas as plataformas.
• synchronized: Bloqueia uma seção de código para ser executada por apenas uma thread por vez (segurança concorrente).
• transient: Impede que um campo específico seja serializado (salvo em disco/rede).
• volatile: Garante que modificações em uma variável sejam imediatamente visíveis para outras threads.

Tratamento de Exceções

• catch: Bloco responsável por capturar e tratar erros disparados no bloco try.
• finally: Bloco executado obrigatoriamente após um try-catch, independente de ter ocorrido erro ou não.
• throw: Lança explicitamente uma exceção para o sistema.
• throws: Declara na assinatura de um método quais exceções ele pode disparar.
• try: Delimita um bloco de código onde podem ocorrer exceções monitoradas.


Declaração e Relacionamento de Classes/Objetos


• class: Define uma nova classe no modelo orientado a objetos.
• enum: Declara um tipo especial de classe contendo um conjunto fixo de constantes.
• extends: Indica que uma classe está herdando de outra (superclasse).
• implements: Indica que uma classe irá implementar os métodos de uma ou mais interfaces.
• instanceof: Operador que verifica se um objeto pertence a um tipo de classe específico.
• interface: Define um contrato contendo métodos que outras classes devem implementar.
• new: Aloca memória e invoca o construtor para criar um novo objeto.
• super: Referencia o construtor ou membros da classe pai (superclasse).
• this: Referencia a instância do objeto atual.