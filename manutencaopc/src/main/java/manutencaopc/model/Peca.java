package manutencaopc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Peca {

    @Id
    private Long id;
    private String nome;
    private String fabricante;
    private Double preco;

    // Construtores
    public Peca() {}

    public Peca(Long id, String nome, String fabricante, Double preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
