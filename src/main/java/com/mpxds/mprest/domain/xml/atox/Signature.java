package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Signature")
public class Signature {
	//
	@XmlAttribute(name="xmlns")
	private String xmlns;
	
	@XmlElement(name="SignedInfo")
	private SignedInfo SignedInfo;
	
	@XmlElement(name="SignatureValue")
	private String SignatureValue;

	@XmlElement(name="KeyInfo")
	private KeyInfo KeyInfo;

	// --- 
	
	public String getXmlns() { return xmlns; }
	
	public SignedInfo getSignedInfo() { return SignedInfo; }
	
	public String getSignatureValue() { return SignatureValue; }
	
	public KeyInfo getKeyInfo() { return KeyInfo; }
 
	@Override
	public String toString() {
		//
		String SignedInfoX = "SignedInfo=null";
		if (null == SignedInfo)
			assert(true); // nop
		else
			SignedInfoX = SignedInfo.toString();
		String KeyInfoX = "KeyInfo=null";
		if (null == KeyInfo)
			assert(true); // nop
		else
			KeyInfoX = KeyInfo.toString();
		//
		return "Signature[xmlns=" + xmlns + "|, " + SignedInfoX 
			+ ", SignatureValue=" + SignatureValue	+ "|, " + KeyInfoX + "|]Signature";
  	}
}