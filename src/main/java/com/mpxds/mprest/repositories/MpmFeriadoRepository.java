package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmFeriado;

@Repository
public interface MpmFeriadoRepository extends JpaRepository<MpmFeriado, Integer> {
	//
	Optional<MpmFeriado> findByDataFeriado(Date dataFeriado);
	
}
