package com.dh.meli.perolas.service;

import com.dh.meli.perolas.model.Cliente;

import java.util.List;

public interface InterfaceClienteService {
    Cliente getClienteById(Long id);

    List<Cliente> getTodosClientes();

    Cliente criaCliente(Cliente novoCliente);

    Cliente atualizaCliente(Cliente cliente);

    void deletaCliente(Long id);


}
