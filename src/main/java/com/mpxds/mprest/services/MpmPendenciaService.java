package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmPendencia;
import com.mpxds.mprest.repositories.MpmPendenciaRepository;

@Service
public class MpmPendenciaService {
	//
	@Autowired
	private MpmPendenciaRepository mpRepo;
	
	public MpmPendencia buscarId(Integer id) {
		//
		Optional<MpmPendencia> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
