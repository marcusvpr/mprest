package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmMotivoEditalsXML {
	//
	private List<MpmMotivoEditalXML> mpmMotivoEditalXMLs; 

	//
	
	@XmlElement(name="MotivoEdital")
	public List<MpmMotivoEditalXML> getMpmMotivoEditalXMLs() {
		return this.mpmMotivoEditalXMLs;
	}
	public void setMpmMotivoEditalXMLs(List<MpmMotivoEditalXML> mpmMotivoEditalXMLs) {
		this.mpmMotivoEditalXMLs = mpmMotivoEditalXMLs;
	}

}
