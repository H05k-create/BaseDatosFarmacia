package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Detalle_Lote;

public interface Detalle_LoteService  {

	public Detalle_Lote registrar(Detalle_Lote x);
	public Detalle_Lote actualizar(Detalle_Lote x);
	public  void eliminar(Detalle_Lote x);
	public List<Detalle_Lote> consultar(Detalle_Lote x);
	
}
