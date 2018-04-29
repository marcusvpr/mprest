package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmItemEmolumentoXml;
import com.mpxds.mprest.repositories.MpmItemEmolumentoXmlRepository;

@Service
public class MpmItemEmolumentoXmlService {
	//
	@Autowired
	private MpmItemEmolumentoXmlRepository mpRepo;
	
	public MpmItemEmolumentoXml buscarId(Integer id) {
		//
		Optional<MpmItemEmolumentoXml> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}

}
