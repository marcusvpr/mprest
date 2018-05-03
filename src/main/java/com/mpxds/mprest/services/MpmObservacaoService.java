package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmObservacao;
import com.mpxds.mprest.repositories.MpmObservacaoRepository;

@Service
public class MpmObservacaoService {
	//
	@Autowired
	private MpmObservacaoRepository mpRepo;
	
	public MpmObservacao buscarId(Integer id) {
		//
		Optional<MpmObservacao> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmObservacao buscarTipo(String tipo) {
		//
		Optional<MpmObservacao> mpObj = mpRepo.findByTipo(tipo);
		//
		return mpObj.orElse(null);
	}
	
	public MpmObservacao buscarDescricao(String descricao) {
		//
		Optional<MpmObservacao> mpObj = mpRepo.findByDescricao(descricao);
		//
		return mpObj.orElse(null);
	}

}
