package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Titulos")
public class MpmTituloXML {
	//
	private String xDt_Protocolo;
	private String xNo_Protocolo;
	private String xDt_Ate;
	private String xCod_Apresentante;
	private String xConvenio;
	private String xEmpresa;
	private String xDt_Distribuicao;
	private String xNo_Distribuicao;
	private String xDt_Emissao;
	private String xDt_Vencto;
	private String xNo_Titulo;
	private String xNo_Banco;
	private String xCod_Endosso;
	private String xAgenciaCedente;
	private String xValor;
	private String xSaldo;
	private String xEsp_Codigo;
	private String xCodigoAlinea;
	private String xTp_Apresentante;
	private String xEdital;
	private String xMicroEmpresa;
	private String xEmolumento;
	private String xDistribuicao;
	private String xLei_489;
	private String xLei_713;
	private String xVl_Variavel;
	private String xFaixa;
	private String xIntimacao;
	private String xCoobrigado;
	private String xDiligencia;
	private String xVl_Edital;
	private String xOutros;
	private String xTot_Emolu;
	private String xTot_Pagar;
	private String xTot_Deposito;
	private String xCco_Deved;
	private String xCco_Aval;
	private String xCco_Endoss;
	private String xCco_Notif;
	private String xCco_EndIgs;
	private String xCco_EndDifs;
	private String xUsr_Titulo;
	private String xDt_Sist_Tit;
	private String xDt_Ocorrencia;
	private String xOco_Codigo;
	private String xNo_Cancelamento;
	private String xDinChq;
	private String xOco_Obs;
	private String xOco_Bloqueia;
	private String xOco_Usr;
	private String xDt_Sist_Oco;
	private String xTit_Chq_Rps;
	private String xTit_Obs1;
	private String xTit_Motivo;
	private String xTit_CustasPg;
	private String xTit_ResIntima;
	private String xTit_ResCorreio;
	private String xTit_DtEdital;
	private String xTit_Intimado;
	private String xTit_Respondido;
	private String xTit_ResSE;
	private String xTit_ResSP;
	private String xTit_VlReembEdital;
	private String xNo_Cliente;
	private String xNomeApresentante;
	private String xEnderecoApresentante;
	private String xNumeroApresentante;
	private String xComplementoApresentante;
	private String xBairroApresentante;
	private String xCidadeApresentante;
	private String xUfApresentante;
	private String xCepApresentante;
	private String xNomeFavorecido;
	private String xEnderecoFavorecido;
	private String xNumeroFavorecido;
	private String xComplementoFavorecido;
	private String xBairroFavorecido;
	private String xCidadeFavorecido;
	private String xUfFavorecido;
	private String xCepFavorecido;
	private String xNomeSacador;
	private String xEnderecoSacador;
	private String xNumeroSacador;
	private String xComplementoSacador;
	private String xBairroSacador;
	private String xCidadeSacador;
	private String xUfSacador;
	private String xCepSacador;
	private String xTp_DoctoApresentante;
	private String xNo_DoctoApresentante;
	private String xTp_DoctoFavorecido;
	private String xNo_DoctoFavorecido;
	private String xTp_DoctoSacador;
	private String xNo_DoctoSacador;
	private String xNo_Livro;
	private String xNo_Folha;
	private String xEncerrado;
	private String xCod_Irregularidade;
	private String xNihil;
	private String xAvista;
	private String xRsDesiste;
	private String xLei4664;
	private String xLei111;
	private String xLei3761;
	private String xTalao_NoLivro;
	private String xConvenio_NoLivro;
	private String xNo_Talao3Ofi;
	private String xAceite;
	private String xFinsFalimentares;
	private String xArquivamento;
	private String xLei6281;
	
	//
	
	@XmlElement(name="Dt_Protocolo")
	public String getxDt_Protocolo() {
		return xDt_Protocolo;
	}
	public void setxDt_Protocolo(String xDt_Protocolo) {
		this.xDt_Protocolo = xDt_Protocolo;
	}
	
	@XmlElement(name="No_Protocolo")
	public String getxNo_Protocolo() {
		return xNo_Protocolo;
	}
	public void setxNo_Protocolo(String xNo_Protocolo) {
		this.xNo_Protocolo = xNo_Protocolo;
	}
	
	@XmlElement(name="Dt_Ate")
	public String getxDt_Ate() {
		return xDt_Ate;
	}
	public void setxDt_Ate(String xDt_Ate) {
		this.xDt_Ate = xDt_Ate;
	}
	
