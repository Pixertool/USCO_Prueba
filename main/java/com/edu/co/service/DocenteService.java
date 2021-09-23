package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Docente;


public interface DocenteService {
    
    public List<Docente> listarDocentes();
    
    public void guardar(Docente docente);
    
    public void eliminar(Docente docente);
    
    public Docente encontrarDocente(Docente docente);
}