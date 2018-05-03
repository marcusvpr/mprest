package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
@Table(name = "mpadt_importar_controle", indexes = {
		@Index(name = "index_mpadt_importar_controle_dat_distrib",
						columnList = "data_distribuicao", unique = true)})
public class MpmImportarControle extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_distribuicao", nullable = true)
	private Date dataDistribuicao;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_protocolo", nullable = true)
	private Date dataProtocolo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_ate", nullable = true)
	private Date dataAte;
	
	@JsonIgnore
	@OneToMany(mappedBy="mpmImportarControle")
	private List<MpmRemessa> mpmRemessas = new ArrayList<>();

	//
	
	public MpmImportarControle() {
		//
	}

	public MpmImportarControle(Integer id, Date dataDistribuicao, Date dataProtocolo, Date dataAte) {
		//
		super();
		
		this.id = id;		
		this.dataDistribuicao = dataDistribuicao;
		this.dataProtocolo = dataProtocolo;
		this.dataAte = dataAte;
	}

	public Date getDataDistribuicao() { return this.dataDistribuicao; }
	public void setDataDistribuicao(Date dataDistribuicao) { this.dataDistribuicao = dataDistribuicao; }

	public Date getDataProtocolo() { return this.dataProtocolo; }
	public void setDataProtocolo(Date dataProtocolo) { this.dataProtocolo = dataProtocolo; }

	public Date getDataAte() { return this.dataAte; }
	public void setDataAte(Date dataAte) { this.dataAte = dataAte; }

	public List<MpmRemessa> getMpmRemessas() { return this.mpmRemessas; }
	public void setMpmRemessas(List<MpmRemessa> mpmRemessas) { this.mpmRemessas = mpmRemessas; }

}
