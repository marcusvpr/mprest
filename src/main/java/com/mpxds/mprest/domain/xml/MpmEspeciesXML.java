package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmEspeciesXML {
	//
	private List<MpmEspecieXML> mpmEspecieXMLs; 

	//
	
	@XmlElement(name="Especies")
	public List<MpmEspecieXML> getMpmEspecieXMLs() {
		return this.mpmEspecieXMLs;
	}
	public void setMpmEspecieXMLs(List<MpmEspecieXML> mpmEspecieXMLs) {
		this.mpmEspecieXMLs = mpmEspecieXMLs;
	}

}
