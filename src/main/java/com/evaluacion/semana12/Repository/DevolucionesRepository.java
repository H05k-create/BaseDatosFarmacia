package com.evaluacion.semana12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.semana12.Entity.Devoluciones;
@Repository
public interface DevolucionesRepository  extends JpaRepository<Devoluciones, String > {

}
