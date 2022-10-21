package com.sampson.awvendasapi.resource;

import com.sampson.awvendasapi.model.Produto;
import com.sampson.awvendasapi.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    private ProdutosRepository produtosRepository;

    @GetMapping
    public List<Produto> listar() {
        return produtosRepository.findAll();
    }
}
