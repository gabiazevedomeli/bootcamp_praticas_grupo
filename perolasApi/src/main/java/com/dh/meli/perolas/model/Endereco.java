package com.dh.meli.perolas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    private long id;

    private String logradouro;
    private String bairro;
    private String Cidade;
}
