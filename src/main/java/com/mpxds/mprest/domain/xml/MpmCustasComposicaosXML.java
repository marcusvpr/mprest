package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmCustasComposicaosXML {
	//
	private List<MpmCustasComposicaoXML> mpmCustasComposicaoXMLs; 

	//
	
	@XmlElement(name="CustasComposicao")
	public List<MpmCustasComposicaoXML> getMpmCustasComposicaoXMLs() {
		return this.mpmCustasComposicaoXMLs;
	}
	public void setMpmCustasComposicaoXMLs(List<MpmCustasComposicaoXML> mpmCustasComposicaoXMLs) {
		this.mpmCustasComposicaoXMLs = mpmCustasComposicaoXMLs;
	}

}
