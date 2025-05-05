package manutencaopc.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String fabricante;
    private BigDecimal preco;

    // Getters e Setters
}
