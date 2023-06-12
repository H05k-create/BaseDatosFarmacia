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

import com.evaluacion.semana12.Entity.Detalle_Lote;
import com.evaluacion.semana12.Service.Detalle_LoteService;

@RestController
@RequestMapping("/Detalle_Lote")
public class Detalle_LoteController {

	@Autowired
	Detalle_LoteService detalle_LoteService;
	
	@GetMapping
	public List<Detalle_Lote> consultar(@RequestBody Detalle_Lote x){
		return detalle_LoteService.consultar(x);
	}
	@PostMapping
	public Detalle_Lote registrar(@RequestBody Detalle_Lote x) {
		return detalle_LoteService.registrar(x);
	}
	@PutMapping
	public Detalle_Lote actualizar(@RequestBody Detalle_Lote x) {
		return detalle_LoteService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar( Detalle_Lote x) {
		detalle_LoteService.eliminar(x);
	}
}
