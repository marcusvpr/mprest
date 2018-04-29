package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmApresentante;

@Repository
public interface MpmApresentanteRepository extends JpaRepository<MpmApresentante, Integer> {
	//
}
