package com.example.demo.Missoes;

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
 * Mesmo padrão do NinjaController. Note que aqui o DTO serve tanto de entrada
 * quanto de saída (por isso o id existe no MissoesDTO).
 *
 * Mesmo assim, o id NÃO pode ser forjado: o MissoesMapper.toModel() copia só
 * nomeDaMissao e dificuldadeMissao para a entidade. O id é sempre gerado pelo banco.
 */
@RestController
@RequestMapping("/api/missoes")
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping
    public List<MissoesDTO> listarTodos() {
        return missoesService.listarTodos();
    }

    @GetMapping("/{id}")
    public MissoesDTO buscarPorId(@PathVariable Long id) {
        return missoesService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<MissoesDTO> criar(@RequestBody @Valid MissoesDTO dto) {
        MissoesDTO criada = missoesService.salvar(dto);
        return ResponseEntity
                .created(URI.create("/api/missoes/" + criada.id()))
                .body(criada);
    }

    @PutMapping("/{id}")
    public MissoesDTO atualizar(@PathVariable Long id, @RequestBody @Valid MissoesDTO dto) {
        return missoesService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        missoesService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
