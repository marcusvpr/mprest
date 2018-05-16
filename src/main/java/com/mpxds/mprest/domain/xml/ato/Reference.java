package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reference {
	//
	private String URI;
    private Transforms Transforms;
    private DigestMethod DigestMethod;
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