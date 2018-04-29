package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmAnoReferencia;

@Repository
public interface MpmAnoReferenciaRepository extends JpaRepository<MpmAnoReferencia, Integer> {
	//
	Optional<MpmAnoReferencia> findByAno(String ano);
	
}
