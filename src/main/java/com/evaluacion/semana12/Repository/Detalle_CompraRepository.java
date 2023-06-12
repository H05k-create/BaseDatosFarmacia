package com.evaluacion.semana12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.semana12.Entity.Detalle_Compra;
@Repository
public interface Detalle_CompraRepository extends JpaRepository<Detalle_Compra , String>{

}
