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
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "É preciso definir o logradouro.")
    @Column(name = "logradouro", length = 80, nullable = false)
    private String logradouro;

    @NotBlank(message = "É preciso definir o bairro.")
    @Column(name = "bairro", length = 80, nullable = false)
    private String bairro;

    @NotBlank(message = "É preciso definir a cidade.")
    @Column(name = "cidade", length = 80, nullable = false)
    private String Cidade;

    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL) // cliente = nome do campo na tabela cliente que é usado como referência
    //@JsonIgnoreProperties("endereco") // ao prencher os dados do Endereco, não traga os dados do cliente    private Endereco endereco;
    private Cliente cliente;
}
