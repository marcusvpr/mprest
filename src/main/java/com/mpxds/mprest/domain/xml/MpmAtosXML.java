package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmAtosXML {
	//
	private List<MpmAtoXML> mpmAtoXMLs; 

	//
	
	@XmlElement(name="Atos")
	public List<MpmAtoXML> getMpmAtoXMLs() {
		return this.mpmAtoXMLs;
	}
	public void setMpmAtoXMLs(List<MpmAtoXML> mpmAtoXMLs) {
		this.mpmAtoXMLs = mpmAtoXMLs;
	}

}
