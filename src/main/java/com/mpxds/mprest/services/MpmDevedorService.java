package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmDevedor;
import com.mpxds.mprest.repositories.MpmDevedorRepository;

@Service
public class MpmDevedorService {
	//
	@Autowired
	private MpmDevedorRepository mpRepo;
	
	public MpmDevedor buscar(Integer id) {
		//
		Optional<MpmDevedor> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
