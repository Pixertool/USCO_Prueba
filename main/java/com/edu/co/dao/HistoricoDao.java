package com.edu.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.co.domain.Historico;

public interface HistoricoDao extends CrudRepository<Historico, Long>{
    
}