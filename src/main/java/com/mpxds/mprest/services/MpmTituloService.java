package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmTitulo;
import com.mpxds.mprest.repositories.MpmTituloRepository;

@Service
public class MpmTituloService {
	//
	@Autowired
	private MpmTituloRepository mpRepo;
	
	public MpmTitulo buscar(Integer id) {
		//
		Optional<MpmTitulo> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
