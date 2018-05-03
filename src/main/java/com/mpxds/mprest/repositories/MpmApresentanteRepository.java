package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmApresentante;

@Repository
public interface MpmApresentanteRepository extends JpaRepository<MpmApresentante, Integer> {
	//
	Optional<MpmApresentante> findByCodigo(String codigo);
}
