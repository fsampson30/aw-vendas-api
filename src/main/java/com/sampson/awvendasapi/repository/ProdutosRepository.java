package com.sampson.awvendasapi.repository;

import com.sampson.awvendasapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {
}
