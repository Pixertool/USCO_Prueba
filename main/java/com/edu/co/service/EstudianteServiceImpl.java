package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.EstudianteDao;
import com.edu.co.domain.Estudiante;

@Service
public class EstudianteServiceImpl implements  EstudianteService{
	
	@Autowired
	private EstudianteDao estudianteDao;

	@Override
	@Transactional(readOnly=true)
	public List<Estudiante> listarEstudiantes() {
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Estudiante estudiante) {
		estudianteDao.save(estudiante);		
	}

	@Override
	@Transactional
	public void eliminar(Estudiante estudiante) {
		estudianteDao.delete(estudiante);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Estudiante encontrarPersona(Estudiante estudiante) {
		return estudianteDao.findById(estudiante.getIdEstudiante()).orElse(null);
	}
	

}
