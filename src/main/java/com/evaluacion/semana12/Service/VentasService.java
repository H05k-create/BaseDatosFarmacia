package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Ventas;

public interface VentasService {

	public Ventas registrar(Ventas x);
	public Ventas actualizar (Ventas x);
	public void eliminar (Ventas x);
	public List<Ventas> consultar();
	
}
