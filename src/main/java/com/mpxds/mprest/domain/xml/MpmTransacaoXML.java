package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Transacao")
public class MpmTransacaoXML {
	//
	private String xDataImportar;
	private String xNomeArquivo;
	private String xIdentificacaoRegistro;
	private String xNumeroCodigoPortador;
	private String xAgenciaCodCedente;
	private String xNomeCedFav;
	private String xNomSacador;
	private String xDocumentoSacador;
	private String xEnderecSacador;
	private String xCeSacador;
	private String xCidadSacador;
	private String xUSacador;
	private String xNossoNumero;
	private String xEspecieTitulo;
	private String xNumeroTitulo;
	private String xDataEmissaoTitulo;
	private String xDataVencimentoTitulo;
	private String xTipoMoeda;
	private String xValorTitulo;
	private String xSaldoTitulo;
	private String xPracaPagamento;
	private String xTipoEndosso;
	private String xInformacaoAceite;
	private String xNumeroControleDevedor;
	private String xNomeDevedor;
	private String xTipoIdentDevedor;
	private String xNumeroIdentDevedor;
	private String xDocumentoDevedor;
	private String xEnderecoDevedor;
	private String xCepDevedor;
	private String xCidadeDevedor;
	private String xUfDevedor;
	private String xNumeroCartorio;
	private String xNumeroProtocoloCartorio;
	private String xTipoOcorrencia;
	private String xDataProtocoloCartorio;
	private String xValorCustasCartorio;
	private String xDeclaracaoPortador;
	private String xDataOcorrenciaCartorio;
	private String xCodigoIrregularidade;
	private String xBairroDevedor;
	private String xValorCustasCartorioDist;
	private String xNomePortador;
	private String xNumeroDistribuicao;
	private String xComplementoRegistro;
	private String xSeloDistribuidor;
	private String xFinsFalimentares;
	private String xConvenio;
	private String xEmpresa;
	private String xNumeroSeqRegistro;
	
	//
	
	@XmlElement(name="DataImportar")
	public String getxDataImportar() {
		return xDataImportar;
	}
	public void setxDataImportar(String xDataImportar) {
		this.xDataImportar = xDataImportar;
	}
	
	@XmlElement(name="NomeArquivo")
	public String getxNomeArquivo() {
		return xNomeArquivo;
	}
	public void setxNomeArquivo(String xNomeArquivo) {
		this.xNomeArquivo = xNomeArquivo;
	}
	
	@XmlElement(name="IdentificacaoRegistro")
	public String getxIdentificacaoRegistro() {
		return xIdentificacaoRegistro;
	}
	public void setxIdentificacaoRegistro(String xIdentificacaoRegistro) {
		this.xIdentificacaoRegistro = xIdentificacaoRegistro;
	}
	
	@XmlElement(name="NumeroCodigoPortador")
	public String getxNumeroCodigoPortador() {
		return xNumeroCodigoPortador;
	}
	public void setxNumeroCodigoPortador(String xNumeroCodigoPortador) {
		this.xNumeroCodigoPortador = xNumeroCodigoPortador;
	}
	
	@XmlElement(name="AgenciaCodCedente")
	public String getxAgenciaCodCedente() {
		return xAgenciaCodCedente;
	}
	public void setxAgenciaCodCedente(String xAgenciaCodCedente) {
		this.xAgenciaCodCedente = xAgenciaCodCedente;
	}
	
	@XmlElement(name="NomeCedFav")
	public String getxNomeCedFav() {
		return xNomeCedFav;
	}
	public void setxNomeCedFav(String xNomeCedFav) {
		this.xNomeCedFav = xNomeCedFav;
	}
	
	@XmlElement(name="NomSacador")
	public String getxNomSacador() {
		return xNomSacador;
	}
	public void setxNomSacador(String xNomSacador) {
		this.xNomSacador = xNomSacador;
	}
	
	@XmlElement(name="DocumentoSacador")
	public String getxDocumentoSacador() {
		return xDocumentoSacador;
	}
	public void setxDocumentoSacador(String xDocumentoSacador) {
		this.xDocumentoSacador = xDocumentoSacador;
	}
	
	@XmlElement(name="EnderecSacador")
	public String getxEnderecSacador() {
		return xEnderecSacador;
	}
	public void setxEnderecSacador(String xEnderecSacador) {
		this.xEnderecSacador = xEnderecSacador;
	}
	
	@XmlElement(name="CeSacador")
	public String getxCeSacador() {
		return xCeSacador;
	}
	public void setxCeSacador(String xCeSacador) {
		this.xCeSacador = xCeSacador;
	}
	
	@XmlElement(name="CidadSacador")
	public String getxCidadSacador() {
		return xCidadSacador;
	}
	public void setxCidadSacador(String xCidadSacador) {
		this.xCidadSacador = xCidadSacador;
	}
	
