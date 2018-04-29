package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmAtoComposicao;

@Repository
public interface MpmAtoComposicaoRepository extends JpaRepository<MpmAtoComposicao, Integer> {
	//
}
