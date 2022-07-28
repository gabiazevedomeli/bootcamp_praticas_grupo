package com.dh.meli.perolas.service;

import com.dh.meli.perolas.model.Produto;
import com.dh.meli.perolas.repository.InterfaceProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.meli.perolas.exceptions.*;

import java.util.List;

@Service
public class ProdutoService implements InterfaceProdutoService {

    @Autowired
    private InterfaceProdutoRepository produtoRepo;

    @Override
    public Produto getProdutoById(Long id) {
        return produtoRepo.findById(id).orElseThrow(()-> new LojaNotFoundException("Produto não encontrado."));
    }

    @Override
    public List<Produto> getTodosProdutos() {
        return (List<Produto>) produtoRepo.findAll();
    }

    @Override
    public Produto criaProduto(Produto novoProduto) {
        if (novoProduto.getId() != null) {
            throw new BadRequestException("O produto não pode ter id.");
        }
        System.out.println(novoProduto);
        return produtoRepo.save(novoProduto);
    }

    @Override
    public Produto atualizaProduto(Long id) {
        return null;
    }

    @Override
    public void deletaProduto(Long id) {
        if (produtoRepo.findById(id).isPresent()) {
            produtoRepo.deleteById(id);
        }
    }
}
