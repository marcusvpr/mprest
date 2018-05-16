package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InformacoesSelo")
public class InformacoesSelo {
	//
	@XmlAttribute(name="Id")
	private String Id;

	@XmlElement(name="Servico")
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