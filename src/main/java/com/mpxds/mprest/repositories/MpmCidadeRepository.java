package com.mpxds.mprest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmEstadoUf;

@Repository
public interface MpmCidadeRepository extends JpaRepository<MpmCidade, Integer> {
	//
	Optional<MpmCidade> findByNomeAndMpmEstadoUf(String nome, MpmEstadoUf mpmEstadoUf);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM MpmCidade obj WHERE obj.mpmEstadoUf.id = :estadoId ORDER BY obj.nome")
	public List<MpmCidade> findMpmCidades(@Param("estadoId") Integer estado_id);
	
	@Transactional(readOnly=true)
	public List<MpmCidade> findAllByOrderByNome();

}
