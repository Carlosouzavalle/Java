O HashSet é uma coleção do Java que armazena elementos sem permitir duplicatas e sem garantir ordem. Ele é ideal quando você precisa garantir que cada item exista apenas uma vez na lista e quer verificar se algo está lá dentro de forma muito rápida.


Sem itens repetidos. Se você tentar adicionar dois objetos iguais, o HashSet ignora o segundo. Para saber se dois objetos User são iguais, ele usa exatamente os métodos equals() e hashCode()

Sem ordem fixa. Diferente de um ArrayList, os itens não ficam na ordem em que foram inseridos. A posição de cada item na memória é definida por um cálculo matemático chamado hash.

Busca instantânea. Ele é muito rápido para adicionar, remover ou procurar itens usando o método .contains().


Por que o hashCode() que adicionamos é tão importante?

Quando você chama usuarios.add(), o HashSet primeiro pede o número do hashCode() do objeto para saber em qual "gaveta" da memória vai guardá-lo. Se já existir alguém naquela gaveta, ele usa o equals() para confirmar se são realmente iguais. Sem o hashCode(), o HashSet colocaria os dois usuários "Ana" em gavetas diferentes e deixaria passar a duplicata.