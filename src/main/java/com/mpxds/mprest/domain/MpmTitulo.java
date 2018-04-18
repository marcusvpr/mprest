package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpm_titulo")
public class MpmTitulo extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(name = "nome_arquivo", nullable = true, length = 40)
	private String nomeArquivo;	
	
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
	
	@Column(nullable = true, length = 1)
	private String digital;
	
	@Column(nullable = true, length = 255)
	private String observacao;
	
	@Column(name = "total_pagar", nullable = true, length = 10)
	private String totalPagar;
	
	@Column(name = "total_deposito", nullable = true, length = 10)
	private String totalDeposito;
	
	@Column(name = "valor_distribuicao", nullable = true, length = 10)
	private String valorDistribuicao;
	
	@Column(nullable = true, length = 10)
	private String saldo;
	
	@Column(nullable = true, length = 10)
	private String valor;
	
	@Column(name = "agencia_cedente", nullable = true, length = 28)
	private String agenciaCedente;
	
	@Column(nullable = true, length = 1)
	private String endosso;
	
	@Column(name = "numero_banco", nullable = true, length = 46)
	private String numeroBanco;
	
	@Column(name = "numero_titulo", nullable = true, length = 46)
	private String numeroTitulo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Column(name = "data_vencimento", nullable = true)
	private Date dataVencimento;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Column(name = "data_emissao", nullable = true)
	private Date dataEmissao;

	@Column(name = "numero_distribuicao", nullable = true, length = 18)
	private String numeroDistribuicao;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Column(name = "data_distribuicao", nullable = true)
	private Date dataDistribuicao;
	
	@Column(name = "codigo_apresentante", nullable = true, length = 13)
	private String codigoApresentante;

	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Column(name = "data_ate", nullable = true)
	private Date dataAte;

	@Column(name = "numero_protocolo", nullable = true, length = 12)
	private String numeroProtocolo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Column(name = "data_protocolo", nullable = true)
	private Date dataProtocolo;

	@Column(nullable = true, length = 4)
	private String faixa;	
			
	@ManyToOne
	@JoinColumn(name="mpmAlinea_id")
	private MpmAlinea mpmAlinea;
	
	@ManyToOne
	@JoinColumn(name="mpmEspecie_id")
	private MpmEspecie mpmEspecie;
	
	@OneToMany(mappedBy="mpmTitulo")
	private List<MpmTituloStatus> mpmTituloStatuss = new ArrayList<>();
			
	@ManyToMany
	@JoinTable(name = "mpmTitulo_mpmDevedor",
		joinColumns = @JoinColumn(name = "mpmTitulo_id"),
		inverseJoinColumns = @JoinColumn(name = "mpmDevedor_id")
	)	
	private List<MpmDevedor> mpmDevedors = new ArrayList<>();

	//
	
	public MpmTitulo() {
		//
	}
	
	public MpmTitulo(String nomeArquivo, String finsFAlimentares, String aceite, String numeroTalao3oficio,
			String convenioNumeroLivro, String talaoNumeroLivro, String aVista, String nihil, String digital,
			String observacao, String totalPagar, String totalDeposito, String valorDistribuicao, String saldo,
			String valor, String agenciaCedente, String endosso, String numeroBanco, String numeroTitulo,
			Date dataVencimento, Date dataEmissao, String numeroDistribuicao, Date dataDistribuicao,
			String codigoApresentante, Date dataAte, String numeroProtocolo, Date dataProtocolo, String faixa,
			MpmAlinea mpmAlinea, MpmEspecie mpmEspecie) {
		//
		super();
		
		this.nomeArquivo = nomeArquivo;
		this.finsFAlimentares = finsFAlimentares;
		this.aceite = aceite;
		this.numeroTalao3oficio = numeroTalao3oficio;
		this.convenioNumeroLivro = convenioNumeroLivro;
		this.talaoNumeroLivro = talaoNumeroLivro;
		this.aVista = aVista;
		this.nihil = nihil;
		this.digital = digital;
		this.observacao = observacao;
		this.totalPagar = totalPagar;
		this.totalDeposito = totalDeposito;
		this.valorDistribuicao = valorDistribuicao;
		this.saldo = saldo;
		this.valor = valor;
		this.agenciaCedente = agenciaCedente;
		this.endosso = endosso;
		this.numeroBanco = numeroBanco;
		this.numeroTitulo = numeroTitulo;
		this.dataVencimento = dataVencimento;
		this.dataEmissao = dataEmissao;
		this.numeroDistribuicao = numeroDistribuicao;
		this.dataDistribuicao = dataDistribuicao;
		this.codigoApresentante = codigoApresentante;
		this.dataAte = dataAte;
		this.numeroProtocolo = numeroProtocolo;
		this.dataProtocolo = dataProtocolo;
		this.faixa = faixa;
		
		this.mpmAlinea = mpmAlinea;
		this.mpmEspecie = mpmEspecie;
	}

	//
	
	public String getNomeArquivo() { return nomeArquivo; }
	public void setNomeArquivo(String nomeArquivo) { this.nomeArquivo = nomeArquivo; }

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

	public String getNihil() { return nihil;}
	public void setNihil(String nihil) { this.nihil = nihil; }

	public String getDigital() { return digital; }
	public void setDigital(String digital) { this.digital = digital; }

	public String getObservacao() { return observacao; }
	public void setObservacao(String observacao) { this.observacao = observacao; }

	public String getTotalPagar() { return totalPagar; }
	public void setTotalPagar(String totalPagar) { this.totalPagar = totalPagar; }

	public String getTotalDeposito() { return totalDeposito; }
	public void setTotalDeposito(String totalDeposito) { this.totalDeposito = totalDeposito; }

	public String getValorDistribuicao() { return valorDistribuicao; }
	public void setValorDistribuicao(String valorDistribuicao) { 
															this.valorDistribuicao = valorDistribuicao; }

	public String getSaldo() { return saldo; }
	public void setSaldo(String saldo) { this.saldo = saldo; }

	public String getValor() { return valor; }
	public void setValor(String valor) { this.valor = valor; }

	public String getAgenciaCedente() { return agenciaCedente; }
	public void setAgenciaCedente(String agenciaCedente) { this.agenciaCedente = agenciaCedente; }

	public String getEndosso() { return endosso; }
	public void setEndosso(String endosso) { this.endosso = endosso; }

	public String getNumeroBanco() { return numeroBanco; }
	public void setNumeroBanco(String numeroBanco) { this.numeroBanco = numeroBanco; }

	public String getNumeroTitulo() { return numeroTitulo; }
	public void setNumeroTitulo(String numeroTitulo) { this.numeroTitulo = numeroTitulo; }

	public Date getDataVencimento() { return dataVencimento; }
	public void setDataVencimento(Date dataVencimento) { this.dataVencimento = dataVencimento; }

	public Date getDataEmissao() { return dataEmissao; }
	public void setDataEmissao(Date dataEmissao) { this.dataEmissao = dataEmissao; }

	public String getNumeroDistribuicao() { return numeroDistribuicao; }
	public void setNumeroDistribuicao(String numeroDistribuicao) { 
															this.numeroDistribuicao = numeroDistribuicao; }

	public Date getDataDistribuicao() { return dataDistribuicao; }
	public void setDataDistribuicao(Date dataDistribuicao) { this.dataDistribuicao = dataDistribuicao; }

	public String getCodigoApresentante() { return codigoApresentante; }
	public void setCodigoApresentante(String codigoApresentante) { 
															this.codigoApresentante = codigoApresentante; }

	public Date getDataAte() { return dataAte; }
	public void setDataAte(Date dataAte) { this.dataAte = dataAte; }
	
	public String getNumeroProtocolo() { return numeroProtocolo; }
	public void setNumeroProtocolo(String numeroProtocolo) { this.numeroProtocolo = numeroProtocolo; }

	public Date getDataProtocolo() { return dataProtocolo; }
	public void setDataProtocolo(Date dataProtocolo) { this.dataProtocolo = dataProtocolo; }

	public String getFaixa() { return faixa; }
	public void setFaixa(String faixa) { this.faixa = faixa; }

	public MpmAlinea getMpmAlinea() { return mpmAlinea; }
	public void setMpmAlinea(MpmAlinea mpmAlinea) { this.mpmAlinea = mpmAlinea; }

	public MpmEspecie getMpmEspecie() { return mpmEspecie; }
	public void setMpmEspecie(MpmEspecie mpmEspecie) { this.mpmEspecie = mpmEspecie; }
	
	public List<MpmTituloStatus> getMpmTituloStatuss() { return mpmTituloStatuss; }
	public void setMpmTituloStatuss(List<MpmTituloStatus> mpmTituloStatuss) { 
																this.mpmTituloStatuss = mpmTituloStatuss; }
	
	public List<MpmDevedor> getMpmDevedors() { return mpmDevedors; }
	public void setMpmDevedors(List<MpmDevedor> mpmDevedors) { this.mpmDevedors = mpmDevedors; }

}
