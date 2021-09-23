package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Reserva;

public interface ReservaService {
    
    public List<Reserva> listarReservas();
    
    public void guardar(Reserva reserva);
    
    public void eliminar(Reserva reserva);
    
    public Reserva encontrarReserva(Reserva reserva);
}