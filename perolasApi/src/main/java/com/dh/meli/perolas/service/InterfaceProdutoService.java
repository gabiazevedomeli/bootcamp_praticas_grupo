package com.dh.meli.perolas.service;

import com.dh.meli.perolas.model.Produto;

import java.util.List;

public interface InterfaceProdutoService {

    Produto getProdutoById(Long id);

    List<Produto> getTodosProdutos();

    Produto criaProduto(Produto novoProduto);

    Produto atualizaProduto(Long id);

    void deletaProduto(Long id);

}
