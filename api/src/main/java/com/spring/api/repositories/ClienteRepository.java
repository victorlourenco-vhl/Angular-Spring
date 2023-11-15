package com.spring.api.repositories;

import com.spring.api.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
