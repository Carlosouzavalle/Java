package com.example.demo.Missoes;

import java.util.List;

import com.example.demo.Ninjas.NinjaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@Data
// equals/hashCode comparam APENAS o id. Sem isso, comparar dois ninjas da mesma
// missão entraria em recursão infinita: ninja -> missoes -> ninjas -> ninja -> ...
// Em entidades JPA a identidade do registro é sempre a chave primária.
@EqualsAndHashCode(of = "id")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String dificuldadeMissao;

    // uma missão pode ter varios ninjas
    // mappedBy = "missoes" diz qual é o campo da outra classe que guarda a FK.
    @OneToMany(mappedBy = "missoes")
    @ToString.Exclude // evita recursão infinita no toString() (log, exceções...)
    private List<NinjaModel> ninjas;

}
