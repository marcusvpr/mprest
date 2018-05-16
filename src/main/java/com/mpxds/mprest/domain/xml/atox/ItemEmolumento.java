package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ItemEmolumento")
public class ItemEmolumento {
	//
	@XmlAttribute(name="Ordem")
	private String Ordem;

	@XmlAttribute(name="Tabela")
	private String Tabela;

	@XmlAttribute(name="Item")
	private String Item;

	@XmlAttribute(name="SubItem")
	private String SubItem;

	@XmlAttribute(name="Quantidade")
	private String Quantidade;

	@XmlAttribute(name="Complemento")
	private String Complemento;

	@XmlAttribute(name="Excessao")
	private String Excessao;

	@XmlAttribute(name="ValorCusta")
	private String ValorCusta;

	// ---

	public String getOrdem() { return Ordem; }
	public String getTabela() { return Tabela; }
	public String getItem() { return Item; }
	public String getSubItem() { return SubItem; }
	public String getQuantidade() { return Quantidade; }
	public String getComplemento() { return Complemento; }
	public String getExcessao() { return Excessao; }
	public String getValorCusta() { return ValorCusta; }

	// ---

	@Override
	public String toString() {
		return "ItemEmolumento[Ordem=" + Ordem + "|, Tabela=" + Tabela + "|, Item=" + Item + "|, SubItem=" + SubItem
				+ "|, Quantidade=" + Quantidade + "|, Complemento=" + Complemento + "|, Excessao=" + Excessao
				+ "|, ValorCusta=" + ValorCusta + "|]ItemEmolumento";
	}
		 
}