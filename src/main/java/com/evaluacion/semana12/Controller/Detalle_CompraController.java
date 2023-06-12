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

import com.evaluacion.semana12.Entity.Detalle_Compra;
import com.evaluacion.semana12.Service.Detalle_CompraService;

@RestController
@RequestMapping("/Detalle_Compra ")
public class Detalle_CompraController {

	@Autowired
	Detalle_CompraService detaleCompraService;
	
	@GetMapping
	public List<Detalle_Compra > consultar(@RequestBody Detalle_Compra x){
		return  detaleCompraService.consultar();
	}
	@PostMapping
	public Detalle_Compra registrar(@RequestBody Detalle_Compra  x) {
		return detaleCompraService.registrar(x);
	}
	@PutMapping 
	public Detalle_Compra  actualizar(@RequestBody Detalle_Compra x) {
		return detaleCompraService.actualizar(x);
	}
	@DeleteMapping
	
	public void eliminar( Detalle_Compra x) {
		detaleCompraService.eliminar(null);
	}
}
