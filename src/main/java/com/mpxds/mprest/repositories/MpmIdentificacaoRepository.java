package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmIdentificacao;

@Repository
public interface MpmIdentificacaoRepository extends JpaRepository<MpmIdentificacao, Integer> {
	//
	Optional<MpmIdentificacao> findByCodigo(Integer codigo);
}
