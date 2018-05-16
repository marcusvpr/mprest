package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KeyInfo {
	//
	private X509Data X509Data;

	// --- 
	
	public X509Data getX509Data() { return X509Data; }

	@Override
	public String toString() {
		//
		return "KeyInfo[" + X509Data.toString() + "]KeyInfo";
  	}
}