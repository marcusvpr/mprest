package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_carga")
public class MpmCarga extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 500)
	private String descricao;
		
	//
	
	public MpmCarga() {
		//
	}

	public MpmCarga(Integer id, String descricao) {
		//
		super();
		
		this.id = id;
		this.descricao = descricao;
	}

	//
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
}
