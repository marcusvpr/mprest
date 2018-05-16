package com.mpxds.mprest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmAnoReferencia;
import com.mpxds.mprest.domain.MpmCustasComposicao;

@Repository
public interface MpmCustasComposicaoRepository extends JpaRepository<MpmCustasComposicao, Integer> {
	//
	Optional<MpmCustasComposicao> findByMpmAnoReferenciaAndTabelaAndItemAndSubItem(
							MpmAnoReferencia mpmAnoReferencia, String Tabela, String item, String subItem);
		
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM MpmCustasComposicao obj WHERE obj.mpmAnoReferencia = :mpmAnoReferencia" +
					" AND obj.tabela = :tabela AND obj.item = :item" +
					" ORDER BY obj.mpmAnoReferencia.ano, obj.tabela, obj.item")
	public List<MpmCustasComposicao> findMpmAnoReferenciaAndTabelaAndItems(
											@Param("mpmAnoReferencia") MpmAnoReferencia mpmAnoReferencia,
											@Param("tabela") String tabela,
											@Param("item") String item);
}
