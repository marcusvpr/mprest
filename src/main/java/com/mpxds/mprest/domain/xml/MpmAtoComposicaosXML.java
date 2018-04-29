package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmAtoComposicaosXML {
	//
	private List<MpmAtoComposicaoXML> mpmAtoComposicaoXMLs; 

	//
	
	@XmlElement(name="AtosComposicao")
	public List<MpmAtoComposicaoXML> getMpmAtoComposicaoXMLs() {
		return this.mpmAtoComposicaoXMLs;
	}
	public void setMpmAtoComposicaoXMLs(List<MpmAtoComposicaoXML> mpmAtoComposicaoXMLs) {
		this.mpmAtoComposicaoXMLs = mpmAtoComposicaoXMLs;
	}

}
