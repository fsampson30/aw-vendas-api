package com.sampson.awvendasapi.repository;

import com.sampson.awvendasapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente,Long > {
}
