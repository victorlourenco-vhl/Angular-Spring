package com.spring.api.controllers;

import com.spring.api.entities.Cliente;
import com.spring.api.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "cadastro")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return clienteService.cadastrar(cliente);
    }

}
