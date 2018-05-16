package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Titulo {
	//
	private String Praca; 
	private String DataEmissao;
	private String DataVencimento;
	private String NumeroTitulo;
	private String NumeroControlePortador;
	private String Endosso;
	private String Aceite;
	private String Especie;
	private String Moeda;
	private String AgenciasCedenteDepositaria; 
	private String ValorTitulo;
	private String ValorProtestar;
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