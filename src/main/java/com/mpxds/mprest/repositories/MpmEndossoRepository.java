package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmEndosso;

@Repository
public interface MpmEndossoRepository extends JpaRepository<MpmEndosso, Integer> {
	//
	Optional<MpmEndosso> findByCodigo(String codigo);
}
