package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAlinea;
import com.mpxds.mprest.repositories.MpmAlineaRepository;

@Service
public class MpmAlineaService {
	//
	@Autowired
	private MpmAlineaRepository mpRepo;
	
	public MpmAlinea buscarId(Integer id) {
		//
		Optional<MpmAlinea> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
