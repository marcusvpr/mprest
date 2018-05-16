package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmImportarControlesXML {
	//
	private List<MpmImportarControleXML> mpmImportarControleXMLs; 

	//
	
	@XmlElement(name="ImportarControle")
	public List<MpmImportarControleXML> getMpmImportarControleXMLs() {
		return this.mpmImportarControleXMLs;
	}
	public void setMpmImportarControleXMLs(List<MpmImportarControleXML> mpmImportarControleXMLs) {
		this.mpmImportarControleXMLs = mpmImportarControleXMLs;
	}

}
