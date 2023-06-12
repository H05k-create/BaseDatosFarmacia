package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Devoluciones;
import com.evaluacion.semana12.Repository.DevolucionesRepository;

@Service
public class DevolucionesServiceImplement implements DevolucionesService {
	
	@Autowired
	DevolucionesRepository devolucionesRepository;
	@Override
	public Devoluciones registrar(Devoluciones x) {
		// TODO Auto-generated method stub
		return devolucionesRepository.save(x);
	}

	@Override
	public Devoluciones actualizar(Devoluciones x) {
		// TODO Auto-generated method stub
		return devolucionesRepository.save(x);
	}

	@Override
	public void eliminar(Devoluciones x) {
		devolucionesRepository.delete(x);
		
	}

	@Override
	public List<Devoluciones> consultar() {
		// TODO Auto-generated method stub
		return devolucionesRepository.findAll();
	}

}
