package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Estudiante;

public interface EstudianteService {
    
    public List<Estudiante> listarEstudiantes();
    
    public void guardar(Estudiante estudiante);
    
    public void eliminar(Estudiante estudiante);
    
    public Estudiante encontrarPersona(Estudiante estudiante);
}