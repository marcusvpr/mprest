package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmStatus;
import com.mpxds.mprest.repositories.MpmStatusRepository;

@Service
public class MpmStatusService {
	//
	@Autowired
	private MpmStatusRepository mpRepo;
	
	public MpmStatus buscar(Integer id) {
		//
		Optional<MpmStatus> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
