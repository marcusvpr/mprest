package com.mpxds.mprest.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_custas_composicao", indexes = { // Verificar com PRISCO ???
		@Index(name = "index_mpadt_custas_composicao_mpmanoref_tabitsubit_descr",
			columnList = "mpmAnoReferencia_id, codigo_ato, tabela, item, subitem, descricao", unique = true)})
public class MpmCustasComposicao extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@ManyToOne
	@JoinColumn(name="mpmAnoReferencia_id")
	private MpmAnoReferencia mpmAnoReferencia; 

	@Column(nullable = false, length = 4)
	private String tabela;
	
	@Column(nullable = false, length = 4)
	private String item;

	@Column(nullable = false, length = 4)
	private String subItem;

	@Column(nullable = true, length = 35)
	private String descricao;

	@Column(nullable = true, length = 20)
	private String complemento;

	@Column(nullable = true, length = 50)
	private String excessao;

	@Column(name = "valor_custa", nullable = true, precision = 6, scale = 2)
	@NumberFormat(pattern = "###,##0.00")
	private BigDecimal valorCusta;

	@Column(name = "codigo_ato", nullable = true, length = 4)
	private String codigoAto;

	@Column(name = "codigo_ato_c", nullable = true, length = 4)
	private String codigoAtoc;

	@Column(nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "###,###,##0.00")
	private BigDecimal de;

	@Column(nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "###,###,##0.00")
	private BigDecimal ate;

	@Column(name = "ano_tab_it_subit", nullable = true, length = 100)
	private String anoTabItSubIt;

	@Column(name = "id_clone", nullable = true)
	private Integer idClone;

	@JsonIgnore
	@OneToMany(mappedBy="mpmCustasComposicao")
	private List<MpmAtoComposicao> mpmAtoComposicaos = new ArrayList<>();
	
	//

	public MpmCustasComposicao() {
		//
	}

	public MpmCustasComposicao(Integer id, MpmAnoReferencia mpmAnoReferencia, String tabela, String item,
			String subItem, String descricao, String complemento, String excessao, BigDecimal valorCusta,
			String codigoAto, String codigoAtoc, BigDecimal de, BigDecimal ate,
			String anoTabItSubIt, Integer idClone) {
		//
		super();
		
		this.id = id;
		this.mpmAnoReferencia = mpmAnoReferencia;
		this.tabela = tabela;
		this.item = item;
		this.subItem = subItem;
		this.descricao = descricao;
		this.complemento = complemento;
		this.excessao = excessao;
		this.valorCusta = valorCusta;
		this.codigoAto = codigoAto;
		this.codigoAtoc = codigoAtoc;
		this.de = de;
		this.ate = ate;
		this.anoTabItSubIt = anoTabItSubIt; // Funcão ????
		this.idClone = idClone;
	}

	public MpmAnoReferencia getMpmAnoReferencia() {
		return this.mpmAnoReferencia;
	}
	public void setMpmAnoReferencia(MpmAnoReferencia mpmAnoReferencia) {
		this.mpmAnoReferencia = mpmAnoReferencia;
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

	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getComplemento() {
		return this.complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getExcessao() {
		return this.excessao;
	}
	public void setExcessao(String excessao) {
		this.excessao = excessao;
	}

	public BigDecimal getValorCusta() {
		return this.valorCusta;
	}
	public void setValorCusta(BigDecimal valorCusta) {
		this.valorCusta = valorCusta;
	}

	public String getCodigoAto() {
		return this.codigoAto;
	}
	public void setCodigoAto(String codigoAto) {
		this.codigoAto = codigoAto;
	}

	public String getCodigoAtoc() {
		return this.codigoAtoc;
	}
	public void setCodigoAtoc(String codigoAtoc) {
		this.codigoAtoc = codigoAtoc;
	}

	public BigDecimal getDe() {
		return this.de;
	}
	public void setDe(BigDecimal de) {
		this.de = de;
	}

	public BigDecimal getAte() {
		return this.ate;
	}
	public void setAte(BigDecimal ate) {
		this.ate = ate;
	}

	public String getAnoTabItSubIt() {
		return this.anoTabItSubIt;
	}
	public void setAnoTabItSubIt(String anoTabItSubIt) {
		this.anoTabItSubIt = anoTabItSubIt;
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
