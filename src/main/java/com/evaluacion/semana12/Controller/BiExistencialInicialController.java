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

import com.evaluacion.semana12.Entity.BiExistencialInicial;
import com.evaluacion.semana12.Service.BiExistencialInicialService;

@RestController
@RequestMapping("/BiExistencialInicial")
public class BiExistencialInicialController {
	@Autowired
	BiExistencialInicialService biExistencialInicialService;
	
	@GetMapping
	
	public List<BiExistencialInicial> consultar(@RequestBody BiExistencialInicial  x){
		return biExistencialInicialService.cosultar();
	}
	@PostMapping
	public BiExistencialInicial registrar(@RequestBody BiExistencialInicial  x) {
		return biExistencialInicialService.registrar(x);
	}
	@PutMapping
	public BiExistencialInicial actualizar(@RequestBody BiExistencialInicial  x) {
		return biExistencialInicialService.actualizar(x);
	}
	@DeleteMapping
	public void eliminar(BiExistencialInicial x) {
		biExistencialInicialService.eliminar(x);
	}
	
	
}
