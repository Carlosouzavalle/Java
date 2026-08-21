O que é um Array?

Um Array é uma estrutura que permite guardar vários valores do mesmo tipo dentro de uma única variável.

Em vez de fazer:

int idade1 = 20;
int idade2 = 25;
int idade3 = 30;
int idade4 = 35;

Você pode fazer:

int[] idades = {20, 25, 30, 35};

Agora idades guarda 4 valores.

==================================================

Índices

A principal coisa para entender é que o Array começa no índice 0.

int[] idades = {20, 25, 30, 35};

Fica assim:

Valor:     20    25    30    35
Índice:     0     1     2     3

Então:

System.out.println(idades[0]);

Resultado:

20

E:

System.out.println(idades[2]);

Resultado:

30


===============================================================

Alterando um valor

Você pode alterar uma posição:

idades[0] = 21;

Agora:

Valor:     21    25    30    35
Índice:     0     1     2     3


======================================================


Criando um Array vazio

Você também pode definir o tamanho primeiro:

int[] idades = new int[5];

Isso cria espaço para 5 inteiros.

Inicialmente:

[0, 0, 0, 0, 0]

Depois você pode preencher:

idades[0] = 20;
idades[1] = 25;
idades[2] = 30;
idades[3] = 35;
idades[4] = 40;


length

Para descobrir o tamanho do Array:

System.out.println(idades.length);

Resultado:

5

⚠️ Em Java é length, não length().

idades.length    // correto
idades.length()  // errado

Isso é diferente de alguns métodos/classes que possuem length().


============================================================


Percorrendo com for

Aqui começa a ficar realmente útil:

int[] idades = {20, 25, 30, 35, 40};


for (int i = 0; i < idades.length; i++) {
    System.out.println(idades[i]);
}

Resultado:

20
25
30
35
40

A variável i representa o índice:

i = 0 → idades[0]
i = 1 → idades[1]
i = 2 → idades[2]
i = 3 → idades[3]
i = 4 → idades[4]



for-each

Java também possui uma forma mais simples de percorrer:

int[] idades = {20, 25, 30, 35, 40};


for (int idade : idades) {
    System.out.println(idade);
}

Aqui você não trabalha diretamente com o índice.

É como dizer:

"Para cada idade dentro de idades, faça isso."


====================================================================


Arrays de outros tipos

Não precisa ser apenas int.

double
double[] precos = {10.50, 20.75, 30.99};
String
String[] nomes = {"Carlos", "João", "Maria"};
char
char[] letras = {'A', 'B', 'C'};
boolean
boolean[] respostas = {true, false, true};

⚠️ Uma limitação importante

Um Array Java tem tamanho fixo.

Se você fizer:

int[] numeros = new int[3];

você criou espaço para exatamente 3 elementos:

[0] [0] [0]

Não pode simplesmente fazer:

numeros[3] = 40;

Isso causaria:

ArrayIndexOutOfBoundsException

porque os índices disponíveis são:

0
1
2

Se você precisar de uma estrutura que possa crescer e diminuir, aí entra o ArrayList:

ArrayList<Integer> numeros = new ArrayList<>();