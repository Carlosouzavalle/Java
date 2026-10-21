package com.example.demo.Ninjas;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface (não classe) — o Spring Data JPA cria a implementação em tempo de execução.
// extends JpaRepository<NinjaModel, Long> = "tenho um repositório da entidade NinjaModel,
//                                            cuja chave primária (id) é Long".
//
// Ao herdar, todos os métodos do JpaRepository já existem: save, findAll, findById, deleteById, count...
// Por isso o corpo da interface fica vazio.
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

    /**
     * QUERY DERIVADA: o Spring Data lê o nome do método e monta o SQL sozinho.
     *
     *   findByEmail            -> SELECT * FROM tb_cadastro WHERE email = ?
     *   existsByEmail          -> SELECT COUNT(*) FROM tb_cadastro WHERE email = ?
     *   existsByEmailAndIdNot  -> SELECT COUNT(*) FROM tb_cadastro WHERE email = ? AND id <> ?
     *
     * O parser divide o nome em: find/exists + By + <condição>.
     * Condições comuns: By, And, Or, Not, Like, Containing, StartingWith,
     * Between, GreaterThan, LessThan, In, OrderBy...
     *
     * Quando o método não dá pra deduzir, use @Query("SELECT ... JPQL ...") por cima.
     */
    Optional<NinjaModel> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByEmailAndIdNot(String email, Long id);
}
