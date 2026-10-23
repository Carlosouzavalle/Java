package com.Study.CadastroDeNinja;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {

}

// O repositório será responsável por permitir que nossa aplicação consulte, salve e exclua ninjas no banco de dados.
// JpaRepository<Ninja, Long> 
// Ninja: a entidade que queremos armazenar.
// Long: o tipo do identificador da entidade, que é o campo id.

// JpaRepository, o Spring Data JPA disponibiliza vários métodos prontos.

// Método	            Para que serve
// save(ninja)	        Salvar ou atualizar um ninja
// findAll()	        Buscar todos os ninjas
// findById(id)	        Buscar um ninja pelo ID
// deleteById(id)	    Excluir um ninja pelo ID
// existsById(id)	    Verificar se um ID existe


// Uma analogia: pense no NinjaRepository como um funcionário que sabe conversar com o banco. Você pede para ele salvar um ninja, e ele cuida dos detalhes da operação.