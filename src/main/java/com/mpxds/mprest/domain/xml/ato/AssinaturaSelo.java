package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AssinaturaSelo {
	//
	private Signature Signature;

	// --- 
	
	public Signature getSignature() { return Signature; }
 
	@Override
	public String toString() {
		//
		return "AssinaturaSelo[" + Signature.toString() + "]AssinaturaSelo";
  	}
}