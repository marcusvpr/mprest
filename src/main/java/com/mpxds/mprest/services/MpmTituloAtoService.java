package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmTituloAto;
import com.mpxds.mprest.repositories.MpmTituloAtoRepository;

@Service
public class MpmTituloAtoService {
	//
	@Autowired
	private MpmTituloAtoRepository mpRepo;
	
	public MpmTituloAto buscarId(Integer id) {
		//
		Optional<MpmTituloAto> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
		
}
