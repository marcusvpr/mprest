package com.mpxds.mprest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mpadt_trailler")
public class MpmTrailler extends MpEntity {
	//
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="mpmRemessa")
	private MpmRemessa mpmRemessa;
	
  	@Column(name = "data_distribuicao", nullable = false, length = 8)
	private String dataDistribuicao;

  	@Column(name = "soma_seg_qtd_remessa", nullable = false, length = 15)
  	private String somaSegQtdRemessa;
	
  	@Column(name = "soma_seg_val_remessa", nullable = false, length = 18)
  	private String somaSegValRemessa;
	
  	@Column(name = "complemento_registro", nullable = false, length = 1)
  	private String complementoRegistro;
	
  	@Column(name = "numero_seq_registro", nullable = false, length = 4)
  	private String numeroSeqRegistro;
	
  	@Column(name = "tipo_movimento", nullable = true, length = 10)
	private String tipoMovimento;	

	// ----------
	
	public MpmTrailler() {
		//
	}

  	public MpmTrailler(Integer id, MpmRemessa mpmRemessa
             , String dataDistribuicao
             , String somaSegQtdRemessa
             , String somaSegValRemessa
             , String complementoRegistro
             , String numeroSeqRegistro
             , String tipoMovimento
             ) {
		//
		super();
		
		this.id = id;
  		this.mpmRemessa = mpmRemessa;
  		this.dataDistribuicao = dataDistribuicao;
  		this.somaSegQtdRemessa = somaSegQtdRemessa;
  		this.somaSegValRemessa = somaSegValRemessa;
  		this.complementoRegistro = complementoRegistro;
  		this.numeroSeqRegistro = numeroSeqRegistro;
		this.tipoMovimento = tipoMovimento;
  	}
  	
  	// ---

	public MpmRemessa getMpmRemessa() { return mpmRemessa; }
	public void setMpmRemessa(MpmRemessa mpmRemessa) { this.mpmRemessa = mpmRemessa; }

	public String getDataDistribuicao() { return dataDistribuicao; }
	public void setDataDistribuicao(String dataDistribuicao) { this.dataDistribuicao = dataDistribuicao; }

	public String getSomaSegQtdRemessa() { return somaSegQtdRemessa; }
	public void setSomaSegQtdRemessa(String somaSegQtdRemessa) { this.somaSegQtdRemessa = somaSegQtdRemessa; }

	public String getSomaSegValRemessa() { return somaSegValRemessa; }
	public void setSomaSegValRemessa(String somaSegValRemessa) { this.somaSegValRemessa = somaSegValRemessa; }

	public String getComplementoRegistro() { return complementoRegistro; }
	public void setComplementoRegistro(String complementoRegistro) { 
															this.complementoRegistro = complementoRegistro; }

	public String getNumeroSeqRegistro() { return numeroSeqRegistro; } 
	public void setNumeroSeqRegistro(String numeroSeqRegistro) { this.numeroSeqRegistro = numeroSeqRegistro; }

	public String getTipoMovimento() { return tipoMovimento; }
	public void setTipoMovimento(String tipoMovimento) { this.tipoMovimento = tipoMovimento; }
   	  	
}
