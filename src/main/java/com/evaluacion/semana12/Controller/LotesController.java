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

import com.evaluacion.semana12.Entity.Lotes;
import com.evaluacion.semana12.Service.LotesService;

@RestController
@RequestMapping("/Lotes")
public class LotesController {
	
	@Autowired
	LotesService lotesService;
	
	@GetMapping
	public List<Lotes > consuitar(@RequestBody Lotes x){
		return lotesService.consultar();
}
	@PostMapping
	public Lotes registrar(@RequestBody Lotes x) {
		return lotesService.registrar(x);
	}
	@PutMapping
	public Lotes actualizar(@RequestBody Lotes x) {
		return lotesService.actualizar(x);
				
	}
	@DeleteMapping
	public void eliminar( Lotes x) {
		lotesService.eliminar(x);
	}
	
	
	
}
