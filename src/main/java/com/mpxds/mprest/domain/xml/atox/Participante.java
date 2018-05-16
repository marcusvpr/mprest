package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Participante")
public class Participante {
	//
	@XmlAttribute(name="Ordem")
	private String Ordem;

	@XmlAttribute(name="Tipo")
	private String Tipo;

	@XmlAttribute(name="TipoPessoa")
	private String TipoPessoa;

	@XmlAttribute(name="Nome")
	private String Nome;

	@XmlAttribute(name="CPFCNPJ")
	private String CPFCNPJ;

	@XmlElement(name="Documento")
	private Documento Documento;

	@XmlElement(name="Endereco")
	private Endereco Endereco;

	// ---
	
	public String getOrdem() { return Ordem; }
	public String getTipo() { return Tipo; }
	public String getTipoPessoa() { return TipoPessoa; }
	public String getNome() { return Nome; }
	public String getCPFCNPJ() { return CPFCNPJ; }

	public Documento getDocumento() { return Documento; }
	public Endereco getEndereco() { return Endereco; }
	
	// ---

	@Override
	public String toString() {
		if (null == Documento) this.Documento = new Documento();
		if (null == Endereco) this.Endereco = new Endereco();
		//
		return "Participante[Ordem=" + Ordem + "|, Tipo=" + Tipo + "|, TipoPessoa=" + TipoPessoa + "|, Nome=" + Nome
				+ "|, CPFCNPJ=" + CPFCNPJ + "|, " 
				+ Documento.toString() + ", " 
				+ Endereco.toString()
				+ "]Participante";
	}
	 
}