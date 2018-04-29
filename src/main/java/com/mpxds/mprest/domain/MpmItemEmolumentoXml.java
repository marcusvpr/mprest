package com.mpxds.mprest.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_item_emolumento_xml")
public class MpmItemEmolumentoXml extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_pratica", nullable = true)
	private Date dataPratica;

	@Column(name = "codigo_ato", nullable = true, length = 4)
	private String codigoAto;

	@Column(name = "ato_sequencia", nullable = true, length = 1)
	private String atoSequencia;

	@Column(name = "numero_controle", nullable = true, length = 14)
	private String numeroControle;

	@Column(nullable = true, length = 4)
	private String tabela;

	@Column(nullable = true, length = 4)
	private String item;

	@Column(name = "sub_item", nullable = true, length = 4)
	private String subItem;

	@Column(name = "descricao_tab", nullable = true, length = 35)
	private String descricaoTab;

	@Column(nullable = true, length = 6)
	private Integer quantidade;

	@Column(nullable = true, length = 50)
	private String complemento;

	@Column(nullable = true, length = 50)
	private String excecao;
	
	@NumberFormat(pattern = "###,##0.00")
	@Column(name = "valor_custa", nullable = true, precision = 6, scale = 2)
	private BigDecimal valorCusta;
	
	@Column(nullable = true, length = 2)
	private String ocorrencia;

	public MpmItemEmolumentoXml() {
		//
	}

	public MpmItemEmolumentoXml(Integer id, Date dataPratica, String codigoAto,
			String atoSequencia, String numeroControle,
			String tabela, String item, String subItem, String descricaoTab, 
			Integer quantidade, String complemento,
			String excecao, BigDecimal valorCusta, String ocorrencia) {
		//
		super();
		
		this.id = id;
		this.dataPratica = dataPratica;
		this.codigoAto = codigoAto;
		this.atoSequencia = atoSequencia;
		this.numeroControle = numeroControle;
		this.tabela = tabela;
		this.item = item;
		this.subItem = subItem;
		this.descricaoTab = descricaoTab;
		this.quantidade = quantidade;
		this.complemento = complemento;
		this.excecao = excecao;
		this.valorCusta = valorCusta;
		this.ocorrencia = ocorrencia;
	}

	public Date getDataPratica() {
		return this.dataPratica;
	}
	public void setDataPratica(Date dataPratica) {
		this.dataPratica = dataPratica;
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

	public String getNumeroControle() {
		return this.numeroControle;
	}
	public void setNumeroControle(String numeroControle) {
		this.numeroControle = numeroControle;
	}

	public String getTabela() {
		return this.tabela;
	}
	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getItem() {
		return this.item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	public String getSubItem() {
		return this.subItem;
	}
	public void setSubItem(String subItem) {
		this.subItem = subItem;
	}
	
	public String getDescricaoTab() {
		return this.descricaoTab;
	}
	public void setDescricaoTab(String descricaoTab) {
		this.descricaoTab = descricaoTab;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getComplemento() {
		return this.complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getExcecao() {
		return this.excecao;
	}
	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}

	public BigDecimal getValorCusta() {
		return this.valorCusta;
	}
	public void setValorCusta(BigDecimal valorCusta) {
		this.valorCusta = valorCusta;
	}

	public String getOcorrencia() {
		return this.ocorrencia;
	}
	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

}
