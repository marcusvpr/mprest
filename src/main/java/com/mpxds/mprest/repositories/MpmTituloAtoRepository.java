package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmTituloAto;

@Repository
public interface MpmTituloAtoRepository extends JpaRepository<MpmTituloAto, Integer> {
	//
}
