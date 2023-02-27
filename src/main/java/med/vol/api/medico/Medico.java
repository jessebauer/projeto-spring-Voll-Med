package med.vol.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.vol.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter // Gerar métodos getters
@NoArgsConstructor // Gera construtor Default, sem argumentos obrigatorio pela JPA
@AllArgsConstructor // Gera um construtor com 1 parametro para cada atributo da classe
@EqualsAndHashCode(of="id") // Gera método equals e hashcode apenas para o campo id
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING) //Mostrar que é um Enum
    private Especialidade especialidade;

    @Embedded //Incorpora valores da classe endereço
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.telefone = dados.telefone();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
