package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ServicoDestino")
public class ServicoDestino {
	//
	@XmlAttribute(name="CodigoServico")
	private String CodigoServico;
	
	// ---
	
	public String getCodigoServico() { return CodigoServico; }

	@Override
	public String toString() {
		//
		return "ServicoDestino[CodigoServico=" + CodigoServico + "|]ServicoDestino";
	}
	 
}