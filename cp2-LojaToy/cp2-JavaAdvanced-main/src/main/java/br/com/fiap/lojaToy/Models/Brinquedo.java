package br.com.fiap.lojaToy.Models;


import jakarta.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name="Brinquedos")
public class Brinquedo {
    @Id
    @Column(name="id")
    public Long id;

    @Column(name="nome")
    @Size(min = 10, max = 200, message = "O nome precisa ter entre 10 e 200 caracteres")
    public String nome;

    @Column(name="tamanho")
    @Size(min = 1, max = 20, message = "O tamanho precisa ter entre 1 e 20 caracteres")
    public String tamanho;

    @Column(name="preco")
    public Double preco;

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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
