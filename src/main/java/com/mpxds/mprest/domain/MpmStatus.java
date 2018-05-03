package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_status", indexes = {
		@Index(name = "index_mpadt_status_codigo", columnList = "codigo", unique = true),
		@Index(name = "index_mpadt_status_descricao", columnList = "descricao", unique = true)})
public class MpmStatus extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 2)
	private Integer codigo;
	
	@Column(nullable = true, length = 25)
	private String descricao;
		
	@OneToMany(mappedBy="mpmStatus")
	private List<MpmTituloStatus> mpmTituloStatuss = new ArrayList<>();
	
	//
	
	public MpmStatus() {
		//
	}

	public MpmStatus(Integer id, Integer codigo, String descricao) {
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
	
	public List<MpmTituloStatus> getMpmTituloStatuss() { return mpmTituloStatuss; }
	public void setMpmTituloStatuss(List<MpmTituloStatus> mpmTituloStatuss) { 
																	this.mpmTituloStatuss = mpmTituloStatuss; }

}
