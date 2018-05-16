package com.mpxds.mprest.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmItemEmolumentoXml;
import com.mpxds.mprest.repositories.MpmItemEmolumentoXmlRepository;

@Service
public class MpmItemEmolumentoXmlService {
	//
	@Autowired
	private MpmItemEmolumentoXmlRepository mpRepo;
	
	public MpmItemEmolumentoXml buscarId(Integer id) {
		//
		Optional<MpmItemEmolumentoXml> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public List<MpmItemEmolumentoXml> buscarCodigoAtoAndAtoSequenciaAndDataPraticaAndNumeroControles(
																		String codigoAto, String atoSequencia,
																		Date dataPratica, String numeroControle ) {
		//
		List<MpmItemEmolumentoXml> mpObjs = mpRepo.findCodigoAtoAndAtoSequenciaAndDataPraticaAndNumeroControles(
																codigoAto, atoSequencia, dataPratica, numeroControle);
		//
		return mpObjs;
	}

}
