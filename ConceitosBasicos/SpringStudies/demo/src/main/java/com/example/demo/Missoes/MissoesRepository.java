package com.example.demo.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// Mesmo padrão da NinjaRepository, agora para a entidade MissoesModel.
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
