package com.evaluacion.semana12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.semana12.Entity.Detalle_Lote;
import com.evaluacion.semana12.Repository.Detalle_LoteRepository;
@Service
public class Detalle_LoteServiceImplement implements Detalle_LoteService {
		
	@Autowired
	Detalle_LoteRepository detaleDetalle_LoteRepository;
	@Override
	public Detalle_Lote registrar(Detalle_Lote x) {
		// TODO Auto-generated method stub
		return detaleDetalle_LoteRepository.save(x);
	}

	@Override
	public Detalle_Lote actualizar(Detalle_Lote x) {
		// TODO Auto-generated method stub
		return detaleDetalle_LoteRepository.save(x);
	}

	@Override
	public void eliminar(Detalle_Lote x) {
		detaleDetalle_LoteRepository.delete(x);
		
	}

	@Override
	public List<Detalle_Lote> consultar(Detalle_Lote x) {
		// TODO Auto-generated method stub
		return detaleDetalle_LoteRepository.findAll();
	}

}
