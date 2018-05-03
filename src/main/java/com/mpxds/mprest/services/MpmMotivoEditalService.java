package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmMotivoEdital;
import com.mpxds.mprest.repositories.MpmMotivoEditalRepository;

@Service
public class MpmMotivoEditalService {
	//
	@Autowired
	private MpmMotivoEditalRepository mpRepo;
	
	public MpmMotivoEdital buscarId(Integer id) {
		//
		Optional<MpmMotivoEdital> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmMotivoEdital buscarCodigo(String codigo) {
		//
		Optional<MpmMotivoEdital> mpObj = mpRepo.findByCodigo(codigo);
		//
		return mpObj.orElse(null);
	}

}
