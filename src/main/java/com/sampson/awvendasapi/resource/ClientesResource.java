package com.sampson.awvendasapi.resource;

import com.sampson.awvendasapi.model.Cliente;
import com.sampson.awvendasapi.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clientesRepository.findAll();
    }

    @GetMapping
    public Optional<Cliente> buscar(@PathVariable Long clienteId){
        return clientesRepository.findById(clienteId);
    }
}
