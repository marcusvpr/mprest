package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmEspecie;

@Repository
public interface MpmEspecieRepository extends JpaRepository<MpmEspecie, Integer> {
	//
	Optional<MpmEspecie> findByCodigo(String codigo);
}
