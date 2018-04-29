package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_selo_distribuidor")
public class MpmSeloDistribuidor extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_distribuicao", nullable = true)
	private Date dataDistribuicao;

	@Column(name = "numero_distribuicao", nullable = true, length = 20)
	private String numeroDistribuicao;
	
	@Column(name = "selo_completo", nullable = true, length = 50)
	private String seloCompleto;

	//
	
	public MpmSeloDistribuidor() {
		//
	}

	public MpmSeloDistribuidor(Date dataDistribuicao) {
		this.dataDistribuicao = dataDistribuicao;
	}

	public MpmSeloDistribuidor(Integer id, Date dataDistribuicao, String numeroDistribuicao,
								String seloCompleto) {
		//
		super();
		
		this.id = id;
		this.dataDistribuicao = dataDistribuicao;
		this.numeroDistribuicao = numeroDistribuicao;
		this.seloCompleto = seloCompleto;
	}

	public Date getDataDistribuicao() { return this.dataDistribuicao; }
	public void setDataDistribuicao(Date dataDistribuicao) { this.dataDistribuicao = dataDistribuicao; }

	public String getNumeroDistribuicao() { return this.numeroDistribuicao; }
	public void setNumeroDistribuicao(String numeroDistribuicao) { 
													this.numeroDistribuicao = numeroDistribuicao; }

	public String getSeloCompleto() { return this.seloCompleto; }
	public void setSeloCompleto(String seloCompleto) { this.seloCompleto = seloCompleto; }

}
