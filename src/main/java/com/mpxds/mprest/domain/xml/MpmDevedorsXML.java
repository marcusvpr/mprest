package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmDevedorsXML {
	//
	private List<MpmDevedorXML> mpmDevedorXMLs; 

	//
	
	@XmlElement(name="Devedores")
	public List<MpmDevedorXML> getMpmDevedorXMLs() {
		return this.mpmDevedorXMLs;
	}
	public void setMpmDevedorXMLs(List<MpmDevedorXML> mpmDevedorXMLs) {
		this.mpmDevedorXMLs = mpmDevedorXMLs;
	}

}
