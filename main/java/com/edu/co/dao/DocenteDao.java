package com.edu.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.co.domain.Docente;

public interface DocenteDao extends CrudRepository<Docente, Long>{
    
}