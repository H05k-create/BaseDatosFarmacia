package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Detalle_Compra;
import com.evaluacion.semana12.Repository.Detalle_CompraRepository;

@Service
public class Detalle_CompraServiceImplement implements Detalle_CompraService{
	
	@Autowired
	Detalle_CompraRepository detalle_CompraRepository;
	@Override
	public Detalle_Compra registrar(Detalle_Compra x) {
		// TODO Auto-generated method stub
		return detalle_CompraRepository.save(x);
	}

	@Override
	public Detalle_Compra actualizar(Detalle_Compra x) {
		// TODO Auto-generated method stub
		return detalle_CompraRepository.save(x);
	}

	@Override
	public void eliminar(Detalle_Compra x) {
		detalle_CompraRepository.delete(x);
		
	}

	@Override
	public List<Detalle_Compra> consultar() {
		// TODO Auto-generated method stub
		return detalle_CompraRepository.findAll();
	}

}
