package com.mpxds.mprest.model.dto;

import java.io.Serializable;

import com.mpxds.mprest.domain.MpmEstadoUf;

public class MpmEstadoUfDTO implements Serializable {
	//
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	
	//
	
	public MpmEstadoUfDTO() {
		//
	}

	public MpmEstadoUfDTO(MpmEstadoUf obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
}
