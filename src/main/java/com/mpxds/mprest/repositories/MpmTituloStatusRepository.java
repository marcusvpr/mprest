package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmTituloStatus;

@Repository
public interface MpmTituloStatusRepository extends JpaRepository<MpmTituloStatus, Integer> {
	//
	Optional<MpmTituloStatus> findByDataOcorrenciaAndCodigo(Date dataOcorencia, String codigo);
}
