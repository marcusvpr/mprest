package com.mpxds.mprest.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmDataProcesso;
import com.mpxds.mprest.repositories.MpmDataProcessoRepository;

@Service
public class MpmDataProcessoService {
	//
	@Autowired
	private MpmDataProcessoRepository mpRepo;
	
	public MpmDataProcesso buscarId(Integer id) {
		//
		Optional<MpmDataProcesso> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmDataProcesso buscarDataProtocolo(Date dataProtocolo) {
		//
		Optional<MpmDataProcesso> mpObj = mpRepo.findByDataProtocolo(dataProtocolo);
		//
		return mpObj.orElse(null);
	}

}
