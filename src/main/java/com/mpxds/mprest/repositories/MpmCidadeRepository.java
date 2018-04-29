package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmEstadoUf;

@Repository
public interface MpmCidadeRepository extends JpaRepository<MpmCidade, Integer> {
	//
	Optional<MpmCidade> findByDescricaoAndMpmEstadoUf(String descricao,MpmEstadoUf mpmEstadoUf);
}
