package com.mpxds.mprest.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_titulo", indexes = {
		@Index(name = "index_mpadt_titulo_datnum_protoc", columnList = "data_protocolo, numero_protocolo",
																								unique = true)})
public class MpmTitulo extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(name = "fins_falimentares", nullable = true, length = 1)
	private String finsFAlimentares;
	
	@Column(nullable = true, length = 1)
	private String aceite;
	
	@Column(name = "numero_talao_3oficio", nullable = true, length = 16)
	private String numeroTalao3oficio;
	
	@Column(name = "convenio_numero_livro", nullable = true, length = 10)
	private String convenioNumeroLivro;
	
	@Column(name = "talao_numero_livro", nullable = true, length = 10)
	private String talaoNumeroLivro;
	
	@Column(nullable = true, length = 1)
	private String aVista;
	
	@Column(nullable = true, length = 1)
	private String nihil;
	
	@Column(name = "total_pagar", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "###,###,###,##0.00")
	private BigDecimal totalPagar;
	
	@Column(name = "total_deposito", nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "###,###,###,##0.00")
	private BigDecimal totalDeposito;
		
	@Column(nullable = true, precision = 15, scale = 2)
	@NumberFormat(pattern = "###,###,###,###,##0.00")
	private BigDecimal saldo;

	@Column(name = "especie_codigo", nullable = true, length = 5)
	private String especieCodigo;
	
	@Column(nullable = true, precision = 12, scale = 2)
	@NumberFormat(pattern = "###,###,###,##0.00")
	private BigDecimal valor;

//	
//	@Column(name = "agencia_cedente", nullable = true, length = 28)
//	private String agenciaCedente;
//	
//	@Column(name = "numero_banco", nullable = true, length = 46)
//	private String numeroBanco;
	
	@Column(name = "numero_titulo", nullable = true, length = 46)
	private String numeroTitulo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_vencimento", nullable = true)
	private Date dataVencimento;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_emissao", nullable = true)
	private Date dataEmissao;
//
//	@Column(name = "numero_distribuicao", nullable = true, length = 18)
//	private String numeroDistribuicao;
//
//	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
//	@Temporal(TemporalType.DATE)
//	@Column(name = "data_distribuicao", nullable = true)
//	private Date dataDistribuicao;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_ate", nullable = true)
	private Date dataAte;

	@Column(name = "numero_protocolo", nullable = true, length = 12)
	private String numeroProtocolo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_protocolo", nullable = true)
	private Date dataProtocolo;

	@Column(nullable = true, length = 4)
	private String faixa; // ??? SubItem do AtosComposiçao ! Prisco !
	
	// Verificar Prisco ?
	private String convenio;
	private String empresa;
	private String tp_Apresentante; // ??? B=Banco / A=Avulso
	
	private String mensagemApresentante; // ??? Vrf.Prisco? "INCLUA APRESENTANTE NA TAB E ALTERE O TÍTULO !!!"
	
//	private String edital; -> Sem Uso ;
//	private String microEmpresa; -> Sem Uso ;
//	private String vl_Variavel; -> MpmTituloAto(valorVariavel) ;
//	private String intimacao; -> Sem Uso ;
//	private String coobrigado; -> Sem Uso ;
//	private String diligencia; -> Sem Uso ;
//	private String vl_Edital; -> Sem Uso ;
//	private String outros; -> Sem Uso ;
//	private String tot_Emolu;  -> MpmTituloAto(totalEmolumento) ;
//	private String cco_Deved;  -> Sem Uso ;
//	private String cco_Aval; -> Sem Uso ;
//	private String cco_Endoss; -> Sem Uso ;
//	private String cco_Notif; -> Sem Uso ;
//	private String cco_EndIgs; -> Sem Uso ;
	
	// INICIO - Normalizar Ocorrencias ???? Prisco...
	private String cco_EndDifs;
	private String usr_Titulo;
	private String dt_Sist_Tit;
	private String no_Cancelamento;
	private String dinChq;
	private String oco_Obs;
	private String oco_Bloqueia;
	private String oco_Usr;
	private String dt_Sist_Oco;
	private String tit_Chq_Rps;
	private String tit_Motivo;
	private String tit_CustasPg;
	private String tit_ResIntima;
	private String tit_ResCorreio;
	private String tit_DtEdital;
	private String tit_Intimado;
	private String tit_Respondido;
	private String tit_ResSE;
	private String tit_ResSP;
	private String tit_VlReembEdital;
	private String no_Cliente;
