package com.evaluacion.semana12.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "Detalle_Compra")
@Table(name = "detalle_compra")
public class Detalle_Compra {
	@Id
	String id_Compra;
	int cantidad;
	double precio_Compra;
	public Detalle_Compra() {
		super();
	}
	public Detalle_Compra(String id_Compra, int cantidad, double precio_Compra) {
		super();
		this.id_Compra = id_Compra;
		this.cantidad = cantidad;
		this.precio_Compra = precio_Compra;
	}
	public String getId_Compra() {
		return id_Compra;
	}
	public void setId_Compra(String id_Compra) {
		this.id_Compra = id_Compra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio_Compra() {
		return precio_Compra;
	}
	public void setPrecio_Compra(double precio_Compra) {
		this.precio_Compra = precio_Compra;
	}
	
	
	
}
