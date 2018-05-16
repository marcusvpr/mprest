package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmOficio;
import com.mpxds.mprest.repositories.MpmOficioRepository;

@Service
public class MpmOficioService {
	//
	@Autowired
	private MpmOficioRepository mpRepo;
	
	public MpmOficio buscarId(Integer id) {
		//
		Optional<MpmOficio> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmOficio buscarIndSistemaPrincipal(Boolean indSistemaPrincipal) {
		//
		Optional<MpmOficio> mpObj = mpRepo.findByIndSistemaPrincipal(indSistemaPrincipal);
		//
		return mpObj.orElse(null);
	}

}
