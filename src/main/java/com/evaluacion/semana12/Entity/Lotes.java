package com.evaluacion.semana12.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Lotes")
@Table(name = "lotes")
public class Lotes {
	 @Id
	String idLote;
	Date fecha_Vencimiento;
	public Lotes() {
		super();
	}
	public Lotes(String idLote, Date fecha_Vencimiento) {
		super();
		this.idLote = idLote;
		this.fecha_Vencimiento = fecha_Vencimiento;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	public Date getFecha_Vencimiento() {
		return fecha_Vencimiento;
	}
	public void setFecha_Vencimiento(Date fecha_Vencimiento) {
		this.fecha_Vencimiento = fecha_Vencimiento;
	}
	
	
	
}
