package com.evaluacion.semana12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.semana12.Entity.Ventas;
@Repository
public interface VentasRepository  extends JpaRepository<Ventas, String>{

}
