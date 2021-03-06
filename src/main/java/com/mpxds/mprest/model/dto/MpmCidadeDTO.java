package com.mpxds.mprest.model.dto;

import java.io.Serializable;

import com.mpxds.mprest.domain.MpmCidade;

public class MpmCidadeDTO implements Serializable {
	//
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	
	//
	
	public MpmCidadeDTO() {
		//
	}

	public MpmCidadeDTO(MpmCidade obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
}
