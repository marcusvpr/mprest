package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Reference")
public class Reference {
	//
	@XmlAttribute(name="URI")
	private String URI;

	@XmlElement(name="Transforms")
    private Transforms Transforms;

	@XmlElement(name="DigestMethod")
    private DigestMethod DigestMethod;

	@XmlElement(name="DigestValue")
	private String DigestValue;

	// --- 
	
	public String getURI() { return URI; }
	public Transforms getTransforms() { return Transforms; }		
	public DigestMethod getDigestMethod() { return DigestMethod; }		
	public String getDigestValue() { return DigestValue; }
    
    // ---
 
	@Override
	public String toString() {
		//
		return "Reference[URI=" + URI
			+ "|, " + Transforms.toString()
			+ ", " + DigestMethod.toString()
			+ ", DigestValue=" + DigestValue + "|]Reference";
  	}
}