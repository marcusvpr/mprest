package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Signature {
	//
	private String xmlns;
	private SignedInfo SignedInfo;
	private String SignatureValue;
	private KeyInfo KeyInfo;

	// --- 
	
	public String getXmlns() { return xmlns; }
	public SignedInfo getSignedInfo() { return SignedInfo; }
	public String getSignatureValue() { return SignatureValue; }
	public KeyInfo getKeyInfo() { return KeyInfo; }
 
	@Override
	public String toString() {
		//
		return "Signature[xmlns=" + xmlns + "|, " + SignedInfo.toString() 
			+ ", SignatureValue=" + SignatureValue	+ "|, " + KeyInfo + "|]Signature";
  	}
}