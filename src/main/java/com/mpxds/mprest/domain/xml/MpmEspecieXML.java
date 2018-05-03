package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Especies")
public class MpmEspecieXML {
	//
	private String xEsp_Codigo;
	private String xDescricao;
	private String xNo_Codigo;
	
	//
		
	@XmlElement(name="Esp_Codigo")
	public String getxEsp_Codigo() {
		return xEsp_Codigo;
	}
	public void setxEsp_Codigo(String xEsp_Codigo) {
		this.xEsp_Codigo = xEsp_Codigo;
	}
	
	@XmlElement(name="Descricao")
	public String getxDescricao() {
		return xDescricao;
	}
	public void setxDescricao(String xDescricao) {
		this.xDescricao = xDescricao;
	}
	
	@XmlElement(name="No_Codigo")
	public String getxNo_Codigo() {
		return xNo_Codigo;
	}
	public void setxNo_Codigo(String xNo_Codigo) {
		this.xNo_Codigo = xNo_Codigo;
	}
	
	@Override
	public String toString() {
		return "MpmEspecieXML [xEsp_Codigo=" + xEsp_Codigo + ", xDescricao=" + xDescricao + ", xNo_Codigo=" + xNo_Codigo
				+ "]";
	}
	
}
