package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmRemessasXML {
	//
	private List<MpmRemessaXML> mpmRemessaXMLs; 

	//
	
	@XmlElement(name="Remessa")
	public List<MpmRemessaXML> getMpmRemessaXMLs() {
		return this.mpmRemessaXMLs;
	}
	public void setMpmRemessaXMLs(List<MpmRemessaXML> mpmRemessaXMLs) {
		this.mpmRemessaXMLs = mpmRemessaXMLs;
	}

}
