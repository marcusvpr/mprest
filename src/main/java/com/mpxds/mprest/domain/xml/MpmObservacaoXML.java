package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Observacoes")
public class MpmObservacaoXML {
	//
	private String tpObservacao;
	private String dscObservacao;
	
	//
		
	@XmlElement(name="TpObservacao")
	public String getTpObservacao() { return tpObservacao; }
	public void setTpObservacao(String tpObservacao) { this.tpObservacao = tpObservacao; }
	
	@XmlElement(name="DscObservacao")
	public String getDscObservacao() { return dscObservacao; }
	public void setDscObservacao(String dscObservacao) { this.dscObservacao = dscObservacao; }
	
	@Override
	public String toString() {
		return "MpmObservacaoXML [tpObservacao;=" + tpObservacao + ", dscObservacao;=" +
																					dscObservacao + "]";
	}
	
}
