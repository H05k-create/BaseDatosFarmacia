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

import com.evaluacion.semana12.Entity.Compras;
import com.evaluacion.semana12.Service.ComprasService;

@RestController
@RequestMapping("/Commpras")
public class ComprasController {

	@Autowired
	ComprasService comprasService;
	@GetMapping
	public List<Compras> consultar(@RequestBody Compras x){
		return comprasService.consultar();
	}
	@PostMapping
	public Compras registrar(@RequestBody Compras x) {
		return comprasService.registrar(x);
	}
	@PutMapping
	public Compras actualizar(@RequestBody Compras x) {
		return comprasService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar( Compras x) {
		comprasService.eliminar(x);
	}
	
}
