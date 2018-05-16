package com.mpxds.mprest.resources;

import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmCarga;
//import com.mpxds.mprest.domain.MpmEspecie;
import com.mpxds.mprest.domain.MpmHeader;
import com.mpxds.mprest.domain.MpmImportarControle;
import com.mpxds.mprest.domain.MpmOficio;
import com.mpxds.mprest.domain.MpmRemessa;
import com.mpxds.mprest.domain.MpmTrailler;
import com.mpxds.mprest.domain.MpmTransacao;
import com.mpxds.mprest.domain.xml.atox.Participante;
import com.mpxds.mprest.domain.xml.atox.Xml;
import com.mpxds.mprest.repositories.MpmCargaRepository;
import com.mpxds.mprest.repositories.MpmHeaderRepository;
import com.mpxds.mprest.repositories.MpmImportarControleRepository;
import com.mpxds.mprest.repositories.MpmOficioRepository;
import com.mpxds.mprest.repositories.MpmRemessaRepository;
import com.mpxds.mprest.repositories.MpmTraillerRepository;
import com.mpxds.mprest.repositories.MpmTransacaoRepository;
//import com.mpxds.mprest.services.MpmEspecieService;
import com.mpxds.mprest.services.MpmImportarControleService;
import com.mpxds.mprest.services.MpmOficioService;
import com.mpxds.mprest.util.MpUtility;

@RestController
@RequestMapping(value="/mImportacaos")
public class MpmImportacaoResource {
	//
    @Autowired
    private ResourcePatternResolver resourcePatternResolver;

    @Autowired
	private MpmCargaRepository mpmCargaRepository;	
//	@Autowired
//	private MpmCargaService mpmCargaService;

	@Autowired
	private MpmOficioRepository mpmOficioRepository;
	@Autowired
	private MpmOficioService mpmOficioService;

	@Autowired
	private MpmImportarControleRepository mpmImportarControleRepository;
	@Autowired
	private MpmImportarControleService mpmImportarControleService;

//	@Autowired
//	private MpmEspecieService mpmEspecieService;

	@Autowired
	private MpmRemessaRepository mpmRemessaRepository;

	@Autowired
	private MpmHeaderRepository mpmHeaderRepository;

	@Autowired
	private MpmTransacaoRepository mpmTransacaoRepository;

	@Autowired
	private MpmTraillerRepository mpmTraillerRepository;
	
	private String logImportacao;

	private List<MpmHeader> mpmHeaderList = new ArrayList<MpmHeader>();
	private List<MpmTrailler> mpmTraillerList = new ArrayList<MpmTrailler>();
	private List<MpmTransacao> mpmTransacaoList = new ArrayList<MpmTransacao>();
	
	private SimpleDateFormat sdfDMY = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat sdfDMYx = new SimpleDateFormat("ddMMyyyy");

	// ---
	
	@RequestMapping(value="/{dataImportar}", method=RequestMethod.GET)
	public ResponseEntity<?> findDataImportar(@PathVariable String dataImportar) {
		//
		this.logImportacao = "";
		
		try {
			this.trataImportacaoXML(sdfDMYx.parse(dataImportar));
			//
		} catch (ParseException e) {
			this.logImportacao = this.logImportacao + " ( TrataImportacaoXML() - Error = " + e.getMessage();
		}
		//
		MpmCarga mpmObj = this.mpmCargaRepository.saveAndFlush(new MpmCarga(null, "MpmImportacao",
																							logImportacao));
		return ResponseEntity.ok().body(mpmObj);
		//
	}
	
