package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {
	//
	private String Ordem;
	private String UF;
	private String Cidade;
	private String Bairro;
	private String CEP;
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