package com.mpxds.mprest.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mpm_devedor")
public class MpmDevedor extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 3)
	private Integer sequencia;
		
	@ManyToOne
	@JoinColumn(name="mpmIdentificacao_id")
	private MpmIdentificacao mpmIdentificacao;
	
	@JsonIgnore
	@ManyToMany(mappedBy="mpmDevedors")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();

	//
	
	public MpmDevedor() {
		//
	}

	public MpmDevedor(Integer id, Integer sequencia, MpmIdentificacao mpmIdentificacao) {
		//
		super();
		
		this.id = id;
		this.sequencia = sequencia;
		this.mpmIdentificacao = mpmIdentificacao;
	}

	//
	
	public Integer getSequencia() { return sequencia; }
	public void setSequencia(Integer sequencia) { this.sequencia = sequencia; }
	
	public MpmIdentificacao getMpmIdentificacao() { return mpmIdentificacao; }
	public void setMpmIdentificacao(MpmIdentificacao mpmIdentificacao) { 
																this.mpmIdentificacao = mpmIdentificacao; }
	
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }

}
