package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmIdentificacao;
import com.mpxds.mprest.repositories.MpmIdentificacaoRepository;

@Service
public class MpmIdentificacaoService {
	//
	@Autowired
	private MpmIdentificacaoRepository mpRepo;
	
	public MpmIdentificacao buscarId(Integer id) {
		//
		Optional<MpmIdentificacao> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmIdentificacao buscarCodigo(Integer codigo) {
		//
		Optional<MpmIdentificacao> mpObj = mpRepo.findByCodigo(codigo);
		//
		return mpObj.orElse(null);
	}

}
