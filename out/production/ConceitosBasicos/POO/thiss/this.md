🤔 Mas por que usar this?

O caso mais importante aparece no construtor.

Imagine:

`public class Pessoa {

    String nome;

    Pessoa(String nome) {
        nome = nome;
    }
}`


Parece correto, mas não está fazendo o que queremos.

Temos dois nome:

_**nome do parâmetro &
nome do atributo**_

Quando fazemos:

**_nome = nome;_**

o Java não consegue usar isso para atribuir o parâmetro ao atributo da maneira que queremos.

Então usamos:

`public class Pessoa {

    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}`

Agora:

**_this.nome
↑
atributo da classe

nome
↑
parâmetro_**

Ou seja:

**_this.nome = nome;_**

A ideia é essa
"Pegue o nome que recebi como parâmetro e coloque no nome deste objeto."