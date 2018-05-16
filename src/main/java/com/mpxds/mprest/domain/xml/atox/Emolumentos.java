package com.mpxds.mprest.domain.xml.atox;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Emolumentos")
public class Emolumentos {
	//
	@XmlAttribute(name="ValorMutua")
	private String ValorMutua;

	@XmlAttribute(name="FETJ")
	private String FETJ;

	@XmlAttribute(name="FUNDPERJ")
	private String FUNDPERJ;

	@XmlAttribute(name="FUNPERJ")
	private String FUNPERJ;

	@XmlAttribute(name="FUNARPEN")
	private String FUNARPEN;

	@XmlAttribute(name="ACOTERJ")
	private String ACOTERJ;

	@XmlAttribute(name="AtoGratuitoo")
	private String AtoGratuito;

	@XmlAttribute(name="ValorTotal")
	private String ValorTotal;

	@XmlAttribute(name="TipoCobranca")
	private String TipoCobranca;

	@XmlAttribute(name="CodigoLivroAdicional")
	private String CodigoLivroAdicional;

	@XmlElement(name="ItemEmolumento")
    private List<ItemEmolumento> ItemEmolumentos = new ArrayList<ItemEmolumento>();

	// ---
	
	public String getValorMutua() { return ValorMutua; }
	public String getFETJ() { return FETJ; }
	public String getFUNDPERJ() { return FUNDPERJ; }
	public String getFUNPERJ() { return FUNPERJ; }
	public String getFUNARPEN() { return FUNARPEN; }
	public String getACOTERJ() { return ACOTERJ; }
	public String getAtoGratuito() { return AtoGratuito; }
	public String getValorTotal() { return ValorTotal; }
	public String getTipoCobranca() { return TipoCobranca; }
	public String getCodigoLivroAdicional() { return CodigoLivroAdicional; }
	//
	public List<ItemEmolumento> getItemEmolumentos() { return ItemEmolumentos; }		
    public void add(ItemEmolumento ItemEmolumento) {
    	ItemEmolumentos.add(ItemEmolumento);
    }

	// ---
    
	@Override

	public String toString() {
		return "Emolumentos[ValorMutua=" + ValorMutua + "|, FETJ=" + FETJ + "|, FUNDPERJ="
				+ FUNDPERJ + "|, FUNPERJ=" + FUNPERJ + "|, FUNARPEN=" + FUNARPEN + "|, ACOTERJ=" + ACOTERJ
				+ "|, AtoGratuito=" + AtoGratuito + "|, ValorTotal=" + ValorTotal + "|, TipoCobranca=" + TipoCobranca
				+ "|, CodigoLivroAdicional=" + CodigoLivroAdicional
				+ "|, ItemEmolumentos=" + ItemEmolumentos.toString()
				+ "]Emolumentos";
	}

}