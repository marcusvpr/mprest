package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OutrasInformacoes")
public class OutrasInformacoes {
	//
	@XmlAttribute(name="Aleatorio")
	private String Aleatorio;

	@XmlAttribute(name="DataHoraSelagem")
	private String DataHoraSelagem;
		
	// ---
	
	public String getAleatorio() { return Aleatorio; }
	public String getDataHoraSelagem() { return DataHoraSelagem; }

	// ---
	
	@Override
	public String toString() {
		//
		return "OutrasInformacoes[Aleatorio=" + Aleatorio 
				+ "|, TipoAtDataHoraSelagem=" + DataHoraSelagem + "|]OutrasInformacoes";
	}
	 
}