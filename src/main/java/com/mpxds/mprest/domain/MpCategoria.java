package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mp_categoria")
public class MpCategoria extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 100)
	private String nome;
	
	//
	
	public MpCategoria() {
		//
	}

	public MpCategoria(Integer id, String nome) {
		//
		super();
		
		this.id = id;
		this.nome = nome;
	}

	//
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

}
