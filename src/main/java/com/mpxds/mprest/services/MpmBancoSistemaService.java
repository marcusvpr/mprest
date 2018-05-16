package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmBancoSistema;
import com.mpxds.mprest.repositories.MpmBancoSistemaRepository;

@Service
public class MpmBancoSistemaService {
	//
	@Autowired
	private MpmBancoSistemaRepository mpRepo;
	
	public MpmBancoSistema buscarId(Integer id) {
		//
		Optional<MpmBancoSistema> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmBancoSistema buscarNome(String nome) {
		//
		Optional<MpmBancoSistema> mpObj = mpRepo.findByNome(nome);
		//
		return mpObj.orElse(null);
	}
	
	public MpmBancoSistema buscarNumero(String numero) {
		//
		Optional<MpmBancoSistema> mpObj = mpRepo.findByNumero(numero);
		//
		return mpObj.orElse(null);
	}

}
