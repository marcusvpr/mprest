package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InformacoesSelo {
	//
	private String Id;
	private Servico Servico;

	// --- 
	
	public String getId() { return Id; }
	public Servico getServico() { return Servico; }
 
	@Override
	public String toString() {
		//
		return "InformacoesSelo[Id=" + Id + "|, " + Servico.toString() + "]InformacoesSelo";
  	}
}