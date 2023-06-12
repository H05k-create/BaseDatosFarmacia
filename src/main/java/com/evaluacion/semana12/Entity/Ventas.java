package com.evaluacion.semana12.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Ventas")
@Table(name = "ventas")
public class Ventas {
	
	@Id
	String idVenta;
    int cantidad;
    int precio;
    double descuento;
    int totalImporte;
    Date fecha;
    int hora;
    String idEmpleado;
	public Ventas() {
		super();
	}
	public Ventas(String idVenta, int cantidad, int precio, double descuento, int totalImporte, Date fecha, int hora,
			String idEmpleado) {
		super();
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descuento = descuento;
		this.totalImporte = totalImporte;
		this.fecha = fecha;
		this.hora = hora;
		this.idEmpleado = idEmpleado;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public int getTotalImporte() {
		return totalImporte;
	}
	public void setTotalImporte(int totalImporte) {
		this.totalImporte = totalImporte;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
    
    
    

}
