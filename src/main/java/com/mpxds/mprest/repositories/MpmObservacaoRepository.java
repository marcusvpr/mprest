package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmObservacao;

@Repository
public interface MpmObservacaoRepository extends JpaRepository<MpmObservacao, Integer> {
	//
}