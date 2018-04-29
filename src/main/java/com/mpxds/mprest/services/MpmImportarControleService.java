package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmImportarControle;
import com.mpxds.mprest.repositories.MpmImportarControleRepository;

@Service
public class MpmImportarControleService {
	//
	@Autowired
	private MpmImportarControleRepository mpRepo;
	
	public MpmImportarControle buscarId(Integer id) {
		//
		Optional<MpmImportarControle> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
