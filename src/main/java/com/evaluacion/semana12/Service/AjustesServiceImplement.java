package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Ajustes;
import com.evaluacion.semana12.Repository.AjustesRepository;

@Service
public class AjustesServiceImplement  implements AjustesService {
	
	@Autowired
	AjustesRepository ajustesRepository;
	@Override
	public Ajustes registrar(Ajustes x) {

		return ajustesRepository.save(x);
	}

	@Override
	public Ajustes actualizar(Ajustes x) {

		return ajustesRepository.save(x);
	}

	@Override
	public void eliminar(Ajustes x) {
		ajustesRepository.delete(x);
		
	}

	@Override
	public List<Ajustes> consultar() {
		
		return ajustesRepository.findAll();
	}

}
