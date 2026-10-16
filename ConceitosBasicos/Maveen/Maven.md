O **Maven** é uma das ferramentas de automação de *build* e gerenciador de dependências mais populares e utilizadas no ecossistema Java[1].


1\. Para que serve o Maven?

**Gerenciamento de Dependências**: Antigamente, os desenvolvedores precisavam baixar arquivos `.jar` manualmente e incluí-los no projeto ou no controle de versão (Git/SVN), o que deixava os repositórios pesados[1][4]. Com o Maven, você apenas declara qual biblioteca precisa e ele faz o download e gerenciamento de versões automaticamente[4].

**Repositório Local (** **.m2** **)**: Quando o Maven baixa uma dependência, ele a armazena na pasta local `.m2/repository` no diretório do usuário[4][5]. Se múltiplos projetos utilizarem a mesma biblioteca, o Maven compartilha a dependência localmente a partir desse diretório, economizando espaço em disco e tráfego de rede[4][6].

**Padronização de Projetos**: O Maven define uma estrutura padrão de arquivos e pastas para aplicações Java, além de permitir o uso de arquétipos (*archetypes*) para criar modelos de projetos pré-configurados com poucos comandos[6][7].



2\. O Arquivo `pom.xml` (*Project Object Model*)

O **pom.xml** é o arquivo central de configuração de qualquer projeto Maven[4][8]. É nele que são descritas as informações do projeto, dependências, propriedades e plugins de build[8].

As principais tags contidas no `pom.xml` incluem:

<groupId>: Define a organização ou pacote raiz da aplicação (ex: br.com.erudio ou dev.expert).

<artifactId>: É o nome do projeto/artefato gerado.

<version>: Especifica a versão atual da aplicação (ex: 0.0.1-SNAPSHOT).

<parent>: Permite herdar configurações e gerenciamento de versões de um projeto pai (muito comum em aplicações Spring Boot com o spring-boot-starter-parent).

<dependencies>: Bloco onde são listadas todas as bibliotecas externas que o projeto necessita (como drivers de banco de dados, bibliotecas de testes, etc.).

<build> / <plugins>: Configura os plugins de compilação e empacotamento, como o plugin para geração do executável JAR.



3\. Estrutura de Pastas Padrão do Maven

O Maven adota uma convenção clara para a organização do código-fonte[7]:

**src/main/java**: Contém as classes e o código-fonte principal em Java[7][15].

**src/main/resources**: Guarda arquivos de configuração (como o `application.properties`) e recursos estáticos[7][15].

**src/test/java**: Contém o código dos testes automatizados (como testes com JUnit)[7][15].

**src/test/resources**: Arquivos estáticos e de configuração específicos para o ambiente de testes[7][15].

**target/**: Pasta criada dinamicamente na compilação do projeto, onde ficam as classes compiladas e o arquivo executável final (`.jar` ou `.war`)[8][15].


4\. Ciclo de Vida e Comandos


Durante a compilação e execução de um projeto, o Maven executa fases de seu ciclo de vida[15]:

**clean**: Limpa a pasta `target/`, removendo compilações antigas[15].

**compile**: Compila todo o código-fonte Java do projeto.

**test**: Executa os testes unitários automatizados.

**install**: Compila, testa, empacota e instala o artefato gerado (JAR) na pasta `.m2` da sua máquina[15].