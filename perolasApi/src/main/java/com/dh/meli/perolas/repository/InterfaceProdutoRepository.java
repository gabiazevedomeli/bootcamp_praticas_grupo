package com.dh.meli.perolas.repository;

import com.dh.meli.perolas.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceProdutoRepository extends CrudRepository<Produto, Long> {
}
