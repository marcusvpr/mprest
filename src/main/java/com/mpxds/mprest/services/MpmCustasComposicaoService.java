package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmCustasComposicao;
import com.mpxds.mprest.repositories.MpmCustasComposicaoRepository;

@Service
public class MpmCustasComposicaoService {
	//
	@Autowired
	private MpmCustasComposicaoRepository mpRepo;
	
	public MpmCustasComposicao buscarId(Integer id) {
		//
		Optional<MpmCustasComposicao> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
