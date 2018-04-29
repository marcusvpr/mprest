package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_feriado")
public class MpmFeriado extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_feriado", nullable = true)
	private Date dataFeriado;
	
	@Column(nullable = true, length = 45)
	private String descricao;

	//
	
	public MpmFeriado() {
		//
	}

	public MpmFeriado(Integer id, Date dataFeriado, String descricao) {
		//
		super();
		
		this.id = id;
		this.dataFeriado = dataFeriado;
		this.descricao = descricao;
	}

	public Date getDataFeriado() { return this.dataFeriado; }
	public void setDataFeriado(Date dataFeriado) { this.dataFeriado = dataFeriado; }

	public String getDescricao() { return this.descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }

}
