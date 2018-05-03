package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmImportarControle;
import com.mpxds.mprest.domain.MpmRemessa;

@Repository
public interface MpmRemessaRepository extends JpaRepository<MpmRemessa, Integer> {
	//
	Optional<MpmRemessa> findByMpmImportarControleAndNomeArquivo(MpmImportarControle mpmImportarControle,
																String nomeArquivo);
}
