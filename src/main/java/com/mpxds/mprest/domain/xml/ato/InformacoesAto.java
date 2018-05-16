package com.mpxds.mprest.domain.xml.ato;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InformacoesAto {
	//
	private String Id;
	private String TipoAto;
	private String DataAto;
	private String NumeroProtocolo;
	private String NumeroRegistro;
	private String Convenio;

	private ServicoDestino ServicoDestino;
	private Titulo Titulo;
    private List<Participante> Participantes = new ArrayList<Participante>();
	private Emolumentos Emolumentos;
	private Selo Selo;
	private ProtocoloVerificacao ProtocoloVerificacao;
		
	// ---
	
	public String getId() { return Id; }
	public String getTipoAto() { return TipoAto; }
	public String getDataAto() { return DataAto; }
	public String getNumeroProtocolo() { return NumeroProtocolo; }
	public String getNumeroRegistro() { return NumeroRegistro; }
	public String getConvenio() { return Convenio; }
	//
	public ServicoDestino getServicoDestino() { return ServicoDestino; }
	public Titulo getTitulo() { return Titulo; }
	//
	public List<Participante> getParticipantes() { return Participantes; }		
    public void add(Participante Participante) {
    	Participantes.add(Participante);
    }
    //
    public Emolumentos getEmolumentos() { return Emolumentos; }
	public Selo getSelo() { return Selo; }
    public ProtocoloVerificacao getProtocoloVerificacao() { return ProtocoloVerificacao; }
	
	// ---
    
	@Override
	public String toString() {
		//
		return "InformacoesAto[Id=" + Id + "|, TipoAto=" + TipoAto + "|, DataAto=" + DataAto + "|, NumeroProtocolo="
				+ NumeroProtocolo + "|, NumeroRegistro=" + NumeroRegistro + "|, Convenio=" + Convenio
				+ "|, " + ServicoDestino.toString()
				+ ", " + Titulo.toString()
				+ ", " + Participantes.toString()
				+ ", " + Emolumentos.toString()
				+ ", " + Selo.toString()
				+ ", " + ProtocoloVerificacao.toString()
				+ "]InformacoesAto";
	}
	 
}