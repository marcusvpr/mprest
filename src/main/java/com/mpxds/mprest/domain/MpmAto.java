package com.mpxds.mprest.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name = "mpadt_ato")
public class MpmAto extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@ManyToOne
	@JoinColumn(name="mpmAnoReferencia_id")
	private MpmAnoReferencia mpmAnoReferencia; 

	@Column(name = "codigo_ato", nullable = true, length = 4)
	private String codigoAto;

	@Column(name = "ato_sequencia", nullable = true, length = 1)
	private String atoSequencia;
	
	@Column(name = "descricao_ato", nullable = true, length = 100)
	private String descricaoAto;

	@Column(name = "tipo_selo", nullable = true, length = 1)
	private String tipoSelo;

	@Column(nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal emolumento;

	@Column(name = "lei_3217", nullable = true, precision = 9, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei3217;

	@Column(name = "lei_4664", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei4664;

	@Column(name = "lei_1111", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei111;

	@Column(name = "lei_3761", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei3761;

	@Column(name = "lei_590", nullable = true, precision = 9, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei590;

	@Column(name = "lei_6281", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei6281;

	@Column(nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal iss;

	@Column(nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal distribuicao;

	@Column(name = "valor_ato", nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal valorAto;

	@Column(nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal gratuidade;

	@Column(name = "id_clone", nullable = true)
	private Integer idClone;

	@OneToMany(mappedBy="mpmAto")
	private List<MpmAtoComposicao> mpmAtoComposicaos = new ArrayList<>();

	//
	
	public MpmAto() {
		//
	}

	public MpmAto(Integer id, MpmAnoReferencia mpmAnoReferencia, String codigoAto, String atoSequencia,
			String descricaoAto, String tipoSelo, BigDecimal emolumento, BigDecimal lei3217, 
			BigDecimal lei4664, BigDecimal lei111, BigDecimal lei3761, BigDecimal lei590, 
			BigDecimal lei6281, BigDecimal iss, BigDecimal distribuicao,
			BigDecimal valorAto, BigDecimal gratuidade, Integer idClone) {
		//
		super();
		
		this.id = id;
		this.mpmAnoReferencia = mpmAnoReferencia;
		this.codigoAto = codigoAto;
		this.atoSequencia = atoSequencia;
		this.descricaoAto = descricaoAto;
		this.tipoSelo = tipoSelo;
		this.emolumento = emolumento;
		this.lei3217 = lei3217;
		this.lei4664 = lei4664;
		this.lei111 = lei111;
		this.lei3761 = lei3761;
		this.lei590 = lei590;
		this.lei6281 = lei6281;
		this.iss = iss;
		this.distribuicao = distribuicao;
		this.valorAto = valorAto;
		this.gratuidade = gratuidade;
		this.idClone = idClone;
	}

	public MpmAnoReferencia getMpmAnoReferencia() {
		return this.mpmAnoReferencia;
	}
	public void setMpmAnoReferencia(MpmAnoReferencia mpmAnoReferencia) {
		this.mpmAnoReferencia = mpmAnoReferencia;
	}

	public String getCodigoAto() {
		return this.codigoAto;
	}
	public void setCodigoAto(String codigoAto) {
		this.codigoAto = codigoAto;
	}

	public String getAtoSequencia() {
		return this.atoSequencia;
	}
	public void setAtoSequencia(String atoSequencia) {
		this.atoSequencia = atoSequencia;
	}

	public String getDescricaoAto() {
		return this.descricaoAto;
	}
	public void setDescricaoAto(String descricaoAto) {
		this.descricaoAto = descricaoAto;
	}

	public String getTipoSelo() {
		return this.tipoSelo;
	}
	public void setTipoSelo(String tipoSelo) {
		this.tipoSelo = tipoSelo;
	}

	public BigDecimal getEmolumento() {
		return this.emolumento;
	}
	public void setEmolumento(BigDecimal emolumento) {
		this.emolumento = emolumento;
	}

	public BigDecimal getLei3217() {
		return this.lei3217;
	}
	public void setLei3217(BigDecimal lei3217) {
		this.lei3217 = lei3217;
	}

	public BigDecimal getLei4664() {
		return this.lei4664;
	}
	public void setLei4664(BigDecimal lei4664) {
		this.lei4664 = lei4664;
	}

	public BigDecimal getLei111() {
		return this.lei111;
	}
	public void setLei111(BigDecimal lei111) {
		this.lei111 = lei111;
	}

	public BigDecimal getLei3761() {
		return this.lei3761;
	}
	public void setLei3761(BigDecimal lei3761) {
		this.lei3761 = lei3761;
	}

	public BigDecimal getLei590() {
		return this.lei590;
	}
	public void setLei590(BigDecimal lei590) {
		this.lei590 = lei590;
	}

	public BigDecimal getLei6281() {
		return this.lei6281;
	}
	public void setLei6281(BigDecimal lei6281) {
		this.lei6281 = lei6281;
	}

	public BigDecimal getIss() {
		return this.iss;
	}
	public void setIss(BigDecimal iss) {
		this.iss = iss;
	}

	public BigDecimal getDistribuicao() {
		return this.distribuicao;
	}
	public void setDistribuicao(BigDecimal distribuicao) {
		this.distribuicao = distribuicao;
	}

	public BigDecimal getValorAto() {
		return this.valorAto;
	}
	public void setValorAto(BigDecimal valorAto) {
		this.valorAto = valorAto;
	}

	public BigDecimal getGratuidade() {
		return this.gratuidade;
	}
	public void setGratuidade(BigDecimal gratuidade) {
		this.gratuidade = gratuidade;
	}

	public Integer getIdClone() {
		return this.idClone;
	}
	public void setIdClone(Integer idClone) {
		this.idClone = idClone;
	}

	public List<MpmAtoComposicao> getMpmAtoComposicaos() {
		return this.mpmAtoComposicaos;
	}
	public void setMpmAtoComposicaos(List<MpmAtoComposicao> mpmAtoComposicaos) {
		this.mpmAtoComposicaos = mpmAtoComposicaos;
	}

}
