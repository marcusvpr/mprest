package com.mpxds.mprest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmEstadoUf;

@Repository
public interface MpmEstadoUfRepository extends JpaRepository<MpmEstadoUf, Integer> {
	//
	Optional<MpmEstadoUf> findBySigla(String sigla);
	
	@Transactional(readOnly=true)
	public List<MpmEstadoUf> findAllByOrderByNome();
}
