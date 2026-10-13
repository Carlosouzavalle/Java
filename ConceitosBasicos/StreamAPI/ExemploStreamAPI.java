import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Amanda", "Carlos", "Beatriz", "Arthur");

        // Construção do pipeline fluente com a Stream API
        List<String> resultado = nomes.stream()
            .filter(nome -> nome.startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

            System.out.println("Resultado do pipeline: " + resultado);
    }
}

// O que acontece no pipeline de dados:

// **stream()**: A partir da coleção original, cria-se uma visão em fluxo (*stream*) dos dados[1].

// **filter(...)**: É uma operação intermediária sem estado (*stateless*)[2]. Ela recebe uma condição (predicado) e constrói uma nova sequência contendo apenas os elementos que avaliam como `true`[2][3].

// **map(...)**: Outra operação intermediária que mapeia cada elemento recebido para um novo valor transformado[2][3].

// **collect(...)**: É a **operação terminal**[4]. Por causa da avaliação preguiçosa (*lazy evaluation*), o fluxo de filtragem e mapeamento só é de fato executado e processado no instante em que a operação terminal é acionada[4][5].