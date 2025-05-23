package manutencaopc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especialidade;
    private String telefone;
}
