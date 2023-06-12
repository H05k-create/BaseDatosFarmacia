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

import com.evaluacion.semana12.Entity.Ventas;
import com.evaluacion.semana12.Service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	VentasService ventasService;
	
	@GetMapping
	public List<Ventas> consultar(@RequestBody Ventas x){
		return ventasService.consultar();
	}
	@PostMapping
	public Ventas registrar(@RequestBody Ventas x) {
		return ventasService.registrar(x);
	}
	@PutMapping
	public Ventas actualizar(@RequestBody Ventas x) {
		return ventasService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar ( Ventas x) {
		ventasService.eliminar(x);
	}
}
