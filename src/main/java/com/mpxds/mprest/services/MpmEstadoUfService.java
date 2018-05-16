package com.mpxds.mprest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.domain.enums.MpDescricaoEstadoUf;
import com.mpxds.mprest.repositories.MpmEstadoUfRepository;

@Service
public class MpmEstadoUfService {
	//
	@Autowired
	private MpmEstadoUfRepository mpRepo;
	
	public MpmEstadoUf buscarId(Integer id) {
		//
		Optional<MpmEstadoUf> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmEstadoUf buscarSigla(String sigla) {
		//
		Optional<MpmEstadoUf> mpObj = mpRepo.findBySigla(sigla);
		//
		return mpObj.orElse(null);
	}
	
	public List<MpmEstadoUf> findAll() {
		//
		return mpRepo.findAllByOrderByNome();
	}

	public MpmEstadoUf buscarGravarMpmEstadoUfBySigla(String sigla) {
		//
		if (sigla.trim().isEmpty()) sigla = "??";
		
		MpmEstadoUf mpmEstadoUf = this.buscarSigla(sigla);
		if (null == mpmEstadoUf) {
			//
			MpDescricaoEstadoUf mpDescricaoEstadoUf = MpDescricaoEstadoUf.fromSigla(sigla.trim().toUpperCase());

			String descricaoEstadoUf = "";
			if (null == mpDescricaoEstadoUf)
				descricaoEstadoUf = " Definir ???";
			else
				descricaoEstadoUf = mpDescricaoEstadoUf.getNome();
			//
			mpmEstadoUf = new MpmEstadoUf(null, sigla, descricaoEstadoUf);
			mpmEstadoUf = this.mpRepo.saveAndFlush(mpmEstadoUf);
		}
		//
		return mpmEstadoUf;
	}
	
	
}
