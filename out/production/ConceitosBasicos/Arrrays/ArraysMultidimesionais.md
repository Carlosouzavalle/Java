Arrays Multidimesionais

1. Array bidimensional
O caso mais comum é uma matriz 2D, com linhas e colunas.

Imagine uma tabela:

        Coluna
          0   1   2
       ┌─────────────
Linha 0│ 10  20  30
Linha 1│ 40  50  60
Linha 2│ 70  80  90

Em Java:

int[][] numeros = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

Você pode acessar os valores usando:

numeros[linha][coluna]



2. Como visualizar
Pense nisso:

int[][] numeros = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

Como:

numeros
   │
   ├── [0] → {10, 20, 30}
   │             ↑  ↑  ↑
   │             0  1  2
   │
   ├── [1] → {40, 50, 60}
   │             ↑  ↑  ↑
   │             0  1  2
   │
   └── [2] → {70, 80, 90}
                 ↑  ↑  ↑
                 0  1  2



3. Criando uma matriz vazia

Você também pode definir o tamanho:

int[][] matriz = new int[3][3];

Isso cria:

0  0  0
0  0  0
0  0  0

Depois:

matriz[0][0] = 10;
matriz[1][1] = 50;
matriz[2][2] = 90;

Fica:

10  0  0
 0 50  0
 0  0 90



 4. Percorrendo uma matriz

Aqui entra uma coisa importante: normalmente usamos dois for.

int[][] numeros = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};


for (int linha = 0; linha < numeros.length; linha++) {


    for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
        System.out.println(numeros[linha][coluna]);
    }


}

O primeiro for percorre as linhas:

linha = 0
linha = 1
linha = 2

O segundo percorre as colunas.




5. Imprimindo como uma matriz

Se quiser manter o formato de tabela:

for (int linha = 0; linha < numeros.length; linha++) {


    for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
        System.out.print(numeros[linha][coluna] + " ");
    }


    System.out.println();
}

Resultado:

10 20 30
40 50 60
70 80 90

A diferença entre:

System.out.print()

e:

System.out.println()

é importante aqui.

print() continua na mesma linha.

println() pula para a próxima linha.


6. for-each

Também podemos usar for-each:

for (int[] linha : numeros) {


    for (int numero : linha) {
        System.out.print(numero + " ");
    }


    System.out.println();
}

Aqui:

for (int[] linha : numeros)

significa:

Para cada linha dentro da matriz.

E:

for (int numero : linha)

significa:

Para cada número dentro daquela linha.


7. E pode ter 3 dimensões

Sim.

Você pode fazer:

int[][][] numeros = new int[2][3][4];

Agora temos:

2 blocos
 └── 3 linhas
      └── 4 colunas

Para acessar:

numeros[0][1][2]

A ideia é:

[bloco][linha][coluna]

E você poderia ter:

int[][][][] numeros;

etc.

Mas no dia a dia, 2 dimensões já são extremamente comuns.


Uma diferença interessante do Java

Em Java, int[][] tecnicamente não é uma "matriz rígida" como você pode imaginar.

É um array cujos elementos são outros arrays.

Por isso você pode fazer:

int[][] numeros = {
    {10, 20},
    {30, 40, 50},
    {60}
};

Isso é válido!

Temos:

10 20
30 40 50
60

Cada linha pode ter um tamanho diferente.

Isso é chamado de array irregular (jagged array).

Então quando você faz:

numeros.length

obtém a quantidade de linhas.

E:

numeros[0].length

obtém a quantidade de elementos da primeira linha.

Já:

numeros[1].length

obtém a quantidade de elementos da segunda.

Esse detalhe é bastante importante em Java e também aparece em C#.