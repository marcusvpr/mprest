package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mpadt_remessa") // ?? Verificar com Prisco PT05 ???
public class MpmRemessa extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="mpmImportarControle_id")
	private MpmImportarControle mpmImportarControle;

  	@Column(name = "nome_arquivo", nullable = false, length = 50) // Was=11???
	private String nomeArquivo;

  	@Column(name = "protocolo_inicial", nullable = false, length = 6)
  	private String protocoloInicial;  
	
	@Column(name = "protocolo_final", nullable = false, length = 6)
  	private String protocoloFinal; 

	@JsonIgnore
	@OneToMany(mappedBy="mpmRemessa")
	private List<MpmHeader> mpmHeaders = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy="mpmRemessa")
	private List<MpmTransacao> mpmTransacaos = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy="mpmRemessa")
	private List<MpmTrailler> mpmTraillers = new ArrayList<>();
		
	// ---
	
	public MpmRemessa() {
		//
	}

  	public MpmRemessa(Integer id, MpmImportarControle mpmImportarControle
             , String nomeArquivo
             , String protocoloInicial
             , String protocoloFinal
             ) {
  		//
		super();

		this.id = id;
  		this.mpmImportarControle = mpmImportarControle;
  		this.nomeArquivo = nomeArquivo;
  		this.protocoloInicial = protocoloInicial;
  		this.protocoloFinal = protocoloFinal;
  	}
  	
  	// ---

	public MpmImportarControle getMpmImportarControle() { return mpmImportarControle; }
	public void setMpmImportarControle(MpmImportarControle mpImportarControle) {
															this.mpmImportarControle = mpImportarControle; }

	public String getNomeArquivo() { return nomeArquivo; }
	public void setNomeArquivo(String nomeArquivo) { this.nomeArquivo = nomeArquivo; }

	public String getProtocoloInicial() { return protocoloInicial; }
	public void setProtocoloInicial(String protocoloInicial) { this.protocoloInicial = protocoloInicial; }

	public String getProtocoloFinal() { return protocoloFinal; }
	public void setProtocoloFinal(String protocoloFinal) { this.protocoloFinal = protocoloFinal; }

	public List<MpmHeader> getMpmHeaders() { return mpmHeaders; }
	public void setMpmHeaders(List<MpmHeader> mpmHeaders) { this.mpmHeaders = mpmHeaders; }

	public List<MpmTransacao> getMpmTransacaos() { return mpmTransacaos; }
	public void setMpmTransacaos(List<MpmTransacao> mpmTransacaos) { this.mpmTransacaos = mpmTransacaos; }

	public List<MpmTrailler> getMpmTraillers() { return mpmTraillers; }
	public void setMpmTraillers(List<MpmTrailler> mpmTraillers) { this.mpmTraillers = mpmTraillers; }
  	  
}