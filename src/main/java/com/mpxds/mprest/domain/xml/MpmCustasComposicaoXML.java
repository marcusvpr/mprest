package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CustasComposicao")
public class MpmCustasComposicaoXML {
	//
	private String xTabela;
	private String xItem;
	private String xSubItem;
	private String xDescricaoTab;
	private String xQuantidade;
	private String xQtdeBalcao;
	private String xComplemento;
	private String xExcessao;
	private String xValorCusta;
	private String xCodigoAto;
	private String xCodigoAtoC;
	private String xDe;
	private String xAte;
	
	//
		
	@XmlElement(name="Tabela")
	public String getxTabela() {
		return xTabela;
	}
	public void setxTabela(String xTabela) {
		this.xTabela = xTabela;
	}
	
	@XmlElement(name="Item")
	public String getxItem() {
		return xItem;
	}
	public void setxItem(String xItem) {
		this.xItem = xItem;
	}
	
	@XmlElement(name="SubItem")
	public String getxSubItem() {
		return xSubItem;
	}
	public void setxSubItem(String xSubItem) {
		this.xSubItem = xSubItem;
	}
	
	@XmlElement(name="DescricaoTab")
	public String getxDescricaoTab() {
		return xDescricaoTab;
	}
	public void setxDescricaoTab(String xDescricaoTab) {
		this.xDescricaoTab = xDescricaoTab;
	}
	
	@XmlElement(name="Quantidade")
	public String getxQuantidade() {
		return xQuantidade;
	}
	public void setxQuantidade(String xQuantidade) {
		this.xQuantidade = xQuantidade;
	}
	
	@XmlElement(name="QtdeBalcao")
	public String getxQtdeBalcao() {
		return xQtdeBalcao;
	}
	public void setxQtdeBalcao(String xQtdeBalcao) {
		this.xQtdeBalcao = xQtdeBalcao;
	}
	
	@XmlElement(name="Complemento")
	public String getxComplemento() {
		return xComplemento;
	}
	public void setxComplemento(String xComplemento) {
		this.xComplemento = xComplemento;
	}
	
	@XmlElement(name="Excessao")
	public String getxExcessao() {
		return xExcessao;
	}
	public void setxExcessao(String xExcessao) {
		this.xExcessao = xExcessao;
	}
	
	@XmlElement(name="ValorCusta")
	public String getxValorCusta() {
		return xValorCusta;
	}
	public void setxValorCusta(String xValorCusta) {
		this.xValorCusta = xValorCusta;
	}
	
	@XmlElement(name="CodigoAto")
	public String getxCodigoAto() {
		return xCodigoAto;
	}
	public void setxCodigoAto(String xCodigoAto) {
		this.xCodigoAto = xCodigoAto;
	}
	
	@XmlElement(name="CodigoAtoC")
	public String getxCodigoAtoC() {
		return xCodigoAtoC;
	}
	public void setxCodigoAtoC(String xCodigoAtoC) {
		this.xCodigoAtoC = xCodigoAtoC;
	}
	
	@XmlElement(name="De")
	public String getxDe() {
		return xDe;
	}
	public void setxDe(String xDe) {
		this.xDe = xDe;
	}
	
	@XmlElement(name="Ate")
	public String getxAte() {
		return xAte;
	}
	public void setxAte(String xAte) {
		this.xAte = xAte;
	}
	
	@Override
	public String toString() {
		return "MpmCustasComposicaoXML [xTabela=" + xTabela + ", xItem=" + xItem + ", xSubItem=" + xSubItem
		+ ", xDescricaoTab=" + xDescricaoTab + ", xQuantidade=" + xQuantidade + ", xQtdeBalcao=" + xQtdeBalcao
		+ ", xComplemento=" + xComplemento + ", xExcessao=" + xExcessao + ", xValorCusta=" + xValorCusta
		+ ", xCodigoAto=" + xCodigoAto + ", xCodigoAtoC=" + xCodigoAtoC + ", xDe=" + xDe + ", xAte=" + xAte
		+ "]";
	}

		
}
