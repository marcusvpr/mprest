package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmOficio;

@Repository
public interface MpmOficioRepository extends JpaRepository<MpmOficio, Integer> {
	//
}