//	private String encerrado;  -> Sem Uso ; ??? Vrf.Prisco? Registros DIGITAL - Atualização !
	private String cod_Irregularidade;
	private String rsDesiste;
	private String arquivamento;
	// FIM - Normalizar Ocorrencias ???? Prisco...

	private String valorDistribuicao; // Verificar Prisco ???
	private String dt_Ocorrencia; // Verificar Prisco ???
	private String oco_Codigo; // Verificar Prisco ???
	private String tot_Emolu; // Verificar Prisco ???

	// ------
	
	@ManyToOne
	@JoinColumn(name="mpmEspecie_id")
	private MpmEspecie mpmEspecie;
	
	@ManyToOne
	@JoinColumn(name="mpmEndosso_id")
	private MpmEndosso mpmEndosso;
	
	@ManyToOne
	@JoinColumn(name="mpmObservacao_id")
	private MpmObservacao mpmObservacao;
	
	@ManyToOne
	@JoinColumn(name="mpmSeloDistribuidor_id")
	private MpmSeloDistribuidor mpmSeloDistribuidor;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="mpmTitulo")
	private MpmTituloAto mpmTituloAto;
	
	@OneToMany(mappedBy="mpmTitulo")
	private List<MpmTituloStatus> mpmTituloStatuss = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "mpmTitulo_mpmAlinea",
		joinColumns = @JoinColumn(name = "mpmTitulo_id"),
		inverseJoinColumns = @JoinColumn(name = "mpmAlinea_id")
	)	
	private List<MpmAlinea> mpmAlineas = new ArrayList<>();
			
	@ManyToMany
	@JoinTable(name = "mpmTitulo_mpmDevedor",
		joinColumns = @JoinColumn(name = "mpmTitulo_id"),
		inverseJoinColumns = @JoinColumn(name = "mpmDevedor_id")
	)	
	private List<MpmDevedor> mpmDevedors = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "mpmTitulo_mpmApresentante", 
		joinColumns = @JoinColumn(name = "mpmTitulo_id"), 
		inverseJoinColumns = @JoinColumn(name = "mpmApresentante_id"))
	private List<MpmApresentante> mpmApresentantes = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "mpmTitulo_mpmPessoaTitulo", 
		joinColumns = @JoinColumn(name = "mpmTitulo_id"), 
		inverseJoinColumns = @JoinColumn(name = "mpmPessoaTitulo_id"))
	private List<MpmPessoaTitulo> mpmPessoaTitulos = new ArrayList<>();

	//
	
	public MpmTitulo() {
		//
	}
	
	public MpmTitulo(Integer id, String finsFAlimentares, String aceite, String numeroTalao3oficio,
			String convenioNumeroLivro,
			String talaoNumeroLivro, String aVista, String nihil, BigDecimal totalPagar, BigDecimal totalDeposito,
			BigDecimal saldo, String especieCodigo, BigDecimal valor,
			String numeroTitulo, Date dataVencimento, Date dataEmissao, Date dataAte,
			String numeroProtocolo, Date dataProtocolo, String faixa, String convenio, String empresa,
			String tp_Apresentante,  String mensagemApresentante,
//			String edital, String microEmpresa, String vl_Variavel, String intimacao,
//			String coobrigado, String diligencia, String vl_Edital, String outros, String tot_Emolu, String cco_Deved,
//			String cco_Aval, String cco_Endoss, String cco_Notif, String cco_EndIgs, String cco_EndDifs,
			String usr_Titulo, String dt_Sist_Tit, String no_Cancelamento, String dinChq, String oco_Obs,
			String oco_Bloqueia, String oco_Usr, String dt_Sist_Oco, String tit_Chq_Rps, String tit_Motivo,
			String tit_CustasPg, String tit_ResIntima, String tit_ResCorreio, String tit_DtEdital, String tit_Intimado,
			String tit_Respondido, String tit_ResSE, String tit_ResSP, String tit_VlReembEdital, String no_Cliente,
//			String encerrado,
			String cod_Irregularidade, String rsDesiste, String arquivamento, String valorDistribuicao,
			String dt_Ocorrencia, String oco_Codigo,  String tot_Emolu,
			MpmEspecie mpmEspecie, MpmEndosso mpmEndosso, MpmObservacao mpmObservacao, 
			MpmSeloDistribuidor mpmSeloDistribuidor) {
			//
		super();
		
		this.id = id;
		this.finsFAlimentares = finsFAlimentares;
		this.aceite = aceite;
		this.numeroTalao3oficio = numeroTalao3oficio;
		this.convenioNumeroLivro = convenioNumeroLivro;
		this.talaoNumeroLivro = talaoNumeroLivro;
		this.aVista = aVista;
		this.nihil = nihil;
		this.totalPagar = totalPagar;
		this.totalDeposito = totalDeposito;
		this.saldo = saldo;
		this.especieCodigo = especieCodigo;
		this.valor = valor;
		this.numeroTitulo = numeroTitulo;
		this.dataVencimento = dataVencimento;
		this.dataEmissao = dataEmissao;
		this.dataAte = dataAte;
		this.numeroProtocolo = numeroProtocolo;
		this.dataProtocolo = dataProtocolo;
		this.faixa = faixa;
		this.convenio = convenio;
		this.empresa = empresa;
		this.tp_Apresentante = tp_Apresentante;
		this.mensagemApresentante = mensagemApresentante;
//		this.edital = edital;
//		this.microEmpresa = microEmpresa;
//		this.vl_Variavel = vl_Variavel;
//		this.intimacao = intimacao;
//		this.coobrigado = coobrigado;
//		this.diligencia = diligencia;
//		this.vl_Edital = vl_Edital;
//		this.outros = outros;
//		this.tot_Emolu = tot_Emolu;
//		this.cco_Deved = cco_Deved;
//		this.cco_Aval = cco_Aval;
//		this.cco_Endoss = cco_Endoss;
//		this.cco_Notif = cco_Notif;
//		this.cco_EndIgs = cco_EndIgs;
//		this.cco_EndDifs = cco_EndDifs;
		this.usr_Titulo = usr_Titulo;
		this.dt_Sist_Tit = dt_Sist_Tit;
		this.no_Cancelamento = no_Cancelamento;
		this.dinChq = dinChq;
		this.oco_Obs = oco_Obs;
		this.oco_Bloqueia = oco_Bloqueia;
		this.oco_Usr = oco_Usr;
		this.dt_Sist_Oco = dt_Sist_Oco;
		this.tit_Chq_Rps = tit_Chq_Rps;
		this.tit_Motivo = tit_Motivo;
		this.tit_CustasPg = tit_CustasPg;
		this.tit_ResIntima = tit_ResIntima;
		this.tit_ResCorreio = tit_ResCorreio;
		this.tit_DtEdital = tit_DtEdital;
		this.tit_Intimado = tit_Intimado;
		this.tit_Respondido = tit_Respondido;
		this.tit_ResSE = tit_ResSE;
		this.tit_ResSP = tit_ResSP;
		this.tit_VlReembEdital = tit_VlReembEdital;
		this.no_Cliente = no_Cliente;
//		this.encerrado = encerrado;
		this.cod_Irregularidade = cod_Irregularidade;
		this.rsDesiste = rsDesiste;
		this.arquivamento = arquivamento;
		
		this.valorDistribuicao = valorDistribuicao; // Vrf.Prisco?
		this.dt_Ocorrencia = dt_Ocorrencia; // Vrf.Prisco?
		this.oco_Codigo = oco_Codigo; // Vrf.Prisco?
		this.tot_Emolu = tot_Emolu; // Vrf.Prisco?
		//
		this.mpmEspecie = mpmEspecie;
		this.mpmEndosso = mpmEndosso;
		this.mpmObservacao = mpmObservacao;
		this.mpmSeloDistribuidor = mpmSeloDistribuidor;
	}

	//
	
	public String getFinsFAlimentares() { return finsFAlimentares; }
	public void setFinsFAlimentares(String finsFAlimentares) { this.finsFAlimentares = finsFAlimentares; }

	public String getAceite() { return aceite; }
	public void setAceite(String aceite) { this.aceite = aceite; }

	public String getNumeroTalao3oficio() { return numeroTalao3oficio; }
	public void setNumeroTalao3oficio(String numeroTalao3oficio) { 
															this.numeroTalao3oficio = numeroTalao3oficio; }

	public String getConvenioNumeroLivro() { return convenioNumeroLivro; }
	public void setConvenioNumeroLivro(String convenioNumeroLivro) {
															this.convenioNumeroLivro = convenioNumeroLivro;	}

	public String getTalaoNumeroLivro() { return talaoNumeroLivro; }
	public void setTalaoNumeroLivro(String talaoNumeroLivro) { this.talaoNumeroLivro = talaoNumeroLivro; }

	public String getAVista() { return aVista; }
	public void setAVista(String aVista) { this.aVista = aVista; }

	// 

	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTp_Apresentante() {
		return tp_Apresentante;
	}
	public void setTp_Apresentante(String tp_Apresentante) {
		this.tp_Apresentante = tp_Apresentante;
	}

	public String getMensagemApresentante() { return mensagemApresentante; }
	public void setMensagemApresentante(String mensagemApresentante) { 
																this.mensagemApresentante = mensagemApresentante; }

