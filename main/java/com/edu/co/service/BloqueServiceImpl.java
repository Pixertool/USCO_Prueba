package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.BloqueDao;
import com.edu.co.domain.Bloque;

@Service
public class BloqueServiceImpl implements  BloqueService{
	
	@Autowired
	private BloqueDao bloqueDao;
	

	@Override
	@Transactional(readOnly=true)
	public List<Bloque> listarBloques() {
		return(List<Bloque>)bloqueDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Bloque bloque) {
		bloqueDao.save(bloque);
		
	}

	@Override
	@Transactional
	public void eliminar(Bloque bloque) {
		bloqueDao.delete(bloque);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Bloque encontrarBloque(Bloque bloque) {
		return bloqueDao.findById(bloque.getIdBloque()).orElse(null);
	}
	

}
