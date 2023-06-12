package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Lotes;

public interface LotesService {
	
	public Lotes registrar (Lotes x);
	public Lotes actualizar(Lotes x);
	public void eliminar(Lotes x);
	public List<Lotes> consultar();
}
