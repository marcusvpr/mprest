package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmControleOficio;
import com.mpxds.mprest.repositories.MpmControleOficioRepository;

@Service
public class MpmControleOficioService {
	//
	@Autowired
	private MpmControleOficioRepository mpRepo;
	
	public MpmControleOficio buscarId(Integer id) {
		//
		Optional<MpmControleOficio> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
