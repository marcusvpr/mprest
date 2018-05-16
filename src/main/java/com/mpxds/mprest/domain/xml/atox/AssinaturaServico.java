package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AssinaturaServico")
public class AssinaturaServico {
	//
	@XmlElement(name="Signature")
	private Signature Signature;

	// --- 
	
	public Signature getSignature() { return Signature; }
 
	@Override
	public String toString() {
		//
		String SignatureX = "Signature=null";
		if (null == Signature)
			assert(true); // nop
		else
			SignatureX = Signature.toString();

		return "AssinaturaServico[" + SignatureX + "]AssinaturaServico";
  	}
}