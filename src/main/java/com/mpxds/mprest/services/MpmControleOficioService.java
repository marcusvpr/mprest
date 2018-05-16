package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmControleOficio;
import com.mpxds.mprest.repositories.MpmControleOficioRepository;

@Service
public class MpmControleOficioService {
	//
	@Autowired
	private MpmControleOficioRepository mpRepo;
	
	public MpmControleOficio buscarId(Integer id) {
		//
		Optional<MpmControleOficio> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmControleOficio buscarCpfCnpj(String cpfCnpj) {
		//
		Optional<MpmControleOficio> mpObj = mpRepo.findByCpfCnpj(cpfCnpj);
		//
		return mpObj.orElse(null);
	}
	
	public MpmControleOficio buscarNomeDevedor(String nome, String numero) {
		//
		Optional<MpmControleOficio> mpObj = null;
		if (numero.isEmpty())
			mpObj = mpRepo.findByNomeDevedor(nome);
		else
			if (numero.trim().equals("1"))
				mpObj = mpRepo.findByNomeDevedor1(nome);
			else
				if (numero.trim().equals("2"))
					mpObj = mpRepo.findByNomeDevedor2(nome);
		//
		return mpObj.orElse(null);
	}

}
