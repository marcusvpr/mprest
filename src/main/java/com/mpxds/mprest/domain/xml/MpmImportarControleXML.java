package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ImportarControle")
public class MpmImportarControleXML {
	//
	private String dataImportar;
	private String dataProtocolo;
	private String dataAte;
	
	//
		
	@XmlElement(name="DataImportar")
	public String getDataImportar() { return dataImportar; }
	public void setDataImportar(String dataImportar) { this.dataImportar = dataImportar; }
	
	@XmlElement(name="DataProtocolo")
	public String getDataProtocolo() { return dataProtocolo; }
	public void setDataProtocolo(String dataProtocolo) { this.dataProtocolo = dataProtocolo; }
	
	@XmlElement(name="DataAte")
	public String getDataAte() { return dataAte; }
	public void setDataAte(String dataAte) { this.dataAte = dataAte; }
	
	@Override
	public String toString() {
		return "MpmImportarControleXML [dataImportar=" + dataImportar + ", DataProtocolo=" + dataProtocolo +
				 																", DataAte=" + dataAte + "]";
	}
	
}
