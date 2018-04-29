package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_controle_oficio")
public class MpmControleOficio extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(name = "numero_ordem", nullable = true, length = 15)
	private Integer numeroOrdem;
	
	@Column(name = "orgao_emissor", nullable = true, length = 50)
	private String orgaoEmissor;
	
	@Column(nullable = true, length = 50)
	private String oficio;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_oficio", nullable = true)
	private Date dataOficio;
	
	@Column(name = "cpf_cnpj", nullable = true, length = 15)
	private String cpfCnpj;
	
	@Column(name = "nome_devedor", nullable = true, length = 135)
	private String nomeDevedor;
	
	@Column(name = "nome_devedor_1", nullable = true, length = 135)
	private String nomeDevedor1;
	
	@Column(name = "nome_devedor_2", nullable = true, length = 135)
	private String nomeDevedor2;

	//
	
	public MpmControleOficio() {
		//
	}

	public MpmControleOficio(Integer id, Integer numeroOrdem, String orgaoEmissor, String oficio,
							Date dataOficio, String cpfCnpj, String nomeDevedor, String nomeDevedor1,
							String nomeDevedor2) {
		//
		super();
		
		this.id = id;
		this.numeroOrdem = numeroOrdem;
		this.orgaoEmissor = orgaoEmissor;
		this.oficio = oficio;
		this.dataOficio = dataOficio;
		this.cpfCnpj = cpfCnpj;
		this.nomeDevedor = nomeDevedor;
		this.nomeDevedor1 = nomeDevedor1;
		this.nomeDevedor2 = nomeDevedor2;
	}

	public Integer getNumeroOrdem() {
		return this.numeroOrdem;
	}
	public void setNumeroOrdem(Integer numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}

	public String getOrgaoEmissor() {
		return this.orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getOficio() {
		return this.oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Date getDataOficio() {
		return this.dataOficio;
	}
	public void setDataOficio(Date dataOficio) {
		this.dataOficio = dataOficio;
	}

	public String getCpfCnpj() {
		return this.cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNomeDevedor() {
		return this.nomeDevedor;
	}
	public void setNomeDevedor(String nomeDevedor) {
		this.nomeDevedor = nomeDevedor;
	}

	public String getNomeDevedor1() {
		return this.nomeDevedor1;
	}
	public void setNomeDevedor1(String nomeDevedor1) {
		this.nomeDevedor1 = nomeDevedor1;
	}

	public String getNomeDevedor2() {
		return this.nomeDevedor2;
	}
	public void setNomeDevedor2(String nomeDevedor2) {
		this.nomeDevedor2 = nomeDevedor2;
	}

}
