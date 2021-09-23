package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.GradoDao;
import com.edu.co.domain.Grado;

@Service
public class GradoServiceImpl implements GradoService {

	@Autowired
	private GradoDao gradoDao;

	@Override
	@Transactional
	public void guardar(Grado grado) {
		gradoDao.save(grado);

	}

	@Override
	@Transactional
	public void eliminar(Grado grado) {
		gradoDao.delete(grado);

	}

	@Override
	@Transactional(readOnly=true)
	public Grado encontrarAulaa(Grado grado) {
		return gradoDao.findById(grado.getIdGrado()).orElse(null);

	}

	@Override
	@Transactional(readOnly=true)
	public List<Grado> listarAulas() {
		return (List<Grado>) gradoDao.findAll();
	}

}
