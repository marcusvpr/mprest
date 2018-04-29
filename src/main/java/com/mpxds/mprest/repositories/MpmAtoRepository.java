package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmAnoReferencia;
import com.mpxds.mprest.domain.MpmAto;

@Repository
public interface MpmAtoRepository extends JpaRepository<MpmAto, Integer> {
	//
	Optional<MpmAto> findByMpmAnoReferenciaAndCodigoAtoAndAtoSequencia(MpmAnoReferencia mpmAnoReferencia,
																	String codigoAto, String atoSequencia);
	
}
