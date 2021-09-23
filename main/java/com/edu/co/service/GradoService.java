package com.edu.co.service;

import java.util.List;

import com.edu.co.domain.Grado;

public interface GradoService {

	public List<Grado> listarAulas();

	public void guardar(Grado grado);

	public void eliminar(Grado grado);

	public Grado encontrarAulaa(Grado grado);
}