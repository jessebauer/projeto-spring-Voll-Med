package med.voll.api.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter // Gerar métodos getters
@NoArgsConstructor // Gera construtor Default, sem argumentos obrigatorio pela JPA
@AllArgsConstructor // Gera um construtor com 1 parametro para cada atributo da classe
@EqualsAndHashCode(of = "id") // Gera método equals e hashcode apenas para o campo id
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
}
