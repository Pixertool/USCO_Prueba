package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Aula;

public interface AulaService {

	public List<Aula> listarAulas();

	public void guardar(Aula aula);

	public void eliminar(Aula aula);

	public Aula encontrarAulaa(Aula aula);
}