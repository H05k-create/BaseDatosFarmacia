package com.evaluacion.semana12.Service;

import java.util.List;

import com.evaluacion.semana12.Entity.BiExistencialInicial;

public interface BiExistencialInicialService {
	
	public BiExistencialInicial registrar(BiExistencialInicial x);
	public BiExistencialInicial actualizar(BiExistencialInicial  x);
	public void eliminar (BiExistencialInicial x);
	public List<BiExistencialInicial > cosultar();
	
}
