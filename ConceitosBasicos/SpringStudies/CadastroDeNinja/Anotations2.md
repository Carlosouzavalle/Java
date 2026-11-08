Partindo do absoluto zero


No Java (especialmente em contextos de persistência de dados e frameworks como JPA e Hibernate), uma entidade é uma classe Java simples (um POJO) que representa uma tabela do banco de dados relacional e um conceito do mundo real

// Como a gente cria uma rota?
// é seguindo essa logica aqui

    @RestController 
    public class NinjaController {
    @GetMapping("/ninjas") 
    public String mostrarNinjas() {
        return "Meus Ninjas";
    }
}


@RestController: informa ao Spring que essa classe recebe requisições web e retorna respostas.
@GetMapping("/ninja"): define o endereço que responderá às requisições GET.
mostrarNinja(): é um método Java comum que será executado quando a rota for chamada.
return: devolve o texto como resposta.


Pq funciona dessa forma?

/ninjas/buscar?nome=Naruto

/ninjas/buscar é o caminho da rota.
? inicia os parâmetros da consulta.
nome=Naruto envia um parâmetro chamado nome com o valor Naruto.
@RequestParam String nome recebe esse valor no método Java.

HttpStatus.NOT_FOUND	Informa que o recurso não foi encontrado (404)
ResponseStatusException	Comunica ao Spring qual resposta HTTP deve ser enviada

@RequestBody. Ela informa ao Spring que os dados do objeto serão recebidos no corpo da requisição.


@NotBlank: impede que o texto seja vazio ou composto apenas por espaços.
@Min(1): exige que a idade seja pelo menos 1.
message: define a mensagem associada à validação.


O @Valid pede ao Spring para validar o objeto recebido antes de executar o método.
Por exemplo, se você enviar um JSON com o nome vazio ou idade zero, a validação deverá rejeitar a requisição, normalmente com HTTP 400.


Ninja cadastrado corretamente	HTTP 200
Dados inválidos	HTTP 400
Nome duplicado	HTTP 409 — Conflict


O método findAll() no Java (geralmente usado no Spring Data JPA) é responsável por buscar e retornar todos os registros de uma determinada tabela do banco de dados.

O Stream em Java (introduzido no Java 8 através da Stream API) é uma abstração que permite manipular sequências de dados (como listas e arrays) de forma declarativa e funcional


O orElseThrow() é um método usado para lidar com objetos do tipo Optional no Java.
A função dele é muito simples: "Se o valor estiver presente, me dê o valor. Se estiver vazio, lance uma exceção."