package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mpm_status")
public class MpmStatus extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 2)
	private Integer codigo;
	
	@Column(nullable = true, length = 25)
	private String descricao;
	
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

}
