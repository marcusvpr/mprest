package com.mpxds.mprest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmBancoSistema;

@Repository
public interface MpmBancoSistemaRepository extends JpaRepository<MpmBancoSistema, Integer> {
	//
	Optional<MpmBancoSistema> findByNome(String nome);

	Optional<MpmBancoSistema> findByNumero(String numro);
	
	@Transactional(readOnly=true)
	public List<MpmBancoSistema> findAllByOrderByNome();
}
