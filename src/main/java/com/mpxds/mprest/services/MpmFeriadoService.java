package com.mpxds.mprest.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmFeriado;
import com.mpxds.mprest.repositories.MpmFeriadoRepository;

@Service
public class MpmFeriadoService {
	//
	@Autowired
	private MpmFeriadoRepository mpRepo;
	
	public MpmFeriado buscarId(Integer id) {
		//
		Optional<MpmFeriado> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmFeriado buscarDataFeriado(Date dataFeriado) {
		//
		Optional<MpmFeriado> mpObj = mpRepo.findByDataFeriado(dataFeriado);
		//
		return mpObj.orElse(null);
	}

}
