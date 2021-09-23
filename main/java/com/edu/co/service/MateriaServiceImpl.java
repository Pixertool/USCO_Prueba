package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.MateriaDao;
import com.edu.co.domain.Materia;

@Service
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	private MateriaDao materiaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Materia> listarPersonas() {
		return (List<Materia>) materiaDao.findAll();
	}

	@Override
	@Transactional 
	public void guardar(Materia materia) {
		materiaDao.save(materia);

	}

	@Override
	@Transactional
	public void eliminar(Materia materia) {
		materiaDao.delete(materia);

	}

	@Override
	@Transactional(readOnly=true)
	public Materia encontrarPersona(Materia materia) {
		return materiaDao.findById(materia.getIdMateria()).orElse(null);
	}
}
