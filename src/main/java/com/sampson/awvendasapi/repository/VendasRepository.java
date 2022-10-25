package com.sampson.awvendasapi.repository;

import com.sampson.awvendasapi.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<Venda, Long> {
}
