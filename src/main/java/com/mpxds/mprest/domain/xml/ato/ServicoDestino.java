package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServicoDestino {
	//
	private String CodigoServico;
	
	// ---
	
	public String getCodigoServico() { return CodigoServico; }

	@Override
	public String toString() {
		//
		return "ServicoDestino[CodigoServico=" + CodigoServico + "|]ServicoDestino";
	}
	 
}