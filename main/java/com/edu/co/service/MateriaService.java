package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Materia;

public interface MateriaService {
    
    public List<Materia> listarPersonas();
    
    public void guardar(Materia materia);
    
    public void eliminar(Materia materia);
    
    public Materia encontrarPersona(Materia materia);
}