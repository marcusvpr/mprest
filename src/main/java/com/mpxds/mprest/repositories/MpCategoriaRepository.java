package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpCategoria;

@Repository
public interface MpCategoriaRepository extends JpaRepository<MpCategoria, Integer> {
	//
}
