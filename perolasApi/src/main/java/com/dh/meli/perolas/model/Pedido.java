package com.dh.meli.perolas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {
    private long id_pedido;
    private double total;
}
