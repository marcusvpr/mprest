package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpm_alinea")
public class MpmAlinea extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 2)
	private Integer codigo;

	@Column(nullable = true, length = 25)
	private String descricao;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmAlinea")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();
	
	//
	
	public MpmAlinea() {
		//
	}

	public MpmAlinea(Integer id, Integer codigo, String descricao) {
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
	
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }

}
