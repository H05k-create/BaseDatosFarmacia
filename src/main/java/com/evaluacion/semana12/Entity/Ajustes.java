package com.evaluacion.semana12.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Ajustes")
@Table(name = "ajustes")
public class Ajustes {
	
	@Id
	String idAjuste;
	String motivo;
	int cantidad;
	Date fecha;
	String tipo;
	public Ajustes() {
		super();
	}
	public Ajustes(String idAjuste, String motivo, int cantidad, Date fecha, String tipo) {
		super();
		this.idAjuste = idAjuste;
		this.motivo = motivo;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
	}
	public String getIdAjuste() {
		return idAjuste;
	}
	public void setIdAjuste(String idAjuste) {
		this.idAjuste = idAjuste;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
