package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.mpxds.mprest.domain.enums.MpTipoCampo;

@Entity
@Table(name="mpadt_sistema_config", indexes = {
		@Index(name = "index_mpadt_sistema_config_parametro", columnList = "parametro", unique = true)})
public class MpSistemaConfig extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 100)
	private String parametro; 

	private String descricao;
	
	@NotNull(message = "Por favor, informe o TIPO CAMPO")
	@Column(nullable = false)
	private MpTipoCampo mpTipoCampo = MpTipoCampo.T ;
	
	@NotNull(message = "Por favor, informe o VALOR t")
	@Column(nullable = false, length = 1000)
	private String valorT = "";

	@NotNull(message = "Por favor, informe o VALOR n")
	@Column(nullable = false)
	private Integer valorN = 0;
	
	@NotNull(message = "Por favor, informe o VALOR b")
	@Column(name = "ind_valor", nullable = false)
	private Boolean indValor = false;

	// ---
	
	public MpSistemaConfig() {
		//
	}

	public MpSistemaConfig(Integer id
						, String parametro
						, String descricao
						, MpTipoCampo mpTipoCampo
						, String valorT
						, Integer valorN
						, Boolean indValor) {
		//
		super();
		 
		this.id = id;
		this.parametro = parametro;
		this.descricao = descricao;
		this.mpTipoCampo = mpTipoCampo;
		this.valorT = valorT;
		this.valorN = valorN;
		this.indValor = indValor;
	}

	public String getParametro() { return this.parametro; }
	public void setParametro(String newParametro) { this.parametro = newParametro; }

	public String getDescricao() { return this.descricao; }
	public void setDescricao(String newDescricao) { this.descricao = newDescricao; }

	public MpTipoCampo getMpTipoCampo() { return this.mpTipoCampo; }
	public void setMpTipoCampo(MpTipoCampo newMpTipoCampo) { this.mpTipoCampo = newMpTipoCampo; }

	public String getValorT() { return this.valorT; }
	public void setValorT(String newValorT) { this.valorT = newValorT; }

	public Integer getValorN() { return this.valorN; }
	public void setValorN(Integer newValorN) { this.valorN = newValorN; }

	public Boolean getIndValor() { return this.indValor; }
	public void setIndValor(Boolean newIndValor) { this.indValor = newIndValor; }

	@Transient
	public String getValor() {
		//
		if (this.mpTipoCampo.equals(MpTipoCampo.T))
			return this.valorT.trim();

		if (this.mpTipoCampo.equals(MpTipoCampo.N))
			return "" + this.valorN;

		return "" + this.indValor;
	}

	@Transient
	public String getParametroValor() {
		//
		if (this.mpTipoCampo.equals(MpTipoCampo.T))
			return this.parametro.trim() + " / " + this.valorT.trim();

		if (this.mpTipoCampo.equals(MpTipoCampo.N))
			return this.parametro.trim() + " / " + this.valorN;

		return this.parametro.trim() + " / " + this.indValor;
	}

}
