package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Titulo")
public class Titulo {
	//
	@XmlAttribute(name="Praca")
	private String Praca; 

	@XmlAttribute(name="DataEmissao")
	private String DataEmissao;

	@XmlAttribute(name="DataVencimento")
	private String DataVencimento;

	@XmlAttribute(name="NumeroTitulo")
	private String NumeroTitulo;

	@XmlAttribute(name="NumeroControlePortador")
	private String NumeroControlePortador;

	@XmlAttribute(name="Endosso")
	private String Endosso;

	@XmlAttribute(name="Aceite")
	private String Aceite;

	@XmlAttribute(name="Especie")
	private String Especie;

	@XmlAttribute(name="Moeda")
	private String Moeda;

	@XmlAttribute(name="AgenciasCedenteDepositaria")
	private String AgenciasCedenteDepositaria; 

	@XmlAttribute(name="ValorTitulo")
	private String ValorTitulo;

	@XmlAttribute(name="ValorProtestar")
	private String ValorProtestar;

	@XmlAttribute(name="TipoProtesto")
	private String TipoProtesto;

	// ---
	
	public String getPraca() { return Praca; }
	public String getDataEmissao() { return DataEmissao; }
	public String getDataVencimento() { return DataVencimento; }
	public String getNumeroTitulo() { return NumeroTitulo; }
	public String getNumeroControlePortador() { return NumeroControlePortador; }
	public String getEndosso() { return Endosso; }
	public String getAceite() { return Aceite; }
	public String getEspecie() { return Especie; }
	public String getMoeda() { return Moeda; }
	public String getAgenciasCedenteDepositaria() { return AgenciasCedenteDepositaria; }
	public String getValorTitulo() { return ValorTitulo; }
	public String getValorProtestar() { return ValorProtestar; }
	public String getTipoProtesto() { return TipoProtesto; }
	
	// ---

	@Override
	public String toString() {
		return "Titulo[Praca=" + Praca + "|, DataEmissao=" + DataEmissao + "|, DataVencimento=" + DataVencimento
				+ "|, NumeroTitulo=" + NumeroTitulo + "|, NumeroControlePortador=" + NumeroControlePortador 
				+ "|, Endosso=" + Endosso + "|, Aceite=" + Aceite + "|, Especie=" + Especie + "|, Moeda=" + Moeda
				+ "|, AgenciasCedenteDepositaria=" + AgenciasCedenteDepositaria + "|, ValorTitulo=" + ValorTitulo
				+ "|, ValorProtestar=" + ValorProtestar + "|, TipoProtesto=" + TipoProtesto + "|]Titulo";
	}
	
}