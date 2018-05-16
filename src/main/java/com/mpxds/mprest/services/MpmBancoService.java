package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAgencia;
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
	
	public MpmBanco buscarCodigoAndMpmAgencia(String codigo, MpmAgencia mpmAgencia) {
		//
		Optional<MpmBanco> mpObj = mpRepo.findByCodigoAndMpmAgencia(codigo, mpmAgencia);
		//
		return mpObj.orElse(null);
	}
	
	public MpmBanco buscarCodigo(String codigo) {
		//
		Optional<MpmBanco> mpObj = mpRepo.findByCodigo(codigo);
		//
		return mpObj.orElse(null);
	}

}
