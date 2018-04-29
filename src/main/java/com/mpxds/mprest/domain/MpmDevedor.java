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
@Table(name = "mpadt_devedor")
public class MpmDevedor extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = true, length = 100)
	private String nome;
		
	@Column(nullable = true, length = 3) // ???? Prisco
	private Integer sequencia;
		
	@ManyToOne
	@JoinColumn(name="mpmIdentificacao_id")
	private MpmIdentificacao mpmIdentificacao;
	
	@JsonIgnore
	@ManyToMany(mappedBy="mpmDevedors")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="mpmEndereco_id")
	private MpmEndereco mpmEndereco;

	//
	
	public MpmDevedor() {
		//
	}

	public MpmDevedor(Integer id, String nome, Integer sequencia, MpmIdentificacao mpmIdentificacao,
						MpmEndereco mpmEndereco) {
		//
		super();
		
		this.id = id;
		this.nome = nome;
		this.sequencia = sequencia;
		this.mpmIdentificacao = mpmIdentificacao;
		this.mpmEndereco = mpmEndereco;
	}

	//
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public Integer getSequencia() { return sequencia; }
	public void setSequencia(Integer sequencia) { this.sequencia = sequencia; }
	
	public MpmIdentificacao getMpmIdentificacao() { return mpmIdentificacao; }
	public void setMpmIdentificacao(MpmIdentificacao mpmIdentificacao) { 
																this.mpmIdentificacao = mpmIdentificacao; }
	
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }
	
	public MpmEndereco getMpmEndereco() { return mpmEndereco; }
	public void setMpmEndereco(MpmEndereco mpmEndereco) { this.mpmEndereco = mpmEndereco; }

}
