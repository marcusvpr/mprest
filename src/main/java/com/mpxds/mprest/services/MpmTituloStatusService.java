package com.mpxds.mprest.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmTituloStatus;
import com.mpxds.mprest.repositories.MpmTituloStatusRepository;

@Service
public class MpmTituloStatusService {
	//
	@Autowired
	private MpmTituloStatusRepository mpRepo;
	
	public MpmTituloStatus buscarId(Integer id) {
		//
		Optional<MpmTituloStatus> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmTituloStatus buscarDataOcorrenciaAndCodigo(Date dataOcoreencia, String codigo) {
		//
		Optional<MpmTituloStatus> mpObj = mpRepo.findByDataOcorrenciaAndCodigo(dataOcoreencia, codigo);
		//
		return mpObj.orElse(null);
	}

}
