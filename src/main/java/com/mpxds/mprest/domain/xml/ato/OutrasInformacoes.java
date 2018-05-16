package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OutrasInformacoes {
	//
	private String Aleatorio;
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