package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmBancosXML {
	//
	private List<MpmBancoXML> mpmBancoXMLs; 

	//
	
	@XmlElement(name="Bancos")
	public List<MpmBancoXML> getMpmBancoXMLs() {
		return this.mpmBancoXMLs;
	}
	public void setMpmBancoXMLs(List<MpmBancoXML> mpmBancoXMLs) {
		this.mpmBancoXMLs = mpmBancoXMLs;
	}

}
