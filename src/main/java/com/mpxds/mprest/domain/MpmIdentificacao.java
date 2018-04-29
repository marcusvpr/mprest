package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_identificacao")
public class MpmIdentificacao extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 1)
	private Integer codigo;

	@Column(nullable = true, length = 10)
	private String descricao;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmIdentificacao")
	private List<MpmDevedor> mpmDevedors = new ArrayList<>();
	
	//
	
	public MpmIdentificacao() {
		//
	}

	public MpmIdentificacao(Integer id, Integer codigo, String descricao) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	//
	
	public Integer getCodigo() { return codigo; }
	public void setCodigo(Integer codigo) { this.codigo = codigo; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public List<MpmDevedor> getMpmDevedors() { return mpmDevedors; }
	public void setMpmDevedors(List<MpmDevedor> mpmDevedors) { this.mpmDevedors = mpmDevedors; }

}
