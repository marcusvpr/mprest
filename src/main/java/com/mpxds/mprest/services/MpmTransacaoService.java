package com.mpxds.mprest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmTransacao;
import com.mpxds.mprest.repositories.MpmTransacaoRepository;

@Service
public class MpmTransacaoService {
	//
	@Autowired
	private MpmTransacaoRepository mpRepo;
	
	public MpmTransacao buscarId(Integer id) {
		//
		Optional<MpmTransacao> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public List<MpmTransacao> findAll() {
		//
		return mpRepo.findAllByOrderByNumeroProtocoloCartorio();
	}

}
