package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AtosComposicao")
public class MpmAtoComposicaoXML {
	//
//	private MpmAto mpmAto;
	private String codigoAto;

//	private MpmCustasComposicao mpmCustasComposicao;
	private String atoSequencia;
	private String tabela;
	private String item;
	private String subItem;
	private String descricaoTab;
	private String quantidade;
	private String complemento;
	private String excessao;
	private String valorCusta;
	
	@XmlElement(name="CodigoAto")
	public String getCodigoAto() {
		return codigoAto;
	}
	public void setCodigoAto(String codigoAto) {
		this.codigoAto = codigoAto;
	}
	
	@XmlElement(name="AtoSequencia")
	public String getAtoSequencia() {
		return atoSequencia;
	}
	public void setAtoSequencia(String atoSequencia) {
		this.atoSequencia = atoSequencia;
	}
	
	@XmlElement(name="Tabela")
	public String getTabela() {
		return tabela;
	}
	public void setTabela(String tabela) {
		this.tabela = tabela;
	}
	
	@XmlElement(name="Item")
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	@XmlElement(name="SubItem")
	public String getSubItem() {
		return subItem;
	}
	public void setSubItem(String subItem) {
		this.subItem = subItem;
	}
	
	@XmlElement(name="DescricaoTab")
	public String getDescricaoTab() {
		return descricaoTab;
	}
	public void setDescricaoTab(String descricaoTab) {
		this.descricaoTab = descricaoTab;
	}
	
	@XmlElement(name="Quantidade")
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	@XmlElement(name="Complemento")
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@XmlElement(name="Excessao")
	public String getExcessao() {
		return excessao;
	}
	public void setExcessao(String excessao) {
		this.excessao = excessao;
	}
	
	@XmlElement(name="ValorCusta")
	public String getValorCusta() {
		return valorCusta;
	}
	public void setValorCusta(String valorCusta) {
		this.valorCusta = valorCusta;
	}

	@Override
	public String toString() {
		return "MpmAtoComposicaoXML [codigoAto=" + codigoAto + ", atoSequencia=" + atoSequencia + ", tabela=" + tabela
				+ ", item=" + item + ", subItem=" + subItem + ", descricaoTab=" + descricaoTab + ", quantidade="
				+ quantidade + ", complemento=" + complemento + ", excessao=" + excessao + ", valorCusta=" + valorCusta
				+ "]";
	}
	
}
