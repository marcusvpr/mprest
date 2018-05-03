package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Edital")
public class MpmEditalXML {
	//
	private String dt_Baixa;
	private String dt_Protocolo;
	private String no_Protocolo;
	private String dt_NovoAte;
	private String dt_Ate;
	private String oco_Usr;
	private String dt_Sist_Oco;
	
	//
	
	@XmlElement(name="Dt_Baixa")	
	public String getDt_Baixa() {
		return dt_Baixa;
	}
	public void setDt_Baixa(String dt_Baixa) {
		this.dt_Baixa = dt_Baixa;
	}
	
	@XmlElement(name="Dt_Protocolo")	
	public String getDt_Protocolo() {
		return dt_Protocolo;
	}
	public void setDt_Protocolo(String dt_Protocolo) {
		this.dt_Protocolo = dt_Protocolo;
	}
	
	@XmlElement(name="No_Protocolo")	
	public String getNo_Protocolo() {
		return no_Protocolo;
	}
	public void setNo_Protocolo(String no_Protocolo) {
		this.no_Protocolo =no_Protocolo;
	}
	
	@XmlElement(name="Dt_NovoAte")	
	public String getDt_NovoAte() {
		return dt_NovoAte;
	}
	public void setDt_NovoAte(String dt_NovoAte) {
		this.dt_NovoAte = dt_NovoAte;
	}
	
	@XmlElement(name="Dt_Ate")	
	public String getDt_Ate() {
		return dt_Ate;
	}
	public void setDt_Ate(String dt_Ate) {
		this.dt_Ate = dt_Ate;
	}
	
	@XmlElement(name="Oco_Usr")	
	public String getOco_Usr() {
		return oco_Usr;
	}
	public void setOco_Usr(String oco_Usr) {
		this.oco_Usr = oco_Usr;
	}
	
	@XmlElement(name="Dt_Sist_Oco")	
	public String getDt_Sist_Oco() {
		return dt_Sist_Oco;
	}
	public void setDt_Sist_Oco(String dt_Sist_Oco) {
		this.dt_Sist_Oco = dt_Sist_Oco;
	}
	
	@Override
	public String toString() {
		return "MpmEditalXML [dt_Baixa=" + dt_Baixa + ", dt_Protocolo=" + dt_Protocolo + ", no_Protocolo="
				+ no_Protocolo + ", dt_NovoAte=" + dt_NovoAte + ", dt_Ate=" + dt_Ate + ", oco_Usr=" + oco_Usr
				+ ", dt_Sist_Oco=" + dt_Sist_Oco + "]";
	}
			
}
