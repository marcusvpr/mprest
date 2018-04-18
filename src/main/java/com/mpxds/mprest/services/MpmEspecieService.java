package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmEspecie;
import com.mpxds.mprest.repositories.MpmEspecieRepository;

@Service
public class MpmEspecieService {
	//
	@Autowired
	private MpmEspecieRepository mpRepo;
	
	public MpmEspecie buscar(Integer id) {
		//
		Optional<MpmEspecie> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}