package com.mpxds.mprest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_cidade", indexes = {
		@Index(name = "index_mpadt_cidade_nome_mpmEstadoUf", columnList = "nome, mpmEstadoUf_id", unique = true)})
public class MpmCidade extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 30)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "mpmEstadoUf_id")
	private MpmEstadoUf mpmEstadoUf;
	
	//
	
	public MpmCidade() {
		//
	}

	public MpmCidade(Integer id, String nome, MpmEstadoUf mpmEstadoUf) {
		//
		super();
		
		this.id = id;
		this.nome = nome;
		this.mpmEstadoUf = mpmEstadoUf;
	}

	//
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public MpmEstadoUf getMpmEstadoUf() { return mpmEstadoUf; }
	public void setMpmEstadoUf(MpmEstadoUf mpmEstadoUf) { this.mpmEstadoUf = mpmEstadoUf; }
	
}
