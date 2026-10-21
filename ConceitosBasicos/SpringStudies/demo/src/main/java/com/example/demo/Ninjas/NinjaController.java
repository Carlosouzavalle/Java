package com.example.demo.Ninjas;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

/**
 * Camada HTTP. Responsabilidades:
 *   - escolher a rota (URL + método)
 *   - converter JSON em objeto (@RequestBody) e objeto em JSON (retorno)
 *   - traduzir o resultado em status HTTP
 *
 * Ela NÃO tem regra de negócio e NÃO toca em entidade.
 * Repare que não existe import de NinjaModel aqui. Isso é proposital.
 */
@RestController
@RequestMapping("/api/ninjas") // prefixo aplicado a TODOS os métodos da classe
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    /**
     * GET /api/ninjas
     * O retorno é convertido pra JSON automaticamente (por causa do @RestController).
     */
    @GetMapping
    public List<NinjaResponseDTO> listarTodos() {
        return ninjaService.listarTodos();
    }

    /**
     * GET /api/ninjas/{id}
     * {id} casa com o @PathVariable. O Long é convertido de String automaticamente.
     */
    @GetMapping("/{id}")
    public NinjaResponseDTO buscarPorId(@PathVariable Long id) {
        return ninjaService.buscarPorId(id);
    }

    /**
     * POST /api/ninjas
     *
     * @RequestBody  -> desserializa o corpo JSON da requisição no NinjaRequestDTO
     * @Valid        -> roda as validações (@NotBlank, @Email, @Min) do DTO.
     *                 Se falhar, a exceção acontece AQUI, antes do método rodar,
     *                 e o GlobalExceptionHandler devolve 400.
     *
     * ResponseEntity.created(...) -> 201 Created + header "Location" com a URL do novo recurso.
     */
    @PostMapping
    public ResponseEntity<NinjaResponseDTO> criar(@RequestBody @Valid NinjaRequestDTO dto) {
        NinjaResponseDTO criado = ninjaService.salvar(dto);
        return ResponseEntity
                .created(URI.create("/api/ninjas/" + criado.id()))
                .body(criado);
    }

    /**
     * PUT /api/ninjas/{id}
     * O id vem SEMPRE da URL, nunca do corpo — é por isso que o
     * NinjaRequestDTO não tem campo id.
     */
    @PutMapping("/{id}")
    public NinjaResponseDTO atualizar(@PathVariable Long id, @RequestBody @Valid NinjaRequestDTO dto) {
        return ninjaService.atualizar(id, dto);
    }

    /**
     * DELETE /api/ninjas/{id}
     * 204 No Content = "deu certo, não há corpo na resposta".
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        ninjaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
