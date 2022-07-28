package com.dh.meli.perolas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "É preciso definir o nome do cliente.")
    @Column(name = "nome", length = 80, nullable = false)
    private String nome;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
}