//	public String getEdital() {
//		return edital;
//	}
//	public void setEdital(String edital) {
//		this.edital = edital;
//	}
//
//	public String getMicroEmpresa() {
//		return microEmpresa;
//	}
//	public void setMicroEmpresa(String microEmpresa) {
//		this.microEmpresa = microEmpresa;
//	}
//
//	public String getVl_Variavel() {
//		return vl_Variavel;
//	}
//	public void setVl_Variavel(String vl_Variavel) {
//		this.vl_Variavel = vl_Variavel;
//	}
//
//	public String getIntimacao() {
//		return intimacao;
//	}
//	public void setIntimacao(String intimacao) {
//		this.intimacao = intimacao;
//	}
//
//	public String getCoobrigado() {
//		return coobrigado;
//	}
//	public void setCoobrigado(String coobrigado) {
//		this.coobrigado = coobrigado;
//	}
//
//	public String getDiligencia() {
//		return diligencia;
//	}
//	public void setDiligencia(String diligencia) {
//		this.diligencia = diligencia;
//	}
//
//	public String getVl_Edital() {
//		return vl_Edital;
//	}
//	public void setVl_Edital(String vl_Edital) {
//		this.vl_Edital = vl_Edital;
//	}
//
//	public String getOutros() {
//		return outros;
//	}
//	public void setOutros(String outros) {
//		this.outros = outros;
//	}
//
//	public String getTot_Emolu() {
//		return tot_Emolu;
//	}
//	public void setTot_Emolu(String tot_Emolu) {
//		this.tot_Emolu = tot_Emolu;
//	}
//
//	public String getCco_Deved() {
//		return cco_Deved;
//	}
//	public void setCco_Deved(String cco_Deved) {
//		this.cco_Deved = cco_Deved;
//	}
//
//	public String getCco_Aval() {
//		return cco_Aval;
//	}
//	public void setCco_Aval(String cco_Aval) {
//		this.cco_Aval = cco_Aval;
//	}
//
//	public String getCco_Endoss() {
//		return cco_Endoss;
//	}
//	public void setCco_Endoss(String cco_Endoss) {
//		this.cco_Endoss = cco_Endoss;
//	}
//
//	public String getCco_Notif() {
//		return cco_Notif;
//	}
//	public void setCco_Notif(String cco_Notif) {
//		this.cco_Notif = cco_Notif;
//	}
//
//	public String getCco_EndIgs() {
//		return cco_EndIgs;
//	}
//	public void setCco_EndIgs(String cco_EndIgs) {
//		this.cco_EndIgs = cco_EndIgs;
//	}

	public String getCco_EndDifs() {
		return cco_EndDifs;
	}
	public void setCco_EndDifs(String cco_EndDifs) {
		this.cco_EndDifs = cco_EndDifs;
	}

	public String getUsr_Titulo() {
		return usr_Titulo;
	}
	public void setUsr_Titulo(String usr_Titulo) {
		this.usr_Titulo = usr_Titulo;
	}

	public String getDt_Sist_Tit() {
		return dt_Sist_Tit;
	}
	public void setDt_Sist_Tit(String dt_Sist_Tit) {
		this.dt_Sist_Tit = dt_Sist_Tit;
	}

	public String getNo_Cancelamento() {
		return no_Cancelamento;
	}
	public void setNo_Cancelamento(String no_Cancelamento) {
		this.no_Cancelamento = no_Cancelamento;
	}

	public String getDinChq() {
		return dinChq;
	}
	public void setDinChq(String dinChq) {
		this.dinChq = dinChq;
	}

	public String getOco_Obs() {
		return oco_Obs;
	}
	public void setOco_Obs(String oco_Obs) {
		this.oco_Obs = oco_Obs;
	}

	public String getOco_Bloqueia() {
		return oco_Bloqueia;
	}
	public void setOco_Bloqueia(String oco_Bloqueia) {
		this.oco_Bloqueia = oco_Bloqueia;
	}

	public String getOco_Usr() {
		return oco_Usr;
	}
	public void setOco_Usr(String oco_Usr) {
		this.oco_Usr = oco_Usr;
	}

	public String getDt_Sist_Oco() {
		return dt_Sist_Oco;
	}
	public void setDt_Sist_Oco(String dt_Sist_Oco) {
		this.dt_Sist_Oco = dt_Sist_Oco;
	}

	public String getTit_Chq_Rps() {
		return tit_Chq_Rps;
	}
	public void setTit_Chq_Rps(String tit_Chq_Rps) {
		this.tit_Chq_Rps = tit_Chq_Rps;
	}

	public String getTit_Motivo() {
		return tit_Motivo;
	}
	public void setTit_Motivo(String tit_Motivo) {
		this.tit_Motivo = tit_Motivo;
	}

	public String getTit_CustasPg() {
		return tit_CustasPg;
	}
	public void setTit_CustasPg(String tit_CustasPg) {
		this.tit_CustasPg = tit_CustasPg;
	}

	public String getTit_ResIntima() {
		return tit_ResIntima;
	}
	public void setTit_ResIntima(String tit_ResIntima) {
		this.tit_ResIntima = tit_ResIntima;
	}

	public String getTit_ResCorreio() {
		return tit_ResCorreio;
	}
	public void setTit_ResCorreio(String tit_ResCorreio) {
		this.tit_ResCorreio = tit_ResCorreio;
	}

	public String getTit_DtEdital() {
		return tit_DtEdital;
	}
	public void setTit_DtEdital(String tit_DtEdital) {
		this.tit_DtEdital = tit_DtEdital;
	}

	public String getTit_Intimado() {
		return tit_Intimado;
	}
	public void setTit_Intimado(String tit_Intimado) {
		this.tit_Intimado = tit_Intimado;
	}

	public String getTit_Respondido() {
		return tit_Respondido;
	}
	public void setTit_Respondido(String tit_Respondido) {
		this.tit_Respondido = tit_Respondido;
	}

	public String getTit_ResSE() {
		return tit_ResSE;
	}
	public void setTit_ResSE(String tit_ResSE) {
		this.tit_ResSE = tit_ResSE;
	}

	public String getTit_ResSP() {
		return tit_ResSP;
	}
	public void setTit_ResSP(String tit_ResSP) {
		this.tit_ResSP = tit_ResSP;
	}

	public String getTit_VlReembEdital() {
		return tit_VlReembEdital;
	}
	public void setTit_VlReembEdital(String tit_VlReembEdital) {
		this.tit_VlReembEdital = tit_VlReembEdital;
	}

	public String getNo_Cliente() {
		return no_Cliente;
	}
	public void setNo_Cliente(String no_Cliente) {
		this.no_Cliente = no_Cliente;
	}

