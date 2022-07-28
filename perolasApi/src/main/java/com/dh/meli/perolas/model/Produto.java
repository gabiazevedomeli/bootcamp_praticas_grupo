package com.dh.meli.perolas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter @Setter
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "É preciso definir o nome do produto")
    @Column(name = "nome", length = 80, nullable = false)
    private String nome;

    @NotNull(message = "É preciso definir a categoria")
    @Column(name = "categoria", nullable = false)
    private String categoria;

    @NotNull(message ="É preciso definir o preço do produto")
    @Column(name = "preco", scale = 2, nullable = false)
    private Double preco;
}


