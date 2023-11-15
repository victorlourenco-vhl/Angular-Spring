package com.spring.api.services;

import com.spring.api.entities.Cliente;
import com.spring.api.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastrar(Cliente obj) {
        return clienteRepository.save(obj);
    }
}
