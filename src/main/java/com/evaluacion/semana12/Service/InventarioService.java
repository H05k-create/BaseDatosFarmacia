package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.Inventario;

public interface InventarioService {
	public Inventario registrar(Inventario x);
	public Inventario actualizar(Inventario x);
	public void eliminar(Inventario x);
	public List<Inventario> consultar();
}
