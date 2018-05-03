package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmTitulosXML {
	//
	private List<MpmTituloXML> mpmTituloXMLs; 

	//
	
	@XmlElement(name="Titulos")
	public List<MpmTituloXML> getMpmTituloXMLs() {
		return this.mpmTituloXMLs;
	}
	public void setMpmTituloXMLs(List<MpmTituloXML> mpmTituloXMLs) {
		this.mpmTituloXMLs = mpmTituloXMLs;
	}

}
