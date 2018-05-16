package com.mpxds.mprest.resources;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmAnoReferencia;
import com.mpxds.mprest.domain.MpmApresentante;
import com.mpxds.mprest.domain.MpmAto;
import com.mpxds.mprest.domain.MpmAtoComposicao;
import com.mpxds.mprest.domain.MpmBanco;
import com.mpxds.mprest.domain.MpmCarga;
import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmControleOficio;
import com.mpxds.mprest.domain.MpmCustasComposicao;
import com.mpxds.mprest.domain.MpmDataProcesso;
import com.mpxds.mprest.domain.MpmDevedor;
import com.mpxds.mprest.domain.MpmEndereco;
import com.mpxds.mprest.domain.MpmEndosso;
import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.domain.MpmHeader;
import com.mpxds.mprest.domain.MpmIdentificacao;
import com.mpxds.mprest.domain.MpmImportarControle;
import com.mpxds.mprest.domain.MpmItemEmolumentoXml;
import com.mpxds.mprest.domain.MpmObservacao;
import com.mpxds.mprest.domain.MpmPendencia;
import com.mpxds.mprest.domain.MpmPessoaTitulo;
import com.mpxds.mprest.domain.MpmRemessa;
import com.mpxds.mprest.domain.MpmSeloDistribuidor;
import com.mpxds.mprest.domain.MpmTitulo;
import com.mpxds.mprest.domain.MpmTituloAto;
import com.mpxds.mprest.domain.MpmTransacao;
import com.mpxds.mprest.repositories.MpmCargaRepository;
import com.mpxds.mprest.repositories.MpmDataProcessoRepository;
import com.mpxds.mprest.repositories.MpmDevedorRepository;
import com.mpxds.mprest.repositories.MpmItemEmolumentoXmlRepository;
import com.mpxds.mprest.repositories.MpmObservacaoRepository;
import com.mpxds.mprest.repositories.MpmPendenciaRepository;
import com.mpxds.mprest.repositories.MpmPessoaTituloRepository;
import com.mpxds.mprest.repositories.MpmSeloDistribuidorRepository;
import com.mpxds.mprest.repositories.MpmTituloAtoRepository;
import com.mpxds.mprest.repositories.MpmTituloRepository;
import com.mpxds.mprest.services.MpmAnoReferenciaService;
import com.mpxds.mprest.services.MpmApresentanteService;
import com.mpxds.mprest.services.MpmAtoComposicaoService;
import com.mpxds.mprest.services.MpmAtoService;
import com.mpxds.mprest.services.MpmBancoService;
import com.mpxds.mprest.services.MpmCidadeService;
import com.mpxds.mprest.services.MpmControleOficioService;
import com.mpxds.mprest.services.MpmCustasComposicaoService;
import com.mpxds.mprest.services.MpmDataProcessoService;
import com.mpxds.mprest.services.MpmDevedorService;
import com.mpxds.mprest.services.MpmEnderecoService;
import com.mpxds.mprest.services.MpmEndossoService;
import com.mpxds.mprest.services.MpmEstadoUfService;
import com.mpxds.mprest.services.MpmIdentificacaoService;
import com.mpxds.mprest.services.MpmImportarControleService;
import com.mpxds.mprest.services.MpmItemEmolumentoXmlService;
import com.mpxds.mprest.services.MpmObservacaoService;
import com.mpxds.mprest.services.MpmPessoaTituloService;
import com.mpxds.mprest.services.MpmRemessaService;
import com.mpxds.mprest.services.MpmSeloDistribuidorService;
import com.mpxds.mprest.services.MpmTituloService;
import com.mpxds.mprest.services.MpmTransacaoService;

