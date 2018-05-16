package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Documento")
public class Documento {
	//
	@XmlAttribute(name="Ordem")
	private String Ordem;

	@XmlAttribute(name="TipoDocumento")
	private String TipoDocumento;

	@XmlAttribute(name="Numero")
	private String Numero;
	
	@XmlAttribute(name="OrgaoEmissor")
	private String OrgaoEmissor;

	// ---
	
	public String getOrdem() { return Ordem; }
	public String getTipoDocumento() { return TipoDocumento; }
	public String getNumero() { return Numero; }
	public String getOrgaoEmissor() { return OrgaoEmissor; }
	
	// ---

	@Override
	public String toString() {
		return "Documento[Ordem=" + Ordem + "|, TipoDocumento=" + TipoDocumento + "|, Numero=" + Numero
				+ "|, OrgaoEmissor=" + OrgaoEmissor + "|]Documento";
	}
	 
}