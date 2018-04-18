package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpm_titulo_status")
public class MpmTituloStatus extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Column(name = "data_ocorrencia", nullable = true)
	private Date dataOcorrencia;
	
	@Column(nullable = true, length = 2)
	private String codigo;
	
	@Column(name = "motivo_protesto", nullable = true, length = 30)
	private String motivo_protesto;
	
	@Column(nullable = true, length = 20)
	private String observacao;
	
	@Column(name = "ind_bloqueado", nullable = true)
	private Boolean indBloqueado;
		
	@ManyToOne
	@JoinColumn(name="mpmTituloProtestado_id")
	private MpmTituloProtestado mpmTituloProtestado;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="mpmTitulo_id")
	private MpmTitulo mpmTitulo;
	
	//
	
	public MpmTituloStatus() {
		//
	}

	public MpmTituloStatus(Integer id, Date dataOcorrencia, String codigo, String motivo_protesto,
							String observacao, Boolean indBloqueado, MpmTitulo mpmTitulo,
							MpmTituloProtestado mpmTituloProtestado) {
		//
		super();
		
		this.id = id;
		this.dataOcorrencia = dataOcorrencia;
		this.codigo = codigo;
		this.motivo_protesto = motivo_protesto;
		this.observacao = observacao;
		this.indBloqueado = indBloqueado;
		this.mpmTitulo = mpmTitulo;
		this.mpmTituloProtestado = mpmTituloProtestado;
	}

	//

	public Date getDataOcorrencia() { return dataOcorrencia; }
	public void setDataOcorrencia(Date dataOcorrencia) { this.dataOcorrencia = dataOcorrencia; }

	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }

	public String getMotivo_protesto() { return motivo_protesto; }
	public void setMotivo_protesto(String motivo_protesto) { this.motivo_protesto = motivo_protesto; }

	public String getObservacao() { return observacao; }
	public void setObservacao(String observacao) { this.observacao = observacao; }

	public Boolean getIndBloqueado() { return indBloqueado; }
	public void setIndBloqueado(Boolean indBloqueado) { this.indBloqueado = indBloqueado; }

	public MpmTitulo getMpmTitulo() { return mpmTitulo; }
	public void setMpmTitulo(MpmTitulo mpmTitulo) { this.mpmTitulo = mpmTitulo; }

	public MpmTituloProtestado getMpmTituloProtestado() { return mpmTituloProtestado; }
	public void setMpmTituloProtestado(MpmTituloProtestado mpmTituloProtestado) { 
															this.mpmTituloProtestado = mpmTituloProtestado; }
	
}
