package com.mpxds.mprest.domain.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dataroot")
public class MpmTransacaosXML {
	//
	private List<MpmTransacaoXML> mpmTransacaoXMLs; 

	//
	
	@XmlElement(name="Transacao")
	public List<MpmTransacaoXML> getMpmTransacaoXMLs() {
		return this.mpmTransacaoXMLs;
	}
	public void setMpmTransacaoXMLs(List<MpmTransacaoXML> mpmTransacaoXMLs) {
		this.mpmTransacaoXMLs = mpmTransacaoXMLs;
	}

}
