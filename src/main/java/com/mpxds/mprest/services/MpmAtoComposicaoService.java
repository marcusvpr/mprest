package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAtoComposicao;
import com.mpxds.mprest.repositories.MpmAtoComposicaoRepository;

@Service
public class MpmAtoComposicaoService {
	//
	@Autowired
	private MpmAtoComposicaoRepository mpRepo;
	
	public MpmAtoComposicao buscarId(Integer id) {
		//
		Optional<MpmAtoComposicao> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