@RestController
@RequestMapping(value="/mAtualizacaos")
public class MpmAtualizacaoResource {
	//
    @Autowired
	private MpmCargaRepository mpmCargaRepository;	
    @Autowired
	private MpmImportarControleService mpmImportarControleService;	
    @Autowired
	private MpmRemessaService mpmRemessaService;	
    @Autowired
	private MpmTransacaoService mpmTransacaoService;	
    @Autowired
	private MpmDataProcessoService mpmDataProcessoService;	
    @Autowired
	private MpmDataProcessoRepository mpmDataProcessoRepository;	
    @Autowired
	private MpmApresentanteService mpmApresentanteService;	
    @Autowired
	private MpmBancoService mpmBancoService;	
    @Autowired
	private MpmEstadoUfService mpmEstadoUfService;	
    @Autowired
	private MpmCidadeService mpmCidadeService;	
    @Autowired
	private MpmEnderecoService mpmEnderecoService;	
    @Autowired
	private MpmPessoaTituloService mpmPessoaTituloService;	
    @Autowired
	private MpmPessoaTituloRepository mpmPessoaTituloRepository;	
    @Autowired
	private MpmEndossoService mpmEndossoService;	
//  @Autowired
//	private MpmEndossoRepository mpmEndossoRepository;	
    @Autowired
	private MpmObservacaoService mpmObservacaoService;	
    @Autowired
	private MpmObservacaoRepository mpmObservacaoRepository;	
    @Autowired
	private MpmDevedorRepository mpmDevedorRepository;	
    @Autowired
	private MpmDevedorService mpmDevedorService;	
    @Autowired
	private MpmControleOficioService mpmControleOficioService;	
    @Autowired
	private MpmPendenciaRepository mpmPendenciaRepository;	
    @Autowired
	private MpmSeloDistribuidorService mpmSeloDistribuidorService;	
    @Autowired
	private MpmSeloDistribuidorRepository mpmSeloDistribuidorRepository;	
    @Autowired
	private MpmIdentificacaoService mpmIdentificacaoService;	
    @Autowired
	private MpmTituloRepository mpmTituloRepository;	
    @Autowired
	private MpmTituloAtoRepository mpmTituloAtoRepository;	
    @Autowired
	private MpmTituloService mpmTituloService;	
    @Autowired
	private MpmAnoReferenciaService mpmAnoReferenciaService;	
    @Autowired
	private MpmCustasComposicaoService mpmCustasComposicaoService;	
    @Autowired
	private MpmAtoService mpmAtoService;	
    @Autowired
	private MpmItemEmolumentoXmlService mpmItemEmolumentoXmlService;	
    @Autowired
	private MpmItemEmolumentoXmlRepository mpmItemEmolumentoXmlRepository;	
    @Autowired
	private MpmAtoComposicaoService mpmAtoComposicaoService;	

    // ---
    
    private String usuarioSistema = "??usuarioSistema??"; // ?? Verificar Prisco - ??Capturar 

    private String logAtualizacao;
	private SimpleDateFormat sdfDMY = new SimpleDateFormat("ddMMyyyy");
	private SimpleDateFormat sdfYMD = new SimpleDateFormat("yyyyMMdd");
	private SimpleDateFormat sdfDMYHMS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private MpmControleOficio mpmControleOficioAtu = null;
	
	// ---
    
//	@RequestMapping(value="/tipoCodigo", method=RequestMethod.GET)
//	public ResponseEntity<MpTabelaInterna> find(@RequestParam(value="tipo") String tipo,
//											    @RequestParam(value="codigo") String codigo) {

	
//	@Transactional(rollbackFor = Exception.class)
	@RequestMapping(value="/{nomeArquivo}/{dataImportar}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable String nomeArquivo,
									@PathVariable String dataImportar) { // Formato: ddMMyyyy !
		//
		this.logAtualizacao = "";
		
		try {
			this.trataAtualizacao(nomeArquivo, dataImportar);
			//
		} catch (ParseException e) {
			this.logAtualizacao = this.logAtualizacao + " ( TrataAtualizacao() - Error = " + e.getMessage();
		}
		//
		MpmCarga mpmObj = this.mpmCargaRepository.saveAndFlush(new MpmCarga(null, 
			"MpmAtualizacao - Arquivo/Data : " + nomeArquivo + " / " + dataImportar, this.logAtualizacao));
		return ResponseEntity.ok().body(mpmObj);
		//
	}
	
