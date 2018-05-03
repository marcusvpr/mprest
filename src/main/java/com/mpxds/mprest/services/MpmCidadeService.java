package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.repositories.MpmCidadeRepository;

@Service
public class MpmCidadeService {
	//
	@Autowired
	private MpmCidadeRepository mpRepo;
	
	public MpmCidade buscarId(Integer id) {
		//
		Optional<MpmCidade> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmCidade buscarNomeAndMpmEstadoUf(String nome, MpmEstadoUf mpmEstadoUf) {
		//
		Optional<MpmCidade> mpObj = mpRepo.findByNomeAndMpmEstadoUf(nome, mpmEstadoUf);
		//
		return mpObj.orElse(null);
	}
	

}
