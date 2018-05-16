package com.mpxds.mprest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmAgencia;
import com.mpxds.mprest.domain.MpmBancoSistema;

@Repository
public interface MpmAgenciaRepository extends JpaRepository<MpmAgencia, Integer> {
	//
	Optional<MpmAgencia> findByNomeAndMpmBancoSistema(String nome, MpmBancoSistema mpmBancoSistema);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM MpmAgencia obj WHERE obj.mpmBancoSistema.id = :bancoSistemaId ORDER BY obj.nome")
	public List<MpmAgencia> findMpmAgencias(@Param("bancoSistemaId") Integer bancoSistema_id);
	
	@Transactional(readOnly=true)
	public List<MpmAgencia> findAllByOrderByNome();

}
