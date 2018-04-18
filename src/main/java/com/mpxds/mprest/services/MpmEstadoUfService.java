package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.repositories.MpmEstadoUfRepository;

@Service
public class MpmEstadoUfService {
	//
	@Autowired
	private MpmEstadoUfRepository mpRepo;
	
	public MpmEstadoUf buscar(Integer id) {
		//
		Optional<MpmEstadoUf> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
