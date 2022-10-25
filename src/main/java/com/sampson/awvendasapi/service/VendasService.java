package com.sampson.awvendasapi.service;

import com.sampson.awvendasapi.model.Venda;
import com.sampson.awvendasapi.repository.ProdutosRepository;
import com.sampson.awvendasapi.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class VendasService {

    @Autowired
    private VendasRepository vendasRepository;

    @Autowired
    private ProdutosRepository produtosRepository;

    public Venda adicionar(Venda venda){
        venda.setCadastro(LocalDateTime.now());
        venda.getItens().forEach(i -> {
            i.setVenda(venda);
            i.setProduto(produtosRepository.findById(i.getProduto().getId()).get());
        });

        BigDecimal totalItens = venda.getItens().stream()
                .map(item -> item.getProduto().getValor().multiply(new BigDecimal(item.getQuantidade())))
                .reduce(BigDecimal.ZERO,BigDecimal::add);

        venda.setTotal(totalItens.add(venda.getFrete()));

        return vendasRepository.save(venda);
    }
}
