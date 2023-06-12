package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Devoluciones;

public interface DevolucionesService {
	
	public Devoluciones registrar(Devoluciones x);
	public Devoluciones actualizar(Devoluciones x);
	public void eliminar(Devoluciones x);
	public List<Devoluciones> consultar();
	
}
