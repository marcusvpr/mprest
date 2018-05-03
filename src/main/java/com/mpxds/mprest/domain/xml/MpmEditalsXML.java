package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmEditalsXML {
	//
	private List<MpmEditalXML> mpmEditalXMLs; 

	//
	
	@XmlElement(name="Edital")
	public List<MpmEditalXML> getMpmEditalXMLs() {
		return this.mpmEditalXMLs;
	}
	public void setMpmEditalXMLs(List<MpmEditalXML> mpmEditalXMLs) {
		this.mpmEditalXMLs = mpmEditalXMLs;
	}

}
