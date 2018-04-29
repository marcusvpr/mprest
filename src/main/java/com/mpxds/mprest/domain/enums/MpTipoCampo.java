package com.mpxds.mprest.domain.enums;

public enum MpTipoCampo {
	//
	B("Boolean"), 
	N("Número"), 
	T("Texto"); 
	
	private String descricao;
	
	// ---
	
	MpTipoCampo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() { return descricao; }
	
}
