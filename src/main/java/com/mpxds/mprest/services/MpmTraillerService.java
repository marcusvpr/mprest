package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmTrailler;
import com.mpxds.mprest.repositories.MpmTraillerRepository;

@Service
public class MpmTraillerService {
	//
	@Autowired
	private MpmTraillerRepository mpRepo;
	
	public MpmTrailler buscarId(Integer id) {
		//
		Optional<MpmTrailler> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
