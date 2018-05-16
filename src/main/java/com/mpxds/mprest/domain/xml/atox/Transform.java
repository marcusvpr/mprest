package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Transform")
public class Transform {
	//
	@XmlAttribute(name="Algorithm")
	private String Algorithm;

	// --- 
	
	public String getAlgorithm() { return Algorithm; }
	
	// ---
 
	@Override
	public String toString() {
		//
		return "Transform[Algorithm=" + Algorithm + "|]Transform";
  	}
}