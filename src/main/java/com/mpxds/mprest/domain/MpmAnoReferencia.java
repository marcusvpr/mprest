package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_ano_referencia", indexes = {
		@Index(name = "index_mpadt_ano_referencia_ano", columnList = "ano", unique = true)})
public class MpmAnoReferencia extends MpEntity {
	//
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 4)
	private String ano;
	
	@Column(nullable = true, length = 20)
	private String descricao;

	@Column(name = "ind_duplicacao", nullable = true)
	private Boolean indDuplicacao;
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmAnoReferencia")
	private List<MpmAto> mpmAtos = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmAnoReferencia")
	private List<MpmCustasComposicao> mpmCustasComposicaos = new ArrayList<>();

	//
	
	public MpmAnoReferencia() {
		//
	}

	public MpmAnoReferencia(Integer id, String ano, String descricao, Boolean indDuplicacao) {
		//
		super();
		
		this.id = id;
		this.ano = ano;
		this.descricao = descricao;
		this.indDuplicacao = indDuplicacao;
	}

	public String getAno() { return this.ano; }
	public void setAno(String ano) { this.ano = ano; }

	public String getDescricao() { return this.descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }

	public Boolean getIndDuplicacao() { return this.indDuplicacao; }
	public void setIndDuplicacao(Boolean indDuplicacao) { this.indDuplicacao = indDuplicacao; }

	public List<MpmAto> getMpmAtos() { return this.mpmAtos; }
	public void setMpAtos(List<MpmAto> mpmAtos) { this.mpmAtos = mpmAtos; }

	public List<MpmCustasComposicao> getMpmCustasComposicaos() { return this.mpmCustasComposicaos; }
	public void setMpCustasComposicaos(List<MpmCustasComposicao> mpmCustasComposicaos) { 
														this.mpmCustasComposicaos = mpmCustasComposicaos; }

}
