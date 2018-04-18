package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmCidade;

@Repository
public interface MpmCidadeRepository extends JpaRepository<MpmCidade, Integer> {
	//
}
