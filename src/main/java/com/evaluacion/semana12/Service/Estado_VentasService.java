package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Estado_Ventas;

public interface Estado_VentasService {

	public Estado_Ventas registrar(Estado_Ventas x);
	public Estado_Ventas actualizar(Estado_Ventas x);
	public void eliminar (Estado_Ventas x);
	public  List<Estado_Ventas> consultar();
}
