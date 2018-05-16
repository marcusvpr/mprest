package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Selo {
	//
	private InformacoesSelo InformacoesSelo;
	private AssinaturaSelo AssinaturaSelo;
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