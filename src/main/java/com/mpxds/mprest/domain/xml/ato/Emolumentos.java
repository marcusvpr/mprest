package com.mpxds.mprest.domain.xml.ato;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Emolumentos {
	//
	private String ValorMutua;
	private String FETJ;
	private String FUNDPERJ;
	private String FUNPERJ;
	private String FUNARPEN;
	private String ACOTERJ;
	private String AtoGratuito;
	private String ValorTotal;
	private String TipoCobranca;
	private String CodigoLivroAdicional;
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