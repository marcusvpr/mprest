package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmEstadoUf;

@Repository
public interface MpmEstadoUfRepository extends JpaRepository<MpmEstadoUf, Integer> {
	//
}
