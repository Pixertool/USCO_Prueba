package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Bloque;


public interface BloqueService {
    
    public List<Bloque> listarBloques();
    
    public void guardar(Bloque bloque);
    
    public void eliminar(Bloque bloque);
    
    public Bloque encontrarBloque(Bloque bloque);
}