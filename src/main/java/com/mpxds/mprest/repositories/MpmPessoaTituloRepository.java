package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmPessoaTitulo;

@Repository
public interface MpmPessoaTituloRepository extends JpaRepository<MpmPessoaTitulo, Integer> {
	//
}
