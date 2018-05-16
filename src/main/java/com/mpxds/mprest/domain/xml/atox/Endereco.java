package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Endereco")
public class Endereco {
	//
	@XmlAttribute(name="Ordem")
	private String Ordem;

	@XmlAttribute(name="UF")
	private String UF;

	@XmlAttribute(name="Cidade")
	private String Cidade;

	@XmlAttribute(name="Bairro")
	private String Bairro;

	@XmlAttribute(name="CEP")
	private String CEP;

	@XmlAttribute(name="Logradouro")
	private String Logradouro;

	// ---
	
	public String getOrdem() { return Ordem; }
	public String getUF() { return UF; }
	public String getCidade() { return Cidade; }
	public String getBairro() { return Bairro; }
	public String getCEP() { return CEP; }
	public String getLogradouro() { return Logradouro; }
	
	// ---

	@Override
	public String toString() {
		return "Endereco[Ordem=" + Ordem + "|, UF=" + UF + "|, Cidade=" + Cidade + "|, Bairro=" + Bairro
				+ "|, CEP=" + CEP + "|, Logradouro=" + Logradouro + "|]Endereco";
	}
	 
}