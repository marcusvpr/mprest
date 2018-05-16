package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmAgencia;
import com.mpxds.mprest.domain.MpmBanco;

@Repository
public interface MpmBancoRepository extends JpaRepository<MpmBanco, Integer> {
	//
	Optional<MpmBanco> findByCodigoAndMpmAgencia(String codigo, MpmAgencia mpmAgencia);
	
	Optional<MpmBanco> findByCodigo(String codigo);
}
