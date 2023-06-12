package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Compras;

public interface ComprasService {
	
	public Compras registrar(Compras x);
	public Compras actualizar(Compras x);
	public void eliminar (Compras x);
	public List<Compras> consultar();
	
}
