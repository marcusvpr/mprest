package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mpxds.mprest.domain.MpmItemEmolumentoXml;

@Repository
public interface MpmItemEmolumentoXmlRepository extends JpaRepository<MpmItemEmolumentoXml, Integer> {
	//	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM MpmItemEmolumentoXml obj WHERE obj.codigoAto = :codigoAto" +
					" AND obj.atoSequencia = :atoSequencia AND obj.dataPratica = :dataPratica" +
					" AND obj.numeroControle = :numeroControle" +
					" ORDER BY obj.codigoAto, obj.atoSequencia, obj.dataPratica, obj.numeroControle")
	public List<MpmItemEmolumentoXml> findCodigoAtoAndAtoSequenciaAndDataPraticaAndNumeroControles(
											@Param("codigoAto") String codigoAto,
											@Param("atoSequencia") String atoSequencia,
											@Param("dataPratica") Date dataPratica,
											@Param("numeroControle") String numeroControle);
	
}
