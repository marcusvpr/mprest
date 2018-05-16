package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProtocoloVerificacao {
	//
	private String Numero;
	private String TipoVerificacao;
	private String PercentualXMLPDF;
	private String HashPDF;
		
	// ---
	
	public String getNumero() { return Numero; }
	public String getTipoVerificacao() { return TipoVerificacao; }
	public String getPercentualXMLPDF() { return PercentualXMLPDF; }
	public String getHashPDF() { return HashPDF; }

	// ---
	
	@Override
	public String toString() {
		//
		return "ProtocoloVerificacao[Numero=" + Numero + "|, TipoVerificacao=" + TipoVerificacao 
				+ "|, PercentualXMLPDF=" + PercentualXMLPDF + "|, HashPDF=" + HashPDF + "|]ProtocoloVerificacao";
	}
	 
}