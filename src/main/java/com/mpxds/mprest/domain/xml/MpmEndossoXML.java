package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Endosso")
public class MpmEndossoXML {
	//
	private String cod_Endosso;
	private String dsc_Endosso;
	
	//
		
	@XmlElement(name="Cod_Endosso")
	public String getCod_Endosso() { return cod_Endosso; }
	public void setCod_Endosso(String cod_Endosso) { this.cod_Endosso = cod_Endosso; }
	
	@XmlElement(name="Dsc_Endosso")
	public String getDsc_Endosso() { return dsc_Endosso; }
	public void setDsc_Endosso(String dsc_Endosso) { this.dsc_Endosso = dsc_Endosso; }
	
	@Override
	public String toString() {
		return "MpmEndossoXML [cod_Endosso;=" + cod_Endosso + ", dsc_Endosso;=" + dsc_Endosso + "]";
	}
	
}
