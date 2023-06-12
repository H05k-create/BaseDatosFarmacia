package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Lotes;
import com.evaluacion.semana12.Repository.LotesRepository;
@Service
public class LotesServiceImplement  implements LotesService{

	@Autowired
	LotesRepository lotesRepository;
	@Override
	public Lotes registrar(Lotes x) {
		// TODO Auto-generated method stub
		return lotesRepository.save(x);
	}

	@Override
	public Lotes actualizar(Lotes x) {
		// TODO Auto-generated method stub
		return lotesRepository.save(x);
	}

	@Override
	public void eliminar(Lotes x) {
		lotesRepository.delete(x);
		
	}

	@Override
	public List<Lotes> consultar() {
		// TODO Auto-generated method stub
		return lotesRepository.findAll();
	}

}
