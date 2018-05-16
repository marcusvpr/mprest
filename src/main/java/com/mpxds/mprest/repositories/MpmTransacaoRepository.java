package com.mpxds.mprest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmTransacao;

@Repository
public interface MpmTransacaoRepository extends JpaRepository<MpmTransacao, Integer> {
	//
	
	@Transactional(readOnly=true)
	public List<MpmTransacao> findAllByOrderByNumeroProtocoloCartorio();
}
