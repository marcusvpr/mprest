package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_selo_distribuidor", indexes = {
		@Index(name = "index_mpadt_selo_distribuidor_dataDistr",
										columnList = "data_distribuicao, numero_distribuicao", unique = true)})
public class MpmSeloDistribuidor extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_distribuicao", nullable = true)
	private Date dataDistribuicao;

	@Column(name = "numero_distribuicao", nullable = true, length = 20)
	private String numeroDistribuicao;
	
	@Column(name = "selo_completo", nullable = true, length = 50)
	private String seloCompleto;

		
	@JsonIgnore
	@OneToMany(mappedBy = "mpmSeloDistribuidor", cascade = CascadeType.ALL)
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();

	//
	
	public MpmSeloDistribuidor() {
		//
	}

	public MpmSeloDistribuidor(Date dataDistribuicao) {
		this.dataDistribuicao = dataDistribuicao;
	}

	public MpmSeloDistribuidor(Integer id, Date dataDistribuicao, String numeroDistribuicao,
								String seloCompleto) {
		//
		super();
		
		this.id = id;
		this.dataDistribuicao = dataDistribuicao;
		this.numeroDistribuicao = numeroDistribuicao;
		this.seloCompleto = seloCompleto;
	}

	public Date getDataDistribuicao() { return this.dataDistribuicao; }
	public void setDataDistribuicao(Date dataDistribuicao) { this.dataDistribuicao = dataDistribuicao; }

	public String getNumeroDistribuicao() { return this.numeroDistribuicao; }
	public void setNumeroDistribuicao(String numeroDistribuicao) { 
													this.numeroDistribuicao = numeroDistribuicao; }

	public String getSeloCompleto() { return this.seloCompleto; }
	public void setSeloCompleto(String seloCompleto) { this.seloCompleto = seloCompleto; }
	
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }

}
