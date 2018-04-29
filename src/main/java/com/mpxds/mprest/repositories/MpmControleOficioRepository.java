package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmControleOficio;

@Repository
public interface MpmControleOficioRepository extends JpaRepository<MpmControleOficio, Integer> {
	//
}
