package com.edu.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.co.domain.Materia;

public interface MateriaDao extends CrudRepository<Materia, Long>{
    
}