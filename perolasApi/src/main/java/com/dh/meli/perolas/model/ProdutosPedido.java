package com.dh.meli.perolas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "produto_has_pedido")
public class ProdutosPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduto;
    private long idPedido;
    private int quantidade;
}
