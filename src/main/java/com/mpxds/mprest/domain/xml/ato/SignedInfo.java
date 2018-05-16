package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SignedInfo {
	//
	private CanonicalizationMethod CanonicalizationMethod;
	private SignatureMethod SignatureMethod;
	private Reference Reference;

	// --- 
	
	public CanonicalizationMethod getCanonicalizationMethod() { return CanonicalizationMethod; }
	public SignatureMethod getSignatureMethod() { return SignatureMethod; }
	public Reference getReference() { return Reference; }
 
	@Override
	public String toString() {
		//
		return "SignedInfo[" + CanonicalizationMethod.toString() 
			+ ", " + SignatureMethod.toString() 
			+ ", " + Reference.toString() 
			+ "]SignedInfo";
  	}
}