package com.mpxds.mprest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mpadt_transacao")
public class MpmTransacao extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="mpmRemessa")
	private MpmRemessa mpmRemessa;
	
  	@Column(name = "numero_codigo_portador", nullable = true, length = 3)
	private String numeroCodigoPortador;

  	@Column(name = "agencia_cod_cedente", nullable = true, length = 15)
	private String agenciaCodCedente;
	
  	@Column(name = "nome_ced_fav", nullable = true, length = 45)
	private String nomeCedFav;
	
  	@Column(name = "nome_sacador", nullable = true, length = 45)
	private String nomeSacador;
	
  	@Column(name = "documento_sacador", nullable = true, length = 14)
	private String documentoSacador;
	
  	@Column(name = "endereco_sacador", nullable = true, length = 45)
	private String enderecoSacador;
	
  	@Column(name = "cep_sacador", nullable = true, length = 8)
	private String cepSacador;
	
  	@Column(name = "cidade_sacador", nullable = true, length = 20)
	private String cidadeSacador;
	
  	@Column(name = "uf_sacador", nullable = true, length = 2)
	private String ufSacador;
	
  	@Column(name = "nosso_numero", nullable = true, length = 15)
	private String nossoNumero;
	
  	@Column(name = "especie_titulo", nullable = true, length = 3)
	private String especieTitulo;
	
  	@Column(name = "numero_titulo", nullable = true, length = 11)
	private String numeroTitulo;
	
  	@Column(name = "data_emissao_titulo", nullable = true, length = 10)
	private String dataEmissaoTitulo;
	
  	@Column(name = "data_vencimento_titulo", nullable = true, length = 10)
	private String dataVencimentoTitulo;
	
  	@Column(name = "tipo_moeda", nullable = true, length = 3)
	private String tipoMoeda;
	
  	@Column(name = "valor_titulo", nullable = true, length = 14)
	private String valorTitulo;
	
  	@Column(name = "saldo_titulo", nullable = true, length = 14)
	private String saldoTitulo;
	
  	@Column(name = "praca_pagamento", nullable = true, length = 20)
	private String pracaPagamento;
	
  	@Column(name = "tipo_endosso", nullable = true, length = 1)
	private String tipoEndosso;
	
  	@Column(name = "informacao_aceite", nullable = true, length = 1)
	private String informacaoAceite;
	
  	@Column(name = "numero_controle_devedor", nullable = true, length = 1)
	private String numeroControleDevedor;
	
  	@Column(name = "nome_devedor", nullable = true, length = 45)
	private String nomeDevedor;
	
  	@Column(name = "tipo_ident_devedor", nullable = true, length = 3)
	private String tipoIdentDevedor;
	
  	@Column(name = "numero_ident_devedor", nullable = true, length = 14)
	private String numeroIdentDevedor;
	
  	@Column(name = "documento_devedor", nullable = true, length = 11)
	private String documentoDevedor;
	
  	@Column(name = "endereco_devedor", nullable = true, length = 45)
	private String enderecoDevedor;
	
  	@Column(name = "cep_devedor", nullable = true, length = 8)
	private String cepDevedor;
	
  	@Column(name = "cidade_devedor", nullable = true, length = 20)
	private String cidadeDevedor;
	
  	@Column(name = "uf_devedor", nullable = true, length =2)
	private String ufDevedor;
	
  	@Column(name = "numero_cartorio", nullable = true, length = 2)
	private String numeroCartorio;
	
  	@Column(name = "numero_protocolo_cartorio", nullable = true, length = 10)
	private String numeroProtocoloCartorio;
	
  	@Column(name = "tipo_ocorrencia", nullable = true, length = 1)
	private String tipoOcorrencia;
	
  	@Column(name = "data_protocolo_cartorio", nullable = true, length = 10)
	private String dataProtocoloCartorio;
	
  	@Column(name = "valor_custas_cartorio", nullable = true, length = 14)
	private String valorCustasCartorio;
	
  	@Column(name = "declaracao_portador", nullable = true, length = 1)
	private String declaracaoPortador;
	
  	@Column(name = "data_ocorrencia_cartorio", nullable = true, length = 10)
	private String dataOcorrenciaCartorio;
	
  	@Column(name = "codigo_irregularidade", nullable = true, length = 2)
	private String codigoIrregularidade;
	
  	@Column(name = "bairro_devedor", nullable = true, length = 25)
	private String bairroDevedor;
	
  	@Column(name = "valor_custas_cartorio_dist", nullable = true, length = 14)
	private String valorCustasCartorioDist;
	
  	@Column(name = "nome_portador", nullable = true, length = 45)
	private String nomePortador;
	
  	@Column(name = "numero_distribuicao", nullable = true, length = 7)
	private String numeroDistribuicao;
	
  	@Column(name = "complemento_registro", nullable = true, length = 1)
	private String complementoRegistro;
	
  	@Column(name = "selo_distribuidor", nullable = true, length = 12)
	private String seloDistribuidor;
	
  	@Column(name = "fins_falimentares", nullable = true, length = 1)
	private String finsFAlimentares;
	
  	@Column(nullable = true, length = 1)
	private String convenio;
	
  	@Column(nullable = true, length = 1)
	private String empresa;
	
  	@Column(name = "numero_seq_Registro", nullable = true, length = 4)
	private String numeroSeqRegistro;	
	
  	@Column(name = "tipo_movimento", nullable = true, length = 10)
	private String tipoMovimento;	

	// ---
	
	public MpmTransacao() { 
		//
	}

	public MpmTransacao(Integer id, MpmRemessa mpmRemessa, String numeroCodigoPortador, 
			String agenciaCodCedente, String nomeCedFav,
			String nomeSacador, String documentoSacador, String enderecoSacador, String cepSacador,
			String cidadeSacador, String ufSacador, String nossoNumero, 
			String especieTitulo, String numeroTitulo,
			String dataEmissaoTitulo, String dataVencimentoTitulo, String tipoMoeda, String valorTitulo,
			String saldoTitulo, String pracaPagamento, String tipoEndosso, String informacaoAceite,
			String numeroControleDevedor, String nomeDevedor, String tipoIdentDevedor,
			String numeroIdentDevedor,
			String documentoDevedor, String enderecoDevedor, String cepDevedor,
			String cidadeDevedor, String ufDevedor,
			String numeroCartorio, String numeroProtocoloCartorio, 
			String tipoOcorrencia, String dataProtocoloCartorio,
			String valorCustasCartorio, String declaracaoPortador, String dataOcorrenciaCartorio,
			String codigoIrregularidade, String bairroDevedor, 
			String valorCustasCartorioDist, String nomePortador, 
			String numeroDistribuicao, String complementoRegistro, String seloDistribuidor,
			String finsFAlimentares, String convenio, String empresa,
			String numeroSeqRegistro, String tipoMovimento) {
		//
		super();
		
		this.mpmRemessa = mpmRemessa;
		this.numeroCodigoPortador = numeroCodigoPortador;
		this.agenciaCodCedente = agenciaCodCedente;
		this.nomeCedFav = nomeCedFav;
		this.nomeSacador = nomeSacador;
		this.documentoSacador = documentoSacador;
		this.enderecoSacador = enderecoSacador;
		this.cepSacador = cepSacador;
		this.cidadeSacador = cidadeSacador;
		this.ufSacador = ufSacador;
		this.nossoNumero = nossoNumero;
		this.especieTitulo = especieTitulo;
		this.numeroTitulo = numeroTitulo;
		this.dataEmissaoTitulo = dataEmissaoTitulo;
		this.dataVencimentoTitulo = dataVencimentoTitulo;
		this.tipoMoeda = tipoMoeda;
		this.valorTitulo = valorTitulo;
		this.saldoTitulo = saldoTitulo;
		this.pracaPagamento = pracaPagamento;
		this.tipoEndosso = tipoEndosso;
		this.informacaoAceite = informacaoAceite;
		this.numeroControleDevedor = numeroControleDevedor;
		this.nomeDevedor = nomeDevedor;
		this.tipoIdentDevedor = tipoIdentDevedor;
		this.numeroIdentDevedor = numeroIdentDevedor;
		this.documentoDevedor = documentoDevedor;
		this.enderecoDevedor = enderecoDevedor;
		this.cepDevedor = cepDevedor;
		this.cidadeDevedor = cidadeDevedor;
		this.ufDevedor = ufDevedor;
		this.numeroCartorio = numeroCartorio;
		this.numeroProtocoloCartorio = numeroProtocoloCartorio;
		this.tipoOcorrencia = tipoOcorrencia;
		this.dataProtocoloCartorio = dataProtocoloCartorio;
		this.valorCustasCartorio = valorCustasCartorio;
		this.declaracaoPortador = declaracaoPortador;
		this.dataOcorrenciaCartorio = dataOcorrenciaCartorio;
		this.codigoIrregularidade = codigoIrregularidade;
		this.bairroDevedor = bairroDevedor;
		this.valorCustasCartorioDist = valorCustasCartorioDist;
		this.nomePortador = nomePortador;
		this.numeroDistribuicao = numeroDistribuicao;
		this.complementoRegistro = complementoRegistro;
		this.seloDistribuidor = seloDistribuidor;
		this.finsFAlimentares = finsFAlimentares;
		this.convenio = convenio;
		this.empresa = empresa;
		this.numeroSeqRegistro = numeroSeqRegistro;
		this.tipoMovimento = tipoMovimento;
	}

	// ---	

	public MpmRemessa getMpmRemessa() { return mpmRemessa; }
	public void setMpmRemessa(MpmRemessa mpmRemessa) { this.mpmRemessa = mpmRemessa; }

	public String getNumeroCodigoPortador() { return numeroCodigoPortador; }
	public void setNumeroCodigoPortador(String numeroCodigoPortador) { 
																this.numeroCodigoPortador = numeroCodigoPortador; }

	public String getAgenciaCodCedente() { return agenciaCodCedente; }
	public void setAgenciaCodCedente(String agenciaCodCedente) { this.agenciaCodCedente = agenciaCodCedente; }

	public String getNomeCedFav() { return nomeCedFav; }
	public void setNomeCedFav(String nomeCedFav) { this.nomeCedFav = nomeCedFav; }

	public String getNomeSacador() { return nomeSacador; }
	public void setNomeSacador(String nomeSacador) { this.nomeSacador = nomeSacador; }

	public String getDocumentoSacador() { return documentoSacador; }
	public void setDocumentoSacador(String documentoSacador) { this.documentoSacador = documentoSacador; }

	public String getEnderecoSacador() { return enderecoSacador; }
	public void setEnderecoSacador(String enderecoSacador) { this.enderecoSacador = enderecoSacador; }

	public String getCepSacador() { return cepSacador; }
	public void setCepSacador(String cepSacador) { this.cepSacador = cepSacador; }

	public String getCidadeSacador() { return cidadeSacador; }
	public void setCidadeSacador(String cidadeSacador) { this.cidadeSacador = cidadeSacador; }

	public String getUfSacador() { return ufSacador; }
	public void setUfSacador(String ufSacador) { this.ufSacador = ufSacador; }

	public String getNossoNumero() { return nossoNumero; }
	public void setNossoNumero(String nossoNumero) { this.nossoNumero = nossoNumero; }

	public String getEspecieTitulo() { return especieTitulo; }
	public void setEspecieTitulo(String especieTitulo) { this.especieTitulo = especieTitulo; }

	public String getNumeroTitulo() { return numeroTitulo; }
	public void setNumeroTitulo(String numeroTitulo) { this.numeroTitulo = numeroTitulo; }

	public String getDataEmissaoTitulo() { return dataEmissaoTitulo; }
	public void setDataEmissaoTitulo(String dataEmissaoTitulo) { this.dataEmissaoTitulo = dataEmissaoTitulo; }

	public String getDataVencimentoTitulo() { return dataVencimentoTitulo; }
	public void setDataVencimentoTitulo(String dataVencimentoTitulo) { 
															this.dataVencimentoTitulo = dataVencimentoTitulo; }

	public String getTipoMoeda() { return tipoMoeda; }
	public void setTipoMoeda(String tipoMoeda) { this.tipoMoeda = tipoMoeda; }

	public String getValorTitulo() { return valorTitulo; }
	public void setValorTitulo(String valorTitulo) { this.valorTitulo = valorTitulo; }

	public String getSaldoTitulo() { return saldoTitulo; }
	public void setSaldoTitulo(String saldoTitulo) { this.saldoTitulo = saldoTitulo; }

	public String getPracaPagamento() { return pracaPagamento; }
	public void setPracaPagamento(String pracaPagamento) { this.pracaPagamento = pracaPagamento; }

	public String getTipoEndosso() { return tipoEndosso; }
	public void setTipoEndosso(String tipoEndosso) { this.tipoEndosso = tipoEndosso; }

	public String getInformacaoAceite() { return informacaoAceite; }
	public void setInformacaoAceite(String informacaoAceite) { this.informacaoAceite = informacaoAceite; }

	public String getNumeroControleDevedor() { return numeroControleDevedor; }
	public void setNumeroControleDevedor(String numeroControleDevedor) { 
														this.numeroControleDevedor = numeroControleDevedor;	}

	public String getNomeDevedor() { return nomeDevedor; }
	public void setNomeDevedor(String nomeDevedor) { this.nomeDevedor = nomeDevedor; }

	public String getTipoIdentDevedor() { return tipoIdentDevedor; }
	public void setTipoIdentDevedor(String tipoIdentDevedor) { this.tipoIdentDevedor = tipoIdentDevedor; }

	public String getNumeroIdentDevedor() { return numeroIdentDevedor; }
	public void setNumeroIdentDevedor(String numeroIdentDevedor) { 
															this.numeroIdentDevedor = numeroIdentDevedor; }

	public String getDocumentoDevedor() { return documentoDevedor; }
	public void setDocumentoDevedor(String documentoDevedor) { this.documentoDevedor = documentoDevedor; }

	public String getEnderecoDevedor() { return enderecoDevedor; }
	public void setEnderecoDevedor(String enderecoDevedor) { this.enderecoDevedor = enderecoDevedor; }

	public String getCepDevedor() { return cepDevedor; }
	public void setCepDevedor(String cepDevedor) { this.cepDevedor = cepDevedor; }

	public String getCidadeDevedor() { return cidadeDevedor;}
	public void setCidadeDevedor(String cidadeDevedor) { this.cidadeDevedor = cidadeDevedor; }

	public String getUfDevedor() { return ufDevedor; }
	public void setUfDevedor(String ufDevedor) { this.ufDevedor = ufDevedor; }

	public String getNumeroCartorio() { return numeroCartorio; }
	public void setNumeroCartorio(String numeroCartorio) { this.numeroCartorio = numeroCartorio; }

	public String getNumeroProtocoloCartorio() { return numeroProtocoloCartorio; }
	public void setNumeroProtocoloCartorio(String numeroProtocoloCartorio) { 
													this.numeroProtocoloCartorio = numeroProtocoloCartorio;	}

	public String getTipoOcorrencia() { return tipoOcorrencia; }
	public void setTipoOcorrencia(String tipoOcorrencia) { this.tipoOcorrencia = tipoOcorrencia; }

	public String getDataProtocoloCartorio() { return dataProtocoloCartorio; }
	public void setDataProtocoloCartorio(String dataProtocoloCartorio) { 
															this.dataProtocoloCartorio = dataProtocoloCartorio; }

	public String getValorCustasCartorio() { return valorCustasCartorio; }
	public void setValorCustasCartorio(String valorCustasCartorio) { 
															this.valorCustasCartorio = valorCustasCartorio; }

	public String getDeclaracaoPortador() { return declaracaoPortador; }
	public void setDeclaracaoPortador(String declaracaoPortador) { 
															this.declaracaoPortador = declaracaoPortador; }

	public String getDataOcorrenciaCartorio() {	return dataOcorrenciaCartorio; }
	public void setDataOcorrenciaCartorio(String dataOcorrenciaCartorio) {
														this.dataOcorrenciaCartorio = dataOcorrenciaCartorio; }

	public String getCodigoIrregularidade() { return codigoIrregularidade; }
	public void setCodigoIrregularidade(String codigoIrregularidade) { 
															this.codigoIrregularidade = codigoIrregularidade; }

	public String getBairroDevedor() { return bairroDevedor; }
	public void setBairroDevedor(String bairroDevedor) { this.bairroDevedor = bairroDevedor; }

	public String getValorCustasCartorioDist() { return valorCustasCartorioDist; }
	public void setValorCustasCartorioDist(String valorCustasCartorioDist) {
													this.valorCustasCartorioDist = valorCustasCartorioDist; }

	public String getNomePortador() { return nomePortador; }
	public void setNomePortador(String nomePortador) { this.nomePortador = nomePortador; }

	public String getNumeroDistribuicao() { return numeroDistribuicao; }
	public void setNumeroDistribuicao(String numeroDistribuicao) { this.numeroDistribuicao = numeroDistribuicao; }

	public String getComplementoRegistro() { return complementoRegistro; }
	public void setComplementoRegistro(String complementoRegistro) { 
																this.complementoRegistro = complementoRegistro;	}

	public String getSeloDistribuidor() { return seloDistribuidor; }
	public void setSeloDistribuidor(String seloDistribuidor) { this.seloDistribuidor = seloDistribuidor; }

	public String getFinsFAlimentares() { return finsFAlimentares; }
	public void setFinsFAlimentares(String finsFAlimentares) { this.finsFAlimentares = finsFAlimentares; }

	public String getConvenio() { return convenio; }
	public void setConvenio(String convenio) { this.convenio = convenio; }

	public String getEmpresa() { return empresa; }
	public void setEmpresa(String empresa) { this.empresa = empresa; }

	public String getNumeroSeqRegistro() { return numeroSeqRegistro; }
	public void setNumeroSeqRegistro(String numeroSeqRegistro) { this.numeroSeqRegistro = numeroSeqRegistro; }

	public String getTipoMovimento() { return tipoMovimento; }
	public void setTipoMovimento(String tipoMovimento) { this.tipoMovimento = tipoMovimento; }

}
