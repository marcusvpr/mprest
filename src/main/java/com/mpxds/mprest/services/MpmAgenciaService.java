package com.mpxds.mprest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAgencia;
import com.mpxds.mprest.domain.MpmBancoSistema;
import com.mpxds.mprest.repositories.MpmAgenciaRepository;

@Service
public class MpmAgenciaService {
	//
	@Autowired
	private MpmAgenciaRepository mpRepo;
	
	public MpmAgencia buscarId(Integer id) {
		//
		Optional<MpmAgencia> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmAgencia buscarNomeAndMpmBancoSistema(String nome, MpmBancoSistema mpmBancoSistema) {
		//
		Optional<MpmAgencia> mpObj = mpRepo.findByNomeAndMpmBancoSistema(nome, mpmBancoSistema);
		//
		return mpObj.orElse(null);
	}
	
	public List<MpmAgencia> findByMpmBancoSistema(Integer estadoId) {
		//
		return mpRepo.findMpmAgencias(estadoId);
	}
	
	public List<MpmAgencia> findAll() {
		//
		return mpRepo.findAllByOrderByNome();
	}

}
