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
@Table(name = "mpadt_banco", indexes = {
		@Index(name = "index_mpadt_banco_codigo_agencia", // Verificar Prisco ?
												columnList = "codigo, mpmAgencia_id", unique = true)})
public class MpmBanco extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 7)
	private String codigo;

	@Column(nullable = true, length = 135)
	private String nome;

	@Column(name = "ind_antecipado", nullable = true)
	private Boolean indAntecipado;

	@Column(name = "ind_postecipado", nullable = true)
	private Boolean indPostecipado;

	@Column(name = "ind_comissionado", nullable = true)
	private Boolean indComissionado;
	
	@ManyToOne
	@JoinColumn(name="mpmAgencia_id")
	private MpmAgencia mpmAgencia;
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmBanco")
	private List<MpmApresentante> mpmApresentantes = new ArrayList<>();

	public MpmBanco() {
		//
	}

	public MpmBanco(Integer id, String codigo, String nome, Boolean indAntecipado, Boolean indPostecipado,
														Boolean indComissionado, MpmAgencia mpmAgencia) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.indAntecipado = indAntecipado;
		this.indPostecipado = indPostecipado;
		this.indComissionado = indComissionado;
		this.mpmAgencia = mpmAgencia;
	}

	public MpmBanco(Integer id, String codigo, String nome, Boolean indAntecipado, Boolean indPostecipado,
																					Boolean indComissionado) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.indAntecipado = indAntecipado;
		this.indPostecipado = indPostecipado;
		this.indComissionado = indComissionado;
	}

	public String getCodigo() { return this.codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }

	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }

	public Boolean getIndAntecipado() { return this.indAntecipado; }
	public void setIndAntecipado(Boolean indAntecipado) { this.indAntecipado = indAntecipado; }

	public Boolean getIndPostecipado() { return this.indPostecipado; }
	public void setIndPostecipado(Boolean indPostecipado) { this.indPostecipado = indPostecipado; }

	public Boolean getIndComissionado() { return this.indComissionado; }
	public void setIndComissionado(Boolean indComissionado) { this.indComissionado = indComissionado; }

	public MpmAgencia getMpmAgencia() { return this.mpmAgencia; }
	public void setMpmAgencia(MpmAgencia mpmAgencia) { this.mpmAgencia = mpmAgencia; }
	
	public List<MpmApresentante> getMpmApresentantes() { return mpmApresentantes; }
	public void setMpmApresentantes(List<MpmApresentante> mpmApresentantes) { 
																this.mpmApresentantes = mpmApresentantes; }

}
