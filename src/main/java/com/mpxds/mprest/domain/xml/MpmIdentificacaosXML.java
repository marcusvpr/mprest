package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmIdentificacaosXML {
	//
	private List<MpmIdentificacaoXML> mpmIdentificacaoXMLs; 

	//
	
	@XmlElement(name="Identificacao")
	public List<MpmIdentificacaoXML> getMpmIdentificacaoXMLs() {
		return this.mpmIdentificacaoXMLs;
	}
	public void setMpmIdentificacaoXMLs(List<MpmIdentificacaoXML> mpmIdentificacaoXMLs) {
		this.mpmIdentificacaoXMLs = mpmIdentificacaoXMLs;
	}

}
