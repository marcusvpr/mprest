package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ProtocoloVerificacao")
public class ProtocoloVerificacao {
	//
	@XmlAttribute(name="Numero")
	private String Numero;

	@XmlAttribute(name="TipoVerificacao")
	private String TipoVerificacao;

	@XmlAttribute(name="PercentualXMLPDF")
	private String PercentualXMLPDF;

	@XmlAttribute(name="HashPDF")
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