	@RequestMapping(value="/{arquivoTxt}/{dataImportar}/txt", method=RequestMethod.GET)
	public ResponseEntity<?> findTxt(@PathVariable String arquivoTxt, @PathVariable String dataImportar) {
		//
		this.logImportacao = "";
		
		try {
			Resource resource = new ClassPathResource("static/files/cartorio/of1/SeloDigital/" + arquivoTxt);
			
			File file = resource.getFile();
			//
			this.trataReceberTxt(file, sdfDMYx.parse(dataImportar));
			//
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		//
		MpmCarga mpmObj = this.mpmCargaRepository.saveAndFlush(new MpmCarga(null,
																			"MpmImportacao", logImportacao));
		return ResponseEntity.ok().body(mpmObj);
		//
	}
	
	@RequestMapping(value="/{arquivoTxtc}/{dataImportar}/txtc", method=RequestMethod.GET)
	public ResponseEntity<?> findTxtc(@PathVariable String arquivoTxtc, @PathVariable String dataImportar) {
		//
		this.logImportacao = "";
		
		try {
			Resource resource = new ClassPathResource("static/files/cartorio/of1/SeloDigital/" + arquivoTxtc);
			
			File file = resource.getFile();
			//
			this.trataComplementoTxtC(file, sdfDMYx.parse(dataImportar));
			//
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		//
		MpmCarga mpmObj = this.mpmCargaRepository.saveAndFlush(new MpmCarga(null, "MpmImportacao",
																							logImportacao));
		return ResponseEntity.ok().body(mpmObj);
		//
	}

	public void trataImportacaoXML(Date dataImportar) throws ParseException {
		//
		Calendar calX = Calendar.getInstance();
		// Captura Oficio Principal... MpmOficio Selecionado ! 
		MpmOficio mpmOficio = mpmOficioService.buscarIndSistemaPrincipal(true);
		if (null==mpmOficio) {
			//
			// this.logImportacao = logImportacao + " ( Erro MpmOficio (IndSitemaPrincipal = true" ;
			// Criar para Teste ? MOCKUP !
			mpmOficio = new MpmOficio(null, "1", "1º Oficio", "?", "?", "?", true, 
											"D:/temp/SeloDigital/Receber/Ano/Mes/Dia", "InformarDrive");

			mpmOficio = mpmOficioRepository.saveAndFlush(mpmOficio);
			// return;
		}
		// Captura Data... MpmImportarControle !
		MpmImportarControle mpmImportarControleXML = mpmImportarControleService.buscarDataDistribuicao(dataImportar);
		if (null == mpmImportarControleXML) {
			//
			// Criar para Teste ? MOCKUP !
			mpmImportarControleXML = new MpmImportarControle(null, dataImportar, null, null);
			
			mpmImportarControleXML = mpmImportarControleService.calculaDataProtocoloAndDataAte(
																							mpmImportarControleXML);
			mpmImportarControleXML = mpmImportarControleRepository.saveAndFlush(mpmImportarControleXML);
		}
		// Capturar Ano da dataDistribuição ! 
		calX.setTime(dataImportar);
		// Trata captura arquivos XML !
		//
		this.mpmHeaderList.clear();
		this.mpmTraillerList.clear();
		this.mpmTransacaoList.clear();
		//
		try {
			//
			String pathX = "static/files/cartorio/of1/SeloDigital/Receber/" + calX.get(Calendar.YEAR) + 
									"/" + (calX.get(Calendar.MONTH)+1) + "/" + calX.get(Calendar.DAY_OF_MONTH) ;

			System.out.println("MpmCargaXMLResource.trataImportacao() - ( PathX : " + pathX + " / Data : " + 
							this.sdfDMY.format(calX.getTime()) +  " / " + calX.get(Calendar.MONTH));

			Resource[] resources = resourcePatternResolver.getResources("classpath:" + pathX + "/*");
			
			for (Resource resource : resources) {
				//
				File fileResource = resource.getFile();
				
				this.receberFileXML(fileResource, mpmImportarControleXML);;
			}
			//
			this.gravaImportacao();
			//
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}
	}

	public void trataReceberTxt(File fileXML, Date dataImportar) throws ParseException {
		//
		// Captura Data... MpmImportarControle !
		MpmImportarControle mpmImportarControleTxt = mpmImportarControleService.buscarDataDistribuicao(dataImportar);
		if (null == mpmImportarControleTxt) {
			//
			// Criar para Teste ? MOCKUP !
			mpmImportarControleTxt = new MpmImportarControle(null, dataImportar, null, null);
			
			mpmImportarControleTxt = mpmImportarControleService.calculaDataProtocoloAndDataAte(
																							mpmImportarControleTxt);
			mpmImportarControleTxt = mpmImportarControleRepository.saveAndFlush(mpmImportarControleTxt);
		}
		//
		MpmRemessa mpmRemessaTxt = new MpmRemessa(null, mpmImportarControleTxt, fileXML.getName());
																				//, "??????", "??????");
		mpmRemessaTxt = this.mpmRemessaRepository.saveAndFlush(mpmRemessaTxt);
		//
		Integer contador = 0;

		// dataImportarSDF = dd/mm/aaaa
		//                   0123456789
		String dataImportarDMY = mpmImportarControleTxt.getDataDistribuicaoSDF().substring(0, 2) +
									mpmImportarControleTxt.getDataDistribuicaoSDF().substring(3, 5) +
									mpmImportarControleTxt.getDataDistribuicaoSDF().substring(8);
		//
		this.mpmHeaderList.clear();
		this.mpmTraillerList.clear();
		this.mpmTransacaoList.clear();
		//
		try (Scanner scanner = new Scanner(fileXML)) {
			//
			while (scanner.hasNextLine()) {
				//
				String line = scanner.nextLine();
				
				if (line.length() == 506) // was 500 ???
					assert(true); // nop
				else {
					this.logImportacao = this.logImportacao + ("Tamanho Linha(506)... inválida ! ( Tam.= " +
			    											line.length() + " / Linha = " + line);
			    	return; 
				}
				
				// Nome do Arquivo: Z030403.171 =arquivo com 506 caracteres
				// 		  Significa:z-Para Importar
				//			        03-3o.Oficio de Protesto
				//			        04-dia
				//			        03-mes
				//			        17-ano
				//			        1-sequencia						
				
				// 01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345
				// 0170717SDT3OPETP0000010470046800200448                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0001
				// 1582               7041702739869  FAZENDA NACIONAL - DIV ATIVA-SIMPLES NACIONALFAZENDA NACIONAL - DIV ATIVA-SIMPLES NACIONALCDA704170273981307179999990010000000176011500000002482803RIO DE JANEIRO       N1CJMC SERVICOS AUXILIARES DE ESCRITORIO LTDA. CGC1858869800017300000000000DO PAU FERRO 1407 APT   304                  22745055RIO DE JANEIRO      RJ030044552PROCURADORIA-GERAL DA FAZENDA NACIONAL       0000018626178202                   FREGUESIA                ECDA26859RBM                      F 0002
				// 1582               7041702740280  FAZENDA NACIONAL - DIV ATIVA-SIMPLES NACIONALFAZENDA NACIONAL - DIV ATIVA-SIMPLES NACIONALCDA704170274021307179999990010000000009600000000000140676RIO DE JANEIRO       N1WILL ACOUGUE LTDA - ME                       CGC1859546500010600000000000DE SEPETIBA 5775 B                           23545003RIO DE JANEIRO      RJ030044553PROCURADORIA-GERAL DA FAZENDA NACIONAL       0000010274178206                   SEPETIBA                 ECDA26863DQD                      F 0003
				// 1582               7041702740360  FAZENDA NACIONAL - DIV ATIVA-SIMPLES NACIONALFAZENDA NACIONAL - DIV ATIVA-SIMPLES NACIONALCDA704170274031307179999990010000000016717500000000232390RIO DE JANEIRO       N1CENTRAL DE CONSIGNADOS LTDA - ME             CGC1859576700017600000000000DOM HELDER CAMARA 5200 SALA: 904             20771004RIO DE JANEIRO      RJ030044554PROCURADORIA-GERAL DA FAZENDA NACIONAL       0000011943178207                   PILARES                  ECDA26864LGF                      F 0004
				// 9170717000000000000003170226015                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       0470
				// 01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789
				// 0040317SDT3OPETP0000010051004900030046                                                                                                                                                                                                                                                                                                                                                                                                                                                                          0001
				// 1A64               1400028071     TJRJ - 2014145799                            TJRJ - ATO EXEC CONJ 07/2014 ART. 3 PAR 1    CDT1400028071 2808142808140010000000015657000000000156570RIO DE JANEIRO       N1ERLY CRELIER MARTINS                         CPF0003661526979100000000000R PICAPAU N  87, CASA                        37550000POUSO ALEGRE        MG030075367TRIBUNAL DE JUSTICA DO RIO DE JANEIRO        0000008953301467                   SAO JOAO                 EAOO26753NRJ                E 0002
				// 1A64               1400027745     TJRJ - 2014143971                            TJRJ - ATO EXEC CONJ 07/2014 ART. 3 PAR 1    CDT1400027745 2608142608140010000000005377800000000053778RIO DE JANEIRO       N1MARIA CRISTINA GONCALVES DE CARVALHO         CPF0001827148039100000000000R MAGALHAES FILHO N  2.548                   64002450TERESINA            PI030075368TRIBUNAL DE JUSTICA DO RIO DE JANEIRO        0000005487301469                   MARQUES DE PARANAGUA     EAOO26755GDR                E 0003
				// 1772                              FACA COMERCIO DE PRODUTOS ESCOLARES LTDA     FACA COMERCIO DE PRODUTOS ESCOLARES LTDA     CH 000310     1007141007140010000000002123100000000021231RIO DE JANEIRO       A1CLAUDIA REGINA LEITE PEREIRA                 CPF0000117304778600000000000ESTRADA DO RIO MORTO 95 BL 04APT 102         22783210RIO DE JANEIRO      RJ030075411FACA COMERCIO DE PRODUTOS ESCOLARES LTDA     0000003519301644                   VARGEM GRANDE            EAOO26930AJE                C 0046
				// 1930                              MICRO CAMPO GRANDE EDICOES CULTURAIS LTDA    MICRO CAMPO GRANDE EDICOES CULTURAIS LTDA    CH 000001     1706141706140010000000002400000000000024000RIO DE JANEIRO       A1VILSON FERREIRA                              CPF0007631192979100000000000RUA TOQUIO 26                                21825030RIO DE JANEIRO      RJ030075412MICRO CAMPO GRANDE EDICOES CULTURAIS LT      0000003519301652                   BANGU                    EAOO26938XAC                C 0047
				// 1901               000000000003491AMPLA                                        AMPLA                                        DMI3491       1004142605140010000000251255000000002512550RIO DE JANEIRO      MN1SEE-CIEP DEP DAVID QUINDERE                  CGC4249865900016000000000000AVENIDA PROFESSOR PEREIRA REIS N 119/2  ANDAR20220800RIO DE JANEIRO      RJ030075651AMPLA ENERGIA E SERVICOS S/A                 0000014835302608                                            EAOO26940IOR                C 0048
				// 1901               000000000003459AMPLA                                        AMPLA                                        DMI3459       1308122509140010000000093108700000000931087RIO DE JANEIRO      MN1PMERJ 7BPM BATAL CASTELO BRANCO              CGC4249872500036300000000000EVARISTO DA VEIGA, 78                        20031040RIO DE JANEIRO      RJ030075652AMPLA ENERGIA E SERVICOS S/A                 0000014168302615                                            EAOO26947TLT                C 0049
				// 1901               000000000003366AMPLA                                        AMPLA                                        DMI3366       1206142507140010000000122250600000001222506RIO DE JANEIRO      MN1PMERJ 12BPM BAT MASC DE MORAIS               CGC4249872500036300000000000EVARISTO DA VEIGA, 78                        20031040RIO DE JANEIRO      RJ030075653AMPLA ENERGIA E SERVICOS S/A                 0000014835302617                                            EAOO26949FJQ                C 0050
				// 9041214000000000000000007636364                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0051
				//
				// ----------------
				// Trata HEADER ...
				// ----------------
				if (line.substring(0, 1).equals("0")) {
					//
					MpmHeader mpmHeader = new MpmHeader();
					
//					mpmHeader.setMpmRemessa(this.mpmRemessa);
					//
					if (!line.substring(1, 7).equals(dataImportarDMY)) {
						//
						this.logImportacao = this.logImportacao + "(ERROR) HEADER DatasDivergentes (Dt.Importar = " +
														dataImportarDMY + " / Data Arquivo = " + line.substring(1, 7);
					}
					//
					mpmHeader.setIdenTransRemetente(line.substring(7, 10));
					mpmHeader.setIdenTransDestinatario(line.substring(10, 13));
					mpmHeader.setIdenTransTipo(line.substring(13, 16));
					mpmHeader.setNumeroSeqRemessa(line.substring(16, 22));
					mpmHeader.setQtdRegRemessa(line.substring(22, 26));
					mpmHeader.setQtdTitRemessa(line.substring(26, 30));
					mpmHeader.setQtdIndRemessa(line.substring(30, 34));
					mpmHeader.setQtdOrigRemessa(line.substring(34, 38));
					mpmHeader.setComplementoRegistro(line.substring(38, 502).trim()); // ??
					mpmHeader.setNumeroSeqRegistro(line.substring(502, 506));

					mpmHeader.setAgenciaCentralizadora(" "); // ???
					mpmHeader.setVersaoLayout(" "); // ???					
					mpmHeader.setTipoMovimento("TXT");					
					//
					mpmHeaderList.add(mpmHeader);
				}
				// -------------------
				// Trata TRANSACAO ...
				// -------------------
				if (line.substring(0, 1).equals("1")) {
					//
					MpmTransacao mpmTransacao = new MpmTransacao();
					
					mpmTransacao.setMpmRemessa(mpmRemessaTxt);
					//
					mpmTransacao.setNumeroCodigoPortador(line.substring(1, 4));
					mpmTransacao.setAgenciaCodCedente(line.substring(4, 19));
					mpmTransacao.setNossoNumero(line.substring(19, 34));
					mpmTransacao.setNomeSacador(line.substring(34, 79));
					mpmTransacao.setNomeCedFav(line.substring(79, 124));
					// Trata MpmEspecie ! 
					mpmTransacao.setEspecieTitulo(line.substring(124, 127));
//					if (mpmTransacao.getEspecieTitulo().trim().equals("20")) {
//						//
//						MpmEspecie mpmEspecie = mpmEspecieService.buscarCodigo("20"); // ????
//						if (null == mpmEspecie)
//							mpmTransacao.setEspecieTitulo(" ");
//						else
//							mpmTransacao.setEspecieTitulo(mpmEspecie.getDescricao());
//					}				
					//
					mpmTransacao.setNumeroTitulo(line.substring(127, 138));
					mpmTransacao.setDataEmissaoTitulo(line.substring(138, 144)); // ?? + "00");
					mpmTransacao.setDataVencimentoTitulo(line.substring(144, 150)); // ??  + "00");
					mpmTransacao.setTipoMoeda(line.substring(150, 153));
					mpmTransacao.setValorTitulo(line.substring(153, 167));
					mpmTransacao.setSaldoTitulo(line.substring(167, 181));
					mpmTransacao.setPracaPagamento(line.substring(181, 201));
					mpmTransacao.setTipoEndosso(line.substring(201, 202));
					mpmTransacao.setInformacaoAceite(line.substring(202, 203));
					mpmTransacao.setNumeroControleDevedor(line.substring(203, 204));
					mpmTransacao.setNomeDevedor(line.substring(204, 249));
					mpmTransacao.setTipoIdentDevedor(line.substring(249, 252));
					mpmTransacao.setNumeroIdentDevedor(line.substring(252, 266));
					mpmTransacao.setDocumentoDevedor(line.substring(266, 277));
					mpmTransacao.setEnderecoDevedor(line.substring(277, 322));
					mpmTransacao.setCepDevedor(line.substring(322, 330));
					mpmTransacao.setCidadeDevedor(line.substring(330, 350));
					mpmTransacao.setUfDevedor(line.substring(350, 352));
					mpmTransacao.setNumeroCartorio(line.substring(352, 354));
					mpmTransacao.setNumeroProtocoloCartorio(line.substring(354, 361)); // ?? "000" + ...
					mpmTransacao.setDataProtocoloCartorio(dataImportarDMY);
					mpmTransacao.setNomePortador(line.substring(361, 406));
					mpmTransacao.setValorCustasCartorioDist(line.substring(406, 416));
					mpmTransacao.setNumeroDistribuicao(line.substring(416, 423));
					// Espa�os Reservado (line.substring(423, 466));
					mpmTransacao.setBairroDevedor(" "); // line.substring(441, 466)); ??
					mpmTransacao.setSeloDistribuidor(line.substring(466, 478));
					// Espa�os Reservado (line.substring(478, 499));
					mpmTransacao.setFinsFAlimentares(line.substring(499, 500));
					mpmTransacao.setConvenio(line.substring(500, 501));
					mpmTransacao.setEmpresa(line.substring(501, 502));
					mpmTransacao.setNumeroSeqRegistro(line.substring(502, 506));

					mpmTransacao.setComplementoRegistro(" ");
					mpmTransacao.setTipoMovimento("TXT");					
					//
					mpmTransacaoList.add(mpmTransacao);
				}
				// ------------------
				// Trata TRAILLER ...
				// ------------------
				if (line.substring(0, 1).equals("9")) {
					//
					MpmTrailler mpmTrailler = new MpmTrailler();
					
					mpmTrailler.setMpmRemessa(mpmRemessaTxt);
					//
					mpmTrailler.setDataDistribuicao("00000000"); // ??
					mpmTrailler.setSomaSegQtdRemessa(line.substring(7, 22));
					mpmTrailler.setSomaSegValRemessa(line.substring(22, 40));
					mpmTrailler.setComplementoRegistro(line.substring(40, 502).trim()); // ???
					mpmTrailler.setNumeroSeqRegistro(line.substring(502, 506));
					mpmTrailler.setTipoMovimento("TXT");					
					//
					mpmTraillerList.add(mpmTrailler);
				}
				//
//				System.out.println("MpRecebimentoBean.receber().line =  ( " + line);			
				contador++;
				//
			}
			//
			scanner.close();
			//
			this.gravaImportacao();
			//
			this.logImportacao = this.logImportacao + ("RECEBE TXT OK : (Arquivo : " +
											mpmRemessaTxt.getNomeArquivo() + " / Cont= " + contador + " )");
			//
		} catch (IOException e) {
			System.out.println("Error : ( e = " + e.toString());
		}
	}

	public void trataComplementoTxtC(File fileX, Date dataImportar) throws ParseException {
		//
		// Nome do Arquivo: Z030403.171 =arquivo com 440 caracteres
		// 		  Significa:z-Para Importar
		//			        03-3o.Oficio de Protesto
		//			        04-dia
		//			        03-mes
		//			        17-ano
		//			        1-sequencia		

		// Captura Data... MpmImportarControle !
		MpmImportarControle mpmImportarControleTxtc = mpmImportarControleService.buscarDataDistribuicao(dataImportar);
		if (null == mpmImportarControleTxtc) {
			//
			// Criar para Teste ? MOCKUP !
			mpmImportarControleTxtc = new MpmImportarControle(null, dataImportar, null, null);
			
			mpmImportarControleTxtc = mpmImportarControleService.calculaDataProtocoloAndDataAte(
																							mpmImportarControleTxtc);
			mpmImportarControleTxtc = mpmImportarControleRepository.saveAndFlush(mpmImportarControleTxtc);
		}
		//
		MpmRemessa mpmRemessaTxtc = new MpmRemessa(null, mpmImportarControleTxtc, fileX.getName());
																				//, "??????", "??????");
		mpmRemessaTxtc = this.mpmRemessaRepository.saveAndFlush(mpmRemessaTxtc);
		//
//		if (this.mpmRemessa.getNomeArquivo().length() == 9)
//			assert(true); // nop
//		else {
//	    	System.out.println("Nome Arquivo... inválido !");
//	    	return;
//		}
		//
		// dataImportarSDF = dd/mm/aaaa
		//                   0123456789
		String dataImportarDMY = mpmImportarControleTxtc.getDataDistribuicaoSDF().substring(0, 2) +
									mpmImportarControleTxtc.getDataDistribuicaoSDF().substring(3, 5) +
									mpmImportarControleTxtc.getDataDistribuicaoSDF().substring(8);
		//		
		Integer contador = 0;

		this.mpmHeaderList.clear();
		this.mpmTraillerList.clear();
		this.mpmTransacaoList.clear();
		//
		try (Scanner scanner = new Scanner(fileX)) {
			//
			while (scanner.hasNextLine()) {
				//
				String line = scanner.nextLine();
				
				if (line.length() == 440)
					assert(true); // nop
				else {
					this.logImportacao = this.logImportacao + ("Tamanho Linha(440)... inválida ! ( Tam.= " +
			    										line.length() + " / Linha = " + line);
			    	return; 
				}
				
				// 01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789
				// 0170816SDT1OPETP0000010005000300000003                                                                                                                                                                                                                                                                                                                                                                                                              0001
				// 1                                 PEPSICO DO BRASIL LTDA                       PEPSICO DO BRASIL LTDA                       CH 000202     290616290616   0000000009429200000000094292                      0MINI MERCADO AMERICO DA ROCHA 1497 L ME      CGC00550322000151           RUA AMERICO ROCHA 1497 COMPLE C              21555300RIO DE JANEIRO      RJ010060224PEPSICO DO BRASIL LTDA                       00000088570240899EBRY02689SQN 0002
				// 1                                 PEPSICO DO BRASIL LTDA                       PEPSICO DO BRASIL LTDA                       CH 000263     180616180616   0000000015054900000000150549                      0ANTONIO MARQUES DIAS                         CPF   10377450782           RUA ANDRADE ARAUJO 1150 OSWALDO CRUZ         21341312RIO DE JANEIRO      RJ010060225PEPSICO DO BRASIL LTDA                       00000104250240900EBRY02690BJU 0003
				// 1                                 BANCO BRADESCO S/A                           BANCO BRADESCO S/A                           CCB003559119  190214260716   0000000176193900000001761939                      0BRUNO DE ARAUJO SANTANA                      CPF   05455031759           RUA CANDIDO BENICIO 2610 SACA 03             22733001RIO DE JANEIRO      RJ010060226BANCO BRADESCO S/A                           00000173630240907EBRY02697JXW 0004
				// 917081600018000000000002006780                                                                                                                                                                                                                                                                                                                                                                                                                      0005
				// 01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789

				// ----------------
				// Trata HEADER ...
				// ----------------
				if (line.substring(0, 1).equals("0")) {
					//
					MpmHeader mpmHeader = new MpmHeader();
					
//					mpmHeader.setMpmRemessa(mpmRemessa);
					//
					if (!line.substring(1, 7).equals(dataImportarDMY)) {
						//
						this.logImportacao = this.logImportacao + ("(ERROR) HEADER. DatasDivergentes (Dt.Importar= " +
															dataImportarDMY + " / DataArq. = " + line.substring(1, 7));
						return;
					}
					//
					mpmHeader.setIdenTransRemetente(line.substring(7, 10));
					mpmHeader.setIdenTransDestinatario(line.substring(10, 13));
					mpmHeader.setIdenTransTipo(line.substring(13, 16));
					mpmHeader.setNumeroSeqRemessa(line.substring(16, 22));
					mpmHeader.setQtdRegRemessa(line.substring(22, 26));
					mpmHeader.setQtdTitRemessa(line.substring(26, 30));
					mpmHeader.setQtdIndRemessa(line.substring(30, 34));
					mpmHeader.setQtdOrigRemessa(line.substring(34, 38));
					mpmHeader.setComplementoRegistro(line.substring(38, 436).trim()); // ??
					mpmHeader.setNumeroSeqRegistro(line.substring(436, 440));

					mpmHeader.setAgenciaCentralizadora(" "); // ???
					mpmHeader.setVersaoLayout(" "); // ???					
					mpmHeader.setTipoMovimento("TXTC");					
					//
					mpmHeaderList.add(mpmHeader);
				}
				// -------------------
				// Trata TRANSACAO ...
				// -------------------
				if (line.substring(0, 1).equals("1")) {
					//
					MpmTransacao mpmTransacao = new MpmTransacao();
					
					mpmTransacao.setMpmRemessa(mpmRemessaTxtc);
					//
					mpmTransacao.setNumeroCodigoPortador(line.substring(1, 4));
					mpmTransacao.setAgenciaCodCedente(line.substring(4, 19));
					mpmTransacao.setNossoNumero(line.substring(19, 34));
					mpmTransacao.setNomeSacador(line.substring(34, 79));
					mpmTransacao.setNomeCedFav(line.substring(79, 124));
					// Trata MpmEspecie !
					mpmTransacao.setEspecieTitulo(line.substring(124, 127));
//					if (mpmTransacao.getEspecieTitulo().trim().equals("20")) {
//						//
//						MpmEspecie mpmEspecie = mpmEspecieService.buscarCodigo("20"); // ????
//						if (null == mpmEspecie)
//							mpmTransacao.setEspecieTitulo(" ");
//						else
//							mpmTransacao.setEspecieTitulo(mpmEspecie.getDescricao());
//					}				
					//
					mpmTransacao.setNumeroTitulo(line.substring(127, 138));
					mpmTransacao.setDataEmissaoTitulo(line.substring(138, 144)); // ?? + "00");
					mpmTransacao.setDataVencimentoTitulo(line.substring(144, 150)); // ?? + "00");
					mpmTransacao.setTipoMoeda(line.substring(150, 153));
					mpmTransacao.setValorTitulo(line.substring(153, 167));
					mpmTransacao.setSaldoTitulo(line.substring(167, 181));
					mpmTransacao.setPracaPagamento(line.substring(181, 201));
					mpmTransacao.setTipoEndosso(line.substring(201, 202));
					mpmTransacao.setInformacaoAceite(line.substring(202, 203));
					mpmTransacao.setNumeroControleDevedor(line.substring(203, 204));
					mpmTransacao.setNomeDevedor(line.substring(204, 249));
					mpmTransacao.setTipoIdentDevedor(line.substring(249, 252));
					mpmTransacao.setNumeroIdentDevedor(line.substring(252, 266));
					mpmTransacao.setDocumentoDevedor(line.substring(266, 277));
					mpmTransacao.setEnderecoDevedor(line.substring(277, 322));
					mpmTransacao.setCepDevedor(line.substring(322, 330));
					mpmTransacao.setCidadeDevedor(line.substring(330, 350));
					mpmTransacao.setUfDevedor(line.substring(350, 352));
					mpmTransacao.setNumeroCartorio(line.substring(352, 354));
					mpmTransacao.setNumeroProtocoloCartorio(line.substring(354, 361)); // ?? "000" + ...
					mpmTransacao.setDataProtocoloCartorio(dataImportarDMY);
					mpmTransacao.setNomePortador(line.substring(361, 406));
					mpmTransacao.setValorCustasCartorioDist(line.substring(406, 416));
					mpmTransacao.setNumeroDistribuicao(line.substring(416, 423));
					mpmTransacao.setSeloDistribuidor(line.substring(423, 435));
					mpmTransacao.setComplementoRegistro(" "); // ???
					mpmTransacao.setConvenio(line.substring(435, 436));
					mpmTransacao.setNumeroSeqRegistro(line.substring(436, 440));
					mpmTransacao.setTipoMovimento("TXTC");					
					//
					mpmTransacaoList.add(mpmTransacao);
				}
				// ------------------
				// Trata TRAILLER ...
				// ------------------
				if (line.substring(0, 1).equals("9")) {
					//
					MpmTrailler mpmTrailler = new MpmTrailler();
					
					mpmTrailler.setMpmRemessa(mpmRemessaTxtc);
					//
					mpmTrailler.setSomaSegQtdRemessa(line.substring(7, 22));
					mpmTrailler.setSomaSegValRemessa(line.substring(22, 40));
					mpmTrailler.setComplementoRegistro(line.substring(40, 436).trim()); // ???
					mpmTrailler.setNumeroSeqRegistro(line.substring(436, 440));
					mpmTrailler.setTipoMovimento("TXTC");					
					//
					mpmTraillerList.add(mpmTrailler);
				}
				//
//				System.out.println("MpRecebimentoBean.receber().line =  ( " + line);

				contador++;
				//
			}
			//
			scanner.close();
			//
			this.gravaImportacao();
			//
		} catch (IOException e) {
			System.out.println("Error : ( e = " + e.toString());
		}
	}

	public void receberFileXML(File fileXML, MpmImportarControle mpmImportarControleXML) throws JAXBException {
		//
		MpmRemessa mpmRemessaXML = new MpmRemessa(null, mpmImportarControleXML,	fileXML.getName());
		mpmRemessaXML = this.mpmRemessaRepository.saveAndFlush(mpmRemessaXML);
		//
		MpmHeader mpmHeader = new MpmHeader(null, mpmRemessaXML, "", "", "", "", "", "",
																		"", "", "", "", "", "0001", "IMPORTACAO"); 
		//
		this.mpmHeaderList.add(mpmHeader);

		String textoXML = this.capturarAtoXml(fileXML);
		//		
		StringReader readerXML = new StringReader(textoXML);
		// Converte XML na Classe Xml !
		JAXBContext jaxbContext = JAXBContext.newInstance(Xml.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Xml xml = (Xml) jaxbUnmarshaller.unmarshal(readerXML);
		//
		MpmTransacao mpmTransacaoXML = new MpmTransacao();
		//
		mpmTransacaoXML.setMpmRemessa(mpmRemessaXML);
		
		mpmTransacaoXML.setDataProtocoloCartorio(MpUtility.mpFormataData(xml.getAto().getInformacoesAto().
																									getDataAto()));
		mpmTransacaoXML.setNumeroProtocoloCartorio(MpUtility.mpFormataNumero(xml.getAto().getInformacoesAto().
																					 	getNumeroProtocolo(), 10));
		mpmTransacaoXML.setNumeroDistribuicao(xml.getAto().getInformacoesAto().getNumeroRegistro()); 
		mpmTransacaoXML.setConvenio(xml.getAto().getInformacoesAto().getConvenio()); 
		mpmTransacaoXML.setPracaPagamento(xml.getAto().getInformacoesAto().getTitulo().getPraca());
		mpmTransacaoXML.setDataEmissaoTitulo(MpUtility.mpFormataData(xml.getAto().getInformacoesAto().getTitulo().
																							getDataEmissao()));
		//
		if (xml.getAto().getInformacoesAto().getTitulo().getDataVencimento().trim().equals("99/99/9999")
		||  xml.getAto().getInformacoesAto().getTitulo().getDataVencimento().trim().equals("  /  /    "))
			mpmTransacaoXML.setDataVencimentoTitulo(mpmTransacaoXML.getDataEmissaoTitulo());
		else
			mpmTransacaoXML.setDataVencimentoTitulo(MpUtility.mpFormataData(xml.getAto().getInformacoesAto().
																				getTitulo().getDataVencimento()));
		//
		mpmTransacaoXML.setNumeroTitulo(xml.getAto().getInformacoesAto().getTitulo().getNumeroTitulo());
		mpmTransacaoXML.setNossoNumero(xml.getAto().getInformacoesAto().getTitulo().getNumeroControlePortador());
		mpmTransacaoXML.setTipoEndosso(xml.getAto().getInformacoesAto().getTitulo().getEndosso());
		mpmTransacaoXML.setInformacaoAceite(xml.getAto().getInformacoesAto().getTitulo().getAceite());
		// Capturar Id da Tabela Especie (Especie + No_codigo= ???) ????
		mpmTransacaoXML.setEspecieTitulo(xml.getAto().getInformacoesAto().getTitulo().getEspecie()); // ?? 
		//
		mpmTransacaoXML.setTipoMoeda(xml.getAto().getInformacoesAto().getTitulo().getMoeda());
		mpmTransacaoXML.setAgenciaCodCedente(xml.getAto().getInformacoesAto().getTitulo().
																					getAgenciasCedenteDepositaria());
		// Obs.: Retirar o (.) e completa com zeros a esquerda totalizando 14 caracteres ...
		mpmTransacaoXML.setValorTitulo(MpUtility.mpFormataNumero(xml.getAto().getInformacoesAto().getTitulo().
																							getValorTitulo(), 14));
		mpmTransacaoXML.setSaldoTitulo(MpUtility.mpFormataNumero(xml.getAto().getInformacoesAto().getTitulo().
																							getValorProtestar(), 14));
		//
		Participante participanteTipo4_36 = null;  // CedenteFavorecido ...
		Participante participanteTipo8 = null;     // Devedor ...
		Participante participanteTipo34 = null;    // Portador ...
		Participante participanteTipo35 = null;    // Sacador ...
		Participante participanteTipoOutro = null; // Outro ...
		//
		for (Participante participante : xml.getAto().getInformacoesAto().getParticipantes()) {
			//
			if (participante.getTipo().equals("4") 
			||  participante.getTipo().equals("36")) 
				participanteTipo4_36 = participante;
			else if (participante.getTipo().equals("8"))
				participanteTipo8 = participante;
			else if (participante.getTipo().equals("34"))
				participanteTipo34 = participante;
			else if (participante.getTipo().equals("35"))
				participanteTipo35 = participante;
			else
				participanteTipoOutro = participante;
		}
		// Tipo = 34 (Portador) ...
		mpmTransacaoXML.setNomePortador(participanteTipo34.getNome());
		mpmTransacaoXML.setNumeroCodigoPortador(participanteTipo34.getDocumento().getNumero());
		// Tipo = 35 (Sacador) ...
		mpmTransacaoXML.setNomeSacador(participanteTipo35.getNome());
		mpmTransacaoXML.setDocumentoSacador(participanteTipo35.getCPFCNPJ());
		mpmTransacaoXML.setUfSacador(participanteTipo35.getEndereco().getUF());
		mpmTransacaoXML.setCidadeSacador(participanteTipo35.getEndereco().getCidade());
		mpmTransacaoXML.setCepSacador(participanteTipo35.getEndereco().getCEP());
		mpmTransacaoXML.setEnderecoSacador(participanteTipo35.getEndereco().getLogradouro());
		// Tipo = 4 ou 36 (Cedente / Favorecido) ...
		mpmTransacaoXML.setNomeCedFav(participanteTipo4_36.getNome()); 
		// Tipo = 8 (Devedor) ...
		mpmTransacaoXML.setNomeDevedor(participanteTipo8.getNome());
		//
		if (participanteTipo8.getTipoPessoa().equals("J"))
			mpmTransacaoXML.setTipoIdentDevedor("CGC"); 
		else
			mpmTransacaoXML.setTipoIdentDevedor("CPF"); 
		//
		mpmTransacaoXML.setNumeroIdentDevedor(participanteTipo8.getCPFCNPJ());
		mpmTransacaoXML.setUfDevedor(participanteTipo8.getEndereco().getUF());
		mpmTransacaoXML.setCidadeDevedor(participanteTipo8.getEndereco().getCidade());
		mpmTransacaoXML.setCepDevedor(participanteTipo8.getEndereco().getCEP());
		mpmTransacaoXML.setBairroDevedor(participanteTipo8.getEndereco().getBairro());
		mpmTransacaoXML.setEnderecoDevedor(participanteTipo8.getEndereco().getLogradouro());
		//
		if (null != participanteTipo8)
			mpmTransacaoXML.setNumeroControleDevedor("1");		
		// Tipo = Outro (Nenhum dos demais acima) ...
		if (null != participanteTipoOutro)
			mpmTransacaoXML.setNomePortador(participanteTipoOutro.getTipo() + "= n�o identificado -"
																			+ participanteTipoOutro.getNome());
		// ----- Verificar com Prisco ????
		
		mpmTransacaoXML.setDocumentoDevedor(" ");
		mpmTransacaoXML.setComplementoRegistro(" "); // ??
		mpmTransacaoXML.setSeloDistribuidor(" "); // ??
		mpmTransacaoXML.setFinsFAlimentares(" "); // ??
		mpmTransacaoXML.setEmpresa(" "); // ??
		mpmTransacaoXML.setNumeroSeqRegistro(" "); // ??		
		//
		mpmTransacaoXML.setNumeroCartorio(" "); // ??
		mpmTransacaoXML.setTipoOcorrencia(" "); // ??
		mpmTransacaoXML.setValorCustasCartorioDist(MpUtility.mpFormataNumero(xml.getAto().getInformacoesAto().
										getEmolumentos().getValorTotal(), 14)); // ?? Prisco Identificou!28.07.2017
		mpmTransacaoXML.setDeclaracaoPortador(" "); // ??
		mpmTransacaoXML.setDataOcorrenciaCartorio(" "); // ??
		mpmTransacaoXML.setCodigoIrregularidade(" "); // ??
		mpmTransacaoXML.setTipoMovimento("XML");
		//
		this.mpmTransacaoList.add(mpmTransacaoXML);
		//
	}

	public String capturarAtoXml(File fileCX) {
		//
		Boolean indAtoIni = false;
		Boolean indAtoFim = false;

		StringBuffer sbCX = new StringBuffer();
		//
		try {
			String conteudoCX = FileUtils.readFileToString(fileCX, StandardCharsets.UTF_8);
			StringTokenizer st = new StringTokenizer(conteudoCX, "\n");
			while ( st.hasMoreTokens() ) {
				//
			    String lineCX = st.nextToken();
				//
				if (indAtoIni && !indAtoFim)
					sbCX.append("\n" + lineCX);
				// Inicio ArquivoXML !
				if (lineCX.indexOf("<?xml version") >= 0) 
					indAtoIni = true;
				// Fim ArquivoXML !
				if (lineCX.indexOf("</xml>") >= 0)
					indAtoFim = true;
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		//
//		System.out.println("MpmImportacaoResource.capturarAtoXml() - ( sbCX = " + sbCX.toString());

		return sbCX.toString();
	}
			    	
	public void gravaImportacao() {
		//
		// Trata Header ...
		for (MpmHeader mpmHeader : this.mpmHeaderList) {
			//
			if (null == mpmHeader.getAgenciaCentralizadora()) mpmHeader.setAgenciaCentralizadora("??????");
			if (null == mpmHeader.getVersaoLayout()) mpmHeader.setVersaoLayout("???");
			//
			mpmHeader = this.mpmHeaderRepository.saveAndFlush(mpmHeader);
		}
		// Trata Transacao ...
		for (MpmTransacao mpmTransacao : this.mpmTransacaoList) {
			// Trata nulos ??? ...
			mpmTransacao = this.TrataNullMpmTransacao(mpmTransacao);
			//
			mpmTransacao = this.mpmTransacaoRepository.saveAndFlush(mpmTransacao);
		}
		// Trata Trailler ...
		for (MpmTrailler mpmTrailler : this.mpmTraillerList) {
			//
			mpmTrailler = this.mpmTraillerRepository.saveAndFlush(mpmTrailler);
		}
		//
		this.logImportacao = logImportacao + " ( MpmHeader = " + mpmHeaderList.size() +
												" ( MpmTransacao = " + mpmTransacaoList.size() +
												" ( MpmTrailler = " + mpmTraillerList.size();
    }
    	
    public MpmTransacao TrataNullMpmTransacao(MpmTransacao mpmTransacao) {
    	//
		if (null == mpmTransacao.getBairroDevedor()) mpmTransacao.setBairroDevedor("?");
		if (null == mpmTransacao.getCodigoIrregularidade()) mpmTransacao.
															setCodigoIrregularidade("?");
		if (null == mpmTransacao.getDataOcorrenciaCartorio()) mpmTransacao.
															setDataOcorrenciaCartorio("?");
		if (null == mpmTransacao.getDeclaracaoPortador()) mpmTransacao.setDeclaracaoPortador("?");
		if (null == mpmTransacao.getDocumentoSacador()) mpmTransacao.setDocumentoSacador("?");
		if (null == mpmTransacao.getEnderecoSacador()) mpmTransacao.setEnderecoSacador("?");
		if (null == mpmTransacao.getCepSacador()) mpmTransacao.setCepSacador("?");
		if (null == mpmTransacao.getCidadeSacador()) mpmTransacao.setCidadeSacador("?");
		if (null == mpmTransacao.getUfSacador()) mpmTransacao.setUfSacador("?");
		if (null == mpmTransacao.getTipoOcorrencia()) mpmTransacao.setTipoOcorrencia("?");
		if (null == mpmTransacao.getValorCustasCartorio()) mpmTransacao.setValorCustasCartorio("?");
		if (null == mpmTransacao.getDataOcorrenciaCartorio()) mpmTransacao.
																setDataOcorrenciaCartorio("?");
		if (null == mpmTransacao.getValorCustasCartorioDist()) mpmTransacao.
																setValorCustasCartorioDist("?");
		if (null == mpmTransacao.getNumeroDistribuicao()) mpmTransacao.setNumeroDistribuicao("?");
		if (null == mpmTransacao.getComplementoRegistro()) mpmTransacao.setComplementoRegistro("?");
		if (null == mpmTransacao.getSeloDistribuidor()) mpmTransacao.setSeloDistribuidor("?");
		if (null == mpmTransacao.getFinsFAlimentares()) mpmTransacao.setFinsFAlimentares("?");
		if (null == mpmTransacao.getConvenio()) mpmTransacao.	setConvenio("?");
		if (null == mpmTransacao.getEmpresa()) mpmTransacao.setEmpresa("?");		
    	//
    	return mpmTransacao;
    }
    
}
