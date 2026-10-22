Partindo do absoluto zero


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