	@XmlElement(name="Cod_Apresentante")
	public String getxCod_Apresentante() {
		return xCod_Apresentante;
	}
	public void setxCod_Apresentante(String xCod_Apresentante) {
		this.xCod_Apresentante = xCod_Apresentante;
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
	
	@XmlElement(name="Dt_Distribuicao")
	public String getxDt_Distribuicao() {
		return xDt_Distribuicao;
	}
	public void setxDt_Distribuicao(String xDt_Distribuicao) {
		this.xDt_Distribuicao = xDt_Distribuicao;
	}
	
	@XmlElement(name="No_Distribuicao")
	public String getxNo_Distribuicao() {
		return xNo_Distribuicao;
	}
	public void setxNo_Distribuicao(String xNo_Distribuicao) {
		this.xNo_Distribuicao = xNo_Distribuicao;
	}
	
	@XmlElement(name="Dt_Emissao")
	public String getxDt_Emissao() {
		return xDt_Emissao;
	}
	public void setxDt_Emissao(String xDt_Emissao) {
		this.xDt_Emissao = xDt_Emissao;
	}
	
	@XmlElement(name="Dt_Vencto")
	public String getxDt_Vencto() {
		return xDt_Vencto;
	}
	public void setxDt_Vencto(String xDt_Vencto) {
		this.xDt_Vencto = xDt_Vencto;
	}
	
	@XmlElement(name="No_Titulo")
	public String getxNo_Titulo() {
		return xNo_Titulo;
	}
	public void setxNo_Titulo(String xNo_Titulo) {
		this.xNo_Titulo = xNo_Titulo;
	}
	
	@XmlElement(name="No_Banco")
	public String getxNo_Banco() {
		return xNo_Banco;
	}
	public void setxNo_Banco(String xNo_Banco) {
		this.xNo_Banco = xNo_Banco;
	}
	
	@XmlElement(name="Cod_Endosso")
	public String getxCod_Endosso() {
		return xCod_Endosso;
	}
	public void setxCod_Endosso(String xCod_Endosso) {
		this.xCod_Endosso = xCod_Endosso;
	}
	
	@XmlElement(name="AgenciaCedente")
	public String getxAgenciaCedente() {
		return xAgenciaCedente;
	}
	public void setxAgenciaCedente(String xAgenciaCedente) {
		this.xAgenciaCedente = xAgenciaCedente;
	}
	
	@XmlElement(name="Valor")
	public String getxValor() {
		return xValor;
	}
	public void setxValor(String xValor) {
		this.xValor = xValor;
	}
	
	@XmlElement(name="Saldo")
	public String getxSaldo() {
		return xSaldo;
	}
	public void setxSaldo(String xSaldo) {
		this.xSaldo = xSaldo;
	}
	
	@XmlElement(name="Esp_Codigo")
	public String getxEsp_Codigo() {
		return xEsp_Codigo;
	}
	public void setxEsp_Codigo(String xEsp_Codigo) {
		this.xEsp_Codigo = xEsp_Codigo;
	}
	
	@XmlElement(name="CodigoAlinea")
	public String getxCodigoAlinea() {
		return xCodigoAlinea;
	}
	public void setxCodigoAlinea(String xCodigoAlinea) {
		this.xCodigoAlinea = xCodigoAlinea;
	}
	
	@XmlElement(name="Tp_Apresentante")
	public String getxTp_Apresentante() {
		return xTp_Apresentante;
	}
	public void setxTp_Apresentante(String xTp_Apresentante) {
		this.xTp_Apresentante = xTp_Apresentante;
	}
	
	@XmlElement(name="Edital")
	public String getxEdital() {
		return xEdital;
	}
	public void setxEdital(String xEdital) {
		this.xEdital = xEdital;
	}
	
	@XmlElement(name="MicroEmpresa")
	public String getxMicroEmpresa() {
		return xMicroEmpresa;
	}
	public void setxMicroEmpresa(String xMicroEmpresa) {
		this.xMicroEmpresa = xMicroEmpresa;
	}
	
	@XmlElement(name="Emolumento")
	public String getxEmolumento() {
		return xEmolumento;
	}
	public void setxEmolumento(String xEmolumento) {
		this.xEmolumento = xEmolumento;
	}
	
	@XmlElement(name="Distribuicao")
	public String getxDistribuicao() {
		return xDistribuicao;
	}
	public void setxDistribuicao(String xDistribuicao) {
		this.xDistribuicao = xDistribuicao;
	}
	
	@XmlElement(name="Lei_489")
	public String getxLei_489() {
		return xLei_489;
	}
	public void setxLei_489(String xLei_489) {
		this.xLei_489 = xLei_489;
	}
	
	@XmlElement(name="Lei_713")
	public String getxLei_713() {
		return xLei_713;
	}
	public void setxLei_713(String xLei_713) {
		this.xLei_713 = xLei_713;
	}
	
	@XmlElement(name="Vl_Variavel")
	public String getxVl_Variavel() {
		return xVl_Variavel;
	}
	public void setxVl_Variavel(String xVl_Variavel) {
		this.xVl_Variavel = xVl_Variavel;
	}
	
	@XmlElement(name="Faixa")
	public String getxFaixa() {
		return xFaixa;
	}
	public void setxFaixa(String xFaixa) {
		this.xFaixa = xFaixa;
	}
	
	@XmlElement(name="Intimacao")
	public String getxIntimacao() {
		return xIntimacao;
	}
	public void setxIntimacao(String xIntimacao) {
		this.xIntimacao = xIntimacao;
	}
	
	@XmlElement(name="Coobrigado")
	public String getxCoobrigado() {
		return xCoobrigado;
	}
	public void setxCoobrigado(String xCoobrigado) {
		this.xCoobrigado = xCoobrigado;
	}
	
	@XmlElement(name="Diligencia")
	public String getxDiligencia() {
		return xDiligencia;
	}
	public void setxDiligencia(String xDiligencia) {
		this.xDiligencia = xDiligencia;
	}
	
	@XmlElement(name="Vl_Edital")
	public String getxVl_Edital() {
		return xVl_Edital;
	}
	public void setxVl_Edital(String xVl_Edital) {
		this.xVl_Edital = xVl_Edital;
	}
	
	@XmlElement(name="Outros")
	public String getxOutros() {
		return xOutros;
	}
	public void setxOutros(String xOutros) {
		this.xOutros = xOutros;
	}
	
	@XmlElement(name="Tot_Emolu")
	public String getxTot_Emolu() {
		return xTot_Emolu;
	}
	public void setxTot_Emolu(String xTot_Emolu) {
		this.xTot_Emolu = xTot_Emolu;
	}
	
	@XmlElement(name="Tot_Pagar")
	public String getxTot_Pagar() {
		return xTot_Pagar;
	}
	public void setxTot_Pagar(String xTot_Pagar) {
		this.xTot_Pagar = xTot_Pagar;
	}
	
	@XmlElement(name="Tot_Deposito")
	public String getxTot_Deposito() {
		return xTot_Deposito;
	}
	public void setxTot_Deposito(String xTot_Deposito) {
		this.xTot_Deposito = xTot_Deposito;
	}
	
	@XmlElement(name="Cco_Deved")
	public String getxCco_Deved() {
		return xCco_Deved;
	}
	public void setxCco_Deved(String xCco_Deved) {
		this.xCco_Deved = xCco_Deved;
	}
	
	@XmlElement(name="Cco_Aval")
	public String getxCco_Aval() {
		return xCco_Aval;
	}
	public void setxCco_Aval(String xCco_Aval) {
		this.xCco_Aval = xCco_Aval;
	}
	
	@XmlElement(name="Cco_Endoss")
	public String getxCco_Endoss() {
		return xCco_Endoss;
	}
	public void setxCco_Endoss(String xCco_Endoss) {
		this.xCco_Endoss = xCco_Endoss;
	}
	
	@XmlElement(name="Cco_Notif")
	public String getxCco_Notif() {
		return xCco_Notif;
	}
	public void setxCco_Notif(String xCco_Notif) {
		this.xCco_Notif = xCco_Notif;
	}
	
	@XmlElement(name="Cco_EndIgs")
	public String getxCco_EndIgs() {
		return xCco_EndIgs;
	}
	public void setxCco_EndIgs(String xCco_EndIgs) {
		this.xCco_EndIgs = xCco_EndIgs;
	}
	
	@XmlElement(name="Cco_EndDifs")
	public String getxCco_EndDifs() {
		return xCco_EndDifs;
	}
	public void setxCco_EndDifs(String xCco_EndDifs) {
		this.xCco_EndDifs = xCco_EndDifs;
	}
	
	@XmlElement(name="Usr_Titulo")
	public String getxUsr_Titulo() {
		return xUsr_Titulo;
	}
	public void setxUsr_Titulo(String xUsr_Titulo) {
		this.xUsr_Titulo = xUsr_Titulo;
	}
	
	@XmlElement(name="Dt_Sist_Tit")
	public String getxDt_Sist_Tit() {
		return xDt_Sist_Tit;
	}
	public void setxDt_Sist_Tit(String xDt_Sist_Tit) {
		this.xDt_Sist_Tit = xDt_Sist_Tit;
	}
	
	@XmlElement(name="Dt_Ocorrencia")
	public String getxDt_Ocorrencia() {
		return xDt_Ocorrencia;
	}
	public void setxDt_Ocorrencia(String xDt_Ocorrencia) {
		this.xDt_Ocorrencia = xDt_Ocorrencia;
	}
	
	@XmlElement(name="Oco_Codigo")
	public String getxOco_Codigo() {
		return xOco_Codigo;
	}
	public void setxOco_Codigo(String xOco_Codigo) {
		this.xOco_Codigo = xOco_Codigo;
	}
	
	@XmlElement(name="No_Cancelamento")
	public String getxNo_Cancelamento() {
		return xNo_Cancelamento;
	}
	public void setxNo_Cancelamento(String xNo_Cancelamento) {
		this.xNo_Cancelamento = xNo_Cancelamento;
	}
	
	@XmlElement(name="DinChq")
	public String getxDinChq() {
		return xDinChq;
	}
	public void setxDinChq(String xDinChq) {
		this.xDinChq = xDinChq;
	}
	
	@XmlElement(name="Oco_Obs")
	public String getxOco_Obs() {
		return xOco_Obs;
	}
	public void setxOco_Obs(String xOco_Obs) {
		this.xOco_Obs = xOco_Obs;
	}
	
	@XmlElement(name="Oco_Bloqueia")
	public String getxOco_Bloqueia() {
		return xOco_Bloqueia;
	}
	public void setxOco_Bloqueia(String xOco_Bloqueia) {
		this.xOco_Bloqueia = xOco_Bloqueia;
	}
	
	@XmlElement(name="Oco_Usr")
	public String getxOco_Usr() {
		return xOco_Usr;
	}
	public void setxOco_Usr(String xOco_Usr) {
		this.xOco_Usr = xOco_Usr;
	}
	
	@XmlElement(name="Dt_Sist_Oco")
	public String getxDt_Sist_Oco() {
		return xDt_Sist_Oco;
	}
	public void setxDt_Sist_Oco(String xDt_Sist_Oco) {
		this.xDt_Sist_Oco = xDt_Sist_Oco;
	}
	
	@XmlElement(name="Tit_Chq_Rps")
	public String getxTit_Chq_Rps() {
		return xTit_Chq_Rps;
	}
	public void setxTit_Chq_Rps(String xTit_Chq_Rps) {
		this.xTit_Chq_Rps = xTit_Chq_Rps;
	}
	
	@XmlElement(name="Tit_Obs1")
	public String getxTit_Obs1() {
		return xTit_Obs1;
	}
	public void setxTit_Obs1(String xTit_Obs1) {
		this.xTit_Obs1 = xTit_Obs1;
	}
	
	@XmlElement(name="Tit_Motivo")
	public String getxTit_Motivo() {
		return xTit_Motivo;
	}
	public void setxTit_Motivo(String xTit_Motivo) {
		this.xTit_Motivo = xTit_Motivo;
	}
	
	@XmlElement(name="Tit_CustasPg")
	public String getxTit_CustasPg() {
		return xTit_CustasPg;
	}
	public void setxTit_CustasPg(String xTit_CustasPg) {
		this.xTit_CustasPg = xTit_CustasPg;
	}
	
	@XmlElement(name="Tit_ResIntima")
	public String getxTit_ResIntima() {
		return xTit_ResIntima;
	}
	public void setxTit_ResIntima(String xTit_ResIntima) {
		this.xTit_ResIntima = xTit_ResIntima;
	}
	
	@XmlElement(name="Tit_ResCorreio")
	public String getxTit_ResCorreio() {
		return xTit_ResCorreio;
	}
	public void setxTit_ResCorreio(String xTit_ResCorreio) {
		this.xTit_ResCorreio = xTit_ResCorreio;
	}
	
	@XmlElement(name="Tit_DtEdital")
	public String getxTit_DtEdital() {
		return xTit_DtEdital;
	}
	public void setxTit_DtEdital(String xTit_DtEdital) {
		this.xTit_DtEdital = xTit_DtEdital;
	}
	
	@XmlElement(name="Tit_Intimado")
	public String getxTit_Intimado() {
		return xTit_Intimado;
	}
	public void setxTit_Intimado(String xTit_Intimado) {
		this.xTit_Intimado = xTit_Intimado;
	}
	
	@XmlElement(name="Tit_Respondido")
	public String getxTit_Respondido() {
		return xTit_Respondido;
	}
	public void setxTit_Respondido(String xTit_Respondido) {
		this.xTit_Respondido = xTit_Respondido;
	}
	
	@XmlElement(name="Tit_ResSE")
	public String getxTit_ResSE() {
		return xTit_ResSE;
	}
	public void setxTit_ResSE(String xTit_ResSE) {
		this.xTit_ResSE = xTit_ResSE;
	}
	
	@XmlElement(name="Tit_ResSP")
	public String getxTit_ResSP() {
		return xTit_ResSP;
	}
	public void setxTit_ResSP(String xTit_ResSP) {
		this.xTit_ResSP = xTit_ResSP;
	}
	
	@XmlElement(name="Tit_VlReembEdital")
	public String getxTit_VlReembEdital() {
		return xTit_VlReembEdital;
	}
	public void setxTit_VlReembEdital(String xTit_VlReembEdital) {
		this.xTit_VlReembEdital = xTit_VlReembEdital;
	}
	
	@XmlElement(name="No_Cliente")
	public String getxNo_Cliente() {
		return xNo_Cliente;
	}
	public void setxNo_Cliente(String xNo_Cliente) {
		this.xNo_Cliente = xNo_Cliente;
	}
	
	@XmlElement(name="NomeApresentante")
	public String getxNomeApresentante() {
		return xNomeApresentante;
	}
	public void setxNomeApresentante(String xNomeApresentante) {
		this.xNomeApresentante = xNomeApresentante;
	}
	
	@XmlElement(name="EnderecoApresentante")
	public String getxEnderecoApresentante() {
		return xEnderecoApresentante;
	}
	public void setxEnderecoApresentante(String xEnderecoApresentante) {
		this.xEnderecoApresentante = xEnderecoApresentante;
	}
	
	@XmlElement(name="NumeroApresentante")
	public String getxNumeroApresentante() {
		return xNumeroApresentante;
	}
	public void setxNumeroApresentante(String xNumeroApresentante) {
		this.xNumeroApresentante = xNumeroApresentante;
	}
	
	@XmlElement(name="ComplementoApresentante")
	public String getxComplementoApresentante() {
		return xComplementoApresentante;
	}
	public void setxComplementoApresentante(String xComplementoApresentante) {
		this.xComplementoApresentante = xComplementoApresentante;
	}
	
	@XmlElement(name="BairroApresentante")
	public String getxBairroApresentante() {
		return xBairroApresentante;
	}
	public void setxBairroApresentante(String xBairroApresentante) {
		this.xBairroApresentante = xBairroApresentante;
	}
	
	@XmlElement(name="CidadeApresentante")
	public String getxCidadeApresentante() {
		return xCidadeApresentante;
	}
	public void setxCidadeApresentante(String xCidadeApresentante) {
		this.xCidadeApresentante = xCidadeApresentante;
	}
	
	@XmlElement(name="UfApresentante")
	public String getxUfApresentante() {
		return xUfApresentante;
	}
	public void setxUfApresentante(String xUfApresentante) {
		this.xUfApresentante = xUfApresentante;
	}
	
	@XmlElement(name="CepApresentante")
	public String getxCepApresentante() {
		return xCepApresentante;
	}
	public void setxCepApresentante(String xCepApresentante) {
		this.xCepApresentante = xCepApresentante;
	}
	
	@XmlElement(name="NomeFavorecido")
	public String getxNomeFavorecido() {
		return xNomeFavorecido;
	}
	public void setxNomeFavorecido(String xNomeFavorecido) {
		this.xNomeFavorecido = xNomeFavorecido;
	}
	
	@XmlElement(name="EnderecoFavorecido")
	public String getxEnderecoFavorecido() {
		return xEnderecoFavorecido;
	}
	public void setxEnderecoFavorecido(String xEnderecoFavorecido) {
		this.xEnderecoFavorecido = xEnderecoFavorecido;
	}
	
	@XmlElement(name="NumeroFavorecido")
	public String getxNumeroFavorecido() {
		return xNumeroFavorecido;
	}
	public void setxNumeroFavorecido(String xNumeroFavorecido) {
		this.xNumeroFavorecido = xNumeroFavorecido;
	}
	
	@XmlElement(name="ComplementoFavorecido")
	public String getxComplementoFavorecido() {
		return xComplementoFavorecido;
	}
	public void setxComplementoFavorecido(String xComplementoFavorecido) {
		this.xComplementoFavorecido = xComplementoFavorecido;
	}
	
	@XmlElement(name="BairroFavorecido")
	public String getxBairroFavorecido() {
		return xBairroFavorecido;
	}
	public void setxBairroFavorecido(String xBairroFavorecido) {
		this.xBairroFavorecido = xBairroFavorecido;
	}
	
	@XmlElement(name="CidadeFavorecido")
	public String getxCidadeFavorecido() {
		return xCidadeFavorecido;
	}
	public void setxCidadeFavorecido(String xCidadeFavorecido) {
		this.xCidadeFavorecido = xCidadeFavorecido;
	}
	
	@XmlElement(name="UfFavorecido")
	public String getxUfFavorecido() {
		return xUfFavorecido;
	}
	public void setxUfFavorecido(String xUfFavorecido) {
		this.xUfFavorecido = xUfFavorecido;
	}
	
	@XmlElement(name="CepFavorecido")
	public String getxCepFavorecido() {
		return xCepFavorecido;
	}
	public void setxCepFavorecido(String xCepFavorecido) {
		this.xCepFavorecido = xCepFavorecido;
	}
	
	@XmlElement(name="NomeSacador")
	public String getxNomeSacador() {
		return xNomeSacador;
	}
	public void setxNomeSacador(String xNomeSacador) {
		this.xNomeSacador = xNomeSacador;
	}
	
	@XmlElement(name="EnderecoSacador")
	public String getxEnderecoSacador() {
		return xEnderecoSacador;
	}
	public void setxEnderecoSacador(String xEnderecoSacador) {
		this.xEnderecoSacador = xEnderecoSacador;
	}
	
	@XmlElement(name="NumeroSacador")
	public String getxNumeroSacador() {
		return xNumeroSacador;
	}
	public void setxNumeroSacador(String xNumeroSacador) {
		this.xNumeroSacador = xNumeroSacador;
	}
	
	@XmlElement(name="ComplementoSacador")
	public String getxComplementoSacador() {
		return xComplementoSacador;
	}
	public void setxComplementoSacador(String xComplementoSacador) {
		this.xComplementoSacador = xComplementoSacador;
	}
	
	@XmlElement(name="BairroSacador")
	public String getxBairroSacador() {
		return xBairroSacador;
	}
	public void setxBairroSacador(String xBairroSacador) {
		this.xBairroSacador = xBairroSacador;
	}
	
	@XmlElement(name="CidadeSacador")
	public String getxCidadeSacador() {
		return xCidadeSacador;
	}
	public void setxCidadeSacador(String xCidadeSacador) {
		this.xCidadeSacador = xCidadeSacador;
	}
	
	@XmlElement(name="UfSacador")
	public String getxUfSacador() {
		return xUfSacador;
	}
	public void setxUfSacador(String xUfSacador) {
		this.xUfSacador = xUfSacador;
	}
	
	@XmlElement(name="CepSacador")
	public String getxCepSacador() {
		return xCepSacador;
	}
	public void setxCepSacador(String xCepSacador) {
		this.xCepSacador = xCepSacador;
	}
	
	@XmlElement(name="Tp_DoctoApresentante")
	public String getxTp_DoctoApresentante() {
		return xTp_DoctoApresentante;
	}
	public void setxTp_DoctoApresentante(String xTp_DoctoApresentante) {
		this.xTp_DoctoApresentante = xTp_DoctoApresentante;
	}
	
	@XmlElement(name="No_DoctoApresentante")
	public String getxNo_DoctoApresentante() {
		return xNo_DoctoApresentante;
	}
	public void setxNo_DoctoApresentante(String xNo_DoctoApresentante) {
		this.xNo_DoctoApresentante = xNo_DoctoApresentante;
	}
	
	@XmlElement(name="Tp_DoctoFavorecido")
	public String getxTp_DoctoFavorecido() {
		return xTp_DoctoFavorecido;
	}
	public void setxTp_DoctoFavorecido(String xTp_DoctoFavorecido) {
		this.xTp_DoctoFavorecido = xTp_DoctoFavorecido;
	}
	
	@XmlElement(name="No_DoctoFavorecido")
	public String getxNo_DoctoFavorecido() {
		return xNo_DoctoFavorecido;
	}
	public void setxNo_DoctoFavorecido(String xNo_DoctoFavorecido) {
		this.xNo_DoctoFavorecido = xNo_DoctoFavorecido;
	}
	
	@XmlElement(name="Tp_DoctoSacador")
	public String getxTp_DoctoSacador() {
		return xTp_DoctoSacador;
	}
	public void setxTp_DoctoSacador(String xTp_DoctoSacador) {
		this.xTp_DoctoSacador = xTp_DoctoSacador;
	}
	
	@XmlElement(name="No_DoctoSacador")
	public String getxNo_DoctoSacador() {
		return xNo_DoctoSacador;
	}
	public void setxNo_DoctoSacador(String xNo_DoctoSacador) {
		this.xNo_DoctoSacador = xNo_DoctoSacador;
	}
	
	@XmlElement(name="No_Livro")
	public String getxNo_Livro() {
		return xNo_Livro;
	}
	public void setxNo_Livro(String xNo_Livro) {
		this.xNo_Livro = xNo_Livro;
	}
	
	@XmlElement(name="No_Folha")
	public String getxNo_Folha() {
		return xNo_Folha;
	}
	public void setxNo_Folha(String xNo_Folha) {
		this.xNo_Folha = xNo_Folha;
	}
	
	@XmlElement(name="Encerrado")
	public String getxEncerrado() {
		return xEncerrado;
	}
	public void setxEncerrado(String xEncerrado) {
		this.xEncerrado = xEncerrado;
	}
	
	@XmlElement(name="Cod_Irregularidade")
	public String getxCod_Irregularidade() {
		return xCod_Irregularidade;
	}
	public void setxCod_Irregularidade(String xCod_Irregularidade) {
		this.xCod_Irregularidade = xCod_Irregularidade;
	}
	
	@XmlElement(name="Nihil")
	public String getxNihil() {
		return xNihil;
	}
	public void setxNihil(String xNihil) {
		this.xNihil = xNihil;
	}
	
	@XmlElement(name="Avista")
	public String getxAvista() {
		return xAvista;
	}
	public void setxAvista(String xAvista) {
		this.xAvista = xAvista;
	}
	
	@XmlElement(name="RsDesiste")
	public String getxRsDesiste() {
		return xRsDesiste;
	}
	public void setxRsDesiste(String xRsDesiste) {
		this.xRsDesiste = xRsDesiste;
	}
	
	@XmlElement(name="Lei4664")
	public String getxLei4664() {
		return xLei4664;
	}
	public void setxLei4664(String xLei4664) {
		this.xLei4664 = xLei4664;
	}
	
	@XmlElement(name="Lei111")
	public String getxLei111() {
		return xLei111;
	}
	public void setxLei111(String xLei111) {
		this.xLei111 = xLei111;
	}
	
	@XmlElement(name="Lei3761")
	public String getxLei3761() {
		return xLei3761;
	}
	public void setxLei3761(String xLei3761) {
		this.xLei3761 = xLei3761;
	}
	
	@XmlElement(name="Talao_NoLivro")
	public String getxTalao_NoLivro() {
		return xTalao_NoLivro;
	}
	public void setxTalao_NoLivro(String xTalao_NoLivro) {
		this.xTalao_NoLivro = xTalao_NoLivro;
	}
	
	@XmlElement(name="Convenio_NoLivro")
	public String getxConvenio_NoLivro() {
		return xConvenio_NoLivro;
	}
	public void setxConvenio_NoLivro(String xConvenio_NoLivro) {
		this.xConvenio_NoLivro = xConvenio_NoLivro;
	}
	
	@XmlElement(name="No_Talao3Ofi")
	public String getxNo_Talao3Ofi() {
		return xNo_Talao3Ofi;
	}
	public void setxNo_Talao3Ofi(String xNo_Talao3Ofi) {
		this.xNo_Talao3Ofi = xNo_Talao3Ofi;
	}
	
	@XmlElement(name="Aceite")
	public String getxAceite() {
		return xAceite;
	}
	public void setxAceite(String xAceite) {
		this.xAceite = xAceite;
	}
	
	@XmlElement(name="FinsFalimentares")
	public String getxFinsFalimentares() {
		return xFinsFalimentares;
	}
	public void setxFinsFalimentares(String xFinsFalimentares) {
		this.xFinsFalimentares = xFinsFalimentares;
	}
	
	@XmlElement(name="Arquivamento")
	public String getxArquivamento() {
		return xArquivamento;
	}
	public void setxArquivamento(String xArquivamento) {
		this.xArquivamento = xArquivamento;
	}
	
	@XmlElement(name="Lei6281")
	public String getxLei6281() {
		return xLei6281;
	}
	public void setxLei6281(String xLei6281) {
		this.xLei6281 = xLei6281;
	}
	
	@Override
	public String toString() {
		return "MpmTituloXML [xDt_Protocolo=" + xDt_Protocolo + ", xNo_Protocolo="
				+ xNo_Protocolo + ", xDt_Ate=" + xDt_Ate + ", xCod_Apresentante=" + xCod_Apresentante + ", xConvenio="
				+ xConvenio + ", xEmpresa=" + xEmpresa + ", xDt_Distribuicao=" + xDt_Distribuicao
				+ ", xNo_Distribuicao=" + xNo_Distribuicao + ", xDt_Emissao=" + xDt_Emissao + ", xDt_Vencto="
				+ xDt_Vencto + ", xNo_Titulo=" + xNo_Titulo + ", xNo_Banco=" + xNo_Banco + ", xCod_Endosso="
				+ xCod_Endosso + ", xAgenciaCedente=" + xAgenciaCedente + ", xValor=" + xValor + ", xSaldo=" + xSaldo
				+ ", xEsp_Codigo=" + xEsp_Codigo + ", xCodigoAlinea=" + xCodigoAlinea + ", xTp_Apresentante="
				+ xTp_Apresentante + ", xEdital=" + xEdital + ", xMicroEmpresa=" + xMicroEmpresa + ", xEmolumento="
				+ xEmolumento + ", xDistribuicao=" + xDistribuicao + ", xLei_489=" + xLei_489 + ", xLei_713=" + xLei_713
				+ ", xVl_Variavel=" + xVl_Variavel + ", xFaixa=" + xFaixa + ", xIntimacao=" + xIntimacao
				+ ", xCoobrigado=" + xCoobrigado + ", xDiligencia=" + xDiligencia + ", xVl_Edital=" + xVl_Edital
				+ ", xOutros=" + xOutros + ", xTot_Emolu=" + xTot_Emolu + ", xTot_Pagar=" + xTot_Pagar
				+ ", xTot_Deposito=" + xTot_Deposito + ", xCco_Deved=" + xCco_Deved + ", xCco_Aval=" + xCco_Aval
				+ ", xCco_Endoss=" + xCco_Endoss + ", xCco_Notif=" + xCco_Notif + ", xCco_EndIgs=" + xCco_EndIgs
				+ ", xCco_EndDifs=" + xCco_EndDifs + ", xUsr_Titulo=" + xUsr_Titulo + ", xDt_Sist_Tit=" + xDt_Sist_Tit
				+ ", xDt_Ocorrencia=" + xDt_Ocorrencia + ", xOco_Codigo=" + xOco_Codigo + ", xNo_Cancelamento="
				+ xNo_Cancelamento + ", xDinChq=" + xDinChq + ", xOco_Obs=" + xOco_Obs + ", xOco_Bloqueia="
				+ xOco_Bloqueia + ", xOco_Usr=" + xOco_Usr + ", xDt_Sist_Oco=" + xDt_Sist_Oco + ", xTit_Chq_Rps="
				+ xTit_Chq_Rps + ", xTit_Obs1=" + xTit_Obs1 + ", xTit_Motivo=" + xTit_Motivo + ", xTit_CustasPg="
				+ xTit_CustasPg + ", xTit_ResIntima=" + xTit_ResIntima + ", xTit_ResCorreio=" + xTit_ResCorreio
				+ ", xTit_DtEdital=" + xTit_DtEdital + ", xTit_Intimado=" + xTit_Intimado + ", xTit_Respondido="
				+ xTit_Respondido + ", xTit_ResSE=" + xTit_ResSE + ", xTit_ResSP=" + xTit_ResSP
				+ ", xTit_VlReembEdital=" + xTit_VlReembEdital + ", xNo_Cliente=" + xNo_Cliente + ", xNomeApresentante="
				+ xNomeApresentante + ", xEnderecoApresentante=" + xEnderecoApresentante + ", xNumeroApresentante="
				+ xNumeroApresentante + ", xComplementoApresentante=" + xComplementoApresentante
				+ ", xBairroApresentante=" + xBairroApresentante + ", xCidadeApresentante=" + xCidadeApresentante
				+ ", xUfApresentante=" + xUfApresentante + ", xCepApresentante=" + xCepApresentante
				+ ", xNomeFavorecido=" + xNomeFavorecido + ", xEnderecoFavorecido=" + xEnderecoFavorecido
				+ ", xNumeroFavorecido=" + xNumeroFavorecido + ", xComplementoFavorecido=" + xComplementoFavorecido
				+ ", xBairroFavorecido=" + xBairroFavorecido + ", xCidadeFavorecido=" + xCidadeFavorecido
				+ ", xUfFavorecido=" + xUfFavorecido + ", xCepFavorecido=" + xCepFavorecido + ", xNomeSacador="
				+ xNomeSacador + ", xEnderecoSacador=" + xEnderecoSacador + ", xNumeroSacador=" + xNumeroSacador
				+ ", xComplementoSacador=" + xComplementoSacador + ", xBairroSacador=" + xBairroSacador
				+ ", xCidadeSacador=" + xCidadeSacador + ", xUfSacador=" + xUfSacador + ", xCepSacador=" + xCepSacador
				+ ", xTp_DoctoApresentante=" + xTp_DoctoApresentante + ", xNo_DoctoApresentante="
				+ xNo_DoctoApresentante + ", xTp_DoctoFavorecido=" + xTp_DoctoFavorecido + ", xNo_DoctoFavorecido="
				+ xNo_DoctoFavorecido + ", xTp_DoctoSacador=" + xTp_DoctoSacador + ", xNo_DoctoSacador="
				+ xNo_DoctoSacador + ", xNo_Livro=" + xNo_Livro + ", xNo_Folha=" + xNo_Folha + ", xEncerrado="
				+ xEncerrado + ", xCod_Irregularidade=" + xCod_Irregularidade + ", xNihil=" + xNihil + ", xAvista="
				+ xAvista + ", xRsDesiste=" + xRsDesiste + ", xLei4664=" + xLei4664 + ", xLei111=" + xLei111
				+ ", xLei3761=" + xLei3761 + ", xTalao_NoLivro=" + xTalao_NoLivro + ", xConvenio_NoLivro="
				+ xConvenio_NoLivro + ", xNo_Talao3Ofi=" + xNo_Talao3Ofi + ", xAceite=" + xAceite
				+ ", xFinsFalimentares=" + xFinsFalimentares + ", xArquivamento=" + xArquivamento + ", xLei6281="
				+ xLei6281 + "]";
	}
	
}
