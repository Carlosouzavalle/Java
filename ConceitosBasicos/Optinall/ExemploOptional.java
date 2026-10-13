package Optinall;

import java.util.Optional;

public class ExemploOptional {
        public static void main(String[] args) {
        String texto = "Olá, mundo!";

        // 1\. Criando um Optional seguro que aceita valores ou null
        Optional<String> optionalTexto = Optional.ofNullable(texto);


        // 2\. Verificando se há um valor presente com isPresent() e obtendo com get()
        if(optionalTexto.isPresent()) {
            String maiusculo = optionalTexto.get().toUpperCase();
            System.out.println(maiusculo);
        } else {
            System.out.println("Texto ausente");
        }

        // 3\. Definindo um valor padrão alternativo com orElse()

        String textoNulo = null;
        String resultadoFinal = Optional.ofNullable(textoNulo).orElse("Valor padrão de inicio");
        System.out.println(resultadoFinal);
        
        // 4\. Lançando uma exceção se o valor estiver ausente com orElseThrow()

        try {
            Optional.ofNullable(textoNulo)
                .orElseThrow(() -> new IllegalArgumentException("O valor fornecido é nulo"));
        } catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    
    }
}


// Funcionamento dos Métodos Utilizados:

// **Optional.ofNullable(valor)**: Instancia um objeto `Optional` contendo o valor fornecido ou cria um recipiente vazio caso a variável seja `null`[1][2].

// **isPresent()** **e** **get()**: O método `isPresent()` checa se existe um valor contido dentro do objeto antes que o método `get()` seja chamado para extraí-lo com segurança[1][2].

// **orElse(outroValor)**: Retorna o valor armazenado caso ele exista ou fornece o `outroValor` de reserva caso o `Optional` esteja vazio[2].

// **orElseThrow()**: Lança uma exceção customizada especificada pelo programador caso o valor esteja ausente[2].