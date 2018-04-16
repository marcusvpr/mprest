package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpCategoria;
import com.mpxds.mprest.repositories.MpCategoriaRepository;

@Service
public class MpCategoriaService {
	//
	@Autowired
	private MpCategoriaRepository mpRepo;
	
	public MpCategoria buscar(Integer id) {
		//
		Optional<MpCategoria> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
