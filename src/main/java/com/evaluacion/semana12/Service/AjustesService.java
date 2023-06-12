package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Ajustes;

public interface AjustesService {

	public Ajustes registrar(Ajustes x);
	public Ajustes actualizar(Ajustes x);
	public void eliminar(Ajustes x);
	public List<Ajustes >  consultar ();
	
}
