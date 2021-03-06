package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmMotivoEdital;

@Repository
public interface MpmMotivoEditalRepository extends JpaRepository<MpmMotivoEdital, Integer> {
	//
	Optional<MpmMotivoEdital> findByCodigo(String codigo);
}