	@XmlElement(name="USacador")
	public String getxUSacador() {
		return xUSacador;
	}
	public void setxUSacador(String xUSacador) {
		this.xUSacador = xUSacador;
	}
	
	@XmlElement(name="NossoNumero")
	public String getxNossoNumero() {
		return xNossoNumero;
	}
	public void setxNossoNumero(String xNossoNumero) {
		this.xNossoNumero = xNossoNumero;
	}
	
	@XmlElement(name="EspecieTitulo")
	public String getxEspecieTitulo() {
		return xEspecieTitulo;
	}
	public void setxEspecieTitulo(String xEspecieTitulo) {
		this.xEspecieTitulo = xEspecieTitulo;
	}
	
	@XmlElement(name="NumeroTitulo")
	public String getxNumeroTitulo() {
		return xNumeroTitulo;
	}
	public void setxNumeroTitulo(String xNumeroTitulo) {
		this.xNumeroTitulo = xNumeroTitulo;
	}
	
	@XmlElement(name="DataEmissaoTitulo")
	public String getxDataEmissaoTitulo() {
		return xDataEmissaoTitulo;
	}
	public void setxDataEmissaoTitulo(String xDataEmissaoTitulo) {
		this.xDataEmissaoTitulo = xDataEmissaoTitulo;
	}
	
	@XmlElement(name="DataVencimentoTitulo")
	public String getxDataVencimentoTitulo() {
		return xDataVencimentoTitulo;
	}
	public void setxDataVencimentoTitulo(String xDataVencimentoTitulo) {
		this.xDataVencimentoTitulo = xDataVencimentoTitulo;
	}
	
	@XmlElement(name="TipoMoeda")
	public String getxTipoMoeda() {
		return xTipoMoeda;
	}
	public void setxTipoMoeda(String xTipoMoeda) {
		this.xTipoMoeda = xTipoMoeda;
	}
	
	@XmlElement(name="ValorTitulo")
	public String getxValorTitulo() {
		return xValorTitulo;
	}
	public void setxValorTitulo(String xValorTitulo) {
		this.xValorTitulo = xValorTitulo;
	}
	
	@XmlElement(name="SaldoTitulo")
	public String getxSaldoTitulo() {
		return xSaldoTitulo;
	}
	public void setxSaldoTitulo(String xSaldoTitulo) {
		this.xSaldoTitulo = xSaldoTitulo;
	}
	
	@XmlElement(name="PracaPagamento")
	public String getxPracaPagamento() {
		return xPracaPagamento;
	}
	public void setxPracaPagamento(String xPracaPagamento) {
		this.xPracaPagamento = xPracaPagamento;
	}
	
	@XmlElement(name="TipoEndosso")
	public String getxTipoEndosso() {
		return xTipoEndosso;
	}
	public void setxTipoEndosso(String xTipoEndosso) {
		this.xTipoEndosso = xTipoEndosso;
	}
	
	@XmlElement(name="InformacaoAceite")
	public String getxInformacaoAceite() {
		return xInformacaoAceite;
	}
	public void setxInformacaoAceite(String xInformacaoAceite) {
		this.xInformacaoAceite = xInformacaoAceite;
	}
	
	@XmlElement(name="NumeroControleDevedor")
	public String getxNumeroControleDevedor() {
		return xNumeroControleDevedor;
	}
	public void setxNumeroControleDevedor(String xNumeroControleDevedor) {
		this.xNumeroControleDevedor = xNumeroControleDevedor;
	}
	
	@XmlElement(name="NomeDevedor")
	public String getxNomeDevedor() {
		return xNomeDevedor;
	}
	public void setxNomeDevedor(String xNomeDevedor) {
		this.xNomeDevedor = xNomeDevedor;
	}
	
	@XmlElement(name="TipoIdentDevedor")
	public String getxTipoIdentDevedor() {
		return xTipoIdentDevedor;
	}
	public void setxTipoIdentDevedor(String xTipoIdentDevedor) {
		this.xTipoIdentDevedor = xTipoIdentDevedor;
	}
	
	@XmlElement(name="NumeroIdentDevedor")
	public String getxNumeroIdentDevedor() {
		return xNumeroIdentDevedor;
	}
	public void setxNumeroIdentDevedor(String xNumeroIdentDevedor) {
		this.xNumeroIdentDevedor = xNumeroIdentDevedor;
	}
	
	@XmlElement(name="DocumentoDevedor")
	public String getxDocumentoDevedor() {
		return xDocumentoDevedor;
	}
	public void setxDocumentoDevedor(String xDocumentoDevedor) {
		this.xDocumentoDevedor = xDocumentoDevedor;
	}
	
