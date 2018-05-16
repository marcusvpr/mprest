package com.mpxds.mprest.domain.xml.ato;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ato {
	//
	private InformacoesAto InformacoesAto;
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