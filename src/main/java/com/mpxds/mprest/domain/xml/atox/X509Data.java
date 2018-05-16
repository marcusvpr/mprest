package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="X509Data")
public class X509Data {
	//
	@XmlElement(name="X509Certificate")
	private String X509Certificate;

	// --- 
	
	public String getX509Certificate() { return X509Certificate; }

	@Override
	public String toString() {
		//
		return "X509Data[X509Certificate=" + X509Certificate + "|]X509Data";
  	}
}