	@XmlElement(name="EnderecoDevedor")
	public String getxEnderecoDevedor() {
		return xEnderecoDevedor;
	}
	public void setxEnderecoDevedor(String xEnderecoDevedor) {
		this.xEnderecoDevedor = xEnderecoDevedor;
	}
	
	@XmlElement(name="CepDevedor")
	public String getxCepDevedor() {
		return xCepDevedor;
	}
	public void setxCepDevedor(String xCepDevedor) {
		this.xCepDevedor = xCepDevedor;
	}
	
	@XmlElement(name="CidadeDevedor")
	public String getxCidadeDevedor() {
		return xCidadeDevedor;
	}
	public void setxCidadeDevedor(String xCidadeDevedor) {
		this.xCidadeDevedor = xCidadeDevedor;
	}
	
	@XmlElement(name="UfDevedor")
	public String getxUfDevedor() {
		return xUfDevedor;
	}
	public void setxUfDevedor(String xUfDevedor) {
		this.xUfDevedor = xUfDevedor;
	}
	
	@XmlElement(name="NumeroCartorio")
	public String getxNumeroCartorio() {
		return xNumeroCartorio;
	}
	public void setxNumeroCartorio(String xNumeroCartorio) {
		this.xNumeroCartorio = xNumeroCartorio;
	}
	
	@XmlElement(name="NumeroProtocoloCartorio")
	public String getxNumeroProtocoloCartorio() {
		return xNumeroProtocoloCartorio;
	}
	public void setxNumeroProtocoloCartorio(String xNumeroProtocoloCartorio) {
		this.xNumeroProtocoloCartorio = xNumeroProtocoloCartorio;
	}
	
	@XmlElement(name="TipoOcorrencia")
	public String getxTipoOcorrencia() {
		return xTipoOcorrencia;
	}
	public void setxTipoOcorrencia(String xTipoOcorrencia) {
		this.xTipoOcorrencia = xTipoOcorrencia;
	}
	
	@XmlElement(name="DataProtocoloCartorio")
	public String getxDataProtocoloCartorio() {
		return xDataProtocoloCartorio;
	}
	public void setxDataProtocoloCartorio(String xDataProtocoloCartorio) {
		this.xDataProtocoloCartorio = xDataProtocoloCartorio;
	}
	
	@XmlElement(name="ValorCustasCartorio")
	public String getxValorCustasCartorio() {
		return xValorCustasCartorio;
	}
	public void setxValorCustasCartorio(String xValorCustasCartorio) {
		this.xValorCustasCartorio = xValorCustasCartorio;
	}
	
	@XmlElement(name="DeclaracaoPortador")
	public String getxDeclaracaoPortador() {
		return xDeclaracaoPortador;
	}
	public void setxDeclaracaoPortador(String xDeclaracaoPortador) {
		this.xDeclaracaoPortador = xDeclaracaoPortador;
	}
	
	@XmlElement(name="DataOcorrenciaCartorio")
	public String getxDataOcorrenciaCartorio() {
		return xDataOcorrenciaCartorio;
	}
	public void setxDataOcorrenciaCartorio(String xDataOcorrenciaCartorio) {
		this.xDataOcorrenciaCartorio = xDataOcorrenciaCartorio;
	}
	
	@XmlElement(name="CodigoIrregularidade")
	public String getxCodigoIrregularidade() {
		return xCodigoIrregularidade;
	}
	public void setxCodigoIrregularidade(String xCodigoIrregularidade) {
		this.xCodigoIrregularidade = xCodigoIrregularidade;
	}
	
	@XmlElement(name="BairroDevedor")
	public String getxBairroDevedor() {
		return xBairroDevedor;
	}
	public void setxBairroDevedor(String xBairroDevedor) {
		this.xBairroDevedor = xBairroDevedor;
	}
	
	@XmlElement(name="ValorCustasCartorioDist")
	public String getxValorCustasCartorioDist() {
		return xValorCustasCartorioDist;
	}
	public void setxValorCustasCartorioDist(String xValorCustasCartorioDist) {
		this.xValorCustasCartorioDist = xValorCustasCartorioDist;
	}
	
	@XmlElement(name="NomePortador")
	public String getxNomePortador() {
		return xNomePortador;
	}
	public void setxNomePortador(String xNomePortador) {
		this.xNomePortador = xNomePortador;
	}
	
	@XmlElement(name="NumeroDistribuicao")
	public String getxNumeroDistribuicao() {
		return xNumeroDistribuicao;
	}
	public void setxNumeroDistribuicao(String xNumeroDistribuicao) {
		this.xNumeroDistribuicao = xNumeroDistribuicao;
	}
	
