package com.mpxds.mprest.domain.xml.atox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Ato")
public class Ato {
	//
	@XmlElement(name="InformacoesAto")
	private InformacoesAto InformacoesAto;

	@XmlElement(name="AssinaturaServico")
	private AssinaturaServico AssinaturaServico;

	// --- 
	
	public InformacoesAto getInformacoesAto() { return InformacoesAto; }
    public AssinaturaServico getAssinaturaServico() { return AssinaturaServico; }
 
	@Override
	public String toString() {
		//
		return "Ato[" + InformacoesAto.toString() 
			+ ", " + AssinaturaServico.toString()
			+ "]Ato";
  	}
}