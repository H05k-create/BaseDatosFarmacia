package com.evaluacion.semana12.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.semana12.Entity.Estado_Ventas;
import com.evaluacion.semana12.Service.Estado_VentasService;

@RestController
@RequestMapping("/Estado_Ventas")
public class Estado_VentasController {

	@Autowired
	Estado_VentasService estado_VentasService;
	
	@GetMapping
	public List<Estado_Ventas> consultar(@RequestBody Estado_Ventas x){
		return estado_VentasService.consultar();
	}
	@PostMapping
	public Estado_Ventas registrar(@RequestBody Estado_Ventas x) {
		return estado_VentasService.registrar(x);
	}
	@PutMapping
	public Estado_Ventas actualizar (@RequestBody Estado_Ventas x) {
		return estado_VentasService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar( Estado_Ventas x) {
		estado_VentasService.eliminar(x);
	}
	
	
}
