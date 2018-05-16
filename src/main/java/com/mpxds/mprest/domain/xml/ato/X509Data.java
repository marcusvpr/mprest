package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class X509Data {
	//
	private String X509Certificate;

	// --- 
	
	public String getX509Certificate() { return X509Certificate; }

	@Override
	public String toString() {
		//
		return "X509Data[X509Certificate=" + X509Certificate + "|]X509Data";
  	}
}