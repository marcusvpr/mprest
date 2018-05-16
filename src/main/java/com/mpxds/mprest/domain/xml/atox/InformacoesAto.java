package com.mpxds.mprest.domain.xml.atox;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InformacoesAto")
public class InformacoesAto {
	//
	@XmlAttribute(name="Id")
	private String Id;

	@XmlAttribute(name="TipoAto")
	private String TipoAto;

	@XmlAttribute(name="DataAto")
	private String DataAto;

	@XmlAttribute(name="NumeroProtocolo")
	private String NumeroProtocolo;

	@XmlAttribute(name="NumeroRegistro")
	private String NumeroRegistro;

	@XmlAttribute(name="Convenio")
	private String Convenio;

	@XmlElement(name="ServicoDestino")
	private ServicoDestino ServicoDestino;

	@XmlElement(name="Titulo")
	private Titulo Titulo;

	@XmlElement(name="Participante")
    private List<Participante> Participantes = new ArrayList<Participante>();

	@XmlElement(name="Emolumentos")
	private Emolumentos Emolumentos;

	@XmlElement(name="Selo")
	private Selo Selo;

	@XmlElement(name="ProtocoloVerificacao")
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