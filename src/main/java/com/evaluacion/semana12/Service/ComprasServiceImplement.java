package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Compras;
import com.evaluacion.semana12.Repository.ComprasRepository;

@Service
public class ComprasServiceImplement implements ComprasService{

	@Autowired
	ComprasRepository comprasRepository;
	@Override
	public Compras registrar(Compras x) {
		// TODO Auto-generated method stub
		return comprasRepository.save(x);
	}

	@Override
	public Compras actualizar(Compras x) {
		// TODO Auto-generated method stub
		return comprasRepository.save(x);
	}

	@Override
	public void eliminar(Compras x) {
		comprasRepository.delete(x);
		
	}

	@Override
	public List<Compras> consultar() {
		// TODO Auto-generated method stub
		return comprasRepository.findAll();
	}

}
