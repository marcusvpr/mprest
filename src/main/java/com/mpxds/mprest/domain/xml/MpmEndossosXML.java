package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmEndossosXML {
	//
	private List<MpmEndossoXML> mpmEndossoXMLs; 

	//
	
	@XmlElement(name="Endosso")
	public List<MpmEndossoXML> getMpmEndossoXMLs() {
		return this.mpmEndossoXMLs;
	}
	public void setMpmEndossoXMLs(List<MpmEndossoXML> mpmEndossoXMLs) {
		this.mpmEndossoXMLs = mpmEndossoXMLs;
	}

}
