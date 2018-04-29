package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpSistemaConfig;
import com.mpxds.mprest.repositories.MpSistemaConfigRepository;

@Service
public class MpSistemaConfigService {
	//
	@Autowired
	private MpSistemaConfigRepository mpRepo;
	
	public MpSistemaConfig buscarId(Integer id) {
		//
		Optional<MpSistemaConfig> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
