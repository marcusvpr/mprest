package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Xml {
	//
    private Ato Ato;

	// ---
	
    public Ato getAto() { return Ato; }
        
   	@Override
   	public String toString() {
		//
		return "xml[" + Ato.toString() + "]xml";
   	}

}
