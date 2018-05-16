package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Remessa")
public class MpmRemessaXML {
	//
	private String dataImportar;
	private String nomeArquivo;
	private String ProtocoloInicial;
	private String ProtocoloFinal;
	
	//
		
	@XmlElement(name="DataImportar")
	public String getDataImportar() {
		return dataImportar;
	}
	public void setDataImportar(String dataImportar) {
		this.dataImportar = dataImportar;
	}
	
	@XmlElement(name="NomeArquivo")
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@XmlElement(name="ProtocoloInicial")
	public String getProtocoloInicial() {
		return ProtocoloInicial;
	}
	public void setProtocoloInicial(String protocoloInicial) {
		ProtocoloInicial = protocoloInicial;
	}
	
	@XmlElement(name="ProtocoloFinal")
	public String getProtocoloFinal() {
		return ProtocoloFinal;
	}
	public void setProtocoloFinal(String protocoloFinal) {
		ProtocoloFinal = protocoloFinal;
	}
	
	@Override
	public String toString() {
		return "MpmRemessaXML [dataImportar=" + dataImportar + ", nomeArquivo=" + nomeArquivo + 
				", ProtocoloInicial=" + ProtocoloInicial + ", ProtocoloFinal=" + ProtocoloFinal + "]";
	}
	
}
