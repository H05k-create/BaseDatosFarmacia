package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Ventas;
import com.evaluacion.semana12.Repository.VentasRepository;
@Service
public class VentasServiceImplement implements VentasService {

	
	@Autowired
	VentasRepository ventasRepository;
	@Override
	public Ventas registrar(Ventas x) {
		// TODO Auto-generated method stub
		return ventasRepository.save(x);
	}

	@Override
	public Ventas actualizar(Ventas x) {
		// TODO Auto-generated method stub
		return ventasRepository.save(x);
	}

	@Override
	public void eliminar(Ventas x) {
		ventasRepository.delete(x);
		
	}

	@Override
	public List<Ventas> consultar() {
		// TODO Auto-generated method stub
		return ventasRepository.findAll();
	}

}
