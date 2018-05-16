package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Servico {
	//
	private String Codigo;

	// --- 
	
	public String getCodigo() { return Codigo; }
 
	@Override
	public String toString() {
		//
		return "Servico[Codigo=" + Codigo + "|]Servico";
  	}
}