package com.mpxds.mprest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_agencia", indexes = {
		@Index(name = "index_mpadt_agencia_nome_mpmBancoSistema", 
												columnList = "nome, mpmBancoSistema_id", unique = true)})
public class MpmAgencia extends MpEntity {
	//
	private static final long serialVersionUID = 1L;

	@Column(nullable = true, length = 11)
	private Integer numero;
		
	@Column(nullable = false, length = 140)
	private String nome;

	@ManyToOne
	@JoinColumn(name="mpmEndereco_id")
	private MpmEndereco mpmEndereco;
		
	@ManyToOne
	@JoinColumn(name = "mpmBancoSistema_id")
	private MpmBancoSistema mpmBancoSistema;
	
	//
	
	public MpmAgencia() {
		//
	}

	public MpmAgencia(Integer id, Integer numero, String nome, MpmEndereco mpmEndereco, 
																		MpmBancoSistema mpmBancoSistema) {
		//
		super();
		
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.mpmEndereco = mpmEndereco;
		this.mpmBancoSistema = mpmBancoSistema;
	}

	//
	
	public Integer getNumero() { return numero; }
	public void setNumero(Integer numero) { this.numero = numero; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public MpmEndereco getMpmEndereco() { return mpmEndereco; }
	public void setMpmEndereco(MpmEndereco mpmEndereco) { this.mpmEndereco = mpmEndereco; }
	
	public MpmBancoSistema getMpmBancoSistema() { return mpmBancoSistema; }
	public void setMpmBancoSistema(MpmBancoSistema mpmBancoSistema) { this.mpmBancoSistema = mpmBancoSistema; }
	
}
