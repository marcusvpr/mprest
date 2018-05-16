package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmDevedor;

@Repository
public interface MpmDevedorRepository extends JpaRepository<MpmDevedor, Integer> {
	//
	Optional<MpmDevedor> findByCodigo(Integer codigo);
}
