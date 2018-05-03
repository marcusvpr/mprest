package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmAlinea;

@Repository
public interface MpmAlineaRepository extends JpaRepository<MpmAlinea, Integer> {
	//
	Optional<MpmAlinea> findByCodigo(Integer codigo);
}
