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

import com.evaluacion.semana12.Entity.Inventario;
import com.evaluacion.semana12.Service.InventarioService;

@RestController
@RequestMapping("/control")
public class InventarioController {
	
	@Autowired
	InventarioService inventarioService;
	
	@GetMapping
	public List<Inventario> consultar(@RequestBody Inventario x){
		return inventarioService.consultar();
	}
	@PostMapping
	public Inventario registrar(@RequestBody Inventario x) {
		return inventarioService.registrar(x);
	}
	@PutMapping
	public Inventario actualizar(@RequestBody Inventario x) {
		return inventarioService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar (Inventario x) {
		inventarioService.eliminar(x);
	}
	
}
