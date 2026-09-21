A diferença principal é:

List é uma interface. ArrayList é uma implementação dessa interface.

Você pode declarar diretamente:

ArrayList<String> nomes = new ArrayList<>();

Aqui você está dizendo:

"Quero especificamente um ArrayList."

//============================================

2. List

Você também pode fazer:

List<String> nomes = new ArrayList<>();

Aqui acontece algo interessante:

List<String>
     ↑
 tipo da variável

new ArrayList<>()
     ↑
 objeto criado

 Você está dizendo:

"Quero trabalhar com uma lista, mas não me importa qual implementação específica."

Para isso, precisa importar:

import java.util.List;
import java.util.ArrayList;

//=========================================

List deixa seu código mais flexível.

List<String> nomes = new ArrayList<>();
Mais tarde você pode trocar:
List<String> nomes = new LinkedList<>();


ArrayList<String> nomes = new ArrayList<>();
você está amarrando a variável à implementação ArrayList.