package com.evaluacion.semana12.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Devoluciones")
@Table(name = "devoluciones")
public class Devoluciones {
	@Id
	String iDevolucion;
	int cantidad;
	Date fecha;
	public Devoluciones() {
		super();
	}
	public Devoluciones(String iDevolucion, int cantidad, Date fecha) {
		super();
		this.iDevolucion = iDevolucion;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	public String getiDevolucion() {
		return iDevolucion;
	}
	public void setiDevolucion(String iDevolucion) {
		this.iDevolucion = iDevolucion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
