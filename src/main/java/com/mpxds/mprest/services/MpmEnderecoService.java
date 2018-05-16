package com.mpxds.mprest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmEndereco;
import com.mpxds.mprest.repositories.MpmEnderecoRepository;

@Service
public class MpmEnderecoService {
	//
	@Autowired
	private MpmEnderecoRepository mpRepo;
	
	public MpmEndereco buscarId(Integer id) {
		//
		Optional<MpmEndereco> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmEndereco buscarLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
			String logradouro, String numero, String complemento, String cep,
			String bairro, MpmCidade mpmCidade) {
		//
		Optional<MpmEndereco> mpObj = mpRepo.findByLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
														logradouro, numero, complemento, cep, bairro, mpmCidade);
		//
		return mpObj.orElse(null);
	}

	public MpmEndereco buscarGravarMpmEnderecoByLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
											String logradouro, String numero, String complemento, String cep,
											String bairro, MpmCidade mpmCidade) {
		//
		MpmEndereco mpmEndereco = this.buscarLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
						logradouro, numero, complemento, cep, bairro, mpmCidade); 
		if (null == mpmEndereco) {
			//
			mpmEndereco = new MpmEndereco(null, logradouro, numero, complemento, cep, bairro, mpmCidade);				
			mpmEndereco = this.mpRepo.saveAndFlush(mpmEndereco);
		}
		//
		return mpmEndereco;
	}
	
}
