package com.sistema.ERP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.ERP.Entity.OperadoresLogistica;

@Repository
public interface OperadoresRepository extends JpaRepository<OperadoresLogistica, Long> {
    
}
