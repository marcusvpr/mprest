package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmHeader;
import com.mpxds.mprest.repositories.MpmHeaderRepository;

@Service
public class MpmHeaderService {
	//
	@Autowired
	private MpmHeaderRepository mpRepo;
	
	public MpmHeader buscarId(Integer id) {
		//
		Optional<MpmHeader> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
