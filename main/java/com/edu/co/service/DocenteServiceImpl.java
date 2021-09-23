package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.DocenteDao;
import com.edu.co.domain.Docente;

@Service
public class DocenteServiceImpl implements  DocenteService{
	
	@Autowired
	private DocenteDao docenteDao;


	@Override
	@Transactional(readOnly=true)
	public List<Docente> listarDocentes() {
		return (List<Docente>) docenteDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Docente docente) {
		docenteDao.save(docente);
		
	}

	@Override
	@Transactional
	public void eliminar(Docente docente) {
		docenteDao.delete(docente);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Docente encontrarDocente(Docente docente) {
		return docenteDao.findById(docente.getIdDocente()).orElse(null);
	}
	

}
