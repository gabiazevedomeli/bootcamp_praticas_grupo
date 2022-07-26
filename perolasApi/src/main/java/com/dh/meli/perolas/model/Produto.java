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

    @NotBlank(message = "Material must to be specified.")
    @Column(name = "material", length = 80, nullable = false)
    private String material;

    @NotNull(message = "Weight must to be specified.")
    @Column(name = "weight", scale = 2, nullable = false)
    private Double weight;

    @NotNull(message = "Carats must to be specified.")
    @Column(name = "carats", nullable = false)
    private Integer carats;
}


