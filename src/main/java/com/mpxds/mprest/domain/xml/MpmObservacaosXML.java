package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmObservacaosXML {
	//
	private List<MpmObservacaoXML> mpmObservacaoXMLs; 

	//
	
	@XmlElement(name="Observacoes")
	public List<MpmObservacaoXML> getMpmObservacaoXMLs() {
		return this.mpmObservacaoXMLs;
	}
	public void setMpmObservacaoXMLs(List<MpmObservacaoXML> mpmObservacaoXMLs) {
		this.mpmObservacaoXMLs = mpmObservacaoXMLs;
	}

}
