package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AlunoTurma")
public class AlunoTurma {
	//
	@XmlElement(name="nome")
	private String nome;

	// ---

	public AlunoTurma() {
	}
	
	public AlunoTurma(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() { return nome; }
	 
	@Override
	public String toString() {
		//
		return "AlunoTurma[Nome: " + this.nome + "]AlunoTurma";
  	}
}