package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SignedInfo")
public class SignedInfo {
	//

	@XmlElement(name="CanonicalizationMethod")
	private CanonicalizationMethod CanonicalizationMethod;

	@XmlElement(name="SignatureMethod")
	private SignatureMethod SignatureMethod;

	@XmlElement(name="Reference")
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