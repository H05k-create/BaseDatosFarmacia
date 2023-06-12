package com.evaluacion.semana12.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "Inventario")
@Table(name = "inventario")
public class Inventario {
	
	@Id
	String producto;
	String nombre;
	String id_presentacion;
	String id_laboratorio;
	int  existencia_minima;
	String id_prescripcion;
	public Inventario() {
		super();
	}
	public Inventario(String producto, String nombre, String id_presentacion, String id_laboratorio,
			int existencia_minima, String id_prescripcion) {
		super();
		this.producto = producto;
		this.nombre = nombre;
		this.id_presentacion = id_presentacion;
		this.id_laboratorio = id_laboratorio;
		this.existencia_minima = existencia_minima;
		this.id_prescripcion = id_prescripcion;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId_presentacion() {
		return id_presentacion;
	}
	public void setId_presentacion(String id_presentacion) {
		this.id_presentacion = id_presentacion;
	}
	public String getId_laboratorio() {
		return id_laboratorio;
	}
	public void setId_laboratorio(String id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}
	public int getExistencia_minima() {
		return existencia_minima;
	}
	public void setExistencia_minima(int existencia_minima) {
		this.existencia_minima = existencia_minima;
	}
	public String getId_prescripcion() {
		return id_prescripcion;
	}
	public void setId_prescripcion(String id_prescripcion) {
		this.id_prescripcion = id_prescripcion;
	}

	
}
