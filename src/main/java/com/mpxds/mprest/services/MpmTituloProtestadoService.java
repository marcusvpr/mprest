package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmTituloProtestado;
import com.mpxds.mprest.repositories.MpmTituloProtestadoRepository;

@Service
public class MpmTituloProtestadoService {
	//
	@Autowired
	private MpmTituloProtestadoRepository mpRepo;
	
	public MpmTituloProtestado buscarId(Integer id) {
		//
		Optional<MpmTituloProtestado> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
