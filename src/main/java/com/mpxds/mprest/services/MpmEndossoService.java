package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmEndosso;
import com.mpxds.mprest.repositories.MpmEndossoRepository;

@Service
public class MpmEndossoService {
	//
	@Autowired
	private MpmEndossoRepository mpRepo;
	
	public MpmEndosso buscarId(Integer id) {
		//
		Optional<MpmEndosso> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmEndosso buscarCodigo(String codigo) {
		//
		Optional<MpmEndosso> mpObj = mpRepo.findByCodigo(codigo);
		//
		return mpObj.orElse(null);
	}

}
