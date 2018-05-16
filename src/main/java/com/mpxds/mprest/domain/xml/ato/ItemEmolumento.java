package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemEmolumento {
	//
	private String Ordem;
	private String Tabela;
	private String Item;
	private String SubItem;
	private String Quantidade;
	private String Complemento;
	private String Excessao;
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