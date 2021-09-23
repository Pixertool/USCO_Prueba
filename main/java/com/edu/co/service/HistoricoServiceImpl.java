package com.edu.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.co.dao.HistoricoDao;
import com.edu.co.domain.Historico;

@Service
public class HistoricoServiceImpl implements  HistoricoService{
	
	@Autowired
	private HistoricoDao historicoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Historico> listarHistoricos() {
		return (List<Historico>)historicoDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Historico historico) {
		historicoDao.save(historico);
		
	}

	@Override
	@Transactional
	public void eliminar(Historico historico) {
		historicoDao.delete(historico);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Historico encontrarHistorico(Historico historico) {
		return historicoDao.findById(historico.getIdHistorico()).orElse(null);
	}
	

}
