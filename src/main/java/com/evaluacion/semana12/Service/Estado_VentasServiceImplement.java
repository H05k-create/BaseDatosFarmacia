package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Estado_Ventas;
import com.evaluacion.semana12.Repository.Estado_VentasRepository;
@Service
public class Estado_VentasServiceImplement implements Estado_VentasService{
	
	@Autowired
	Estado_VentasRepository estado_VentasRepository;
	
	@Override
	public Estado_Ventas registrar(Estado_Ventas x) {
		// TODO Auto-generated method stub
		return estado_VentasRepository.save(x);
	}

	@Override
	public Estado_Ventas actualizar(Estado_Ventas x) {
		// TODO Auto-generated method stub
		return estado_VentasRepository.save(x);
	}

	@Override
	public void eliminar(Estado_Ventas x) {
		estado_VentasRepository.delete(x);
		
	}

	@Override
	public List<Estado_Ventas> consultar() {
		// TODO Auto-generated method stub
		return estado_VentasRepository.findAll();
	}

}
