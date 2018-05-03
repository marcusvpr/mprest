package com.mpxds.mprest.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_apresentante", indexes = {
		@Index(name = "index_mpadt_apresentante_codigo", columnList = "codigo", unique = true)})
public class MpmApresentante extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = false, length = 7)
	private String codigo;
	
	@Column(nullable = true, length = 135)
	private String nome;

	@Column(name = "ind_banco", nullable = true)
	private Boolean indBanco;

	@Column(name = "tipo_documento", nullable = true, length = 4)
	private String tipoDocumento;
	
	@Column(name = "numero_documento", nullable = true, length = 14)
	private String numeroDocumento;

	@Column(name = "valor_reembolso_ted", nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "#,###,###,##0.00")
	private BigDecimal valorReembolsoTed;
	
	@ManyToOne
	@JoinColumn(name="mpmEndereco_id")
	private MpmEndereco mpmEndereco;
	
	@JsonIgnore
	@ManyToMany(mappedBy="mpmApresentantes")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="mpmBanco_id")
	private MpmBanco mpmBanco;

	//
	
	public MpmApresentante() {
		//
	}

	public MpmApresentante(Integer id,  String codigo,  String nome, Boolean indBanco, String tipoDocumento,
							String numeroDocumento, BigDecimal valorReembolsoTed, MpmEndereco mpmEndereco,
							MpmBanco mpmBanco) {
		//
		super();
		
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.indBanco = indBanco;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.valorReembolsoTed = valorReembolsoTed;
		this.mpmEndereco = mpmEndereco;
		this.mpmBanco = mpmBanco;
	}

	//
		
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public Boolean getIndBanco() { return indBanco; }
	public void setIndBanco(Boolean indBanco) { this.indBanco = indBanco; }

	public String getTipoDocumento() { return tipoDocumento; }
	public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

	public String getNumeroDocumento() { return numeroDocumento; }
	public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }

	public BigDecimal getValorReembolsoTed() { return valorReembolsoTed; }
	public void setValorReembolsoTed(BigDecimal valorReembolsoTed) { 
																this.valorReembolsoTed = valorReembolsoTed; }

	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }
	
	public MpmEndereco getMpmEndereco() { return mpmEndereco; }
	public void setMpmEndereco(MpmEndereco mpmEndereco) { this.mpmEndereco = mpmEndereco; }
	
	public MpmBanco getMpmBanco() { return mpmBanco; }
	public void setMpmBanco(MpmBanco mpmBanco) { this.mpmBanco = mpmBanco; }

}
