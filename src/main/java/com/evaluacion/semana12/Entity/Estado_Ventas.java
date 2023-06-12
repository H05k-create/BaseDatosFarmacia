package com.evaluacion.semana12.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "Estado_Ventas")
@Table(name = "estado_ventas")
public class Estado_Ventas {
	
	@Id
	String idEstadoVenta;
	String descripcion;
	public Estado_Ventas() {
		super();
	}
	public Estado_Ventas(String idEstadoVenta, String descripcion) {
		super();
		this.idEstadoVenta = idEstadoVenta;
		this.descripcion = descripcion;
	}
	public String getIdEstadoVenta() {
		return idEstadoVenta;
	}
	public void setIdEstadoVenta(String idEstadoVenta) {
		this.idEstadoVenta = idEstadoVenta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
