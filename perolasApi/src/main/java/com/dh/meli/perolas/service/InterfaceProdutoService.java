package com.dh.meli.perolas.service;

import com.dh.meli.perolas.model.Produto;

import java.util.List;

public interface InterfaceProdutoService {

    Produto getProdutoById(Long id);

    List<Produto> getTodosProdutos();

    Produto criarProduto(Produto novoProduto);

    Produto atualizarProduto(Long id);

    void deleteJewel(Long id);

}
