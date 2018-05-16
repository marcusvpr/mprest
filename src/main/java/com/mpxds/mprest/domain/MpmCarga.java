package com.mpxds.mprest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_carga")
public class MpmCarga extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = true, length = 100)
	private String codigo;
		
	@Column(nullable = true, length = 2500)
	private String descricao;
		
	//
	
	public MpmCarga() {
		//
	}

	public MpmCarga(Integer id, String codigo, String descricao) {
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
	
}
