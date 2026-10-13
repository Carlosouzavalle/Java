package PathFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class ExemploFilesPath {
    public static void main(String[] args) {
        try {
            // 1\. Mapeamento do caminho do diretório e do arquivo
            Path pasta = Path.of("C:\\Users\\Usuario\\Documents\\Java\\ConceitosBasicos\\PathFiles");
            Path arquivo = pasta.resolve("dados.txt");

            // 2\. Criação do diretório caso não exista
            if (Files.notExists(pasta)) {
                Files.createDirectories(pasta);
                System.out.println("Diretório criado: " + pasta.toAbsolutePath());
            }

            // 3\. Escrita rápida no arquivo (Files.writeString - Java 11+)
            String conteudo = "Linha 1: Aprendendo Java NIO.2\\n" + 
                                "Linha 2: Manipulando Path e Files\\n" 
                                + "Linha 3: Processando dados com Stream API";

            Files.writeString(arquivo, conteudo, StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );
            System.out.println("Arquivo criado/atualizado: " + arquivo.getFileName());

            // 4\. Leitura do conteúdo completo como String (Files.readString)
            System.out.println("\n Conteúdo do arquivo: ");
            String textoLido = Files.readString(arquivo);
            System.out.println(textoLido);


            // 5\. Leitura em fluxo linha a linha com a Stream API (Files.lines)
            System.out.println("\n--- Filtrando linhas com Stream API ---");
            try(Stream<String> linhas = Files.lines(arquivo)) {
                linhas.filter(linha -> linha.contains("Stream"))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
            }


            // 6\. Listagem de arquivos de um diretório com Stream API (Files.list)
            System.out.println("\n --- Listando arquivos de dirretório ---");
            try(Stream<Path> conteudoPasta = Files.list(pasta)) {
                conteudoPasta.forEach(p -> System.out.println("Encontrado: " + p.getFileName()));
            }


        } catch (Exception e) {
            System.out.println("Erro ao criar o diretório: " + e.getMessage());
        }   
    }
}


// **Path.of("pasta").resolve("dados.txt")**: Concatena diretórios e arquivos de forma segura, adaptando os separadores de caminho (`/` ou `\`) automaticamente de acordo com o sistema operacional (Windows, Linux ou macOS).


// **Files.writeString()** **e** **Files.readString()**: Métodos convenientes para escrita e leitura direta de arquivos de texto sem a necessidade de instanciar `FileWriter` ou `BufferedReader` manualmente.

// Files.lines(arquivo): Retorna uma Stream<String> onde cada elemento é uma linha do arquivo. Como essa Stream mantém o arquivo aberto durante o processamento, ela deve ser declarada dentro de um bloco try-with-resources para garantir o fechamento correto do arquivo.

// Files.list(pasta): Retorna uma Stream<Path> contendo todos os arquivos e subpastas do diretório informado, facilitando buscas e filtragens avançadas.