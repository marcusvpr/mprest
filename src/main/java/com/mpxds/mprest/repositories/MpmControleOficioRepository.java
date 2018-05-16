package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmControleOficio;

@Repository
public interface MpmControleOficioRepository extends JpaRepository<MpmControleOficio, Integer> {
	//
	Optional<MpmControleOficio> findByCpfCnpj(String cpfCnpj);

	Optional<MpmControleOficio> findByNomeDevedor(String nomeDevedor);
	Optional<MpmControleOficio> findByNomeDevedor1(String nomeDevedor1);
	Optional<MpmControleOficio> findByNomeDevedor2(String nomeDevedor2);
}
