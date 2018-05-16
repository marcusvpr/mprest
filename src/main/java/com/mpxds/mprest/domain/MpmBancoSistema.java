package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_banco_sistema", indexes = {
		@Index(name = "index_mpadt_banco_sistema_nome", columnList = "nome", unique = true)})
public class MpmBancoSistema extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, length = 03)
	private String numero;
		
	@JsonIgnore
	@OneToMany(mappedBy = "mpmBancoSistema", cascade = CascadeType.ALL)
	private List<MpmAgencia> mpmAgencias = new ArrayList<>();
	
	//
	
	public MpmBancoSistema() {
		//
	}

	public MpmBancoSistema(Integer id, String numero, String nome) {
		//
		super();
		
		this.id = id;
		this.nome = nome;
		this.numero = numero;
	}

	//
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getNumero() { return numero; }
	public void setNumero(String numero) { this.numero = numero; }
	
	public List<MpmAgencia> getMpmAgencias() { return mpmAgencias; }
	public void setMpmAgencias(List<MpmAgencia> mpmAgencias) { this.mpmAgencias = mpmAgencias; }

}
