package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_observacao", indexes = {
		@Index(name = "index_mpadt_observacao_tipo", columnList = "tipo", unique = true),
		@Index(name = "index_mpadt_observacao_descricao", columnList = "descricao", unique = true)})
public class MpmObservacao extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = true, length = 50)
	private String tipo;
	
	@Column(nullable = true, length = 200)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "mpmMotivoEdital")
	private MpmMotivoEdital mpmMotivoEdital;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmObservacao")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();

	//

	public MpmObservacao() {
		//
	}

	public MpmObservacao(Integer id, String tipo, String descricao, MpmMotivoEdital mpmMotivoEdital) {
		//
		super();
		
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
		this.mpmMotivoEdital = mpmMotivoEdital;
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

	public MpmMotivoEdital getMpmMotivoEdital() { return this.mpmMotivoEdital; }
	public void setMpmMotivoEdital(MpmMotivoEdital mpmMotivoEdital) { this.mpmMotivoEdital = mpmMotivoEdital; }
		
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }

}
