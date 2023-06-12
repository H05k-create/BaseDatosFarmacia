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

import com.evaluacion.semana12.Entity.Devoluciones;
import com.evaluacion.semana12.Service.DevolucionesService;

@RestController
@RequestMapping("/Devoluciones")
public class DevolucionesController {
	
	@Autowired
	DevolucionesService devolucionesService;
	
	@GetMapping
	public List<Devoluciones> consultar(@RequestBody Devoluciones x){
		return devolucionesService.consultar();
	}
	@PostMapping
	public Devoluciones registrar(@RequestBody Devoluciones x) {
		return devolucionesService.registrar(x);
	}
	@PutMapping
	public Devoluciones actualizar(@RequestBody Devoluciones x) {
		return devolucionesService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar( Devoluciones x) {
		devolucionesService.eliminar(x);
	}
	
}
