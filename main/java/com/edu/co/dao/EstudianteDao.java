package com.edu.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.co.domain.Estudiante;

public interface EstudianteDao extends CrudRepository<Estudiante, Long>{
    
}