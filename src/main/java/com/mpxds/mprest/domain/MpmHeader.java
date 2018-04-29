package com.mpxds.mprest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_header")
public class MpmHeader extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@ManyToOne
	@JoinColumn(name="mpmRemessa")
	private MpmRemessa mpmRemessa;
	
  	@Column(name = "iden_trans_remetente", nullable = false, length = 3)
	private String idenTransRemetente;	
	
  	@Column(name = "iden_trans_destinatario", nullable = false, length = 3)
	private String idenTransDestinatario;
	
  	@Column(name = "iden_trans_tipo", nullable = false, length = 3)
	private String idenTransTipo;
	
  	@Column(name = "numero_seq_remessa", nullable = false, length = 6)
	private String numeroSeqRemessa;
	
  	@Column(name = "qtd_reg_remessa", nullable = false, length = 4)
	private String qtdRegRemessa;
	
  	@Column(name = "qtd_tit_remessa", nullable = false, length = 4)
	private String qtdTitRemessa;
	
  	@Column(name = "qtd_ind_remessa", nullable = false, length = 4)
	private String qtdIndRemessa;
	
  	@Column(name = "qtd_orig_remessa", nullable = false, length = 4)
	private String qtdOrigRemessa;
	
  	@Column(name = "agencia_centralizadora", nullable = false, length = 6)
	private String agenciaCentralizadora;
	
  	@Column(name = "versao_layout", nullable = false, length = 3)
	private String versaoLayout;
	
  	@Column(name = "complemento_registro", nullable = false, length = 1)
	private String complementoRegistro;
	
  	@Column(name = "numero_seq_registro", nullable = false, length = 4)
	private String numeroSeqRegistro;	
	
	// 
	
	public MpmHeader() {
		//
	}
	
	public MpmHeader(Integer id, MpmRemessa mpmRemessa, String idenTransRemetente, String idenTransDestinatario,
			String idenTransTipo, String numeroSeqRemessa, String qtdRegRemessa, String qtdTitRemessa,
			String qtdIndRemessa, String qtdOrigRemessa, String agenciaCentralizadora, String versaoLayout,
			String complementoRegistro, String numeroSeqRegistro) {
		//
		super();
		
		this.id = id;
		this.mpmRemessa = mpmRemessa;
		this.idenTransRemetente = idenTransRemetente;
		this.idenTransDestinatario = idenTransDestinatario;
		this.idenTransTipo = idenTransTipo;
		this.numeroSeqRemessa = numeroSeqRemessa;
		this.qtdRegRemessa = qtdRegRemessa;
		this.qtdTitRemessa = qtdTitRemessa;
		this.qtdIndRemessa = qtdIndRemessa;
		this.qtdOrigRemessa = qtdOrigRemessa;
		this.agenciaCentralizadora = agenciaCentralizadora;
		this.versaoLayout = versaoLayout;
		this.complementoRegistro = complementoRegistro;
		this.numeroSeqRegistro = numeroSeqRegistro;
	}



	//

	public MpmRemessa getMpmRemessa() { return mpmRemessa; }
	public void setMpmRemessa(MpmRemessa mpmRemessa) { this.mpmRemessa = mpmRemessa; }

	public String getIdenTransRemetente() { return idenTransRemetente; }
	public void setIdenTransRemetente(String idenTransRemetente) { 
														this.idenTransRemetente = idenTransRemetente; }

	public String getIdenTransDestinatario() { return idenTransDestinatario; }
	public void setIdenTransDestinatario(String idenTransDestinatario) { 
														this.idenTransDestinatario = idenTransDestinatario; }

	public String getIdenTransTipo() { return idenTransTipo; }
	public void setIdenTransTipo(String idenTransTipo) { this.idenTransTipo = idenTransTipo; }

	public String getNumeroSeqRemessa() { return numeroSeqRemessa; }
	public void setNumeroSeqRemessa(String numeroSeqRemessa) { this.numeroSeqRemessa = numeroSeqRemessa; }

	public String getQtdRegRemessa() { return qtdRegRemessa; }
	public void setQtdRegRemessa(String qtdRegRemessa) { this.qtdRegRemessa = qtdRegRemessa; }

	public String getQtdTitRemessa() { return qtdTitRemessa; }
	public void setQtdTitRemessa(String qtdTitRemessa) { this.qtdTitRemessa = qtdTitRemessa; }

	public String getQtdIndRemessa() { return qtdIndRemessa; }
	public void setQtdIndRemessa(String qtdIndRemessa) { this.qtdIndRemessa = qtdIndRemessa; }

	public String getQtdOrigRemessa() { return qtdOrigRemessa; }
	public void setQtdOrigRemessa(String qtdOrigRemessa) { this.qtdOrigRemessa = qtdOrigRemessa; }

	public String getAgenciaCentralizadora() { return agenciaCentralizadora; }
	public void setAgenciaCentralizadora(String agenciaCentralizadora) { 
	                                                   this.agenciaCentralizadora = agenciaCentralizadora; }

	public String getVersaoLayout() { return versaoLayout; }
	public void setVersaoLayout(String versaoLayout) { this.versaoLayout = versaoLayout; }

	public String getComplementoRegistro() { return complementoRegistro; }
	public void setComplementoRegistro(String complementoRegistro) { 
														this.complementoRegistro = complementoRegistro; }

	public String getNumeroSeqRegistro() { return numeroSeqRegistro; }
	public void setNumeroSeqRegistro(String numeroSeqRegistro) { this.numeroSeqRegistro = numeroSeqRegistro; }

}
