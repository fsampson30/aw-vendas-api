package com.sampson.awvendasapi.resource;

import com.sampson.awvendasapi.model.Cliente;
import com.sampson.awvendasapi.model.Venda;
import com.sampson.awvendasapi.repository.ClientesRepository;
import com.sampson.awvendasapi.repository.VendasRepository;
import com.sampson.awvendasapi.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasResource {

    @Autowired
    private VendasRepository vendasRepository;

    @Autowired
    private VendasService vendasService;

    @GetMapping
    public List<Venda> listar() {
        return vendasRepository.findAll();

    }

    @PostMapping
    public Venda adicionar(@RequestBody @Valid Venda venda) {
        return vendasService.adicionar(venda);
    }

}
