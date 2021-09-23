package com.edu.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.co.domain.Reserva;

public interface ReservaDao extends CrudRepository<Reserva, Long>{
    
}