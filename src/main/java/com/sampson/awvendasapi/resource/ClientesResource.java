package com.sampson.awvendasapi.resource;

import com.sampson.awvendasapi.model.Cliente;
import com.sampson.awvendasapi.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clientesRepository.findAll();
    }
}
