package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmSeloDistribuidor;
import com.mpxds.mprest.repositories.MpmSeloDistribuidorRepository;

@Service
public class MpmSeloDistribuidorService {
	//
	@Autowired
	private MpmSeloDistribuidorRepository mpRepo;
	
	public MpmSeloDistribuidor buscarId(Integer id) {
		//
		Optional<MpmSeloDistribuidor> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
