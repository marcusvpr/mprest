package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmSeloDistribuidor;

@Repository
public interface MpmSeloDistribuidorRepository extends JpaRepository<MpmSeloDistribuidor, Integer> {
	//
	Optional<MpmSeloDistribuidor> findByDataDistribuicaoAndNumeroDistribuicao(Date dataDistribuicao,
																				String numeroDistribuicao);
}
