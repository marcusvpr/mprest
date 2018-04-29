package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAnoReferencia;
import com.mpxds.mprest.domain.MpmAto;
import com.mpxds.mprest.repositories.MpmAtoRepository;

@Service
public class MpmAtoService {
	//
	@Autowired
	private MpmAtoRepository mpRepo;
	
	public MpmAto buscarId(Integer id) {
		//
		Optional<MpmAto> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmAto buscarMpmAnoReferenciaAndCodigoAtoAndAtoSequencia(MpmAnoReferencia mpmAnoReferencia,
																	String codigoAto, String atoSequencia) {
		//
		Optional<MpmAto> mpObj = mpRepo.findByMpmAnoReferenciaAndCodigoAtoAndAtoSequencia(mpmAnoReferencia,
																					codigoAto, atoSequencia);
		//
		return mpObj.orElse(null);
	}
	
}
