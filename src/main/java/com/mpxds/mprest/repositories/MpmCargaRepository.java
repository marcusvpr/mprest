package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmCarga;

@Repository
public interface MpmCargaRepository extends JpaRepository<MpmCarga, Integer> {
	//
}
