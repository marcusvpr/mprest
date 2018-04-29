package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAnoReferencia;
import com.mpxds.mprest.repositories.MpmAnoReferenciaRepository;

@Service
public class MpmAnoReferenciaService {
	//
	@Autowired
	private MpmAnoReferenciaRepository mpRepo;
	
	public MpmAnoReferencia buscarId(Integer id) {
		//
		Optional<MpmAnoReferencia> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmAnoReferencia buscarAnoReferencia(String anoReferencia) {
		//
		Optional<MpmAnoReferencia> mpObj = mpRepo.findByAno(anoReferencia);
		//
		return mpObj.orElse(null);
	}

}
