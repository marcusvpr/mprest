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
@Table(name = "mpadt_endereco", indexes = {
		@Index(name = "index_mpadt_endereco_logr_num_comp_cep_bair_cida",
				columnList = "logradouro, numero, complemento, cep, bairro, mpmCidade_id", unique = true)})
public class MpmEndereco extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 50)
	private String logradouro;
	
	@Column(nullable = false, length = 10)
	private String numero;
	
	@Column(nullable = false, length = 20)
	private String complemento;
	
	@Column(nullable = false, length = 9)
	private String cep;

	@Column(nullable = false, length = 30)
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name="mpmCidade_id")
	private MpmCidade mpmCidade;
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmEndereco")
	private List<MpmDevedor> mpmDevedors = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmEndereco")
	private List<MpmApresentante> mpmApresentantes = new ArrayList<>();
		
	@JsonIgnore
	@OneToMany(mappedBy="mpmEndereco")
	private List<MpmPessoaTitulo> mpmPessoaTitulos = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmEndereco")
	private List<MpmAgencia> mpmAgencias = new ArrayList<>();

	//
	
	public MpmEndereco() {
		//
	}

	public MpmEndereco(Integer id, String logradouro, String numero, String complemento,
						String cep, String bairro, MpmCidade mpmCidade) {
		//
		super();
		
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.mpmCidade = mpmCidade;
	}
	
	//

	public String getLogradouro() {return logradouro; }
	public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

	public String getNumero() { return numero; }
	public void setNumero(String numero) { this.numero = numero; }

	public String getComplemento() { return complemento; }
	public void setComplemento(String complemento) { this.complemento = complemento; }

	public String getCep() { return cep; }
	public void setCep(String cep) { this.cep = cep; }

	public String getBairro() { return bairro; }
	public void setBairro(String bairro) { this.bairro = bairro; }

	public MpmCidade getMpmCidade() { return mpmCidade; }
	public void setMpmCidade(MpmCidade mpmCidade) { this.mpmCidade = mpmCidade; }
		
	public List<MpmDevedor> getMpmDevedors() { return mpmDevedors; }
	public void setMpmDevedors(List<MpmDevedor> mpmDevedors) { this.mpmDevedors = mpmDevedors; }
	
	public List<MpmApresentante> getMpmApresentantes() { return mpmApresentantes; }
	public void setMpmApresentantes(List<MpmApresentante> mpmApresentantes) { 
																this.mpmApresentantes = mpmApresentantes; }
	
	public List<MpmPessoaTitulo> getMpmPessoaTitulos() { return mpmPessoaTitulos; }
	public void setMpmPessoaTitulos(List<MpmPessoaTitulo> mpmPessoaTitulos) { 
																this.mpmPessoaTitulos = mpmPessoaTitulos; }
	
	public List<MpmAgencia> getMpmAgencias() { return mpmAgencias; }
	public void setMpmAgencias(List<MpmAgencia> mpmAgencias) { this.mpmAgencias = mpmAgencias; }
	
}
