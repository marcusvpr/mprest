package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MotivoEdital")
public class MpmMotivoEditalXML {
	//
	private String codMotivoEdital;
	private String descMotivoEdital;
	
	//
		
	@XmlElement(name="CodMotivoEdital")
	public String getCodMotivoEdital() { return codMotivoEdital; }
	public void setCodMotivoEdital(String codMotivoEdital) { this.codMotivoEdital = codMotivoEdital; }
	
	@XmlElement(name="DescMotivoEdital")
	public String getDescMotivoEdital() { return descMotivoEdital; }
	public void setDescMotivoEdital(String descMotivoEdital) { this.descMotivoEdital = descMotivoEdital; }
	
	@Override
	public String toString() {
		return "MpmMotivoEditalXML [codMotivoEdital;=" + codMotivoEdital + ", descMotivoEdital;=" +
																					descMotivoEdital + "]";
	}
	
}