//	public String getEncerrado() {
//		return encerrado;
//	}
//	public void setEncerrado(String encerrado) {
//		this.encerrado = encerrado;
//	}

	public String getCod_Irregularidade() {
		return cod_Irregularidade;
	}
	public void setCod_Irregularidade(String cod_Irregularidade) {
		this.cod_Irregularidade = cod_Irregularidade;
	}

	public String getRsDesiste() {
		return rsDesiste;
	}
	public void setRsDesiste(String rsDesiste) {
		this.rsDesiste = rsDesiste;
	}

	public String getArquivamento() {
		return arquivamento;
	}
	public void setArquivamento(String arquivamento) {
		this.arquivamento = arquivamento;
	}

	public String getValorDistribuicao() { return valorDistribuicao; }
	public void setValorDistribuicao(String valorDistribuicao) { this.valorDistribuicao = valorDistribuicao; }

	public String getDt_Ocorrencia() { return dt_Ocorrencia; }
	public void setDt_Ocorrencia(String dt_Ocorrencia) { this.dt_Ocorrencia = dt_Ocorrencia; }

	public String getOco_Codigo() { return oco_Codigo; }
	public void setOco_Codigo(String oco_Codigo) { this.oco_Codigo = oco_Codigo; }

	public String getTot_Emolu() { return tot_Emolu; }
	public void setTot_Emolu(String tot_Emolu) { this.tot_Emolu = tot_Emolu; }

	//
	
	public String getNihil() { return nihil;}
	public void setNihil(String nihil) { this.nihil = nihil; }

	public BigDecimal getTotalPagar() { return totalPagar; }
	public void setTotalPagar(BigDecimal totalPagar) { this.totalPagar = totalPagar; }

	public BigDecimal getTotalDeposito() { return totalDeposito; }
	public void setTotalDeposito(BigDecimal totalDeposito) { this.totalDeposito = totalDeposito; }

	public BigDecimal getSaldo() { return saldo; }
	public void setSaldo(BigDecimal saldo) { this.saldo = saldo; }

	public String getEspecieCodigo() { return especieCodigo; }
	public void setEspecieCodigo(String especieCodigo) { this.especieCodigo = especieCodigo; }

	public BigDecimal getValor() { return valor; }
	public void setValor(BigDecimal valor) { this.valor = valor; }
