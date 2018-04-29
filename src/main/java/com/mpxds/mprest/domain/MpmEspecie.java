package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_especie")
public class MpmEspecie extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 3)
	private String codigo;
	
	@Column(nullable = true, length = 25)
	private String descricao;

	@Column(name = "codigo_corregedoria", nullable = true, length = 2)
	private Integer codigoCorregedoria;
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmEspecie")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();

	//
	
	public MpmEspecie() {
		//
	}

	public MpmEspecie(Integer id, String codigo, String descricao, Integer codigoCorregedoria) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.codigoCorregedoria = codigoCorregedoria;
	}

	//
		
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public Integer getCodigoCorregedoria() { return codigoCorregedoria; }
	public void setCodigoCorregedoria(Integer codigoCorregedoria) { 
															this.codigoCorregedoria = codigoCorregedoria; }
		
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }

}
