package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Selo")
public class Selo {
	//
	@XmlElement(name="InformacoesSelo")
	private InformacoesSelo InformacoesSelo;
	
	@XmlElement(name="AssinaturaSelo")
	private AssinaturaSelo AssinaturaSelo;

	@XmlElement(name="OutrasInformacoes")
	private OutrasInformacoes OutrasInformacoes;

	// --- 
	
	public InformacoesSelo getInformacoesSelo() { return InformacoesSelo; }
	public AssinaturaSelo getAssinaturaSelo() { return AssinaturaSelo; }
	public OutrasInformacoes getOutrasInformacoes() { return OutrasInformacoes; }

	@Override
	public String toString() {
		//
		return "Selo[" + InformacoesSelo.toString() 
			+ ", " + AssinaturaSelo.toString()
			+ ", " + OutrasInformacoes.toString()
			+ "]Selo";
  	}
}