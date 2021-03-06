package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmImportarControle;

@Repository
public interface MpmImportarControleRepository extends JpaRepository<MpmImportarControle, Integer> {
	//
	Optional<MpmImportarControle> findByDataDistribuicao(Date dataDistribuicao);
}
