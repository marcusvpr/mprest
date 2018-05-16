package com.mpxds.mprest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmAnoReferencia;
import com.mpxds.mprest.domain.MpmCustasComposicao;
import com.mpxds.mprest.repositories.MpmCustasComposicaoRepository;

@Service
public class MpmCustasComposicaoService {
	//
	@Autowired
	private MpmCustasComposicaoRepository mpRepo;
	
	public MpmCustasComposicao buscarId(Integer id) {
		//
		Optional<MpmCustasComposicao> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmCustasComposicao buscarMpmAnoReferenciaAndTabelaAndItemAndSubItem(MpmAnoReferencia mpmAnoReferencia,
																					String tabela, 
																					String item, String subItem) {
		//
		Optional<MpmCustasComposicao> mpObj = mpRepo.findByMpmAnoReferenciaAndTabelaAndItemAndSubItem(
																			mpmAnoReferencia, tabela, item, subItem);
		//
		return mpObj.orElse(null);
	}
	
	public List<MpmCustasComposicao> buscarMpmAnoReferenciaAndTabelaAndItem(MpmAnoReferencia mpmAnoReferencia,
																						String tabela, String item) {
		//
		List<MpmCustasComposicao> mpObjs = mpRepo.findMpmAnoReferenciaAndTabelaAndItems(mpmAnoReferencia,
																									tabela, item);
		//
		return mpObjs;
	}

}
