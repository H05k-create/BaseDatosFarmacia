package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Inventario;
import com.evaluacion.semana12.Repository.InventarioRepository;

@Service
public class InventarioServiceImplement implements InventarioService{

		@Autowired
		InventarioRepository inventarioRepository;
	@Override
	public Inventario registrar(Inventario x) {
		// TODO Auto-generated method stub
		return inventarioRepository.save(x);
	}

	@Override
	public Inventario actualizar(Inventario x) {
		// TODO Auto-generated method stub
		return inventarioRepository.save(x);
	}

	@Override
	public void eliminar(Inventario x) {
		inventarioRepository.delete(x);
		
	}

	@Override
	public List<Inventario> consultar() {
		// TODO Auto-generated method stub
		return inventarioRepository.findAll();
	}

}
