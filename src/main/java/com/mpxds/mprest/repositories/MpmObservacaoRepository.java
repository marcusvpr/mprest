package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmObservacao;

@Repository
public interface MpmObservacaoRepository extends JpaRepository<MpmObservacao, Integer> {
	//
	Optional<MpmObservacao> findByTipo(String tipo);
	Optional<MpmObservacao> findByDescricao(String descricao);
}
