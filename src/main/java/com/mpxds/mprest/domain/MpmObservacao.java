package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_observacao")
public class MpmObservacao extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = true, length = 50)
	private String tipo;
	
	@Column(nullable = true, length = 200)
	private String descricao;

	//

	public MpmObservacao() {
		//
	}

	public MpmObservacao(Integer id, String tipo, String descricao) {
		//
		super();
		
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public String getTipo() { return this.tipo; }
	public void setTipo(String tipo) { this.tipo = tipo; }

	public String getDescricao() { return this.descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }

}
