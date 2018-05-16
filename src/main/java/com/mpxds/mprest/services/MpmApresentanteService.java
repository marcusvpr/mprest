package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmApresentante;
import com.mpxds.mprest.repositories.MpmApresentanteRepository;

@Service
public class MpmApresentanteService {
	//
	@Autowired
	private MpmApresentanteRepository mpRepo;
	
	public MpmApresentante buscarId(Integer id) {
		//
		Optional<MpmApresentante> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmApresentante buscarCodigo(String codigo) {
		//
		Optional<MpmApresentante> mpObj = mpRepo.findByCodigo(codigo);
		//
		return mpObj.orElse(null);
	}
	
	public MpmApresentante buscarNome(String nome) {
		//
		Optional<MpmApresentante> mpObj = mpRepo.findByNome(nome);
		//
		return mpObj.orElse(null);
	}

}
