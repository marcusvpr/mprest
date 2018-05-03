package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmEdital;
import com.mpxds.mprest.repositories.MpmEditalRepository;

@Service
public class MpmEditalService {
	//
	@Autowired
	private MpmEditalRepository mpRepo;
	
	public MpmEdital buscarId(Integer id) {
		//
		Optional<MpmEdital> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
