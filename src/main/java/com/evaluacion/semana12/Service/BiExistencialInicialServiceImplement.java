package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.BiExistencialInicial;
import com.evaluacion.semana12.Repository.BiExistencialInicialRepository;
@Service
public class BiExistencialInicialServiceImplement  implements BiExistencialInicialService{

	
	@Autowired
	BiExistencialInicialRepository biExistencialInicialRepository;
	@Override
	public BiExistencialInicial registrar(BiExistencialInicial x) {
		return biExistencialInicialRepository.save(x);
	}

	@Override
	public BiExistencialInicial actualizar(BiExistencialInicial x) {
		// TODO Auto-generated method stub
		return biExistencialInicialRepository.save(x);
	}

	@Override
	public void eliminar(BiExistencialInicial x) {
		biExistencialInicialRepository.delete(x); 
		
	}

	@Override
	public List<BiExistencialInicial> cosultar() {
		// TODO Auto-generated method stub
		return biExistencialInicialRepository.findAll();
	}

}
