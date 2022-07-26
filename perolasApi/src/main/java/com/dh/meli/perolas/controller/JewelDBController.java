package com.dh.meli.perolas.controller;

import com.dh.meli.perolas.model.Produto;
import com.dh.meli.perolas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/jewels")
public class JewelDBController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getJewelById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.getProdutoById(id));
    }

    @PostMapping
    public ResponseEntity<Produto> createNewJewel(@RequestBody @Valid Produto newJewel) {
        System.out.println(newJewel);
        System.out.println("Controller");
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.criarProduto(newJewel));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAllJewels() {
        return ResponseEntity.ok(produtoService.getTodosProdutos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJewel(@PathVariable Long id) {
        Produto jewelFound = produtoService.getProdutoById(id);
        return ResponseEntity.notFound().build();
    }
}