	@XmlElement(name="ComplementoRegistro")
	public String getxComplementoRegistro() {
		return xComplementoRegistro;
	}
	public void setxComplementoRegistro(String xComplementoRegistro) {
		this.xComplementoRegistro = xComplementoRegistro;
	}
	
	@XmlElement(name="SeloDistribuidor")
	public String getxSeloDistribuidor() {
		return xSeloDistribuidor;
	}
	public void setxSeloDistribuidor(String xSeloDistribuidor) {
		this.xSeloDistribuidor = xSeloDistribuidor;
	}
	
	@XmlElement(name="FinsFalimentares")
	public String getxFinsFalimentares() {
		return xFinsFalimentares;
	}
	public void setxFinsFalimentares(String xFinsFalimentares) {
		this.xFinsFalimentares = xFinsFalimentares;
	}
	
	@XmlElement(name="Convenio")
	public String getxConvenio() {
		return xConvenio;
	}
	public void setxConvenio(String xConvenio) {
		this.xConvenio = xConvenio;
	}
	
	@XmlElement(name="Empresa")
	public String getxEmpresa() {
		return xEmpresa;
	}
	public void setxEmpresa(String xEmpresa) {
		this.xEmpresa = xEmpresa;
	}
	
	@XmlElement(name="NumeroSeqRegistro")
	public String getxNumeroSeqRegistro() {
		return xNumeroSeqRegistro;
	}
	public void setxNumeroSeqRegistro(String xNumeroSeqRegistro) {
		this.xNumeroSeqRegistro = xNumeroSeqRegistro;
	}
	
	//
	@Override
	public String toString() {
		return "MpmTransacaoXML [xDataImportar=" + xDataImportar + ", xNomeArquivo=" + xNomeArquivo
				+ ", xIdentificacaoRegistro=" + xIdentificacaoRegistro + ", xNumeroCodigoPortador="
				+ xNumeroCodigoPortador + ", xAgenciaCodCedente=" + xAgenciaCodCedente + ", xNomeCedFav=" + xNomeCedFav
				+ ", xNomSacador=" + xNomSacador + ", xDocumentoSacador=" + xDocumentoSacador + ", xEnderecSacador="
				+ xEnderecSacador + ", xCeSacador=" + xCeSacador + ", xCidadSacador=" + xCidadSacador + ", xUSacador="
				+ xUSacador + ", xNossoNumero=" + xNossoNumero + ", xEspecieTitulo=" + xEspecieTitulo
				+ ", xNumeroTitulo=" + xNumeroTitulo + ", xDataEmissaoTitulo=" + xDataEmissaoTitulo
				+ ", xDataVencimentoTitulo=" + xDataVencimentoTitulo + ", xTipoMoeda=" + xTipoMoeda + ", xValorTitulo="
				+ xValorTitulo + ", xSaldoTitulo=" + xSaldoTitulo + ", xPracaPagamento=" + xPracaPagamento
				+ ", xTipoEndosso=" + xTipoEndosso + ", xInformacaoAceite=" + xInformacaoAceite
				+ ", xNumeroControleDevedor=" + xNumeroControleDevedor + ", xNomeDevedor=" + xNomeDevedor
				+ ", xTipoIdentDevedor=" + xTipoIdentDevedor + ", xNumeroIdentDevedor=" + xNumeroIdentDevedor
				+ ", xDocumentoDevedor=" + xDocumentoDevedor + ", xEnderecoDevedor=" + xEnderecoDevedor
				+ ", xCepDevedor=" + xCepDevedor + ", xCidadeDevedor=" + xCidadeDevedor + ", xUfDevedor=" + xUfDevedor
				+ ", xNumeroCartorio=" + xNumeroCartorio + ", xNumeroProtocoloCartorio=" + xNumeroProtocoloCartorio
				+ ", xTipoOcorrencia=" + xTipoOcorrencia + ", xDataProtocoloCartorio=" + xDataProtocoloCartorio
				+ ", xValorCustasCartorio=" + xValorCustasCartorio + ", xDeclaracaoPortador=" + xDeclaracaoPortador
				+ ", xDataOcorrenciaCartorio=" + xDataOcorrenciaCartorio + ", xCodigoIrregularidade="
				+ xCodigoIrregularidade + ", xBairroDevedor=" + xBairroDevedor + ", xValorCustasCartorioDist="
				+ xValorCustasCartorioDist + ", xNomePortador=" + xNomePortador + ", xNumeroDistribuicao="
				+ xNumeroDistribuicao + ", xComplementoRegistro=" + xComplementoRegistro + ", xSeloDistribuidor="
				+ xSeloDistribuidor + ", xFinsFalimentares=" + xFinsFalimentares + ", xConvenio=" + xConvenio
				+ ", xEmpresa=" + xEmpresa + ", xNumeroSeqRegistro=" + xNumeroSeqRegistro + "]";
	}		
	
}
