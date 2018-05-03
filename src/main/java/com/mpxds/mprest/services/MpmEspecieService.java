package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmEspecie;
import com.mpxds.mprest.repositories.MpmEspecieRepository;

@Service
public class MpmEspecieService {
	//
	@Autowired
	private MpmEspecieRepository mpRepo;
	
	public MpmEspecie buscarId(Integer id) {
		//
		Optional<MpmEspecie> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmEspecie buscarCodigo(String codigo) {
		//
		Optional<MpmEspecie> mpObj = mpRepo.findByCodigo(codigo);
		//
		return mpObj.orElse(null);
	}

}
