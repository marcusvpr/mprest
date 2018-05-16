package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="KeyInfo")
public class KeyInfo {
	//
	@XmlElement(name="X509Data")
	private X509Data X509Data;

	// --- 
	
	public X509Data getX509Data() { return X509Data; }

	@Override
	public String toString() {
		//
		return "KeyInfo[" + X509Data.toString() + "]KeyInfo";
  	}
}