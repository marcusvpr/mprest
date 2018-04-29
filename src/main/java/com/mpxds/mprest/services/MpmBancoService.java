package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmBanco;
import com.mpxds.mprest.repositories.MpmBancoRepository;

@Service
public class MpmBancoService {
	//
	@Autowired
	private MpmBancoRepository mpRepo;
	
	public MpmBanco buscarId(Integer id) {
		//
		Optional<MpmBanco> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
