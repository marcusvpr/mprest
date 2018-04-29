package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Identificacao")
public class MpmIdentificacaoXML {
	//
	private String cod_Identificacao;
	private String dsc_Identificacao;
	
	//
		
	@XmlElement(name="Cod_Identificacao")
	public String getCod_Identificacao() { return cod_Identificacao; }
	public void setCod_Identificacao(String cod_Identificacao) { this.cod_Identificacao = cod_Identificacao; }
	
	@XmlElement(name="Dsc_Identificacao")
	public String getDsc_Identificacao() { return dsc_Identificacao; }
	public void setDsc_Identificacao(String dsc_Identificacao) { this.dsc_Identificacao = dsc_Identificacao; }
	
	@Override
	public String toString() {
		return "MpmIdentificacaoXML [cod_Identificacao;=" + cod_Identificacao + ", dsc_Identificacao;=" +
																			dsc_Identificacao + "]";
	}
	
}
