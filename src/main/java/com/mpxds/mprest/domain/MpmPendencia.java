package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_pendencia")
public class MpmPendencia extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_ocorrencia", nullable = true)
	private Date dataOcorrencia;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_protocolo", nullable = true)
	private Date dataProtocolo;
	
  	@Column(name = "numero_protocolo", nullable = true, length = 20)
	private String numeroProtocolo;
	
  	@Column(name = "usuario_ocorrencia", nullable = true, length = 50)
	private String usuarioOcorrencia;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_sistema_ocorrencia", nullable = true)
	private Date dataSistemaOcorrencia;
	
  	@Column(nullable = true, length = 100)
	private String observacao;
	
  	@Column(nullable = true, length = 100)
	private String observacao1;

	// 
	
	public MpmPendencia() {
		//
	}

	public MpmPendencia(Integer id, Date dataOcorrencia, Date dataProtocolo, 
			String numeroProtocolo, String usuarioOcorrencia,
			Date dataSistemaOcorrencia, String observacao, String observacao1) {
		//
		super();
		
		this.id = id;
		this.dataOcorrencia = dataOcorrencia;
		this.dataProtocolo = dataProtocolo;
		this.numeroProtocolo = numeroProtocolo;
		this.usuarioOcorrencia = usuarioOcorrencia;
		this.dataSistemaOcorrencia = dataSistemaOcorrencia;
		this.observacao = observacao;
		this.observacao1 = observacao1;
	}

	public Date getDataOcorrencia() { return this.dataOcorrencia; }
	public void setDataOcorrencia(Date dataOcorrencia) { this.dataOcorrencia = dataOcorrencia; }

	public Date getDataProtocolo() { return this.dataProtocolo; }
	public void setDataProtocolo(Date dataProtocolo) { this.dataProtocolo = dataProtocolo; }

	public String getNumeroProtocolo() { return this.numeroProtocolo; }
	public void setNumeroProtocolo(String numeroProtocolo) { this.numeroProtocolo = numeroProtocolo; }

	public String getUsuarioOcorrencia() { return this.usuarioOcorrencia; }
	public void setUsuarioOcorrencia(String usuarioOcorrencia) { this.usuarioOcorrencia = usuarioOcorrencia; }

	public Date getDataSistemaOcorrencia() { return this.dataSistemaOcorrencia; }
	public void setDataSistemaOcorrencia(Date dataSistemaOcorrencia) {
														this.dataSistemaOcorrencia = dataSistemaOcorrencia;	}

	public String getObservacao() { return this.observacao; }
	public void setObservacao(String observacao) { this.observacao = observacao; }

	public String getObservacao1() { return this.observacao1; }
	public void setObservacao1(String observacao1) { this.observacao1 = observacao1; }

}
