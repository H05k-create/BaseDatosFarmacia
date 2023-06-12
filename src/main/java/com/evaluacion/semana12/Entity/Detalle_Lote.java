package com.evaluacion.semana12.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Detalle_Lote")
@Table(name = "detalle_Lote")
public class Detalle_Lote {

	@Id 
	String idLote;
	Date FechaIngreso;
	int cantidad;
	int precio_Compra;
	double porcentaje_Ganancia;
	double porcentaje_Descuento;
	double precio_Venta;
	public Detalle_Lote() {
		super();
	}
	public Detalle_Lote(String idLote, Date fechaIngreso, int cantidad, int precio_Compra, double porcentaje_Ganancia,
			double porcentaje_Descuento, double precio_Venta) {
		super();
		this.idLote = idLote;
		FechaIngreso = fechaIngreso;
		this.cantidad = cantidad;
		this.precio_Compra = precio_Compra;
		this.porcentaje_Ganancia = porcentaje_Ganancia;
		this.porcentaje_Descuento = porcentaje_Descuento;
		this.precio_Venta = precio_Venta;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	public Date getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_Compra() {
		return precio_Compra;
	}
	public void setPrecio_Compra(int precio_Compra) {
		this.precio_Compra = precio_Compra;
	}
	public double getPorcentaje_Ganancia() {
		return porcentaje_Ganancia;
	}
	public void setPorcentaje_Ganancia(double porcentaje_Ganancia) {
		this.porcentaje_Ganancia = porcentaje_Ganancia;
	}
	public double getPorcentaje_Descuento() {
		return porcentaje_Descuento;
	}
	public void setPorcentaje_Descuento(double porcentaje_Descuento) {
		this.porcentaje_Descuento = porcentaje_Descuento;
	}
	public double getPrecio_Venta() {
		return precio_Venta;
	}
	public void setPrecio_Venta(double precio_Venta) {
		this.precio_Venta = precio_Venta;
	}
	
	
}
