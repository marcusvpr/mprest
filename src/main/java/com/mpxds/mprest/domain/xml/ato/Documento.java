package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Documento {
	//
	private String Ordem;
	private String TipoDocumento;
	private String Numero;
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