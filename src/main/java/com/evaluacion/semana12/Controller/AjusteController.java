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

import com.evaluacion.semana12.Entity.Ajustes;
import com.evaluacion.semana12.Service.AjustesService;

@RestController
@RequestMapping("/Anonimo")
public class AjusteController {
	
	
	@Autowired
  AjustesService ajustesService;
  
  @GetMapping
  public List<Ajustes> consultar( Ajustes x){
	  return ajustesService.consultar();
	  
  }
  @PostMapping
  public Ajustes registrar(@RequestBody Ajustes x) {
	  return ajustesService.registrar(x);
  }
  @PutMapping
  public Ajustes actualizar(@RequestBody Ajustes x) {
	  return ajustesService.actualizar(x);
  }
  @DeleteMapping
  public void eliminar(@RequestBody Ajustes x) {
	  ajustesService.eliminar(x);
  }
  
  
}
