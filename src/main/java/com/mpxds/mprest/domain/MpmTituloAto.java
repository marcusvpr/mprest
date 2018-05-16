package com.mpxds.mprest.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "mpadt_titulo_ato")
public class MpmTituloAto extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
//	@JoinColumn(name="mpmTitulo_id")
	@JsonIgnore
	@OneToOne
	@MapsId
	private MpmTitulo mpmTitulo;

	@Column(nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal emolumento;

	@Column(nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal distribuicao;

	@Column(name = "lei_489", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei489;

	@Column(name = "lei_713", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei713;

	@Column(name = "lei_4664", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei4664;

	@Column(name = "lei_111", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei111;

	@Column(name = "lei_3761", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei3761;

	@Column(name = "lei_6281", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal lei6281;

	@Column(name = "valor_variavel", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal valorVariavel;

	@Column(name = "total_emolumento", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal totalEmolumento;

	//
	
	public MpmTituloAto() {
		//
	}

	public MpmTituloAto(Integer id,
						BigDecimal emolumento, BigDecimal distribuicao,
						BigDecimal lei489, BigDecimal lei713, 
						BigDecimal lei4664, BigDecimal lei111, 
						BigDecimal lei3761, BigDecimal lei6281, 
						BigDecimal valorVariavel, BigDecimal totalEmolumento) {
		//
		super();
		
		this.id = id;
		this.emolumento = emolumento;
		this.distribuicao = distribuicao;
		this.lei489 = lei489;
		this.lei713 = lei713;
		this.lei4664 = lei4664;
		this.lei111 = lei111;
		this.lei3761 = lei3761;
		this.lei6281 = lei6281;
		this.valorVariavel = valorVariavel;
		this.totalEmolumento = totalEmolumento;
	}

	public MpmTituloAto(Integer id, MpmTitulo mpmTitulo,
			BigDecimal emolumento, BigDecimal distribuicao,
			BigDecimal lei489, BigDecimal lei713, BigDecimal lei4664, BigDecimal lei111, BigDecimal lei3761, 
			BigDecimal lei6281, BigDecimal valorVariavel, BigDecimal totalEmolumento) {
		//
		super();
		
		this.id = id;
		this.mpmTitulo = mpmTitulo;
		this.emolumento = emolumento;
		this.distribuicao = distribuicao;
		this.lei489 = lei489;
		this.lei713 = lei713;
		this.lei4664 = lei4664;
		this.lei111 = lei111;
		this.lei3761 = lei3761;
		this.lei6281 = lei6281;
		this.valorVariavel = valorVariavel;
		this.totalEmolumento = totalEmolumento;
	}

	public MpmTitulo getMpmTitulo() { return mpmTitulo; }
	public void setMpmTitulo(MpmTitulo mpmTitulo) { this.mpmTitulo = mpmTitulo; }

	public BigDecimal getEmolumento() { return this.emolumento; }
	public void setEmolumento(BigDecimal emolumento) { this.emolumento = emolumento; }

	public BigDecimal getDistribuicao() { return this.distribuicao; }
	public void setDistribuicao(BigDecimal distribuicao) { this.distribuicao = distribuicao; }

	public BigDecimal getLei489() { return lei489; }
	public void setLei489(BigDecimal lei489) { this.lei489 = lei489; }

	public BigDecimal getLei713() { return lei713; }
	public void setLei713(BigDecimal lei713) { this.lei713 = lei713; }

	public BigDecimal getLei4664() { return this.lei4664; }
	public void setLei4664(BigDecimal lei4664) { this.lei4664 = lei4664; }

	public BigDecimal getLei111() { return this.lei111; }
	public void setLei111(BigDecimal lei111) { this.lei111 = lei111; }

	public BigDecimal getLei3761() { return this.lei3761; }
	public void setLei3761(BigDecimal lei3761) { this.lei3761 = lei3761; }

	public BigDecimal getLei6281() { return this.lei6281; }
	public void setLei6281(BigDecimal lei6281) { this.lei6281 = lei6281; }

	public BigDecimal getValorVariavel() { return this.valorVariavel; }
	public void setValorVariavel(BigDecimal valorVariavel) { this.valorVariavel = valorVariavel; }

	public BigDecimal getTotalEmolumento() { return this.totalEmolumento; }
	public void setTotalEmolumento(BigDecimal totalEmolumento) { this.totalEmolumento = totalEmolumento; }

}
