package com.dh.meli.perolas.service;

import com.dh.meli.perolas.exceptions.BadRequestException;
import com.dh.meli.perolas.exceptions.LojaNotFoundException;
import com.dh.meli.perolas.model.Cliente;
import com.dh.meli.perolas.model.Produto;
import com.dh.meli.perolas.repository.InterfaceClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService implements InterfaceClienteService {

    @Autowired
    private InterfaceClienteRepository clienteRepo;

    @Override
    public Cliente getClienteById(Long id) {
        return clienteRepo.findById(id).orElseThrow(() -> new LojaNotFoundException("Cliente não encontrado"));
    }

    @Override
    public List<Cliente> getTodosClientes() {
        return (List<Cliente>) clienteRepo.findAll();
    }

    @Override
    public Cliente criaCliente(Cliente novoCliente) {
        if (novoCliente.getId() != null) {
            throw new BadRequestException("O cliente não pode ter id.");
        }
        return clienteRepo.save(novoCliente);
    }

    @Override
    public Cliente atualizaCliente(Cliente cliente) {
        clienteRepo.findById(cliente.getId());
        return clienteRepo.save(cliente);
    }

    @Override
    public void deletaCliente(Long id) {
        if (clienteRepo.findById(id).isPresent()) {
            clienteRepo.deleteById(id);
        }
    }


}
