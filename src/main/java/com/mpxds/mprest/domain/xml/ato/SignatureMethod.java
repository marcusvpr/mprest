package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SignatureMethod {
	//
	private String Algorithm;

	// --- 
	
	public String getAlgorithm() { return Algorithm; }
	
	// ---
 
	@Override
	public String toString() {
		//
		return "SignatureMethod[Algorithm=" + Algorithm + "|]SignatureMethod";
  	}
}