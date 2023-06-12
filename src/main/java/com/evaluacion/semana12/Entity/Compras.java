package com.evaluacion.semana12.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Commpras")
@Table(name = "compras")
public class Compras {
	
	@Id
	String idCompra;
	String idProveedor;
	String No_Factura;
	Date fecha;
	public Compras() {
		super();
	}
	public Compras(String idCompra, String idProveedor, String no_Factura, Date fecha) {
		super();
		this.idCompra = idCompra;
		this.idProveedor = idProveedor;
		No_Factura = no_Factura;
		this.fecha = fecha;
	}
	public String getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNo_Factura() {
		return No_Factura;
	}
	public void setNo_Factura(String no_Factura) {
		No_Factura = no_Factura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
