package com.sistema.ERP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.ERP.Entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    
}
