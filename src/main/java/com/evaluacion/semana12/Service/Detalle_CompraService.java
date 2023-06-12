package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Detalle_Compra;

public interface Detalle_CompraService {
	
	public Detalle_Compra registrar(Detalle_Compra  x);
	public Detalle_Compra  actualizar(Detalle_Compra  x);
	public void eliminar(Detalle_Compra x);
	public List<Detalle_Compra > consultar();
	
}