	public void trataAtualizacao(String nomeArquivo, String dataImportar) throws ParseException {
		// Trata MpmImportaControle...
		MpmImportarControle mpmImportarControleAtu = mpmImportarControleService.buscarDataDistribuicao(
																						sdfDMY.parse(dataImportar));
		if (null == mpmImportarControleAtu) {
			//
			this.logAtualizacao = this.logAtualizacao + 
					" ( TrataAtualizacao() - Error ... Não Existe MpmImportarControle (Data = " + dataImportar; 
			return; 
		}
		// Trata MpmRemessa ...
		MpmRemessa mpmRemessa = mpmRemessaService.buscarMpmImportarControleAndNomeArquivo(mpmImportarControleAtu,
																									nomeArquivo);
		if (null == mpmRemessa) {
			//
			this.logAtualizacao = this.logAtualizacao + 
					" ( TrataAtualizacao() - Error ... Não Existe MpmRemessa ( IC/Arquivo = " + 
															mpmImportarControleAtu.getId() + " / " + nomeArquivo; 
			return; 
		}
		// Trata MpmHeader ... Verificar com Prisco??? 1 to 1 ?
		MpmHeader mpmHeaderAtu = null;
		for (MpmHeader mpmHeaderX : mpmRemessa.getMpmHeaders()) {
			//
			
			mpmHeaderAtu = mpmHeaderX;
		}
		if (null == mpmHeaderAtu) {
			this.logAtualizacao = this.logAtualizacao + 
							" ( TrataAtualizacao() - Error ... Não Existe MpmHeader ( IC/Arquivo = " + 
															mpmImportarControleAtu.getId() + " / " + nomeArquivo; 
			return; 
		}
		// Trata MpmTransacao ... Verificar com Prisco??? 1 to 1 ?
		MpmTransacao mpmTransacaoAtu = null;
		for (MpmTransacao mpmTransacao : mpmRemessa.getMpmTransacaos()) {
			//
			mpmTransacaoAtu = mpmTransacao;
		}
		if (null == mpmTransacaoAtu) {
			this.logAtualizacao = this.logAtualizacao + 
							" ( TrataAtualizacao() - Error ... Não Existe MpmTransacao ( IC/Arquivo = " + 
															mpmImportarControleAtu.getId() + " / " + nomeArquivo; 
			return; 
		}
		// Trata MpmDataProcesso ...
		MpmDataProcesso mpmDataProcesso = mpmDataProcessoService.buscarDataProtocolo(sdfDMY.parse(dataImportar));
		if (null == mpmDataProcesso) {
			//
			mpmDataProcesso = new MpmDataProcesso(null, mpmImportarControleAtu.getDataProtocolo(),
																			mpmImportarControleAtu.getDataAte());
			mpmDataProcesso = this.mpmDataProcessoRepository.saveAndFlush(mpmDataProcesso);	

		}
		//
		String numeroProtocoloCartorioAtu = mpmTransacaoAtu.getNumeroProtocoloCartorio();
		
		List<MpmTransacao> mpmTransacaoList = mpmTransacaoService.findAll(); // Vrf.Prisco?
		for (MpmTransacao mpmTransacaoX : mpmTransacaoList) {
			//
			if (mpmTransacaoX.getNumeroProtocoloCartorio().equals(numeroProtocoloCartorioAtu)) {
				//
				MpmTitulo mpmTituloAtu = new MpmTitulo();

				MpmApresentante mpmApresentanteTitAtu = mpmApresentanteService.buscarCodigo(
																			mpmTransacaoX.getNumeroCodigoPortador());
				if (null == mpmApresentanteTitAtu) { // Verificar com Prisco? Sobrescreve dados Apresentante?
					//
					mpmApresentanteTitAtu = new MpmApresentante();
					
					mpmApresentanteTitAtu.setCodigo(mpmTransacaoX.getNumeroCodigoPortador());
				}
				//	
				mpmTituloAtu.setDataProtocolo(sdfDMY.parse(mpmTransacaoX.getDataProtocoloCartorio()));
				mpmTituloAtu.setNumeroProtocolo(mpmTransacaoX.getNumeroProtocoloCartorio());
				mpmTituloAtu.setDataAte(mpmImportarControleAtu.getDataAte());
				//
				Double valorDistribuicao = Double.valueOf(mpmTransacaoX.getValorCustasCartorioDist()) / 100;
				mpmTituloAtu.setValorDistribuicao(valorDistribuicao.toString());
				//
				MpmBanco mpmBancoAtu = null;
				
				if (mpmApresentanteTitAtu.getCodigo().trim().equals("0")) {
					//
					mpmApresentanteTitAtu.setNome(mpmTransacaoX.getNomePortador());
				} else {
					//
					if (nomeArquivo.indexOf("ATO") >= 0) {
						Integer codigoApresentante = Integer.parseInt(mpmApresentanteTitAtu.getCodigo().trim());
						mpmBancoAtu = mpmBancoService.buscarCodigo(codigoApresentante.toString());
					} else
						mpmBancoAtu = mpmBancoService.buscarCodigo(mpmApresentanteTitAtu.getCodigo().trim());
					//
					if (null == mpmBancoAtu) {
						//
						mpmApresentanteTitAtu.setNome(mpmTransacaoX.getNomePortador());
						mpmTituloAtu.setMensagemApresentante("INCLUA APRESENTANTE NA TAB E ALTERE O TÍTULO !!!");
					} else {
						// Preencha informações Apresentante a partir Tabela Bancos !
						List<MpmApresentante> mpmApresentanteTitAtus = new ArrayList<>();
						
						for (MpmApresentante mpmApresentateBanco : mpmBancoAtu.getMpmApresentantes()) {
							// Verificar Prisco ???
							mpmApresentanteTitAtu.setNome(mpmApresentateBanco.getNome());
							mpmApresentanteTitAtu.setMpmEndereco(mpmApresentateBanco.getMpmEndereco());
							mpmApresentanteTitAtu.setMpmBanco(mpmBancoAtu);
							mpmApresentanteTitAtu.setTipoDocumento("CNPJ"); // CGC ???
							mpmApresentanteTitAtu.setNumeroDocumento(mpmApresentateBanco.getNumeroDocumento());
							// Relations ...
							mpmBancoAtu.getMpmApresentantes().addAll(Arrays.asList(mpmApresentanteTitAtu));
							
							mpmApresentanteTitAtus.add(mpmApresentanteTitAtu);
						}
						//
						mpmTituloAtu.setMpmApresentantes(mpmApresentanteTitAtus);
					}
					//
					mpmTituloAtu.setAceite("N");
					// Trata FinsFAlimentares ...
					if (mpmTransacaoX.getFinsFAlimentares().trim().toUpperCase().equals("F"))
						mpmTituloAtu.setFinsFAlimentares("S");
					else
						mpmTituloAtu.setFinsFAlimentares("N");
					// Trata Convenio ...
					if (mpmTransacaoX.getConvenio().trim().toUpperCase().equals("N"))
						mpmTituloAtu.setConvenio("");
					else
						mpmTituloAtu.setConvenio(mpmTransacaoX.getConvenio().trim());
					//
					mpmTituloAtu.setEmpresa(mpmTransacaoX.getEmpresa().trim());
					//
					MpmPessoaTitulo mpmPessoaTituloFavorecido = mpmPessoaTituloService.buscarNomeAndIndFavorecido(
																		mpmTransacaoX.getNomeCedFav().trim(), true);
					if (null == mpmPessoaTituloFavorecido) {
						//
						mpmPessoaTituloFavorecido = new MpmPessoaTitulo();
						
						mpmPessoaTituloFavorecido.setNome(mpmTransacaoX.getNomeCedFav().trim());
						//
						mpmPessoaTituloFavorecido = this.mpmPessoaTituloRepository.saveAndFlush(
																						mpmPessoaTituloFavorecido);	
					}
					MpmPessoaTitulo mpmPessoaTituloSacador = mpmPessoaTituloService.buscarNomeAndIndSacador(
																	mpmTransacaoX.getNomeSacador().trim(), true);
					if (null == mpmPessoaTituloSacador) {
						//
						mpmPessoaTituloSacador = new MpmPessoaTitulo();

						mpmPessoaTituloSacador.setNome(mpmTransacaoX.getNomeSacador().trim());
						//
						mpmPessoaTituloSacador = this.mpmPessoaTituloRepository.saveAndFlush(mpmPessoaTituloSacador);	
					}
					// Titulo Link com MpmRemessa (DataProtocolo/NumeroProtoco) ??? 
					mpmTituloAtu.setDataProtocolo(mpmTransacaoX.getMpmRemessa().getMpmImportarControle().
																							getDataDistribuicao());
					mpmTituloAtu.setNumeroProtocolo(mpmTransacaoX.getNumeroProtocoloCartorio());
					mpmTituloAtu.setDataEmissao(sdfDMY.parse(mpmTransacaoX.getDataEmissaoTitulo()));
					//
					if (mpmTransacaoX.getDataVencimentoTitulo().trim().equals("99999900"))
						mpmTituloAtu.setDataVencimento(mpmTituloAtu.getDataEmissao());
					else
						mpmTituloAtu.setDataVencimento((sdfDMY.parse(mpmTransacaoX.getDataVencimentoTitulo().trim().
																								substring(0, 6))));
					//
					mpmTituloAtu.setNumeroTitulo(mpmTransacaoX.getNumeroTitulo());
//					mpmTituloAtu.setNumeroBanco(mpmTransacaoX.getNossoNumero()); ???
					// Trata MpmEndosso !
					MpmEndosso mpmEndossoAtu = null;
					
					String codigoEndosso = "S";
					if (!mpmTransacaoX.getTipoEndosso().isEmpty())
						codigoEndosso = mpmTransacaoX.getTipoEndosso().trim().toUpperCase();
					
					mpmEndossoAtu = mpmEndossoService.buscarCodigo(codigoEndosso);
					if (null == mpmEndossoAtu) {
						//
						this.logAtualizacao = this.logAtualizacao + 
									" ( TrataAtualizacao() - Error ... Não Existe MpmEndosso = " + codigoEndosso; 
						return; 
					}
					mpmTituloAtu.setMpmEndosso(mpmEndossoAtu);
					// Verificar Prisco ???
//					if (!mpmTransacaoX.getAgenciaCodCedente().isEmpty())
//						mpmTituloAtu.setAgenciaCodCedente(mpmTransacaoX.getAgenciaCodCedente());
					//
					mpmTituloAtu.setValor(new BigDecimal(mpmTransacaoX.getValorTitulo().replace(",", ".")));
					mpmTituloAtu.setSaldo(new BigDecimal(mpmTransacaoX.getSaldoTitulo().replace(",", ".")));
					mpmTituloAtu.setEspecieCodigo(mpmTransacaoX.getEspecieTitulo()); // Verificar Prisco ???
					//
					if (null == mpmBancoAtu)
						mpmTituloAtu.setTp_Apresentante("A");
					else {
						//
						if (mpmBancoAtu.getNome().trim().toUpperCase().indexOf("*BANCO*") >= 0)
							mpmTituloAtu.setTp_Apresentante("B");
						else
							if (mpmBancoAtu.getNome().trim().toUpperCase().indexOf("CAIXA ECON") >= 0)
								mpmTituloAtu.setTp_Apresentante("B");
							else
								if (mpmTituloAtu.getConvenio().trim().toUpperCase().equals("C")
								||  mpmTituloAtu.getConvenio().trim().toUpperCase().equals("E")
								||  mpmTituloAtu.getConvenio().trim().toUpperCase().equals("F"))
									mpmTituloAtu.setTp_Apresentante("B");
								else
									mpmTituloAtu.setTp_Apresentante("A");
						//
						if (mpmTituloAtu.getEspecieCodigo().trim().toUpperCase().equals("TJD"))
							mpmTituloAtu.setTp_Apresentante("A");
						
					}
					//
//					mpmTituloAtu.setEdital("N"); // Sem Uso ! 
//					mpmTituloAtu.setMicroEmpresa("N"); // Sem Uso ! 
					//
					mpmTituloAtu.setUsr_Titulo(usuarioSistema);
					mpmTituloAtu.setDt_Sist_Tit(sdfDMYHMS.format(new Date()));
					mpmTituloAtu.setOco_Bloqueia("N");
					mpmTituloAtu.setNihil("N");
					mpmTituloAtu.setAVista("N");
					// Trata MpmObservavao...
					String tipoObsAtu = mpmTituloAtu.getEspecieCodigo().trim().toUpperCase();					
					if (mpmTituloAtu.getConvenio().trim().toUpperCase().equals("C"))
						tipoObsAtu = "CONVENIO";
					
					MpmObservacao mpmObservacaoAtu = mpmObservacaoService.buscarTipo(tipoObsAtu);
					if (null == mpmObservacaoAtu) {
						//
						this.logAtualizacao = this.logAtualizacao + 
									" ( TrataAtualizacao() - Error ... Não Existe MpmObservacao = " + tipoObsAtu; 
						// Mockup ? Verificar Prisco ?
						mpmObservacaoAtu = new MpmObservacao(null, tipoObsAtu, "??? Rot.Atu.Verificar!");
						mpmObservacaoAtu =  mpmObservacaoRepository.saveAndFlush(mpmObservacaoAtu);
						// return; 
					}
					mpmTituloAtu.setMpmObservacao(mpmObservacaoAtu);
					// Registros DIGITAL... ??? Prisco Sem USO ! ???
//					mpmTituloAtu.setEncerrado("");
//					if (nomeArquivo.indexOf("ATO") >= 0)
//						if ((mpmTituloAtu.getEspecieCodigo().trim().length() == 3)
//						&&  (mpmTituloAtu.getEspecieCodigo().trim().toUpperCase().substring(0, 1).equals("I")))
//							mpmTituloAtu.setEncerrado("D");
					// Rotina para verificar se tem algum Ofício que impeça o PROTESTO DO TÍTULO !
					Boolean indOficio = this.verificaOficios(mpmTransacaoAtu);
					if (indOficio) {
						//
						mpmTituloAtu.setDt_Ocorrencia(sdfDMY.format(mpmTituloAtu.getDataProtocolo())); // Vrf.Prisco?
						mpmTituloAtu.setOco_Codigo("PD"); // (TÍTULO FICA PENDENTE) Vrf.Prisco? 
						mpmTituloAtu.setOco_Bloqueia("S"); 
						mpmTituloAtu.setOco_Usr(usuarioSistema); // ?? Capturar ?
						mpmTituloAtu.setDt_Sist_Oco(sdfDMYHMS.format(new Date()));
						// GRAVA Tabela Pendencias ???
						String obsTxt = "TEM OFICIO OU SUSPEITA DE OFICIO, " +
															this.mpmControleOficioAtu.getOrgaoEmissor() + ", " +
															this.mpmControleOficioAtu.getOficio() + ", " +
															this.mpmControleOficioAtu.getDataOficio(); // ???
						
						MpmPendencia mpmPendenciaAtu = new MpmPendencia(null,
																		mpmTituloAtu.getDataProtocolo(),
																		mpmTituloAtu.getDataProtocolo(),
																		mpmTituloAtu.getNumeroProtocolo(),
																		usuarioSistema, new Date(), "", obsTxt);
						// Grava no Final ou Inicia Transação?
						mpmPendenciaAtu = this.mpmPendenciaRepository.saveAndFlush(mpmPendenciaAtu);
						
						MpmSeloDistribuidor mpmSeloDistribuidorAtu = mpmSeloDistribuidorService.
																	buscarDataDistribuicaoAndNumeroDistribuicao(
																				mpmTituloAtu.getDataProtocolo(),
																				mpmTituloAtu.getNumeroProtocolo());
						if (null == mpmSeloDistribuidorAtu) {
							//
							mpmSeloDistribuidorAtu = new MpmSeloDistribuidor(null,
																			mpmTituloAtu.getDataProtocolo(),
																			mpmTituloAtu.getNumeroProtocolo(),
																			mpmTransacaoX.getSeloDistribuidor());
							// Grava no Final ou Inicia Transação?
							mpmSeloDistribuidorAtu = this.mpmSeloDistribuidorRepository.saveAndFlush(
																							mpmSeloDistribuidorAtu);
						}
						// Gravar os Devedores ... Titulo x Devedor (1toN) ?
						MpmDevedor mpmDevedorAtu = mpmDevedorService.buscarCodigo(
														// mpmImportarControleAtu.getDataProtocolo(), // ?Prisco?
														// mpmTransacaoX.getNumeroProtocoloCartorio(), // ?Prisco?
														Integer.parseInt(mpmTransacaoX.getNumeroSeqRegistro()));
						if (null == mpmDevedorAtu) {
							//
							MpmIdentificacao mpmIdentificacaoDevAtu = mpmIdentificacaoService.buscarCodigo(1);
							if (null == mpmIdentificacaoDevAtu) {
								//
								this.logAtualizacao = this.logAtualizacao + 
										" ( TrataAtualizacao() - Error ... Não Existe MpmIdentificacao = 1"; 
								return; 
							}
							//
							MpmEstadoUf mpmEstadoUfDevAtu = mpmEstadoUfService.buscarGravarMpmEstadoUfBySigla(
																					mpmTransacaoX.getUfDevedor());
							
							MpmCidade mpmCidadeDevAtu = mpmCidadeService.buscarGravarMpmCidadeByNomeAndMpmEstadoUF(
																					mpmTransacaoX.getCidadeDevedor(),
																					mpmEstadoUfDevAtu);
							MpmEndereco mpmEnderecoDevAtu = mpmEnderecoService.
								buscarGravarMpmEnderecoByLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
										mpmTransacaoX.getEnderecoDevedor(),
										"???", // Numero ? Vrf.Prisco ?
										"???", // Complemento ? Vrf.Prisco ?
										mpmTransacaoX.getCepDevedor(),
										mpmTransacaoX.getBairroDevedor(),
										mpmCidadeDevAtu);
							
							String tipoDocumentoDevAtu = "";
							String numeroDocumentoDevAtu = "";
							 // Prisco?CGC CNPJ ?
							if (mpmTransacaoX.getTipoIdentDevedor().trim().toUpperCase().equals("CGC")) {
								//
								tipoDocumentoDevAtu = "CNPJ";
								numeroDocumentoDevAtu = mpmTransacaoX.getNumeroIdentDevedor().trim();
							} else {
								tipoDocumentoDevAtu = mpmTransacaoX.getTipoIdentDevedor().trim();
								if (mpmTransacaoX.getNumeroIdentDevedor().trim().length() > 10)
									numeroDocumentoDevAtu = mpmTransacaoX.getNumeroIdentDevedor().trim().
																									substring(0, 11);
								else
									numeroDocumentoDevAtu = mpmTransacaoX.getNumeroIdentDevedor().trim();
							}
							
							mpmDevedorAtu = new MpmDevedor(null,
															mpmTransacaoX.getNomeDevedor(),
															Integer.parseInt(mpmTransacaoX.getNumeroSeqRegistro()),
															tipoDocumentoDevAtu,
															numeroDocumentoDevAtu,
															mpmIdentificacaoDevAtu,
															mpmEnderecoDevAtu);
							// Grava no Final ou Inicia Transação?
							mpmDevedorAtu = this.mpmDevedorRepository.saveAndFlush(mpmDevedorAtu);							//
							// Relations ...
							mpmTituloAtu.getMpmDevedors().addAll(Arrays.asList(mpmDevedorAtu));							
//							mpmTituloAtu.setCco_Dev(mpmTituloAtu.getCco_Dev() + 1); // Prisco Sem Uso! 
						}
						// 
					} else {
						//
						this.calculaCustas(mpmImportarControleAtu.getDataProtocolo(), numeroProtocoloCartorioAtu);
						//
						numeroProtocoloCartorioAtu = mpmTransacaoAtu.getNumeroProtocoloCartorio();
						
						break; // Vrf.Prisco ???
					}
					//
				}
				//
			} // -- END for (MpmTransacao mpmTransacaoX : mpmTransacaoList) ...
		}
	}
	
	public Boolean verificaOficios(MpmTransacao mpTransacaoVO) {
		//
		if (mpTransacaoVO.getTipoIdentDevedor().trim().toUpperCase().equals("CPF")) {
			//
			String numeroIdentDevedorVO = mpTransacaoVO.getNumeroIdentDevedor();
			if (numeroIdentDevedorVO.length() > 10)
				numeroIdentDevedorVO.substring(0, 10);
			//
			MpmControleOficio mpmControleOficioVO = mpmControleOficioService.buscarCpfCnpj(numeroIdentDevedorVO);
			if (null == mpmControleOficioVO)
				assert(true); // nop
			else
				return true;
		}
		if (mpTransacaoVO.getTipoIdentDevedor().trim().toUpperCase().equals("CGC")) {
			//
			String numeroIdentDevedorVO = mpTransacaoVO.getNumeroIdentDevedor();
			if (numeroIdentDevedorVO.length() > 8)
				numeroIdentDevedorVO.substring(0, 8);
			//
			MpmControleOficio mpmControleOficioVO = mpmControleOficioService.buscarCpfCnpj(numeroIdentDevedorVO);
			if (null == mpmControleOficioVO)
				assert(true); // nop
			else
				return true;
		}
		//
		MpmControleOficio mpmControleOficioNomeVO = mpmControleOficioService.buscarNomeDevedor(
																				mpTransacaoVO.getNomeDevedor(), "");
		if (null == mpmControleOficioNomeVO)
			assert(true); // nop
		else
			return true;
		//
		mpmControleOficioNomeVO = mpmControleOficioService.buscarNomeDevedor(mpTransacaoVO.getNomeDevedor(), "1");
		if (null == mpmControleOficioNomeVO)
			assert(true); // nop
		else
			return true;
		//
		mpmControleOficioNomeVO = mpmControleOficioService.buscarNomeDevedor(mpTransacaoVO.getNomeDevedor(), "2");
		if (null == mpmControleOficioNomeVO)
			assert(true); // nop
		else
			return true;
		
		//
		return false;
	}
	
	public void calculaCustas(Date dataProcotocoCC, String numeroProtocoloCC) {
		//
		MpmTitulo mpmTituloCC = mpmTituloService.buscarDataProtocoloAndNumeroProtocolo(dataProcotocoCC,
																								numeroProtocoloCC);
		if (null == mpmTituloCC) 
			return;
		//
		if (mpmTituloCC.getSaldo().compareTo(BigDecimal.ZERO) > 0) {
			// Trata MpmAnoReferencia!
			Calendar calCC = Calendar.getInstance();
			calCC.setTime(dataProcotocoCC);
			Integer anoReferenciaCC = calCC.get(Calendar.YEAR);
			//
			MpmAnoReferencia mpmAnoReferenciaCC = mpmAnoReferenciaService.buscarAnoReferencia(
																						anoReferenciaCC.toString());
			// Trata MpmCustasComposicao!
			String codAtoCC ="";
			
			List<MpmCustasComposicao> mpmCustasComposicaoCCs = mpmCustasComposicaoService.
											buscarMpmAnoReferenciaAndTabelaAndItem(mpmAnoReferenciaCC, "24", "1");
			for (MpmCustasComposicao mpmCustasComposicaoCC : mpmCustasComposicaoCCs) {
				//
				if (mpmTituloCC.getSaldo().compareTo(mpmCustasComposicaoCC.getAte()) <= 0) {
					//
					codAtoCC = mpmCustasComposicaoCC.getCodigoAto();
					
					mpmTituloCC.setFaixa(mpmCustasComposicaoCC.getSubItem()); // Prisco? Melhor Guardar CustComp?
					break;
				}
			}
			// Trata MpmAto !
			MpmAto mpmAtoCC = mpmAtoService.buscarMpmAnoReferenciaAndCodigoAtoAndAtoSequencia(mpmAnoReferenciaCC,
																									codAtoCC, "1");
			if (null == mpmAtoCC) 
				assert(true); // nop
			else {
				//
				mpmTituloCC.setTot_Emolu(mpmAtoCC.getEmolumento().toString());
				// Trata MmpTituloAto !
				MpmTituloAto mpmTituloAtoCC = new MpmTituloAto(null,
																mpmAtoCC.getEmolumento(),
																mpmAtoCC.getDistribuicao(),
																mpmAtoCC.getLei590(), // Lei489? 
																mpmAtoCC.getLei3217(), // Lei713?
																mpmAtoCC.getLei4664(),
																mpmAtoCC.getLei111(),
																mpmAtoCC.getLei3761(),
																mpmAtoCC.getLei6281(),
																mpmAtoCC.getValorVariavel(),
																mpmAtoCC.getEmolumento());
				
				mpmTituloAtoCC = this.mpmTituloAtoRepository.saveAndFlush(mpmTituloAtoCC);
				//
				mpmTituloCC.setMpmTituloAto(mpmTituloAtoCC);
				mpmTituloCC.setTot_Emolu(mpmAtoCC.getEmolumento().toString());
				
				mpmTituloCC.setTotalDeposito(mpmTituloAtoCC.getEmolumento().add(mpmTituloAtoCC.getValorVariavel())
																			.add(mpmTituloAtoCC.getEmolumento())
																			.add(mpmTituloAtoCC.getLei713())
																			.add(mpmTituloAtoCC.getLei489())
																			.add(mpmTituloAtoCC.getLei3761())
																			.add(mpmTituloAtoCC.getLei4664())
																			.add(mpmTituloAtoCC.getLei111())
																			.add(mpmTituloAtoCC.getLei6281()));
				
				mpmTituloCC.setTotalPagar(mpmTituloCC.getTotalDeposito().add(mpmTituloCC.getSaldo())
																		.add(mpmTituloAtoCC.getDistribuicao()));
				
				mpmTituloCC = this.mpmTituloRepository.saveAndFlush(mpmTituloCC);
				// Relations ...
				mpmTituloAtoCC.setMpmTitulo(mpmTituloCC);
				
				mpmTituloAtoCC = this.mpmTituloAtoRepository.saveAndFlush(mpmTituloAtoCC);
				
				// Trata MpmItemEmolumentoXML !
				String numeroControleCC = sdfYMD.format(mpmTituloCC.getDataProtocolo()) + 
																				mpmTituloCC.getNumeroProtocolo();
				
				List<MpmItemEmolumentoXml> mpmItemEmolumentoXmlCCs = mpmItemEmolumentoXmlService.
													buscarCodigoAtoAndAtoSequenciaAndDataPraticaAndNumeroControles(
																				mpmAtoCC.getCodigoAto(),
																				mpmAtoCC.getAtoSequencia(),
																				mpmTituloCC.getDataProtocolo(),
																				numeroControleCC);
				Boolean indMpmItemEmolumentoXmlCC = false;
				
				for (MpmItemEmolumentoXml mpmItemEmolumentoXmlCC : mpmItemEmolumentoXmlCCs) {
					//
					if (!mpmItemEmolumentoXmlCC.getItem().equals("*")) {
						//
						indMpmItemEmolumentoXmlCC = true;
						break;
					}
				}
				// Se não encontrou GRAVA ItemEmolumentoXML ???
				if (!indMpmItemEmolumentoXmlCC) { // False
					// Trata MpmAtoComposicao !
					List<MpmAtoComposicao> mpmAtoComposicaoCCs = mpmAtoCC.getMpmAtoComposicaos();

					for (MpmAtoComposicao mpmAtoComposicaoCC : mpmAtoComposicaoCCs) {
						//
						if (!mpmAtoComposicaoCC.getMpmCustasComposicao().getItem().equals("*")) {
							//
							MpmItemEmolumentoXml mpmItemEmolumentoXmlCC = new MpmItemEmolumentoXml(null,
									mpmTituloCC.getDataProtocolo(),
									mpmAtoCC.getCodigoAto(),
									mpmAtoCC.getAtoSequencia(),
									numeroControleCC, 
									// Verificar ? Prisco ?
									mpmAtoComposicaoCC.getMpmCustasComposicao().getTabela(),
									mpmAtoComposicaoCC.getMpmCustasComposicao().getItem(),
									mpmAtoComposicaoCC.getMpmCustasComposicao().getSubItem(),
									mpmAtoComposicaoCC.getMpmCustasComposicao().getDescricao(),
									mpmAtoComposicaoCC.getQuantidade(),
									"Complemento de emolumentos",
									"Exceção aplicada",
									mpmAtoComposicaoCC.getMpmCustasComposicao().getValorCusta(),
									"??"); // Ocorrencia?

							mpmItemEmolumentoXmlCC = this.mpmItemEmolumentoXmlRepository.saveAndFlush(mpmItemEmolumentoXmlCC);
						}
					} // END for (MpmAtoComposicao 
					//
					// ATUALIZA CUSTAS na Tabela TRANSACAO
				}
				
			}
			
		}
	}

}
