package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_edital")
public class MpmEdital extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_baixa", nullable = true)
	private Date dataBaixa;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_protocolo", nullable = true)
	private Date dataProtocolo;

	@Column(name = "numero_protocolo", nullable = true, length = 6)
	private String numeroProtocolo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_novo_ate", nullable = true)
	private Date dataNovoAte;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_ate", nullable = true)
	private Date dataAte;

	@Column(name = "ocorrencia_usuario", nullable = true, length = 25)
	private String ocorrenciaUsuario;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_sistema_ocorrencia", nullable = true)
	private Date dataSistemaOcorrencia;

	//
	
	public MpmEdital() {
		//
	}
	
	public MpmEdital(Integer id, Date dataBaixa, Date dataProtocolo, String numeroProtocolo, Date dataNovoAte,
										Date dataAte, String ocorrenciaUsuario, Date dataSistemaOcorrencia) {
		//
		super();
		
		this.id = id;
		this.dataBaixa = dataBaixa;
		this.dataProtocolo = dataProtocolo;
		this.numeroProtocolo = numeroProtocolo;
		this.dataNovoAte = dataNovoAte;
		this.dataAte = dataAte;
		this.ocorrenciaUsuario = ocorrenciaUsuario;
		this.dataSistemaOcorrencia = dataSistemaOcorrencia;
	}

	public Date getDataProtocolo() { return this.dataProtocolo; }
	public void setDataProtocolo(Date dataProtocolo) { this.dataProtocolo = dataProtocolo; }

	public Date getDataAte() { return this.dataAte;	}
	public void setDataAte(Date dataAte) { this.dataAte = dataAte; }

	public Date getDataBaixa() { return dataBaixa; }
	public void setDataBaixa(Date dataBaixa) { this.dataBaixa = dataBaixa; }

	public String getNumeroProtocolo() { return numeroProtocolo; }
	public void setNumeroProtocolo(String numeroProtocolo) { this.numeroProtocolo = numeroProtocolo; }

	public Date getDataNovoAte() { return dataNovoAte; }
	public void setDataNovoAte(Date dataNovoAte) { this.dataNovoAte = dataNovoAte; }

	public String getOcorrenciaUsuario() { return ocorrenciaUsuario; }
	public void setOcorrenciaUsuario(String ocorrenciaUsuario) { this.ocorrenciaUsuario = ocorrenciaUsuario; }

	public Date getDataSistemaOcorrencia() { return dataSistemaOcorrencia; }
	public void setDataSistemaOcorrencia(Date dataSistemaOcorrencia) { 
														this.dataSistemaOcorrencia = dataSistemaOcorrencia; }
	
}
