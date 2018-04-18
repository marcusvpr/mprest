package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mpm_cidade")
public class MpmCidade extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 30)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="mpmEstadoUf_id")
	private MpmEstadoUf mpmEstadoUf;
	//
	
	public MpmCidade() {
		//
	}

	public MpmCidade(Integer id, String descricao, MpmEstadoUf mpmEstadoUf) {
		//
		super();
		
		this.id = id;
		this.descricao = descricao;
		this.mpmEstadoUf = mpmEstadoUf;
	}

	//
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public MpmEstadoUf getMpmEstadoUf() { return mpmEstadoUf; }
	public void setMpmEstadoUf(MpmEstadoUf mpmEstadoUf) { this.mpmEstadoUf = mpmEstadoUf; }

}
