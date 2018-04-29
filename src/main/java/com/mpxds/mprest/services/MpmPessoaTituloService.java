package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmPessoaTitulo;
import com.mpxds.mprest.repositories.MpmPessoaTituloRepository;

@Service
public class MpmPessoaTituloService {
	//
	@Autowired
	private MpmPessoaTituloRepository mpRepo;
	
	public MpmPessoaTitulo buscarId(Integer id) {
		//
		Optional<MpmPessoaTitulo> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
