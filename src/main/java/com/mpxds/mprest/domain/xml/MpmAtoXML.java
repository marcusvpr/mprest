package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Atos")
public class MpmAtoXML {
	//
	private String codigoAto;
	private String atoSequencia;
	private String descricaoAto;
	private String tipoSelo;
	private String emolumento;
	private String vl_Variavel;
	private String lei3217;
	private String lei4664;
	private String lei111;
	private String lei3761;
	private String lei590;
	private String lei6281;
	private String iss;
	private String distribuicao;
	private String valorAto;
	private String gratuidade;

	//
	
	@XmlElement(name="CodigoAto")
	public String getCodigoAto() {
		return this.codigoAto;
	}
	public void setCodigoAto(String codigoAto) {
		this.codigoAto = codigoAto;
	}

	@XmlElement(name="AtoSequencia")
	public String getAtoSequencia() {
		return this.atoSequencia;
	}
	public void setAtoSequencia(String atoSequencia) {
		this.atoSequencia = atoSequencia;
	}

	@XmlElement(name="DescricaoAto")
	public String getDescricaoAto() {
		return this.descricaoAto;
	}
	public void setDescricaoAto(String descricaoAto) {
		this.descricaoAto = descricaoAto;
	}

	@XmlElement(name="TipoSelo")
	public String getTipoSelo() {
		return this.tipoSelo;
	}
	public void setTipoSelo(String tipoSelo) {
		this.tipoSelo = tipoSelo;
	}

	@XmlElement(name="Emolumento")
	public String getEmolumento() {
		return this.emolumento;
	}
	public void setEmolumento(String emolumento) {
		this.emolumento = emolumento;
	}

	@XmlElement(name="Vl_Variavel")
	public String getVl_Variavel() { return this.vl_Variavel; 	}
	public void setVl_Variavel(String vl_Variavel) { this.vl_Variavel = vl_Variavel; }

	@XmlElement(name="Lei3217")
	public String getLei3217() {
		return this.lei3217;
	}
	public void setLei3217(String lei3217) {
		this.lei3217 = lei3217;
	}

	@XmlElement(name="Lei4664")
	public String getLei4664() {
		return this.lei4664;
	}
	public void setLei4664(String lei4664) {
		this.lei4664 = lei4664;
	}

	@XmlElement(name="Lei111")
	public String getLei111() {
		return this.lei111;
	}
	public void setLei111(String lei111) {
		this.lei111 = lei111;
	}

	@XmlElement(name="Lei3761")
	public String getLei3761() {
		return this.lei3761;
	}
	public void setLei3761(String lei3761) {
		this.lei3761 = lei3761;
	}

	@XmlElement(name="Lei590")
	public String getLei590() {
		return this.lei590;
	}
	public void setLei590(String lei590) {
		this.lei590 = lei590;
	}

	@XmlElement(name="Lei6281")
	public String getLei6281() {
		return this.lei6281;
	}
	public void setLei6281(String lei6281) {
		this.lei6281 = lei6281;
	}

	@XmlElement(name="Iss")
	public String getIss() {
		if (null == this.iss)
			return "0";
		else
			return this.iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}

	@XmlElement(name="Distribuicao")
	public String getDistribuicao() {
		return this.distribuicao;
	}
	public void setDistribuicao(String distribuicao) {
		this.distribuicao = distribuicao;
	}

	@XmlElement(name="ValorAto")
	public String getValorAto() {
		return this.valorAto;
	}
	public void setValorAto(String valorAto) {
		this.valorAto = valorAto;
	}

	@XmlElement(name="Gratuidade")
	public String getGratuidade() {
		if (null == this.gratuidade)
			return "0";
		else
		return this.gratuidade;
	}
	public void setGratuidade(String gratuidade) {
		this.gratuidade = gratuidade;
	}
	
	@Override
	public String toString() {
		return "MpmAtoXML [codigoAto=" + codigoAto + ", atoSequencia="
				+ atoSequencia + ", descricaoAto=" + descricaoAto + ", tipoSelo=" + tipoSelo + ", emolumento="
				+ emolumento + ", lei3217=" + lei3217 + ", lei4664=" + lei4664 + ", lei111=" + lei111 + ", lei3761="
				+ lei3761 + ", lei590=" + lei590 + ", lei6281=" + lei6281 + ", iss=" + iss + ", distribuicao="
				+ distribuicao + ", valorAto=" + valorAto + ", gratuidade=" + gratuidade + "]";
	}

}
