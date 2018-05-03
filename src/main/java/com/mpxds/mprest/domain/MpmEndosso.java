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
@Table(name = "mpadt_endosso", indexes = {
		@Index(name = "index_mpadt_endosso_codigo", columnList = "codigo", unique = true)})
public class MpmEndosso extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 1)
	private String codigo;

	@Column(nullable = true, length = 30)
	private String descricao;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmEndosso")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();
	
	//
	
	public MpmEndosso() {
		//
	}

	public MpmEndosso(Integer id, String codigo, String descricao) {
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
	
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }

}
