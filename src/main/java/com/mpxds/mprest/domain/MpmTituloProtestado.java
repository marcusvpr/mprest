package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_titulo_protestado", indexes = {
		@Index(name = "index_mpadt_titulo_protestado_livro_folha",
												columnList = "numero_livro, numero_folha", unique = true)})
public class MpmTituloProtestado extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(name = "numero_livro", nullable = true, length = 20)
	private Integer numeroLivro;
	
	@Column(name = "numero_folha", nullable = true, length = 5)
	private Integer numeroFolha;
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmTituloProtestado")
	private List<MpmTituloStatus> mpmTituloStatuss = new ArrayList<>();
	
	//
	
	public MpmTituloProtestado() {
		//
	}

	public MpmTituloProtestado(Integer id, Integer numeroLivro, Integer numeroFolha) {
		//
		super();
		
		this.id = id;
		this.numeroLivro = numeroLivro;
		this.numeroFolha = numeroFolha;
	}

	//
	
	public Integer getNumeroLivro() { return numeroLivro; }
	public void setNumeroLivro(Integer numeroLivro) { this.numeroLivro = numeroLivro; }
	
	public Integer getNumeroFolha() { return numeroFolha; }
	public void setNumeroFolha(Integer numeroFolha) { this.numeroFolha = numeroFolha; }
	
	public List<MpmTituloStatus> getMpmTituloStatuss() { return mpmTituloStatuss; }
	public void setMpmTituloStatuss(List<MpmTituloStatus> mpmTituloStatuss) { 
															this.mpmTituloStatuss = mpmTituloStatuss; }

}
