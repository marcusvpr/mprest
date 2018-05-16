package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Servico")
public class Servico {
	//
	@XmlAttribute(name="Codigo")
	private String Codigo;

	// --- 
	
	public String getCodigo() { return Codigo; }
 
	@Override
	public String toString() {
		//
		return "Servico[Codigo=" + Codigo + "|]Servico";
  	}
}