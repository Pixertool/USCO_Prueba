package com.edu.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.co.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}