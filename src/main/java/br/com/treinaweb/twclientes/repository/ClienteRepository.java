package br.com.treinaweb.twclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twclientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
