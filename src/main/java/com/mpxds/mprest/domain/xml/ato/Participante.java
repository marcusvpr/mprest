package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Participante {
	//
	private String Ordem;
	private String Tipo;
	private String TipoPessoa;
	private String Nome;
	private String CPFCNPJ;

	private Documento Documento;
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