package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmRemessa;
import com.mpxds.mprest.repositories.MpmRemessaRepository;

@Service
public class MpmRemessaService {
	//
	@Autowired
	private MpmRemessaRepository mpRepo;
	
	public MpmRemessa buscarId(Integer id) {
		//
		Optional<MpmRemessa> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
