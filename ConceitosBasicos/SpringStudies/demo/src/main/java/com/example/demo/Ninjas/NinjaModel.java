package com.example.demo.Ninjas;

import com.example.demo.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// Entity ele transforma a classe em uma entidade do DB
// JPA = java persistence API
@Entity 
@Table(name = "tb_cadastro")
@NoArgsConstructor
@Data // ele cria os getters e setters automaticamente
// Ver MissoesModel: comparar apenas pelo id quebra a recursão infinita entre as entidades.
@EqualsAndHashCode(of = "id")
public class NinjaModel {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // O ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreign key
    private MissoesModel missoes;
}




// ./mvnw spring-boot:run 
// mvnw — Maven Wrapper É um script que permite executar o Maven usando a versão definida pelo projeto, sem depender de uma instalação global do Maven. Se necessário, ele baixa essa versão.

// O pom.xml é um dos arquivos mais importantes do seu projeto Maven. Ele define informações como dependências, plugins e configurações de compilação.

// Comando	O que faz

// ./mvnw spring-boot:run	Executa a aplicação Spring Boot usando o Wrapper.
// ./mvnw clean	Remove os arquivos gerados anteriormente, normalmente em target/.
// ./mvnw test	Executa os testes automatizados configurados no projeto.
// ./mvnw package	Compila, executa as etapas de teste previstas e empacota a aplicação.
// java -jar target/arquivo.jar	Executa um JAR executável já gerado, se ele estiver configurado para isso.


