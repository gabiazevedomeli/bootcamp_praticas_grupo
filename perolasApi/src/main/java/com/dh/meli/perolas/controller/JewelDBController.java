package com.dh.meli.perolas.controller;

import com.dh.meli.perolas.model.JewelDB;
import com.dh.meli.perolas.service.JewelDBService;
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
    private JewelDBService jewelService;

    @GetMapping("/{id}")
    public ResponseEntity<JewelDB> getJewelById(@PathVariable Long id) {
        return ResponseEntity.ok(jewelService.getJewelById(id));
    }

    @PostMapping
    public ResponseEntity<JewelDB> createNewJewel(@RequestBody @Valid JewelDB newJewel) {
        System.out.println(newJewel);
        System.out.println("Controller");
        return ResponseEntity.status(HttpStatus.CREATED).body(jewelService.createNewJewel(newJewel));
    }

    // rota funciona
    @GetMapping
    public ResponseEntity<List<JewelDB>> getAllJewels() {
        return ResponseEntity.ok(jewelService.getAllJewels());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJewel(@PathVariable Long id) {
        JewelDB jewelFound = jewelService.getJewelById(id);
        return ResponseEntity.notFound().build();
    }
}

