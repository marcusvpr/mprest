package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmCarga;
import com.mpxds.mprest.repositories.MpmCargaRepository;

@Service
public class MpmCargaService {
	//
	@Autowired
	private MpmCargaRepository mpRepo;
	
	public MpmCarga buscarId(Integer id) {
		//
		Optional<MpmCarga> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
