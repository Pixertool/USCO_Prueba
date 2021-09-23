package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.AulaDao;
import com.edu.co.domain.Aula;

@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaDao aulaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Aula> listarAulas() {
		return (List<Aula>) aulaDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Aula aula) {
		aulaDao.save(aula);

	}

	@Override
	@Transactional
	public void eliminar(Aula aula) {
		aulaDao.delete(aula);

	}

	@Override
	@Transactional(readOnly=true)
	public Aula encontrarAulaa(Aula aula) {
		return aulaDao.findById(aula.getIdAula()).orElse(null);
	}

}
