package com.dh.meli.perolas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "produto_has_pedido")
public class ProdutosPedido {
    private long idProduto;
    private long idPedido;
    private int quantidade;
}
