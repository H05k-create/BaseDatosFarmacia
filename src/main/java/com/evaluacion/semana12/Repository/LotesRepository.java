package com.evaluacion.semana12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.semana12.Entity.Lotes;
@Repository
public interface LotesRepository extends JpaRepository<Lotes, String> {

}
