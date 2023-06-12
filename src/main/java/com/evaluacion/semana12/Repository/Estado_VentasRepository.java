package com.evaluacion.semana12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.semana12.Entity.Estado_Ventas;
@Repository
public interface Estado_VentasRepository  extends JpaRepository<Estado_Ventas, String>{

}
