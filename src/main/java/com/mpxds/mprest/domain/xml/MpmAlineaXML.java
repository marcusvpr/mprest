package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Alinea")
public class MpmAlineaXML {
	//
	private String codigoAlinea;
	private String descricaoAlinea;
	
	//
		
	@XmlElement(name="CodigoAlinea")
	public String getCodigoAlinea() { return codigoAlinea; }
	public void setCodigoAlinea(String codigoAlinea) { this.codigoAlinea = codigoAlinea; }
	
	@XmlElement(name="DescricaoAlinea")
	public String getDescricaoAlinea() { return descricaoAlinea; }
	public void setDescricaoAlinea(String descricaoAlinea) { this.descricaoAlinea = descricaoAlinea; }
	
	@Override
	public String toString() {
		return "MpmAlineaXML [codigoAlinea=" + codigoAlinea + ", descricaoAlinea=" + descricaoAlinea + "]";
	}
	
}
