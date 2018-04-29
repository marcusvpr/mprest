package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_banco")
public class MpmBanco extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 7)
	private String codigo;

	@Column(nullable = true, length = 11)
	private Integer agencia;
	
	@Column(nullable = true, length = 135)
	private String nome;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmBanco")
	private List<MpmApresentante> mpmApresentantes = new ArrayList<>();

	public MpmBanco() {
		//
	}

	public MpmBanco(Integer id, String codigo, Integer agencia, String nome) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.agencia = agencia;
		this.nome = nome;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getAgencia() {
		return this.agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<MpmApresentante> getMpmApresentantes() { return mpmApresentantes; }
	public void setMpmApresentantes(List<MpmApresentante> mpmApresentantes) { 
																this.mpmApresentantes = mpmApresentantes; }

}
