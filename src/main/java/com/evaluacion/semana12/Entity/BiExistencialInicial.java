package com.evaluacion.semana12.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "BiExistencialInicial")
@Table(name = "BiExistencialInicial ")
public class BiExistencialInicial {
	
	@Id
	String idExistenciaInicial;
	int cantidad;
	public BiExistencialInicial() {
		super();
	}
	public BiExistencialInicial(String idExistenciaInicial, int cantidad) {
		super();
		this.idExistenciaInicial = idExistenciaInicial;
		this.cantidad = cantidad;
	}
	public String getIdExistenciaInicial() {
		return idExistenciaInicial;
	}
	public void setIdExistenciaInicial(String idExistenciaInicial) {
		this.idExistenciaInicial = idExistenciaInicial;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
