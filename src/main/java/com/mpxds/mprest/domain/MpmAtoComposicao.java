package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_ato_composicao")
public class MpmAtoComposicao extends MpEntity {
	//
	private static final long serialVersionUID = 1L;

	@Column(nullable = true, length = 5)
	private Integer quantidade;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="mpmAto_id")
	private MpmAto mpmAto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="mpmCustasComposicao_id")
	private MpmCustasComposicao mpmCustasComposicao;

	//
	
	public MpmAtoComposicao() {
		//
	}

	public MpmAtoComposicao(Integer id, MpmAto mpmAto, MpmCustasComposicao mpmCustasComposicao,
							Integer quantidade) {
		//
		super();
		
		this.mpmAto = mpmAto;
		this.mpmCustasComposicao = mpmCustasComposicao;
		this.quantidade = quantidade;
	}

	public MpmAto getMpmAto() {
		return this.mpmAto;
	}
	public void setMpmAto(MpmAto mpmAto) {
		this.mpmAto = mpmAto;
	}

	public MpmCustasComposicao getMpmCustasComposicao() {
		return this.mpmCustasComposicao;
	}
	public void setMpmCustasComposicao(MpmCustasComposicao mpmCustasComposicao) {
		this.mpmCustasComposicao = mpmCustasComposicao;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
