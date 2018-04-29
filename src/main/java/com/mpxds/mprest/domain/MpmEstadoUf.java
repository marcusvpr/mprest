package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_estado_uf")
public class MpmEstadoUf extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 2)
	private String sigla;

	@Column(nullable = true, length = 30)
	private String nome;
		
	@JsonIgnore
	@OneToMany(mappedBy = "mpmEstadoUf", cascade = CascadeType.ALL)
	private List<MpmCidade> mpmCidades = new ArrayList<>();
	
	//
	
	public MpmEstadoUf() {
		//
	}

	public MpmEstadoUf(Integer id, String sigla, String nome) {
		//
		super();
		
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}

	//
	
	public String getSigla() { return sigla; }
	public void setSigla(String sigla) { this.sigla = sigla; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public List<MpmCidade> getMpmCidades() { return mpmCidades; }
	public void setMpmCidades(List<MpmCidade> mpmCidades) { this.mpmCidades = mpmCidades; }

}
