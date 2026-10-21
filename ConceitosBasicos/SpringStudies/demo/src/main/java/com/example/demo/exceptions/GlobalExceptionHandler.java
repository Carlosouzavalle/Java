package com.example.demo.exceptions;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Missoes.MissoesNotFoundException;
import com.example.demo.Ninjas.NinjaNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

/**
 * TRADUTOR GLOBAL de exceção -> resposta HTTP.
 *
 * @RestControllerAdvice = @ControllerAdvice + @ResponseBody
 *   - @ControllerAdvice: "esta classe se aplica a TODOS os controllers" (em vez de um)
 *   - @ResponseBody: os objetos retornados viram JSON
 *
 * Por que isso importa: o Service NÃO pode saber sobre HTTP. Ele lança
 * NinjaNotFoundException (uma verdade de domínio). Quem traduz "não encontrado"
 * em 404 é esta classe. Se amanhã a API virar um consumer de fila, a mesma
 * exceção continua correta — só o tradutor muda.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /** Ninja não existe -> 404 Not Found. */
    @ExceptionHandler(NinjaNotFoundException.class)
    public ResponseEntity<ErroResponse> ninjaNaoEncontrado(NinjaNotFoundException ex,
            HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErroResponse.de(HttpStatus.NOT_FOUND, ex.getMessage(), request.getRequestURI()));
    }

    /** Missão não existe -> 404 Not Found. */
    @ExceptionHandler(MissoesNotFoundException.class)
    public ResponseEntity<ErroResponse> missaoNaoEncontrada(MissoesNotFoundException ex,
            HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErroResponse.de(HttpStatus.NOT_FOUND, ex.getMessage(), request.getRequestURI()));
    }

    /**
     * Regra de negócio violada -> 400 Bad Request.
     * (email duplicado, idade mínima, nome vazio...)
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErroResponse> argumentoInvalido(IllegalArgumentException ex,
            HttpServletRequest request) {
        return ResponseEntity.badRequest()
                .body(ErroResponse.de(HttpStatus.BAD_REQUEST, ex.getMessage(), request.getRequestURI()));
    }

    /**
     * Validação do DTO (@NotBlank, @Email, @Min) falhou -> 400 com o detalhe por campo.
     *
     * MethodArgumentNotValidException é lançada pelo Spring ANTES do método do
     * Controller rodar, quando o @Valid reprova o objeto desserializado.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErroResponse> validacaoFalhou(MethodArgumentNotValidException ex,
            HttpServletRequest request) {
        Map<String, String> campos = new LinkedHashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(erro -> campos.putIfAbsent(erro.getField(), erro.getDefaultMessage()));

        return ResponseEntity.badRequest()
                .body(ErroResponse.de(HttpStatus.BAD_REQUEST, "Dados inválidos",
                        request.getRequestURI(), campos));
    }

    /**
     * Rede de segurança para qualquer exceção não tratada.
     *
     * Devolve 500 com mensagem genérica — nunca o stack trace, que vaza detalhe
     * interno da aplicação. O log registra o completo para o dev olhar.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroResponse> erroInesperado(Exception ex, HttpServletRequest request) {
        log.error("Erro inesperado em {} {}", request.getMethod(), request.getRequestURI(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErroResponse.de(HttpStatus.INTERNAL_SERVER_ERROR,
                        "Erro interno inesperado", request.getRequestURI()));
    }
}
