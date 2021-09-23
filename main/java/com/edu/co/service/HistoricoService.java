package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Historico;

public interface HistoricoService {
    
    public List<Historico> listarHistoricos();
    
    public void guardar(Historico historico);
    
    public void eliminar(Historico historico);
    
    public  Historico encontrarHistorico (Historico historico);
}