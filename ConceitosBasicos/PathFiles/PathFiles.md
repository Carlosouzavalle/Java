No Java, as classes **Path** e **Files** fazem parte do pacote **java.nio.file** (introduzido no Java 7 como parte da API NIO.2). Elas representam a forma moderna, eficiente e recomendada para manipular arquivos e diretórios, substituindo a antiga classe `java.io.File`.

1\. O que é a interface `Path`?

**Representação de Caminho**: A interface **Path** representa a localização/caminho de um arquivo ou diretório no sistema de arquivos (seja um caminho relativo ou absoluto).

**Sem Efeitos Colaterais**: Criar um objeto `Path` apenas mapeia um caminho na memória — **não verifica nem cria** o arquivo no disco rígido automaticamente.

**Criação de Caminhos**:
* No Java 11+: `Path caminho = Path.of("pasta", "arquivo.txt");`
* No Java 7 ao 10: `Path caminho = Paths.get("pasta/arquivo.txt");`

2\. O que é a classe `Files`?

Ao contrário de `Path` (que apenas guarda o endereço), a classe **Files** é uma **classe utilitária estática** que executa as operações reais no sistema de arquivos utilizando os objetos `Path`.

Principais Operações da Classe `Files`:



| Operação | Método | Descrição |
| :--- | :--- | :--- |
| **Verificação** | `Files.exists(path)` / `Files.notExists(path)` | Checa se o arquivo ou diretório realmente existe no disco. |
| **Criação** | `Files.createFile(path)` / `Files.createDirectories(path)` | Cria um novo arquivo ou uma estrutura completa de diretórios. |
| **Leitura Rápida** | `Files.readString(path)` / `Files.readAllLines(path)` | Lê todo o conteúdo de um arquivo de texto diretamente. |
| **Escrita Rápida** | `Files.writeString(path, conteudo)` | Escreve ou sobrescreve texto em um arquivo. |
| **Cópia e Mover** | `Files.copy(origem, destino)` / `Files.move(origem, destino)` | Copia ou move arquivos entre caminhos com opções configuráveis. |
| **Exclusão** | `Files.delete(path)` / `Files.deleteIfExists(path)` | Remove o arquivo do sistema de arquivos. |

3\. Vantagens em relação ao antigo `java.io.File`

**Integração com Streams**: Métodos como `Files.lines(path)` e `Files.walk(path)` retornam Stream< String > ou Stream< Path > , permitindo filtrar e processar arquivos grandes de forma preguiçosa (*lazy evaluation*) sem carregar tudo na memória.

**Tratamento de Exceções Claro**: Lança exceções específicas de E/S (como `NoSuchFileException` ou `DirectoryNotEmptyException`), facilitando o diagnóstico de erros.

**Atributos e Metadados**: Permite consultar facilmente permissões de arquivos, datas de criação, modificação e proprietários através de `Files.getAttribute()` ou views de atributos (`BasicFileAttributes`).

**Suporte a Links Simbólicos**: Lida nativamente com atalhos e links simbólicos no sistema operacional.