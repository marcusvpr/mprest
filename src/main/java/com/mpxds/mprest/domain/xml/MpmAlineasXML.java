package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmAlineasXML {
	//
	private List<MpmAlineaXML> mpmAlineaXMLs; 

	//
	
	@XmlElement(name="Alinea")
	public List<MpmAlineaXML> getMpmAlineaXMLs() {
		return this.mpmAlineaXMLs;
	}
	public void setMpmAlineaXMLs(List<MpmAlineaXML> mpmAlineaXMLs) {
		this.mpmAlineaXMLs = mpmAlineaXMLs;
	}

}
