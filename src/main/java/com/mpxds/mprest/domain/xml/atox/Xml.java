package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="xml")
public class Xml {
	//
	@XmlElement(name="Ato")
    private Ato Ato;

	// ---
	
    public Ato getAto() { return Ato; }
        
   	@Override
   	public String toString() {
		//
		return "xml[" + Ato.toString() + "]xml";
   	}

}
