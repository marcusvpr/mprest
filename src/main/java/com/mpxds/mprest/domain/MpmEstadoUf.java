package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpm_estado_uf")
public class MpmEstadoUf extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 2)
	private String sigla;

	@Column(nullable = true, length = 30)
	private String descricao;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmEstadoUf")
	private List<MpmCidade> mpmCidades = new ArrayList<>();
	
	//
	
	public MpmEstadoUf() {
		//
	}

	public MpmEstadoUf(Integer id, String sigla, String descricao) {
		//
		super();
		
		this.id = id;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	//
	
	public String getSigla() { return sigla; }
	public void setSigla(String sigla) { this.sigla = sigla; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public List<MpmCidade> getMpmCidades() { return mpmCidades; }
	public void setMpmCidades(List<MpmCidade> mpmCidades) { this.mpmCidades = mpmCidades; }

}
