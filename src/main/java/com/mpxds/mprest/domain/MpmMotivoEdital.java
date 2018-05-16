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
@Table(name = "mpadt_motivo_edital", indexes = {
		@Index(name = "index_mpadt_motivo_edital_codigo", columnList = "codigo", unique = true)})
public class MpmMotivoEdital extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 2)
	private String codigo;

	@Column(nullable = true, length = 100)
	private String descricao;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmMotivoEdital")
	private List<MpmObservacao> mpmObservacaos = new ArrayList<>();
	
	//
	
	public MpmMotivoEdital() {
		//
	}

	public MpmMotivoEdital(Integer id, String codigo, String descricao) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	//
	
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public List<MpmObservacao> getMpmObservacaos() { return mpmObservacaos; }
	public void setMpmObservacaos(List<MpmObservacao> mpmObservacaos) { this.mpmObservacaos = mpmObservacaos; }

}
