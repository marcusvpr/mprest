package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmPendencia;

@Repository
public interface MpmPendenciaRepository extends JpaRepository<MpmPendencia, Integer> {
	//
}