//
//	public String getAgenciaCedente() { return agenciaCedente; }
//	public void setAgenciaCedente(String agenciaCedente) { this.agenciaCedente = agenciaCedente; }
//
//	public String getNumeroBanco() { return numeroBanco; }
//	public void setNumeroBanco(String numeroBanco) { this.numeroBanco = numeroBanco; }

	public String getNumeroTitulo() { return numeroTitulo; }
	public void setNumeroTitulo(String numeroTitulo) { this.numeroTitulo = numeroTitulo; }

	public Date getDataVencimento() { return dataVencimento; }
	public void setDataVencimento(Date dataVencimento) { this.dataVencimento = dataVencimento; }

	public Date getDataEmissao() { return dataEmissao; }
	public void setDataEmissao(Date dataEmissao) { this.dataEmissao = dataEmissao; }

//	public String getNumeroDistribuicao() { return numeroDistribuicao; }
//	public void setNumeroDistribuicao(String numeroDistribuicao) { 
//															this.numeroDistribuicao = numeroDistribuicao; }
//
//	public Date getDataDistribuicao() { return dataDistribuicao; }
//	public void setDataDistribuicao(Date dataDistribuicao) { this.dataDistribuicao = dataDistribuicao; }

	public Date getDataAte() { return dataAte; }
	public void setDataAte(Date dataAte) { this.dataAte = dataAte; }
	
	public String getNumeroProtocolo() { return numeroProtocolo; }
	public void setNumeroProtocolo(String numeroProtocolo) { this.numeroProtocolo = numeroProtocolo; }

	public Date getDataProtocolo() { return dataProtocolo; }
	public void setDataProtocolo(Date dataProtocolo) { this.dataProtocolo = dataProtocolo; }

	public String getFaixa() { return faixa; }
	public void setFaixa(String faixa) { this.faixa = faixa; }

	public List<MpmAlinea> getMpmAlineas() { return mpmAlineas; }
	public void setMpmAlineas(List<MpmAlinea> mpmAlineas) { this.mpmAlineas = mpmAlineas; }

	public MpmEspecie getMpmEspecie() { return mpmEspecie; }
	public void setMpmEspecie(MpmEspecie mpmEspecie) { this.mpmEspecie = mpmEspecie; }

	public MpmEndosso getMpmEndosso() { return mpmEndosso; }
	public void setMpmEndosso(MpmEndosso mpmEndosso) { this.mpmEndosso = mpmEndosso; }

	public MpmObservacao getMpmObservacao() { return mpmObservacao; }
	public void setMpmObservacao(MpmObservacao mpmObservacao) { this.mpmObservacao = mpmObservacao; }

	public MpmSeloDistribuidor getMpmSeloDistribuidor() { return mpmSeloDistribuidor; }
	public void setMpmSeloDistribuidor(MpmSeloDistribuidor mpmSeloDistribuidor) { 
																this.mpmSeloDistribuidor = mpmSeloDistribuidor; }

	public MpmTituloAto getMpmTituloAto() { return mpmTituloAto; }
	public void setMpmTituloAto(MpmTituloAto mpmTituloAto) { this.mpmTituloAto = mpmTituloAto; }
	
	public List<MpmTituloStatus> getMpmTituloStatuss() { return mpmTituloStatuss; }
	public void setMpmTituloStatuss(List<MpmTituloStatus> mpmTituloStatuss) { 
																this.mpmTituloStatuss = mpmTituloStatuss; }
	
	public List<MpmDevedor> getMpmDevedors() { return mpmDevedors; }
	public void setMpmDevedors(List<MpmDevedor> mpmDevedors) { this.mpmDevedors = mpmDevedors; }

	public List<MpmApresentante> getMpmApresentantes() { return mpmApresentantes; }
	public void setMpmApresentantes(List<MpmApresentante> mpmApresentantes) { 
																this.mpmApresentantes = mpmApresentantes; }
	
	public List<MpmPessoaTitulo> getMpmPessoaTitulos() { return mpmPessoaTitulos; }
	public void setMpmPessoaTitulos(List<MpmPessoaTitulo> mpmPessoaTitulos) { 
																this.mpmPessoaTitulos = mpmPessoaTitulos; }
	
}
