package com.evaluacion.semana12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.semana12.Entity.Detalle_Lote;
@Repository
public interface Detalle_LoteRepository extends JpaRepository<Detalle_Lote, String>{

}
