package com.mpxds.mprest.resources;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpCategoria;
import com.mpxds.mprest.domain.MpSistemaConfig;
import com.mpxds.mprest.domain.MpmAlinea;
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
import com.mpxds.mprest.domain.MpmEdital;
import com.mpxds.mprest.domain.MpmEndereco;
import com.mpxds.mprest.domain.MpmEndosso;
import com.mpxds.mprest.domain.MpmEspecie;
import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.domain.MpmFeriado;
import com.mpxds.mprest.domain.MpmHeader;
import com.mpxds.mprest.domain.MpmIdentificacao;
import com.mpxds.mprest.domain.MpmImportarControle;
import com.mpxds.mprest.domain.MpmItemEmolumentoXml;
import com.mpxds.mprest.domain.MpmMotivoEdital;
import com.mpxds.mprest.domain.MpmObservacao;
import com.mpxds.mprest.domain.MpmOficio;
import com.mpxds.mprest.domain.MpmPendencia;
import com.mpxds.mprest.domain.MpmPessoaTitulo;
import com.mpxds.mprest.domain.MpmRemessa;
import com.mpxds.mprest.domain.MpmSeloDistribuidor;
import com.mpxds.mprest.domain.MpmStatus;
import com.mpxds.mprest.domain.MpmTitulo;
import com.mpxds.mprest.domain.MpmTituloProtestado;
import com.mpxds.mprest.domain.MpmTituloStatus;
import com.mpxds.mprest.domain.MpmTrailler;
import com.mpxds.mprest.domain.MpmTransacao;
import com.mpxds.mprest.domain.enums.MpTipoCampo;
import com.mpxds.mprest.domain.xml.MpmAlineaXML;
import com.mpxds.mprest.domain.xml.MpmAlineasXML;
import com.mpxds.mprest.domain.xml.MpmAtoComposicaoXML;
import com.mpxds.mprest.domain.xml.MpmAtoComposicaosXML;
import com.mpxds.mprest.domain.xml.MpmAtoXML;
import com.mpxds.mprest.domain.xml.MpmAtosXML;
import com.mpxds.mprest.domain.xml.MpmDevedorXML;
import com.mpxds.mprest.domain.xml.MpmDevedorsXML;
import com.mpxds.mprest.domain.xml.MpmEditalXML;
import com.mpxds.mprest.domain.xml.MpmEditalsXML;
import com.mpxds.mprest.domain.xml.MpmEndossoXML;
import com.mpxds.mprest.domain.xml.MpmEndossosXML;
import com.mpxds.mprest.domain.xml.MpmEspecieXML;
import com.mpxds.mprest.domain.xml.MpmEspeciesXML;
import com.mpxds.mprest.domain.xml.MpmIdentificacaoXML;
import com.mpxds.mprest.domain.xml.MpmIdentificacaosXML;
import com.mpxds.mprest.domain.xml.MpmMotivoEditalXML;
import com.mpxds.mprest.domain.xml.MpmMotivoEditalsXML;
import com.mpxds.mprest.domain.xml.MpmObservacaoXML;
import com.mpxds.mprest.domain.xml.MpmObservacaosXML;
import com.mpxds.mprest.domain.xml.MpmTituloXML;
import com.mpxds.mprest.domain.xml.MpmTitulosXML;
import com.mpxds.mprest.domain.xml.MpmTransacaoXML;
import com.mpxds.mprest.domain.xml.MpmTransacaosXML;
import com.mpxds.mprest.repositories.MpCategoriaRepository;
import com.mpxds.mprest.repositories.MpSistemaConfigRepository;
import com.mpxds.mprest.repositories.MpmAlineaRepository;
import com.mpxds.mprest.repositories.MpmAnoReferenciaRepository;
import com.mpxds.mprest.repositories.MpmApresentanteRepository;
import com.mpxds.mprest.repositories.MpmAtoComposicaoRepository;
import com.mpxds.mprest.repositories.MpmAtoRepository;
import com.mpxds.mprest.repositories.MpmBancoRepository;
import com.mpxds.mprest.repositories.MpmCargaRepository;
import com.mpxds.mprest.repositories.MpmCidadeRepository;
import com.mpxds.mprest.repositories.MpmControleOficioRepository;
import com.mpxds.mprest.repositories.MpmCustasComposicaoRepository;
import com.mpxds.mprest.repositories.MpmDataProcessoRepository;
import com.mpxds.mprest.repositories.MpmDevedorRepository;
import com.mpxds.mprest.repositories.MpmEditalRepository;
import com.mpxds.mprest.repositories.MpmEnderecoRepository;
import com.mpxds.mprest.repositories.MpmEndossoRepository;
import com.mpxds.mprest.repositories.MpmEspecieRepository;
import com.mpxds.mprest.repositories.MpmEstadoUfRepository;
import com.mpxds.mprest.repositories.MpmFeriadoRepository;
import com.mpxds.mprest.repositories.MpmHeaderRepository;
import com.mpxds.mprest.repositories.MpmIdentificacaoRepository;
import com.mpxds.mprest.repositories.MpmImportarControleRepository;
import com.mpxds.mprest.repositories.MpmItemEmolumentoXmlRepository;
import com.mpxds.mprest.repositories.MpmMotivoEditalRepository;
import com.mpxds.mprest.repositories.MpmObservacaoRepository;
import com.mpxds.mprest.repositories.MpmOficioRepository;
import com.mpxds.mprest.repositories.MpmPendenciaRepository;
import com.mpxds.mprest.repositories.MpmPessoaTituloRepository;
import com.mpxds.mprest.repositories.MpmRemessaRepository;
import com.mpxds.mprest.repositories.MpmSeloDistribuidorRepository;
import com.mpxds.mprest.repositories.MpmStatusRepository;
import com.mpxds.mprest.repositories.MpmTituloProtestadoRepository;
import com.mpxds.mprest.repositories.MpmTituloRepository;
import com.mpxds.mprest.repositories.MpmTituloStatusRepository;
import com.mpxds.mprest.repositories.MpmTraillerRepository;
import com.mpxds.mprest.repositories.MpmTransacaoRepository;
import com.mpxds.mprest.services.MpmAlineaService;
import com.mpxds.mprest.services.MpmAnoReferenciaService;
import com.mpxds.mprest.services.MpmApresentanteService;
import com.mpxds.mprest.services.MpmAtoService;
import com.mpxds.mprest.services.MpmBancoService;
import com.mpxds.mprest.services.MpmCargaService;
import com.mpxds.mprest.services.MpmCidadeService;
import com.mpxds.mprest.services.MpmDevedorService;
import com.mpxds.mprest.services.MpmEditalService;
import com.mpxds.mprest.services.MpmEnderecoService;
import com.mpxds.mprest.services.MpmEndossoService;
import com.mpxds.mprest.services.MpmEspecieService;
import com.mpxds.mprest.services.MpmEstadoUfService;
import com.mpxds.mprest.services.MpmIdentificacaoService;
import com.mpxds.mprest.services.MpmImportarControleService;
import com.mpxds.mprest.services.MpmMotivoEditalService;
import com.mpxds.mprest.services.MpmObservacaoService;
import com.mpxds.mprest.services.MpmPessoaTituloService;
import com.mpxds.mprest.services.MpmRemessaService;
import com.mpxds.mprest.services.MpmSeloDistribuidorService;
import com.mpxds.mprest.services.MpmStatusService;
import com.mpxds.mprest.services.MpmTituloProtestadoService;
import com.mpxds.mprest.services.MpmTituloStatusService;

@RestController
@RequestMapping(value="/mCargaXMLs")
public class MpmCargaXMLResource {
	//
	@Autowired
	private MpCategoriaRepository mpCategoriaRepository;
	@Autowired
	private MpmAlineaRepository mpmAlineaRepository;
	@Autowired
	private MpmAlineaService mpmAlineaService;
	@Autowired
	private MpmEspecieRepository mpmEspecieRepository;
	@Autowired
	private MpmEspecieService mpmEspecieService;
	@Autowired
	private MpmStatusRepository mpmStatusRepository;
	@Autowired
	private MpmStatusService mpmStatusService;
	@Autowired
	private MpmTituloStatusRepository mpmTituloStatusRepository;
	@Autowired
	private MpmTituloStatusService mpmTituloStatusService;
	@Autowired
	private MpmTituloProtestadoRepository mpmTituloProtestadoRepository;
	@Autowired
	private MpmTituloProtestadoService mpmTituloProtestadoService;
	@Autowired
	private MpmIdentificacaoRepository mpmIdentificacaoRepository;
	@Autowired
	private MpmIdentificacaoService mpmIdentificacaoService;
	@Autowired
	private MpmEstadoUfRepository mpmEstadoUfRepository;
	@Autowired
	private MpmEstadoUfService mpmEstadoUfService;
	@Autowired
	private MpmCidadeRepository mpmCidadeRepository;
	@Autowired
	private MpmCidadeService mpmCidadeService;
	@Autowired
	private MpmEnderecoRepository mpmEnderecoRepository;
	@Autowired
	private MpmEnderecoService mpmEnderecoService;
	@Autowired
	private MpmDevedorRepository mpmDevedorRepository;
	@Autowired
	private MpmDevedorService mpmDevedorService;
	@Autowired
	private MpmApresentanteRepository mpmApresentanteRepository;
	@Autowired
	private MpmApresentanteService mpmApresentanteService;
	@Autowired
	private MpmPessoaTituloRepository mpmPessoaTituloRepository;
	@Autowired
	private MpmPessoaTituloService mpmPessoaTituloService;
	@Autowired
	private MpmTituloRepository mpmTituloRepository;
	@Autowired
	private MpSistemaConfigRepository mpSistemaConfigRepository;
	@Autowired
	private MpmOficioRepository mpmOficioRepository;
	@Autowired
	private MpmAnoReferenciaRepository mpmAnoReferenciaRepository;
	@Autowired
	private MpmAnoReferenciaService mpmAnoReferenciaService;
	@Autowired
	private MpmAtoRepository mpmAtoRepository;
	@Autowired
	private MpmAtoService mpmAtoService;
	@Autowired
	private MpmAtoComposicaoRepository mpmAtoComposicaoRepository;
	@Autowired
	private MpmCustasComposicaoRepository mpmCustasComposicaoRepository;
	@Autowired
	private MpmBancoRepository mpmBancoRepository;
	@Autowired
	private MpmBancoService mpmBancoService;
	@Autowired
	private MpmControleOficioRepository mpmControleOficioRepository;
	@Autowired
	private MpmDataProcessoRepository mpmDataProcessoRepository;
	@Autowired
	private MpmFeriadoRepository mpmFeriadoRepository;
	@Autowired
	private MpmObservacaoRepository mpmObservacaoRepository;
	@Autowired
	private MpmObservacaoService mpmObservacaoService;
	@Autowired
	private MpmSeloDistribuidorRepository mpmSeloDistribuidorRepository;
	@Autowired
	private MpmSeloDistribuidorService mpmSeloDistribuidorService;
	@Autowired
	private MpmImportarControleRepository mpmImportarControleRepository;
	@Autowired
	private MpmImportarControleService mpmImportarControleService;
	@Autowired
	private MpmRemessaRepository mpmRemessaRepository;
	@Autowired
	private MpmRemessaService mpmRemessaService;
	@Autowired
	private MpmHeaderRepository mpmHeaderRepository;
	@Autowired
	private MpmTransacaoRepository mpmTransacaoRepository;
	@Autowired
	private MpmTraillerRepository mpmTraillerRepository;
	@Autowired
	private MpmPendenciaRepository mpmPendenciaRepository;
	@Autowired
	private MpmItemEmolumentoXmlRepository mpmItemEmolumentoXmlRepository;
	@Autowired
	private MpmCargaRepository mpmCargaRepository;
	@Autowired
	private MpmEndossoRepository mpmEndossoRepository;
	@Autowired
	private MpmEndossoService mpmEndossoService;
	@Autowired
	private MpmEditalRepository mpmEditalRepository;
	@Autowired
	private MpmEditalService mpmEditalService;
	@Autowired
	private MpmMotivoEditalRepository mpmMotivoEditalRepository;
	@Autowired
	private MpmMotivoEditalService mpmMotivoEditalService;

	@Autowired
	private MpmCargaService mpmCargaService;

	//

	private Boolean indXml_01_Alinea = true;
	private Boolean indXml_02_Ato = true;
	private Boolean indXml_03_AtoComposicao = true;
	private Boolean indXml_04_Identificacao = true;
	private Boolean indXml_05_Devedor = true;
	private Boolean indXml_06_Endosso = true;
	private Boolean indXml_07_Edital = true;
	private Boolean indXml_08_MotivoEdital = true;
	private Boolean indXml_09_Observacao = true;
	private Boolean indXml_10_Transacao = true;
	private Boolean indXml_11_Especie = true;
	private Boolean indXml_12_Titulo = true;

	private Boolean indCarga = false;
	private String logCarga = "";
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	//
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		try {
			this.trataCargaXML();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//
		MpmCarga mpObj = this.mpmCargaService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
	
	public void trataCargaXML() throws ParseException {
		//
		if (this.indXml_01_Alinea)
			this.trataCargaAlineaXML();
		if (this.indXml_02_Ato)
			this.trataCargaAtoXML();
		if (this.indXml_03_AtoComposicao)
			this.trataCargaAtoComposicaoXML();
		if (this.indXml_04_Identificacao)
			this.trataCargaIdentificacaoXML();
		if (this.indXml_05_Devedor)
			this.trataCargaDevedorXML();
		if (this.indXml_06_Endosso)
			this.trataCargaEndossoXML();
		if (this.indXml_07_Edital)
			this.trataCargaEditalXML();
		if (this.indXml_08_MotivoEdital)
			this.trataCargaMotivoEditalXML();
		if (this.indXml_09_Observacao)
			this.trataCargaObservacaoXML();
		if (this.indXml_10_Transacao)
			this.trataCargaTransacaoXML();
		if (this.indXml_11_Especie)
			this.trataCargaEspecieXML();
		if (this.indXml_12_Titulo)
			this.trataCargaTituloXML();

		if (this.indCarga)
			this.trataCarga();
		//
		MpmCarga mpmCarga = new MpmCarga(null, logCarga);
		
		this.mpmCargaRepository.saveAndFlush(mpmCarga);
	}

	public void trataCargaAlineaXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Alinea.xml");

			File file = resource.getFile();

			JAXBContext jaxbContext = JAXBContext.newInstance(MpmAlineasXML.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmAlineasXML mpmAlineasXML = (MpmAlineasXML) jaxbUnmarshaller.unmarshal(file);

			//
			this.mpmAlineaRepository.deleteAll();
			
			for (MpmAlineaXML mpmAlineaXML : mpmAlineasXML.getMpmAlineaXMLs()) {
				//
				MpmAlinea mpmAlinea = new MpmAlinea(null,
						Integer.parseInt(mpmAlineaXML.getCodigoAlinea()),
						mpmAlineaXML.getDescricaoAlinea());
				//
				mpmAlinea = this.mpmAlineaRepository.saveAndFlush(mpmAlinea);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaAlineaXML() = " + 
														mpmAlineasXML.getMpmAlineaXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void trataCargaAtoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Atos.xml");

			File file = resource.getFile();

			JAXBContext jaxbContext = JAXBContext.newInstance(MpmAtosXML.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmAtosXML mpmAtosXML = (MpmAtosXML) jaxbUnmarshaller.unmarshal(file);

			MpmAnoReferencia mpmAnoRef = this.mpmAnoReferenciaService.buscarAnoReferencia("2018");
			if (null == mpmAnoRef) {
				mpmAnoRef = new MpmAnoReferencia(null, "2018", "ANO 2018", true);
				mpmAnoRef = this.mpmAnoReferenciaRepository.saveAndFlush(mpmAnoRef);
			}
			//
			this.mpmAtoRepository.deleteAll();

			for (MpmAtoXML mpmAtoXML : mpmAtosXML.getMpmAtoXMLs()) {
				//
				MpmAto mpmAto = new MpmAto(null,
						mpmAnoRef,
						mpmAtoXML.getCodigoAto(),
						mpmAtoXML.getAtoSequencia(),
						mpmAtoXML.getDescricaoAto(),
						mpmAtoXML.getTipoSelo(),
						new BigDecimal(mpmAtoXML.getEmolumento().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getLei3217().replace(",", ".")), 
						new BigDecimal(mpmAtoXML.getLei4664().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getLei111().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getLei3761().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getLei590().replace(",", ".")), 
						new BigDecimal(mpmAtoXML.getLei6281().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getIss().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getDistribuicao().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getValorAto().replace(",", ".")),
						new BigDecimal(mpmAtoXML.getGratuidade().replace(",", ".")),
						null); // idClone
				//
				mpmAto = this.mpmAtoRepository.saveAndFlush(mpmAto);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaAtoXML() = " + 
																	mpmAtosXML.getMpmAtoXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void trataCargaAtoComposicaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/AtosComposicao.xml");

			File file = resource.getFile();

			JAXBContext jaxbContext = JAXBContext.newInstance(MpmAtoComposicaosXML.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmAtoComposicaosXML mpmAtoComposicaosXML = (MpmAtoComposicaosXML) jaxbUnmarshaller.unmarshal(file);

			MpmAnoReferencia mpmAnoRef = this.mpmAnoReferenciaService.buscarAnoReferencia("2018");
			if (null == mpmAnoRef) {
				mpmAnoRef = new MpmAnoReferencia(null, "2018", "ANO 2018", true);
				mpmAnoRef = this.mpmAnoReferenciaRepository.saveAndFlush(mpmAnoRef);
			}
			//
			this.mpmAtoComposicaoRepository.deleteAll();

			for (MpmAtoComposicaoXML mpmAtoComposicaoXML : mpmAtoComposicaosXML.getMpmAtoComposicaoXMLs()) {
				//
				String anoTabItSubIt = mpmAnoRef.getAno() + mpmAtoComposicaoXML.getTabela() + 
						mpmAtoComposicaoXML.getItem() + mpmAtoComposicaoXML.getSubItem() ;
				
				MpmAto mpmAto = this.mpmAtoService.buscarMpmAnoReferenciaAndCodigoAtoAndAtoSequencia(mpmAnoRef, 
									mpmAtoComposicaoXML.getCodigoAto(), mpmAtoComposicaoXML.getAtoSequencia());
				if (null == mpmAto) {
					this.logCarga = this.logCarga + 
									" ( TrataCargaAtoComposicaoXML() - Error ... Não Existe MpmAto = " + 
									mpmAnoRef.getAno() + "(" + mpmAnoRef.getId() + ")" + " / " +
									mpmAtoComposicaoXML.getCodigoAto() + " / " +
									mpmAtoComposicaoXML.getAtoSequencia();
					continue; // break
				}
				//
				MpmCustasComposicao mpmCustasComposicao = new MpmCustasComposicao(null, mpmAnoRef,
											mpmAtoComposicaoXML.getTabela(),
											mpmAtoComposicaoXML.getItem(),
											mpmAtoComposicaoXML.getSubItem(),
											mpmAtoComposicaoXML.getDescricaoTab(),
											mpmAtoComposicaoXML.getComplemento(),
											mpmAtoComposicaoXML.getExcessao(),
											new BigDecimal(mpmAtoComposicaoXML.getValorCusta().replace(",", ".")),
											mpmAtoComposicaoXML.getCodigoAto(),
											"?", // CodigoAtoC (Prisco???)
											new BigDecimal("0"), // De (Prisco???)
											new BigDecimal("0"), // Ate (Prisco???)
											anoTabItSubIt, // Função ????
											null);

				mpmCustasComposicao = this.mpmCustasComposicaoRepository.saveAndFlush(mpmCustasComposicao);						
				//				
				MpmAtoComposicao mpmAtoComposicao = new MpmAtoComposicao(null,
											mpmAto,
											mpmCustasComposicao,
											Integer.parseInt(mpmAtoComposicaoXML.getQuantidade()));
														
				mpmAtoComposicao = this.mpmAtoComposicaoRepository.saveAndFlush(mpmAtoComposicao);	

				// Trata Relations ...
				mpmCustasComposicao .getMpmAtoComposicaos().addAll(Arrays.asList(mpmAtoComposicao));

				mpmCustasComposicao = this.mpmCustasComposicaoRepository.saveAndFlush(mpmCustasComposicao);						
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaAtoXML() = " + 
												mpmAtoComposicaosXML.getMpmAtoComposicaoXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void trataCargaIdentificacaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Identificacao.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmIdentificacaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmIdentificacaosXML mpmIdentificacaosXML = (MpmIdentificacaosXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmIdentificacaoRepository.deleteAll();
				
			for (MpmIdentificacaoXML mpmIdentificacaoXML : mpmIdentificacaosXML.getMpmIdentificacaoXMLs()) {
				//
				MpmIdentificacao mpmIdentificacao = new MpmIdentificacao(null,
						Integer.parseInt(mpmIdentificacaoXML.getCod_Identificacao()),
						mpmIdentificacaoXML.getDsc_Identificacao());
				//
				mpmIdentificacao = this.mpmIdentificacaoRepository.saveAndFlush(mpmIdentificacao);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaIdentificacaoXML() = " + 
												mpmIdentificacaosXML.getMpmIdentificacaoXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
	private void trataCargaDevedorXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Devedores.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmDevedorsXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmDevedorsXML mpmDevedorsXML = (MpmDevedorsXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmDevedorRepository.deleteAll();

			for (MpmDevedorXML mpmDevedorXML : mpmDevedorsXML.getMpmDevedorXMLs()) {
				// Trata Estado ...
				MpmEstadoUf mpmEstadoUf = this.mpmEstadoUfService.buscarSigla(mpmDevedorXML.getxUf());
				if (null == mpmEstadoUf) {
					//
					String nomeEstado = "NOME ???";
					if (mpmDevedorXML.getxUf().toUpperCase().equals("RJ"))
						nomeEstado = "RIO DE JANEIRO";
					else
					if (mpmDevedorXML.getxUf().toUpperCase().equals("SP"))
						nomeEstado = "SÃO PAULO";
					//
					mpmEstadoUf = new MpmEstadoUf(null, mpmDevedorXML.getxUf(), nomeEstado);
					mpmEstadoUf = this.mpmEstadoUfRepository.saveAndFlush(mpmEstadoUf);
				}
				// Trata Cidade ...
				MpmCidade mpmCidade = this.mpmCidadeService.buscarNomeAndMpmEstadoUf(
																	mpmDevedorXML.getxCidade(), mpmEstadoUf);
				if (null == mpmCidade) {
					//
					mpmCidade = new MpmCidade(null, mpmDevedorXML.getxCidade(), mpmEstadoUf);					
					mpmCidade = this.mpmCidadeRepository.saveAndFlush(mpmCidade);
					
					mpmEstadoUf.getMpmCidades().addAll(Arrays.asList(mpmCidade));
					mpmEstadoUf = this.mpmEstadoUfRepository.saveAndFlush(mpmEstadoUf);
				}
				// Trata Endereco ...
				MpmEndereco mpmEndereco = this.mpmEnderecoService.
											buscarLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
													mpmDevedorXML.getxEndereco(), mpmDevedorXML.getxNumero(), 
													mpmDevedorXML.getxComplemento(), mpmDevedorXML.getxCep(),
													mpmDevedorXML.getxBairro(), mpmCidade);
				if (null == mpmEndereco) {
					//
					mpmEndereco = new MpmEndereco(null, mpmDevedorXML.getxEndereco(), 
													mpmDevedorXML.getxNumero(),	mpmDevedorXML.getxComplemento(),
													mpmDevedorXML.getxCep(), mpmDevedorXML.getxBairro(),
													mpmCidade);				
					mpmEndereco = this.mpmEnderecoRepository.saveAndFlush(mpmEndereco);
				}
				// Trata Identificacao ...
				MpmIdentificacao mpmIdentificacao = this.mpmIdentificacaoService.buscarCodigo(
													Integer.parseInt(mpmDevedorXML.getxCod_Identificacao()));
				if (null == mpmIdentificacao) {
					//
					this.logCarga = this.logCarga + " ( TrataCargaIdentificacaoXML() Error.Codigo = " +
																		mpmDevedorXML.getxCod_Identificacao();
					continue;
				}
				// Trata Devedor ...
				MpmDevedor mpmDevedor = new MpmDevedor(null, mpmDevedorXML.getxNome(), 0,
																			mpmIdentificacao, mpmEndereco);
				mpmDevedor = this.mpmDevedorRepository.saveAndFlush(mpmDevedor);
				// Trata Relations ...
				mpmIdentificacao.getMpmDevedors().addAll(Arrays.asList(mpmDevedor));
				mpmIdentificacao = this.mpmIdentificacaoRepository.saveAndFlush(mpmIdentificacao);
				
				mpmEndereco.getMpmDevedors().addAll(Arrays.asList(mpmDevedor));
				mpmEndereco = this.mpmEnderecoRepository.saveAndFlush(mpmEndereco);						
				//
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaDevedorXML() EstadoCidadeEnderecoDevedor = " + 
														mpmDevedorsXML.getMpmDevedorXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void trataCargaEndossoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Endosso.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmEndossosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmEndossosXML mpmEndossosXML = (MpmEndossosXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmEndossoRepository.deleteAll();
			
			for (MpmEndossoXML mpmEndossoXML : mpmEndossosXML.getMpmEndossoXMLs()) {
				//
				MpmEndosso mpmEndosso = new MpmEndosso(null,
						mpmEndossoXML.getCod_Endosso(), mpmEndossoXML.getDsc_Endosso());
				//
				mpmEndosso = this.mpmEndossoRepository.saveAndFlush(mpmEndosso);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaEndossoXML() = " + 
													mpmEndossosXML.getMpmEndossoXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void trataCargaEditalXML() throws ParseException {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Edital.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmEditalsXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmEditalsXML mpmEditalsXML = (MpmEditalsXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmEditalRepository.deleteAll();
			
			for (MpmEditalXML mpmEditalXML : mpmEditalsXML.getMpmEditalXMLs()) {
				//
				MpmEdital mpmEdital = new MpmEdital(null,
						sdf.parse(mpmEditalXML.getDt_Baixa().replace("T", " ")),
						sdf.parse(mpmEditalXML.getDt_Protocolo().replace("T", " ")),
						mpmEditalXML.getNo_Protocolo(),
						sdf.parse(mpmEditalXML.getDt_NovoAte().replace("T", " ")),
						sdf.parse(mpmEditalXML.getDt_Ate().replace("T", " ")),
						mpmEditalXML.getOco_Usr(),
						sdf.parse(mpmEditalXML.getDt_Sist_Oco().replace("T", " ")));
				//
				mpmEdital = this.mpmEditalRepository.saveAndFlush(mpmEdital);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaEditalXML() = " + 
													mpmEditalsXML.getMpmEditalXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void trataCargaMotivoEditalXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/MotivoEdital.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmMotivoEditalsXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmMotivoEditalsXML mpmMotivoEditalsXML = (MpmMotivoEditalsXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmMotivoEditalRepository.deleteAll();
			
			for (MpmMotivoEditalXML mpmMotivoEditalXML : mpmMotivoEditalsXML.getMpmMotivoEditalXMLs()) {
				//
				MpmMotivoEdital mpmMotivoEdital = new MpmMotivoEdital(null,
						mpmMotivoEditalXML.getCodMotivoEdital(), mpmMotivoEditalXML.getDescMotivoEdital());
				//
				mpmMotivoEdital = this.mpmMotivoEditalRepository.saveAndFlush(mpmMotivoEdital);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaMotivoEditalXML() = " + 
													mpmMotivoEditalsXML.getMpmMotivoEditalXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void trataCargaObservacaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Observacoes.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmObservacaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmObservacaosXML mpmObservacaosXML = (MpmObservacaosXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmObservacaoRepository.deleteAll();
			
			for (MpmObservacaoXML mpmObservacaoXML : mpmObservacaosXML.getMpmObservacaoXMLs()) {
				//
				MpmObservacao mpmObservacao = new MpmObservacao(null,
						mpmObservacaoXML.getTpObservacao(), mpmObservacaoXML.getDscObservacao());
				//
				mpmObservacao = this.mpmObservacaoRepository.saveAndFlush(mpmObservacao);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaObservacaoXML() = " + 
													mpmObservacaosXML.getMpmObservacaoXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void trataCargaTransacaoXML() throws ParseException {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Transacao.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmTransacaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmTransacaosXML mpmTransacaosXML = (MpmTransacaosXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmTransacaoRepository.deleteAll();
			
			for (MpmTransacaoXML mpmTransacaoXML : mpmTransacaosXML.getMpmTransacaoXMLs()) {
				//
				// Trata MpmImportarControle ...
				MpmImportarControle mpmImportarControle = mpmImportarControleService.buscarDataDistribuicao(
											sdf.parse(mpmTransacaoXML.getxDataImportar().replace("T", " ")));
				if (null == mpmImportarControle) {
					//
					mpmImportarControle = new MpmImportarControle(null, 
						sdf.parse(mpmTransacaoXML.getxDataImportar().replace("T", " ")), // Dt.Distrib.?
						sdf.parse(mpmTransacaoXML.getxDataImportar().replace("T", " ")), // Dt.Protocolo ?
						sdf.parse(mpmTransacaoXML.getxDataImportar().replace("T", " "))) ; // Dt.Ate ?
					//
					mpmImportarControle = this.mpmImportarControleRepository.saveAndFlush(mpmImportarControle);
				}
				// Trata MpmRemessa ...
				MpmRemessa mpmRemessa = mpmRemessaService.buscarMpmImportarControleAndNomeArquivo(
													mpmImportarControle, mpmTransacaoXML.getxNomeArquivo());
				if (null == mpmRemessa) {
					//
					mpmRemessa = new MpmRemessa(null, mpmImportarControle,
							mpmTransacaoXML.getxNomeArquivo(),
							"?Carga", // Protoc.Inicial
							"?Carga"); // Protoc.Final
					//
					mpmRemessa = this.mpmRemessaRepository.saveAndFlush(mpmRemessa);
				}
				
				// Trata MpmTransacao ...
				MpmTransacao mpmTransacao = new MpmTransacao(null, mpmRemessa,
						mpmTransacaoXML.getxNumeroCodigoPortador(),
						mpmTransacaoXML.getxAgenciaCodCedente(),
						mpmTransacaoXML.getxNomeCedFav(),
						mpmTransacaoXML.getxNomSacador(),
						mpmTransacaoXML.getxDocumentoSacador(),
						mpmTransacaoXML.getxEnderecSacador(),
						mpmTransacaoXML.getxCeSacador(),
						mpmTransacaoXML.getxCidadSacador(),
						mpmTransacaoXML.getxUSacador(),
						mpmTransacaoXML.getxNossoNumero(),
						mpmTransacaoXML.getxEspecieTitulo(),
						mpmTransacaoXML.getxNumeroTitulo(),
						mpmTransacaoXML.getxDataEmissaoTitulo(),
						mpmTransacaoXML.getxDataVencimentoTitulo(),
						mpmTransacaoXML.getxTipoMoeda(),
						mpmTransacaoXML.getxValorTitulo(),
						mpmTransacaoXML.getxSaldoTitulo(),
						mpmTransacaoXML.getxPracaPagamento(),
						mpmTransacaoXML.getxTipoEndosso(),
						mpmTransacaoXML.getxInformacaoAceite(),
						mpmTransacaoXML.getxNumeroControleDevedor(),
						mpmTransacaoXML.getxNomeDevedor(),
						mpmTransacaoXML.getxTipoIdentDevedor(),
						mpmTransacaoXML.getxNumeroIdentDevedor(),
						mpmTransacaoXML.getxDocumentoDevedor(),
						mpmTransacaoXML.getxEnderecoDevedor(),
						mpmTransacaoXML.getxCepDevedor(),
						mpmTransacaoXML.getxCidadeDevedor(),
						mpmTransacaoXML.getxUfDevedor(),
						mpmTransacaoXML.getxNumeroCartorio(),
						mpmTransacaoXML.getxNumeroProtocoloCartorio(),
						mpmTransacaoXML.getxTipoOcorrencia(),
						mpmTransacaoXML.getxDataProtocoloCartorio(),
						mpmTransacaoXML.getxValorCustasCartorio(),
						mpmTransacaoXML.getxDeclaracaoPortador(),
						mpmTransacaoXML.getxDataOcorrenciaCartorio(),
						mpmTransacaoXML.getxCodigoIrregularidade(),
						mpmTransacaoXML.getxBairroDevedor(),
						mpmTransacaoXML.getxValorCustasCartorioDist(),
						mpmTransacaoXML.getxNomePortador(),
						mpmTransacaoXML.getxNumeroDistribuicao(),
						mpmTransacaoXML.getxComplementoRegistro(),
						mpmTransacaoXML.getxSeloDistribuidor(),
						mpmTransacaoXML.getxFinsFalimentares(),
						mpmTransacaoXML.getxConvenio(),
						mpmTransacaoXML.getxEmpresa(),
						mpmTransacaoXML.getxNumeroSeqRegistro());

//						mpmTransacaoXML.getxIdentificacaoRegistro(), ???
//				//
				mpmTransacao = this.mpmTransacaoRepository.saveAndFlush(mpmTransacao);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaTransacaoXML() = " + 
													mpmTransacaosXML.getMpmTransacaoXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void trataCargaEspecieXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Especies.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmEspeciesXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmEspeciesXML mpmEspeciesXML = (MpmEspeciesXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmEspecieRepository.deleteAll();
			
			for (MpmEspecieXML mpmEspecieXML : mpmEspeciesXML.getMpmEspecieXMLs()) {
				//
				MpmEspecie mpmEspecie = new MpmEspecie(null, mpmEspecieXML.getxEsp_Codigo(), 
											mpmEspecieXML.getxDescricao(), 
											Integer.parseInt(mpmEspecieXML.getxNo_Codigo()));
				//
				mpmEspecie = this.mpmEspecieRepository.saveAndFlush(mpmEspecie);
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaEspecieXML() = " + 
													mpmEspeciesXML.getMpmEspecieXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void trataCargaTituloXML() throws ParseException {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Titulos.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmTitulosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmTitulosXML mpmTitulosXML = (MpmTitulosXML) jaxbUnmarshaller.unmarshal(file);
			//
			this.mpmTituloRepository.deleteAll();
			
			for (MpmTituloXML mpmTituloXML : mpmTitulosXML.getMpmTituloXMLs()) {
				//
				// Trata MpmAlinea ... Codigo = 11-12 ???
				MpmAlinea mpmAlinea = mpmAlineaService.buscarCodigo(Integer.parseInt(
													mpmTituloXML.getxCodigoAlinea().trim().substring(0,2)));
				if (null == mpmAlinea) {
					//
					this.logCarga = this.logCarga + " ( TrataCargaTituloXML() Error.codigoAlinea = " +
																	mpmTituloXML.getxCodigoAlinea().trim();
					continue;
				}
				// Trata MpmEspecie ... 
				MpmEspecie mpmEspecie = mpmEspecieService.buscarCodigo(mpmTituloXML.getxEsp_Codigo().trim());
				if (null == mpmEspecie) {
					//
					this.logCarga = this.logCarga + " ( TrataCargaTituloXML() Error.codigoEspecie = " +
																	mpmTituloXML.getxEsp_Codigo().trim();
					continue;
				}
 				
				// Trata MpmEndosso ... 
				MpmEndosso mpmEndosso = mpmEndossoService.buscarCodigo(mpmTituloXML.getxCod_Endosso().trim());
				if (null == mpmEndosso) {
					//
					this.logCarga = this.logCarga + " ( TrataCargaTituloXML() Error.codigoEndosso = " +
																	mpmTituloXML.getxCod_Endosso().trim();
					continue;
				}

				// Trata MpmObservacao ... 
				String descricaoObs = "???";
				
				Integer posX = mpmTituloXML.getxTit_Obs1().indexOf("(");
				if (posX >= 0)
					descricaoObs = mpmTituloXML.getxTit_Obs1().substring(0, posX);
				
				MpmObservacao mpmObservacao = mpmObservacaoService.buscarDescricao(descricaoObs);
				if (null == mpmObservacao) {
					//
					this.logCarga = this.logCarga + " ( TrataCargaTituloXML() Error.descricaoObs = " +
															descricaoObs + " / " + mpmTituloXML.getxTit_Obs1();
					continue;
				}
				
				// Trata MpmApresentante ( MpmEndereco + MpmCidade + MpmEstadoUF ) ...
				//
				MpmEstadoUf mpmEstadoUfApresentante = mpmEstadoUfService.buscarSigla(
																	mpmTituloXML.getxUfApresentante().trim());
				if (null == mpmEstadoUfApresentante) {
					//
					mpmEstadoUfApresentante = new MpmEstadoUf(null,
															mpmTituloXML.getxUfApresentante().trim(),
															"?????");
					mpmEstadoUfApresentante = this.mpmEstadoUfRepository.saveAndFlush(mpmEstadoUfApresentante);
				}

				//
				MpmCidade mpmCidadeApresentante = mpmCidadeService.buscarNomeAndMpmEstadoUf(
																mpmTituloXML.getxCidadeApresentante().trim(),
																mpmEstadoUfApresentante);
				if (null == mpmCidadeApresentante) {
					//
					mpmCidadeApresentante = new MpmCidade(null,
														mpmTituloXML.getxCidadeApresentante().trim(),
														mpmEstadoUfApresentante);
					mpmCidadeApresentante = this.mpmCidadeRepository.saveAndFlush(mpmCidadeApresentante);
				}
				// Relations ...
				mpmEstadoUfApresentante.getMpmCidades().addAll(Arrays.asList(mpmCidadeApresentante));
				mpmEstadoUfApresentante = this.mpmEstadoUfRepository.saveAndFlush(mpmEstadoUfApresentante);
				
				//
				MpmEndereco mpmEnderecoApresentante = mpmEnderecoService.
											buscarLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
													mpmTituloXML.getxEnderecoApresentante().trim(),
													mpmTituloXML.getxNumeroApresentante().trim(),
													mpmTituloXML.getxComplementoApresentante().trim(),
													mpmTituloXML.getxCepApresentante().trim(),
													mpmTituloXML.getxBairroApresentante().trim(),
													mpmCidadeApresentante);
				if (null == mpmEnderecoApresentante) {
					//
					mpmEnderecoApresentante = new MpmEndereco(null,
							mpmTituloXML.getxEnderecoApresentante().trim(),
							mpmTituloXML.getxNumeroApresentante().trim(),
							mpmTituloXML.getxComplementoApresentante().trim(),
							mpmTituloXML.getxCepApresentante().trim(),
							mpmTituloXML.getxBairroApresentante().trim(),
							mpmCidadeApresentante);
					mpmEnderecoApresentante = this.mpmEnderecoRepository.saveAndFlush(mpmEnderecoApresentante);
				}
				
				// 
				MpmBanco mpmBancoApresentante = mpmBancoService.buscarCodigoAndAgencia(
													mpmTituloXML.getxNo_Banco().trim(),
													Integer.parseInt(mpmTituloXML.getxAgenciaCedente().trim()));
				if (null == mpmBancoApresentante) {
					//
					mpmBancoApresentante = new MpmBanco(null,
							mpmTituloXML.getxNo_Banco().trim(),
							Integer.parseInt(mpmTituloXML.getxAgenciaCedente().trim()),
							"???"); // Nome
					mpmBancoApresentante = this.mpmBancoRepository.saveAndFlush(mpmBancoApresentante);
				}
				
				//
				MpmApresentante mpmApresentante = mpmApresentanteService.buscarCodigo(
																mpmTituloXML.getxCod_Apresentante().trim());
				if (null == mpmApresentante) {
					//
					mpmApresentante = new MpmApresentante(null,
							mpmTituloXML.getxCod_Apresentante().trim(),
							mpmTituloXML.getxNomeApresentante().trim(),
							false, // indBanco ???
							mpmTituloXML.getxTp_DoctoApresentante().trim(),
							mpmTituloXML.getxNo_DoctoApresentante().trim(),
							BigDecimal.valueOf(0.00), // valorReembolsoTed ???
							mpmEnderecoApresentante,
							mpmBancoApresentante);
					mpmApresentante = this.mpmApresentanteRepository.saveAndFlush(mpmApresentante);
				}				
				// Relations ...
				mpmEnderecoApresentante.getMpmApresentantes().addAll(Arrays.asList(mpmApresentante));
				mpmEnderecoApresentante = this.mpmEnderecoRepository.saveAndFlush(mpmEnderecoApresentante);
		
				mpmBancoApresentante.getMpmApresentantes().addAll(Arrays.asList(mpmApresentante));
				mpmBancoApresentante = this.mpmBancoRepository.saveAndFlush(mpmBancoApresentante);
				
				// Trata MpmSeloDistribuidor ...
				MpmSeloDistribuidor mpmSeloDistribuidor = 
								mpmSeloDistribuidorService.buscarDataDistribuicaoAndNumeroDistribuicao(
												sdf.parse(mpmTituloXML.getxDt_Distribuicao().replace("T", " ")),
												mpmTituloXML.getxNo_Distribuicao());
				if (null == mpmSeloDistribuidor) {
					//
					mpmSeloDistribuidor = new MpmSeloDistribuidor(null,
							sdf.parse(mpmTituloXML.getxDt_Distribuicao().replace("T", " ")),
							mpmTituloXML.getxNo_Distribuicao(),
							"????");
					mpmSeloDistribuidor = this.mpmSeloDistribuidorRepository.saveAndFlush(mpmSeloDistribuidor);
				}				
				
				// Trata MpmTituloProtestado ...
				MpmTituloProtestado mpmTituloProtestado = 
									mpmTituloProtestadoService.buscarNumeroLivroAndNumeroFolha(
																Integer.parseInt(mpmTituloXML.getxNo_Livro()),
																Integer.parseInt(mpmTituloXML.getxNo_Folha()));
				if (null == mpmTituloProtestado) {
					//
					mpmTituloProtestado = new MpmTituloProtestado(null,
																Integer.parseInt(mpmTituloXML.getxNo_Livro()),
																Integer.parseInt(mpmTituloXML.getxNo_Folha()));
					mpmTituloProtestado = this.mpmTituloProtestadoRepository.saveAndFlush(mpmTituloProtestado);
				}				
				
				// Trata MpmTitulo ...
				MpmTitulo mpmTitulo = new MpmTitulo(null,  
						mpmTituloXML.getxFinsFalimentares(),
						mpmTituloXML.getxAceite(),
						mpmTituloXML.getxNo_Talao3Ofi(),
						mpmTituloXML.getxConvenio_NoLivro(),
						mpmTituloXML.getxTalao_NoLivro(),
						mpmTituloXML.getxAvista(),
						mpmTituloXML.getxNihil(),
						mpmTituloXML.getxTot_Pagar(),
						mpmTituloXML.getxTot_Deposito(),
						mpmTituloXML.getxDistribuicao(),
						mpmTituloXML.getxSaldo(),
						mpmTituloXML.getxValor(),
						mpmTituloXML.getxNo_Titulo(),
						sdf.parse(mpmTituloXML.getxDt_Vencto().replace("T", " ")),
						sdf.parse(mpmTituloXML.getxDt_Emissao().replace("T", " ")),
						sdf.parse(mpmTituloXML.getxDt_Ate().replace("T", " ")),
						mpmTituloXML.getxNo_Protocolo(),
						sdf.parse(mpmTituloXML.getxDt_Protocolo().replace("T", " ")),
						mpmTituloXML.getxFaixa(),
						mpmAlinea, mpmEspecie, mpmEndosso, mpmObservacao, mpmSeloDistribuidor);
				
				mpmTitulo = this.mpmTituloRepository.saveAndFlush(mpmTitulo);
				
						//
//						mpmTituloXML.getxConvenio(),
//						mpmTituloXML.getxEmpresa(),
//						mpmTituloXML.getxTp_Apresentante(), // ???
//						mpmTituloXML.getxEdital(),
//						mpmTituloXML.getxMicroEmpresa(),
//						mpmTituloXML.getxEmolumento(),
//						mpmTituloXML.getxLei_489(),
//						mpmTituloXML.getxLei_713(),
//						mpmTituloXML.getxVl_Variavel(),
//						mpmTituloXML.getxIntimacao(),
//						mpmTituloXML.getxCoobrigado(),
//						mpmTituloXML.getxDiligencia(),
//						mpmTituloXML.getxVl_Edital(),
//						mpmTituloXML.getxOutros(),
//						mpmTituloXML.getxTot_Emolu(),
//						mpmTituloXML.getxCco_Deved(),
//						mpmTituloXML.getxCco_Aval(),
//						mpmTituloXML.getxCco_Endoss(),
//						mpmTituloXML.getxCco_Notif(),
//						mpmTituloXML.getxCco_EndIgs(),
//						mpmTituloXML.getxCco_EndDifs(),
//						mpmTituloXML.getxUsr_Titulo(),
//						mpmTituloXML.getxDt_Sist_Tit(),
//						mpmTituloXML.getxNo_Cancelamento(),
//						mpmTituloXML.getxDinChq(),
//						mpmTituloXML.getxOco_Obs(),
//						mpmTituloXML.getxOco_Bloqueia(),
//						mpmTituloXML.getxOco_Usr(),
//						mpmTituloXML.getxDt_Sist_Oco(),
//						mpmTituloXML.getxTit_Chq_Rps(),
//						mpmTituloXML.getxTit_Motivo(),
//						mpmTituloXML.getxTit_CustasPg(),
//						mpmTituloXML.getxTit_ResIntima(),
//						mpmTituloXML.getxTit_ResCorreio(),
//						mpmTituloXML.getxTit_DtEdital(),
//						mpmTituloXML.getxTit_Intimado(),
//						mpmTituloXML.getxTit_Respondido(),
//						mpmTituloXML.getxTit_ResSE(),
//						mpmTituloXML.getxTit_ResSP(),
//						mpmTituloXML.getxTit_VlReembEdital(),
//						mpmTituloXML.getxNo_Cliente(),
//						mpmTituloXML.getxNomeFavorecido(),
//						mpmTituloXML.getxEnderecoFavorecido(),
//						mpmTituloXML.getxNumeroFavorecido(),
//						mpmTituloXML.getxComplementoFavorecido(),
//						mpmTituloXML.getxBairroFavorecido(),
//						mpmTituloXML.getxCidadeFavorecido(),
//						mpmTituloXML.getxUfFavorecido(),
//						mpmTituloXML.getxCepFavorecido(),
//						mpmTituloXML.getxNomeSacador(),
//						mpmTituloXML.getxEnderecoSacador(),
//						mpmTituloXML.getxNumeroSacador(),
//						mpmTituloXML.getxComplementoSacador(),
//						mpmTituloXML.getxBairroSacador(),
//						mpmTituloXML.getxCidadeSacador(),
//						mpmTituloXML.getxUfSacador(),
//						mpmTituloXML.getxCepSacador(),
//						mpmTituloXML.getxTp_DoctoFavorecido(),
//						mpmTituloXML.getxNo_DoctoFavorecido(),
//						mpmTituloXML.getxTp_DoctoSacador(),
//						mpmTituloXML.getxNo_DoctoSacador(),
//						mpmTituloXML.getxEncerrado(),
//						mpmTituloXML.getxCod_Irregularidade(),
//						mpmTituloXML.getxRsDesiste(),
//						mpmTituloXML.getxLei4664(),
//						mpmTituloXML.getxLei111(),
//						mpmTituloXML.getxLei3761(),
//						mpmTituloXML.getxArquivamento(),
//						mpmTituloXML.getxLei6281(),

				// Trata MpmStatus ...
				MpmStatus mpmStatus = mpmStatusService.buscarCodigo(01); // Vrf.Key Prisco ??
				if (null == mpmStatus) {
					//
					mpmStatus = new MpmStatus(null, 01 , "Verificar KEY Prisco ???");
					mpmStatus = this.mpmStatusRepository.saveAndFlush(mpmStatus);
				}				

				// Trata MpmTituloStatus ...
				MpmTituloStatus mpmTituloStatus = 
								mpmTituloStatusService.buscarDataOcorrenciaAndCodigo(
										sdf.parse(mpmTituloXML.getxDt_Ocorrencia().replace("T", " ")),
										mpmTituloXML.getxOco_Codigo());
				if (null == mpmTituloStatus) {
					//
					mpmTituloStatus = new MpmTituloStatus(null,
												sdf.parse(mpmTituloXML.getxDt_Ocorrencia().replace("T", " ")),
												mpmTituloXML.getxOco_Codigo(),
												"???", // motivoProtesto ???
												"???", // observacao ???
												false, // indBloqueado ???
												mpmTitulo,
												mpmTituloProtestado,
												mpmStatus);
					mpmTituloStatus = this.mpmTituloStatusRepository.saveAndFlush(mpmTituloStatus);
				}
				// Retations ...
				mpmStatus.getMpmTituloStatuss().addAll(Arrays.asList(mpmTituloStatus));
				mpmTitulo = this.mpmTituloRepository.saveAndFlush(mpmTitulo);
				

				// Relations ...
				mpmTitulo.getMpmApresentantes().addAll(Arrays.asList(mpmApresentante));
				mpmTitulo = this.mpmTituloRepository.saveAndFlush(mpmTitulo);
				
				// Trata Relations ...
				mpmAlinea.getMpmTitulos().addAll(Arrays.asList(mpmTitulo));
				mpmAlinea = this.mpmAlineaRepository.saveAndFlush(mpmAlinea);

				mpmEspecie.getMpmTitulos().addAll(Arrays.asList(mpmTitulo));
				mpmEspecie = this.mpmEspecieRepository.saveAndFlush(mpmEspecie);

				mpmEndosso.getMpmTitulos().addAll(Arrays.asList(mpmTitulo));
				mpmEndosso = this.mpmEndossoRepository.saveAndFlush(mpmEndosso);

				mpmObservacao.getMpmTitulos().addAll(Arrays.asList(mpmTitulo));
				mpmObservacao = this.mpmObservacaoRepository.saveAndFlush(mpmObservacao);

				mpmSeloDistribuidor.getMpmTitulos().addAll(Arrays.asList(mpmTitulo));
				mpmSeloDistribuidor = this.mpmSeloDistribuidorRepository.saveAndFlush(mpmSeloDistribuidor);

				mpmTituloProtestado.getMpmTituloStatuss().addAll(Arrays.asList(mpmTituloStatus));
				mpmTituloProtestado = this.mpmTituloProtestadoRepository.saveAndFlush(mpmTituloProtestado);
				//
			}
			//
			this.logCarga = this.logCarga + " ( TrataCargaTituloXML() = " + 
													mpmTitulosXML.getMpmTituloXMLs().size() + " ) ";
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
	public void trataCarga() {
		// ========================
		// Trata MpCategoria ...
		// ========================
		MpCategoria mpCat1 = new MpCategoria(null, "Informática"); // Teste/Marcus???
		MpCategoria mpCat2 = new MpCategoria(null, "Escritório");
		
		this.mpCategoriaRepository.saveAll(Arrays.asList(mpCat1, mpCat2));

		// ========================
		// Trata MpmAlinea ...
		// ========================
		MpmAlinea mpmAli1 = new MpmAlinea(null, 11, "INSUFICIÊNCIA DE FUNDOS"); // Prisco???
		MpmAlinea mpmAli2 = new MpmAlinea(null, 2, "Alinea.02");
		MpmAlinea mpmAli3 = new MpmAlinea(null, 3, "Alinea.03");
		MpmAlinea mpmAli4 = new MpmAlinea(null, 4, "Alinea.04");
		MpmAlinea mpmAli5 = new MpmAlinea(null, 5, "Alinea.05");

		mpmAli1 = this.mpmAlineaRepository.saveAndFlush(mpmAli1);
		mpmAli2 = this.mpmAlineaRepository.saveAndFlush(mpmAli2);
		mpmAli3 = this.mpmAlineaRepository.saveAndFlush(mpmAli3);
		mpmAli4 = this.mpmAlineaRepository.saveAndFlush(mpmAli4);
		mpmAli5 = this.mpmAlineaRepository.saveAndFlush(mpmAli5);
		
		// ========================
		// Trata MpmEspecie ...
		// ========================
		MpmEspecie mpmEsp1 = new MpmEspecie(null, "DM", "DUPLICATA MERCANTIL", 4); // Prisco???
		MpmEspecie mpmEsp2 = new MpmEspecie(null, "002", "Especie.002", 20);
		MpmEspecie mpmEsp3 = new MpmEspecie(null, "003", "Especie.003", 30);
		MpmEspecie mpmEsp4 = new MpmEspecie(null, "004", "Especie.004", 40);
		MpmEspecie mpmEsp5 = new MpmEspecie(null, "005", "Especie.005", 50);

		mpmEsp1 = this.mpmEspecieRepository.saveAndFlush(mpmEsp1);
		mpmEsp2 = this.mpmEspecieRepository.saveAndFlush(mpmEsp2);
		mpmEsp3 = this.mpmEspecieRepository.saveAndFlush(mpmEsp3);
		mpmEsp4 = this.mpmEspecieRepository.saveAndFlush(mpmEsp4);
		mpmEsp5 = this.mpmEspecieRepository.saveAndFlush(mpmEsp5);
		
		// ========================
		// Trata MpmStatus ...
		// ========================
		MpmStatus mpmSta1 = new MpmStatus(null, 1, "Status.001"); // Prisco???
		MpmStatus mpmSta2 = new MpmStatus(null, 2, "Status.002");
		MpmStatus mpmSta3 = new MpmStatus(null, 3, "Status.003");
		MpmStatus mpmSta4 = new MpmStatus(null, 4, "Status.004");
		MpmStatus mpmSta5 = new MpmStatus(null, 5, "Status.005");

		mpmSta1 = mpmStatusRepository.saveAndFlush(mpmSta1);
		mpmSta2 = mpmStatusRepository.saveAndFlush(mpmSta2);
		mpmSta3 = mpmStatusRepository.saveAndFlush(mpmSta3);
		mpmSta4 = mpmStatusRepository.saveAndFlush(mpmSta4);
		mpmSta5 = mpmStatusRepository.saveAndFlush(mpmSta5);
		
		// ========================
		// Trata MpmIdentificacao ...
		// ========================
		MpmIdentificacao mpmIde1 = new MpmIdentificacao(null, 1, "Devedor"); // Prisco???
		MpmIdentificacao mpmIde2 = new MpmIdentificacao(null, 2, "Identif.02");
		MpmIdentificacao mpmIde3 = new MpmIdentificacao(null, 3, "Identif.03");
		MpmIdentificacao mpmIde4 = new MpmIdentificacao(null, 4, "Identif.04");
		
		mpmIde1 = mpmIdentificacaoRepository.saveAndFlush(mpmIde1);
		mpmIde2 = mpmIdentificacaoRepository.saveAndFlush(mpmIde2);
		mpmIde3 = mpmIdentificacaoRepository.saveAndFlush(mpmIde3);
		mpmIde4 = mpmIdentificacaoRepository.saveAndFlush(mpmIde4);
		
		// ========================
		// Trata MpmEndosso ...
		// ========================
		MpmEndosso mpmEndo1 = new MpmEndosso(null, "1", "Endosso 1"); // Prisco???
		MpmEndosso mpmEndo2 = new MpmEndosso(null, "2", "Endosso 2"); 
		MpmEndosso mpmEndo3 = new MpmEndosso(null, "3", "Endosso 3"); 
		MpmEndosso mpmEndo4 = new MpmEndosso(null, "4", "Endosso 4"); 
		
		mpmEndo1 = mpmEndossoRepository.saveAndFlush(mpmEndo1);
		mpmEndo2 = mpmEndossoRepository.saveAndFlush(mpmEndo2);
		mpmEndo3 = mpmEndossoRepository.saveAndFlush(mpmEndo3);
		mpmEndo4 = mpmEndossoRepository.saveAndFlush(mpmEndo4);

		// ==========================
		// Trata MpmMotivoEdital ... 
		// ==========================
		MpmMotivoEdital mpmMotE1 = new MpmMotivoEdital(null, "01", "Mot.Edital.1"); 
		
		mpmMotE1 = mpmMotivoEditalRepository.saveAndFlush(mpmMotE1);

		// ==========================
		// Trata MpmObservacao ... 
		// ==========================
		MpmObservacao mpmObs1 = new MpmObservacao(null, "Tipo.1", "Descricao.1", mpmMotE1); 
		
		mpmObs1 = mpmObservacaoRepository.saveAndFlush(mpmObs1);

		// =============================
		// Trata MpmSeloDistribuidor ... 
		// =============================
		Date dataX = new Date();

		MpmSeloDistribuidor mpmSel1 = new MpmSeloDistribuidor(null, dataX, "11111", "Selo COmpleto 1"); 
		
		mpmSel1 = mpmSeloDistribuidorRepository.saveAndFlush(mpmSel1);

		// ========================
		// Trata MpmTitulo ...
		// ========================
		MpmTitulo mpmTit1 = new MpmTitulo(null, "?", "?", "?", "?", "?", "?", "?",
				"?", "?", "?", "?", "?", "?",dataX, dataX, dataX,
				"?", dataX, "?", mpmAli1, mpmEsp1, mpmEndo1, mpmObs1, mpmSel1);

		MpmTitulo mpmTit2 = new MpmTitulo(null, "?", "?", "?", "?", "?", "?", "?",
				"?", "?", "?", "?", "?", "?",dataX, dataX, dataX,
				"?", dataX, "?", mpmAli1, mpmEsp1, mpmEndo1, mpmObs1, mpmSel1);

		MpmTitulo mpmTit3 = new MpmTitulo(null, "?", "?", "?", "?", "?", "?", "?", 
				"?", "?", "?", "?", "?", "?",dataX, dataX, dataX,
				"?", dataX, "?", mpmAli3, mpmEsp3, mpmEndo3, mpmObs1, mpmSel1);
		
		mpmTit1 = mpmTituloRepository.saveAndFlush(mpmTit1);
		mpmTit2 = mpmTituloRepository.saveAndFlush(mpmTit2);
		mpmTit3 = mpmTituloRepository.saveAndFlush(mpmTit3);

		// =============================
		// Trata MpmTituloProtestado ...
		// =============================
		dataX = new Date();
		
		MpmTituloProtestado mpmTitPro1 = new MpmTituloProtestado(null, 11111111, 11111);
		MpmTituloProtestado mpmTitPro2 = new MpmTituloProtestado(null, 22222222, 22222);
		MpmTituloProtestado mpmTitPro3 = new MpmTituloProtestado(null, 33333333, 33333);
		MpmTituloProtestado mpmTitPro4 = new MpmTituloProtestado(null, 44444444, 44444);
		MpmTituloProtestado mpmTitPro5 = new MpmTituloProtestado(null, 55555555, 55555);

		mpmTitPro1 = mpmTituloProtestadoRepository.saveAndFlush(mpmTitPro1);
		mpmTitPro2 = mpmTituloProtestadoRepository.saveAndFlush(mpmTitPro2);
		mpmTitPro3 = mpmTituloProtestadoRepository.saveAndFlush(mpmTitPro3);
		mpmTitPro4 = mpmTituloProtestadoRepository.saveAndFlush(mpmTitPro4);
		mpmTitPro5 = mpmTituloProtestadoRepository.saveAndFlush(mpmTitPro5);

		// =========================
		// Trata MpmTituloStatus ...
		// =========================		
		MpmTituloStatus mpmTitSta1 = new MpmTituloStatus(null, dataX, "01", "Motivo TitulosStatus.001",
										"Obs.TitulosStatus1", false, mpmTit1, mpmTitPro1, mpmSta1);
		MpmTituloStatus mpmTitSta2 = new MpmTituloStatus(null, dataX, "02", "Motivo TitulosStatus.002",
										"Obs.TitulosStatus2", false, mpmTit1, mpmTitPro1, mpmSta1);
		MpmTituloStatus mpmTitSta3 = new MpmTituloStatus(null, dataX, "03", "Motivo TitulosStatus.003",
										"Obs.TitulosStatus3", false, mpmTit1, null, mpmSta1);
		MpmTituloStatus mpmTitSta4 = new MpmTituloStatus(null, dataX, "04", "Motivo TitulosStatus.004",
										"Obs.TitulosStatus4", false, mpmTit2, null, mpmSta1);
		MpmTituloStatus mpmTitSta5 = new MpmTituloStatus(null, dataX, "05", "Motivo TitulosStatus.005",
										"Obs.TitulosStatus5", false, mpmTit2, null, mpmSta1);
		MpmTituloStatus mpmTitSta6 = new MpmTituloStatus(null, dataX, "06", "Motivo TitulosStatus.006",
										"Obs.TitulosStatus6", false, mpmTit3, mpmTitPro5, mpmSta1);

		mpmTitSta1 = mpmTituloStatusRepository.saveAndFlush(mpmTitSta1);
		mpmTitSta2 = mpmTituloStatusRepository.saveAndFlush(mpmTitSta2);
		mpmTitSta3 = mpmTituloStatusRepository.saveAndFlush(mpmTitSta3);
		mpmTitSta4 = mpmTituloStatusRepository.saveAndFlush(mpmTitSta4);
		mpmTitSta5 = mpmTituloStatusRepository.saveAndFlush(mpmTitSta5);
		mpmTitSta6 = mpmTituloStatusRepository.saveAndFlush(mpmTitSta6);

		// =============================
		// Trata MpmEstadoUf ...
		// =============================
		MpmEstadoUf mpmEst1 = new MpmEstadoUf(null, "RJ", "RIO DE JANEIRO");
		MpmEstadoUf mpmEst2 = new MpmEstadoUf(null, "SP", "SÃO PAULO");
		MpmEstadoUf mpmEst3 = new MpmEstadoUf(null, "RS", "RIO GRANDE DO SUL");

		mpmEst1 = mpmEstadoUfRepository.saveAndFlush(mpmEst1);
		mpmEst2 = mpmEstadoUfRepository.saveAndFlush(mpmEst2);
		mpmEst3 = mpmEstadoUfRepository.saveAndFlush(mpmEst3);

		// =============================
		// Trata MpmCidade ...
		// =============================
		MpmCidade mpmCid1 = new MpmCidade(null, "RIO JANEIRO", mpmEst1);
		MpmCidade mpmCid2 = new MpmCidade(null, "NITERÓI", mpmEst1);
		MpmCidade mpmCid3 = new MpmCidade(null, "SÃO GONÇALO", mpmEst1);
		MpmCidade mpmCid4 = new MpmCidade(null, "SÃO PAULO", mpmEst2);
		MpmCidade mpmCid5 = new MpmCidade(null, "SANTA CATARINA", mpmEst3);
		
		mpmCid1 = mpmCidadeRepository.saveAndFlush(mpmCid1);
		mpmCid2 = mpmCidadeRepository.saveAndFlush(mpmCid2);
		mpmCid3 = mpmCidadeRepository.saveAndFlush(mpmCid3);
		mpmCid4 = mpmCidadeRepository.saveAndFlush(mpmCid4);
		mpmCid5 = mpmCidadeRepository.saveAndFlush(mpmCid5);

		mpmEst1.getMpmCidades().addAll(Arrays.asList(mpmCid1, mpmCid2, mpmCid3));
		mpmEst2.getMpmCidades().addAll(Arrays.asList(mpmCid4));
		mpmEst3.getMpmCidades().addAll(Arrays.asList(mpmCid5));

		mpmEstadoUfRepository.saveAll(Arrays.asList(mpmEst1, mpmEst2, mpmEst3));
		
		// =============================
		// Trata MpmEndereco ...
		// =============================
		MpmEndereco mpmEnd1 = new MpmEndereco(null, "RUA LOGRADOURO 1", " NUMERO: 1", "COMPLEMENTO 1",
												"11111-111", "BAIRRO 1", mpmCid1);
		MpmEndereco mpmEnd2 = new MpmEndereco(null, "RUA LOGRADOURO 2", " NUMERO: 2", "COMPLEMENTO 2",
												"22222-222", "BAIRRO 2", mpmCid1);
		MpmEndereco mpmEnd3 = new MpmEndereco(null, "RUA LOGRADOURO 3", " NUMERO: 3", "COMPLEMENTO 3",
												"33333-333", "BAIRRO 3", mpmCid2);
		MpmEndereco mpmEnd4 = new MpmEndereco(null, "RUA LOGRADOURO 4", " NUMERO: 4", "COMPLEMENTO 4",
												"44444-444", "BAIRRO 4", mpmCid3);
		MpmEndereco mpmEnd5 = new MpmEndereco(null, "RUA LOGRADOURO 5", " NUMERO: 5", "COMPLEMENTO 5",
												"55555-555", "BAIRRO 5", mpmCid4);
		MpmEndereco mpmEnd6 = new MpmEndereco(null, "RUA LOGRADOURO 6", " NUMERO: 6", "COMPLEMENTO 6",
												"66666-666", "BAIRRO 6", mpmCid1);
		MpmEndereco mpmEnd7 = new MpmEndereco(null, "RUA LOGRADOURO 7", " NUMERO: 6", "COMPLEMENTO 6",
												"77777-777", "BAIRRO 7", mpmCid1);
		
		mpmEnd1 = mpmEnderecoRepository.saveAndFlush(mpmEnd1);
		mpmEnd2 = mpmEnderecoRepository.saveAndFlush(mpmEnd2);
		mpmEnd3 = mpmEnderecoRepository.saveAndFlush(mpmEnd3);
		mpmEnd4 = mpmEnderecoRepository.saveAndFlush(mpmEnd4);
		mpmEnd5 = mpmEnderecoRepository.saveAndFlush(mpmEnd5);
		mpmEnd6 = mpmEnderecoRepository.saveAndFlush(mpmEnd6);
		mpmEnd7 = mpmEnderecoRepository.saveAndFlush(mpmEnd7);

		// ==========================
		// Trata MpmBanco ... 
		// ==========================
		MpmBanco mpmBan1 = new MpmBanco(null, "1111", 1111111, "Banco.1"); 
		MpmBanco mpmBan2 = new MpmBanco(null, "2222", 2222222, "Banco.2"); 
		MpmBanco mpmBan3 = new MpmBanco(null, "3333", 3333333, "Banco.3"); 
		MpmBanco mpmBan4 = new MpmBanco(null, "4444", 4444444, "Banco.4"); 
		
		mpmBan1 = mpmBancoRepository.saveAndFlush(mpmBan1);
		mpmBan2 = mpmBancoRepository.saveAndFlush(mpmBan2);
		mpmBan3 = mpmBancoRepository.saveAndFlush(mpmBan3);
		mpmBan4 = mpmBancoRepository.saveAndFlush(mpmBan4);

		// =============================
		// Trata MpmDevedor ...
		// =============================
		MpmDevedor mpmDev1 = new MpmDevedor(null, "nome111", 111, mpmIde1, mpmEnd1);
		MpmDevedor mpmDev2 = new MpmDevedor(null, "nome222", 222, mpmIde1, mpmEnd1);
		MpmDevedor mpmDev3 = new MpmDevedor(null, "nome333", 333, mpmIde3, mpmEnd2);
		MpmDevedor mpmDev4 = new MpmDevedor(null, "nome444", 444, mpmIde4, mpmEnd4);
		MpmDevedor mpmDev5 = new MpmDevedor(null, "nome555", 555, mpmIde4, mpmEnd5);

		mpmDev1 = mpmDevedorRepository.saveAndFlush(mpmDev1);
		mpmDev2 = mpmDevedorRepository.saveAndFlush(mpmDev2);
		mpmDev3 = mpmDevedorRepository.saveAndFlush(mpmDev3);
		mpmDev4 = mpmDevedorRepository.saveAndFlush(mpmDev4);
		mpmDev5 = mpmDevedorRepository.saveAndFlush(mpmDev5);

		// =============================
		// Trata MpmApresentante ...
		// =============================
		MpmApresentante mpmApr1 = new MpmApresentante(null, "111", "Apresentante 1", false, "TD01",
												"Num.Doc. 1", new BigDecimal("1000.00"), mpmEnd6, mpmBan1);
		MpmApresentante mpmApr2 = new MpmApresentante(null, "222", "Apresentante 2", false, "TD02",
												"Num.Doc. 2", new BigDecimal("1000.00"), mpmEnd7, mpmBan1);
		MpmApresentante mpmApr3 = new MpmApresentante(null, "333", "Apresentante 3", true, "TD03",
												"Num.Doc. 3", new BigDecimal("1000.00"), mpmEnd1, mpmBan2);
		MpmApresentante mpmApr4 = new MpmApresentante(null, "444", "Apresentante 4", true, "TD04",
												"Num.Doc. 4", new BigDecimal("1000.00"), mpmEnd1, mpmBan3);
		MpmApresentante mpmApr5 = new MpmApresentante(null, "555", "Apresentante 5", false, "TD05",
												"Num.Doc. 5", new BigDecimal("1000.00"), mpmEnd1, mpmBan4);

		mpmApr1 = mpmApresentanteRepository.saveAndFlush(mpmApr1);
		mpmApr2 = mpmApresentanteRepository.saveAndFlush(mpmApr2);
		mpmApr3 = mpmApresentanteRepository.saveAndFlush(mpmApr3);
		mpmApr4 = mpmApresentanteRepository.saveAndFlush(mpmApr4);
		mpmApr5 = mpmApresentanteRepository.saveAndFlush(mpmApr5);

		// =============================
		// Trata MpmPessoaTitulo ...
		// =============================
		MpmPessoaTitulo mpmPet1 = new MpmPessoaTitulo(null, "Pessoa Titulo 1", "TD01", "Num.Doc. 1", 
														false, 111, "1", "1", true, mpmEnd7);
		MpmPessoaTitulo mpmPet2 = new MpmPessoaTitulo(null, "Pessoa Titulo 2", "TD02", "Num.Doc. 2", 
														false, 222, "2", "2", true, mpmEnd6);
		MpmPessoaTitulo mpmPet3 = new MpmPessoaTitulo(null, "Pessoa Titulo 3", "TD03", "Num.Doc. 3", 
														false, 333, "3", "3", true, mpmEnd2);
		MpmPessoaTitulo mpmPet4 = new MpmPessoaTitulo(null, "Pessoa Titulo 4", "TD04", "Num.Doc. 4", 
														false, 444, "4", "4", true, mpmEnd2);
		MpmPessoaTitulo mpmPet5 = new MpmPessoaTitulo(null, "Pessoa Titulo 5", "TD05", "Num.Doc. 5", 
														false, 555, "5", "5", true, mpmEnd2);

		mpmPet1 = mpmPessoaTituloRepository.saveAndFlush(mpmPet1);
		mpmPet2 = mpmPessoaTituloRepository.saveAndFlush(mpmPet2);
		mpmPet3 = mpmPessoaTituloRepository.saveAndFlush(mpmPet3);
		mpmPet4 = mpmPessoaTituloRepository.saveAndFlush(mpmPet4);
		mpmPet5 = mpmPessoaTituloRepository.saveAndFlush(mpmPet5);

		// =========================
		// Trata MpSistemaConfig ...
		// =========================
		MpSistemaConfig mpSisC1 = new MpSistemaConfig(null, "SistemaOficio", "Define CÓDIDO do Oficio",
																			MpTipoCampo.N, "", 1, false);
		
		mpSistemaConfigRepository.saveAll(Arrays.asList(mpSisC1));

		// =========================
		// Trata MpmOficio ...
		// =========================
		MpmOficio mpmOfi1 = new MpmOficio(null, "1", "1º Oficio", "?", "?", "?", true, 
										"D:/temp/SeloDigital/Receber/Ano/Mes/Dia", "InformarDrive");
		MpmOficio mpmOfi2 = new MpmOficio(null, "2", "2º Oficio", "?", "?", "?", true, 
										"H:/SeloDigital/Receber/Ano/Mes/Dia", "InformarDrive");
		MpmOficio mpmOfi3 = new MpmOficio(null, "3", "3º Oficio", "?", "?", "?", true, 
										"I:/Receber/Ano/Mes/Dia", "InformarDrive");
		MpmOficio mpmOfi4 = new MpmOficio(null, "4", "4º Oficio", "?", "?", "?", true, 
										"X:/SeloDigital/Receber/Ano/Mes/Dia", "InformarDrive");
		
		mpmOficioRepository.saveAll(Arrays.asList(mpmOfi1, mpmOfi2, mpmOfi3, mpmOfi4));

		// =============================
		// Trata MpmControleOficio ...
		// =============================
		MpmControleOficio mpmCon1 = new MpmControleOficio(null, 111111, "Org Emissor 1", "Oficio 1", 
										new Date(), "cpf cnpj 1", "Nom.Dev", "Nom.Dev1", "Nom.Dev2");
		MpmControleOficio mpmCon2 = new MpmControleOficio(null, 222222, "Org Emissor 2", "Oficio 2", 
										new Date(), "cpf cnpj 2", "Nom.Dev", "Nom.Dev1", "Nom.Dev2");
		MpmControleOficio mpmCon3 = new MpmControleOficio(null, 333333, "Org Emissor 3", "Oficio 3", 
										new Date(), "cpf cnpj 3", "Nom.Dev", "Nom.Dev1", "Nom.Dev2");
		
		mpmControleOficioRepository.saveAll(Arrays.asList(mpmCon1, mpmCon2, mpmCon3));

		// =========================
		// Trata MpmAnoReferencia ...
		// =========================
		MpmAnoReferencia mpmAno1 = new MpmAnoReferencia(null, "2016", "Ano 2016", true);
		MpmAnoReferencia mpmAno2 = new MpmAnoReferencia(null, "2017", "Ano 2017", true);
		MpmAnoReferencia mpmAno3 = new MpmAnoReferencia(null, "2018", "Ano 2018", true);
		MpmAnoReferencia mpmAno4 = new MpmAnoReferencia(null, "2019", "Ano 2019", false);
		
		mpmAno1 = mpmAnoReferenciaRepository.saveAndFlush(mpmAno1);
		mpmAno2 = mpmAnoReferenciaRepository.saveAndFlush(mpmAno2);
		mpmAno3 = mpmAnoReferenciaRepository.saveAndFlush(mpmAno3);
		mpmAno4 = mpmAnoReferenciaRepository.saveAndFlush(mpmAno4);

		// =========================
		// Trata MpmAto ... 
		// =========================
		MpmAto mpmAto1 = new MpmAto(null, mpmAno3, "1111", "1", "Descricao Ato.1", "1", 
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00),
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00),
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00),
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), 1);
		MpmAto mpmAto2 = new MpmAto(null, mpmAno3, "2222", "2", "Descricao Ato.2", "2", 
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00),
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00),
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00),
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(100.00), 2);
		
		mpmAto1 = mpmAtoRepository.saveAndFlush(mpmAto1);
		mpmAto2 = mpmAtoRepository.saveAndFlush(mpmAto2);

		// =============================
		// Trata MpmCustasComposicao ... 
		// =============================
		MpmCustasComposicao mpmCus1 = new MpmCustasComposicao(null, mpmAno3, "16", "01", "*",
											"BUSCAS", "Complem.1", "Excessao.1", BigDecimal.valueOf(12.24),
											"4049", "4075", BigDecimal.valueOf(0.01), 
											BigDecimal.valueOf(50.00), "2017.24.1.A - FAIXA A", null); 

		mpmCus1 = mpmCustasComposicaoRepository.saveAndFlush(mpmCus1);

		// ==========================
		// Trata MpmAtoComposicao ... 
		// ==========================
		MpmAtoComposicao mpmAtoc1 = new MpmAtoComposicao(null, mpmAto1, mpmCus1, 100); 
		MpmAtoComposicao mpmAtoc2 = new MpmAtoComposicao(null, mpmAto2, mpmCus1, 200); 
		
		mpmAtoc1 = mpmAtoComposicaoRepository.saveAndFlush(mpmAtoc1);
		mpmAtoc2 = mpmAtoComposicaoRepository.saveAndFlush(mpmAtoc2);

		// ==========================
		// Trata MpmDataProcesso ... 
		// ==========================
		MpmDataProcesso mpmDatP1 = new MpmDataProcesso(null, dataX, dataX, "PI.111", "PF.111"); 
		MpmDataProcesso mpmDatP2 = new MpmDataProcesso(null, dataX, dataX, "PI.222", "PF.222"); 
		
		mpmDatP1 = mpmDataProcessoRepository.saveAndFlush(mpmDatP1);
		mpmDatP2 = mpmDataProcessoRepository.saveAndFlush(mpmDatP2);

		// ==========================
		// Trata MpmFeriado ... 
		// ==========================
		MpmFeriado mpmFer1 = new MpmFeriado(null, dataX, "Teste Feriado 1"); 
		MpmFeriado mpmFer2 = new MpmFeriado(null, new Date(), "Teste Feriado 2"); 
		
		mpmFer1 = mpmFeriadoRepository.saveAndFlush(mpmFer1);
		mpmFer2 = mpmFeriadoRepository.saveAndFlush(mpmFer2);

		// =============================
		// Trata MpmImportarControle ... 
		// =============================
		MpmImportarControle mpmImpC1 = new MpmImportarControle(null, dataX, dataX, dataX); 
		MpmImportarControle mpmImpC2 = new MpmImportarControle(null, dataX, dataX, dataX); 
		
		mpmImpC1 = mpmImportarControleRepository.saveAndFlush(mpmImpC1);
		mpmImpC2 = mpmImportarControleRepository.saveAndFlush(mpmImpC2);

		// =====================
		// Trata MpmRemessa ... 
		// =====================
		MpmRemessa mpmRem1 = new MpmRemessa(null, mpmImpC1, "Z012103.181", "PROTI1", "PROTF1"); 
		MpmRemessa mpmRem2 = new MpmRemessa(null, mpmImpC1, "Z012103.182", "PROTI2", "PROTF2");
		MpmRemessa mpmRem3 = new MpmRemessa(null, mpmImpC2, "Z012103.183", "PROTI3", "PROTF3");
		
		mpmRem1 = mpmRemessaRepository.saveAndFlush(mpmRem1);
		mpmRem2 = mpmRemessaRepository.saveAndFlush(mpmRem2);
		mpmRem3 = mpmRemessaRepository.saveAndFlush(mpmRem3);

		// =====================
		// Trata MpmHeader ... 
		// =====================
		MpmHeader mpmHea1 = new MpmHeader(null, mpmRem1, "111", "111", "111", "111", "111", "111",
											"111", "111", "111", "111", "1", "111"); 
		MpmHeader mpmHea2 = new MpmHeader(null, mpmRem1, "222", "222", "222", "222", "222", "222",
											"222", "222", "222", "222", "2", "222"); 
		MpmHeader mpmHea3 = new MpmHeader(null, mpmRem2, "333", "333", "333", "333", "333", "333",
											"333", "333", "333", "333", "3", "333"); 
		
		mpmHea1 = mpmHeaderRepository.saveAndFlush(mpmHea1);
		mpmHea2 = mpmHeaderRepository.saveAndFlush(mpmHea2);
		mpmHea3 = mpmHeaderRepository.saveAndFlush(mpmHea3);

		// ======================
		// Trata MpmTransacao ... 
		// ======================
		MpmTransacao mpmTrans1 = new MpmTransacao(null, mpmRem1, "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"); 

		MpmTransacao mpmTrans2 = new MpmTransacao(null, mpmRem1, "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"); 

		MpmTransacao mpmTrans3 = new MpmTransacao(null, mpmRem2, "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1",
												"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"); 
		
		mpmTrans1 = mpmTransacaoRepository.saveAndFlush(mpmTrans1);
		mpmTrans2 = mpmTransacaoRepository.saveAndFlush(mpmTrans2);
		mpmTrans3 = mpmTransacaoRepository.saveAndFlush(mpmTrans3);

		// ======================
		// Trata MpmTrailler ... 
		// ======================
		MpmTrailler mpmTra1 = new MpmTrailler(null, mpmRem1, "111", "111", "111", "1", "111"); 
		MpmTrailler mpmTra2 = new MpmTrailler(null, mpmRem1, "222", "222", "222", "2", "222"); 
		MpmTrailler mpmTra3 = new MpmTrailler(null, mpmRem2, "333", "333", "333", "3", "333"); 

		mpmTra1 = mpmTraillerRepository.saveAndFlush(mpmTra1);
		mpmTra2 = mpmTraillerRepository.saveAndFlush(mpmTra2);
		mpmTra3 = mpmTraillerRepository.saveAndFlush(mpmTra3);

		// ======================
		// Trata MpmPendencia ... 
		// ======================
		MpmPendencia mpmPend1 = new MpmPendencia(null, dataX, dataX, "1", "1", dataX, "1", "1");
		MpmPendencia mpmPend2 = new MpmPendencia(null, dataX, dataX, "1", "1", dataX, "1", "1");
		MpmPendencia mpmPend3 = new MpmPendencia(null, dataX, dataX, "1", "1", dataX, "1", "1");

		mpmPend1 = mpmPendenciaRepository.saveAndFlush(mpmPend1);
		mpmPend2 = mpmPendenciaRepository.saveAndFlush(mpmPend2);
		mpmPend3 = mpmPendenciaRepository.saveAndFlush(mpmPend3);

		// ==============================
		// Trata MpmItemEmolumentoXml ... 
		// ==============================
		MpmItemEmolumentoXml mpmItX1 = new MpmItemEmolumentoXml(null, dataX, "1", "1", "1", "1",
											"1", "1", "1", 1, "1", "1", BigDecimal.valueOf(1.11), "1");

		mpmItX1 = mpmItemEmolumentoXmlRepository.saveAndFlush(mpmItX1);

		// ==========================
		// Procede Relacionamentos:
		// ==========================
		mpmAli1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2));
		mpmAli3.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmEsp1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2));
		mpmEsp3.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmEndo1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2));
		mpmEndo3.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmTit1.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta1, mpmTitSta2, mpmTitSta3));
		mpmTit2.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta4, mpmTitSta5));
		mpmTit3.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta6));

		mpmTitPro1.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta1, mpmTitSta2));
		mpmTitPro5.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta6));

		mpmSta1.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta1, mpmTitSta2, mpmTitSta3));
		//	

		mpmBan1.getMpmApresentantes().addAll(Arrays.asList(mpmApr1, mpmApr2));
		mpmBan2.getMpmApresentantes().addAll(Arrays.asList(mpmApr3));
		mpmBan3.getMpmApresentantes().addAll(Arrays.asList(mpmApr4));
		mpmBan4.getMpmApresentantes().addAll(Arrays.asList(mpmApr5));
		
		mpmEnd1.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev2));
		mpmEnd2.getMpmDevedors().addAll(Arrays.asList(mpmDev3));
		mpmEnd4.getMpmDevedors().addAll(Arrays.asList(mpmDev4));
		mpmEnd5.getMpmDevedors().addAll(Arrays.asList(mpmDev5));
		
		mpmEnd1.getMpmApresentantes().addAll(Arrays.asList(mpmApr3, mpmApr4, mpmApr5));
		mpmEnd6.getMpmApresentantes().addAll(Arrays.asList(mpmApr1));
		mpmEnd7.getMpmApresentantes().addAll(Arrays.asList(mpmApr2));

		mpmEnd2.getMpmPessoaTitulos().addAll(Arrays.asList(mpmPet3, mpmPet4, mpmPet5));
		mpmEnd6.getMpmPessoaTitulos().addAll(Arrays.asList(mpmPet2));
		mpmEnd7.getMpmPessoaTitulos().addAll(Arrays.asList(mpmPet1));

		mpmIde1.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev2));
		mpmIde3.getMpmDevedors().addAll(Arrays.asList(mpmDev3));
		mpmIde4.getMpmDevedors().addAll(Arrays.asList(mpmDev4, mpmDev5));

		// N to N:
		
		mpmTit1.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev2));
		mpmTit2.getMpmDevedors().addAll(Arrays.asList(mpmDev3, mpmDev4));
		mpmTit3.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev3, mpmDev5));

		mpmTit1 = mpmTituloRepository.saveAndFlush(mpmTit1);
		mpmTit2 = mpmTituloRepository.saveAndFlush(mpmTit2);
		mpmTit3 = mpmTituloRepository.saveAndFlush(mpmTit3);

		mpmDev1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit3));
		mpmDev2.getMpmTitulos().addAll(Arrays.asList(mpmTit1));
		mpmDev3.getMpmTitulos().addAll(Arrays.asList(mpmTit2, mpmTit3));
		mpmDev4.getMpmTitulos().addAll(Arrays.asList(mpmTit2));
		mpmDev5.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmTit1.getMpmApresentantes().addAll(Arrays.asList(mpmApr1, mpmApr2));
		mpmTit2.getMpmApresentantes().addAll(Arrays.asList(mpmApr3, mpmApr4));
		mpmTit3.getMpmApresentantes().addAll(Arrays.asList(mpmApr1, mpmApr3, mpmApr5));

		mpmTit1 = mpmTituloRepository.saveAndFlush(mpmTit1);
		mpmTit2 = mpmTituloRepository.saveAndFlush(mpmTit2);
		mpmTit3 = mpmTituloRepository.saveAndFlush(mpmTit3);

		mpmApr1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit3));
		mpmApr2.getMpmTitulos().addAll(Arrays.asList(mpmTit1));
		mpmApr3.getMpmTitulos().addAll(Arrays.asList(mpmTit2, mpmTit3));
		mpmApr4.getMpmTitulos().addAll(Arrays.asList(mpmTit2));
		mpmApr5.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmTit1.getMpmPessoaTitulos().addAll(Arrays.asList(mpmPet1, mpmPet2));
		mpmTit2.getMpmPessoaTitulos().addAll(Arrays.asList(mpmPet3, mpmPet4));
		mpmTit3.getMpmPessoaTitulos().addAll(Arrays.asList(mpmPet2, mpmPet4, mpmPet5));

		mpmTit1 = mpmTituloRepository.saveAndFlush(mpmTit1);
		mpmTit2 = mpmTituloRepository.saveAndFlush(mpmTit2);
		mpmTit3 = mpmTituloRepository.saveAndFlush(mpmTit3);
		
		mpmPet1.getMpmTitulos().addAll(Arrays.asList(mpmTit1));
		mpmPet2.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit3));
		mpmPet3.getMpmTitulos().addAll(Arrays.asList(mpmTit2));
		mpmPet4.getMpmTitulos().addAll(Arrays.asList(mpmTit2, mpmTit3));
		mpmPet5.getMpmTitulos().addAll(Arrays.asList(mpmTit3));
		
		mpmObs1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2, mpmTit3));

		mpmSel1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2, mpmTit3));

		//
		
		mpmAno3.getMpmAtos().addAll(Arrays.asList(mpmAto1, mpmAto2));

		mpmCus1.getMpmAtoComposicaos().addAll(Arrays.asList(mpmAtoc1, mpmAtoc2));

		//

		mpmRem1.getMpmHeaders().addAll(Arrays.asList(mpmHea1, mpmHea2));
		mpmRem2.getMpmHeaders().addAll(Arrays.asList(mpmHea3));

		mpmRem1.getMpmTransacaos().addAll(Arrays.asList(mpmTrans1)); // , mpmTrans2));
//		mpmRem2.getMpmTransacaos().addAll(Arrays.asList(mpmTrans2));

		mpmRem1.getMpmTraillers().addAll(Arrays.asList(mpmTra1, mpmTra2));
		mpmRem2.getMpmTraillers().addAll(Arrays.asList(mpmTra3));
		
		mpmImpC1.getMpmRemessas().addAll(Arrays.asList(mpmRem1, mpmRem2));
		mpmImpC2.getMpmRemessas().addAll(Arrays.asList(mpmRem3));

		mpmMotE1.getMpmObservacaos().addAll(Arrays.asList(mpmObs1));

		//
		
		mpmAlineaRepository.saveAll(Arrays.asList(mpmAli1, mpmAli2, mpmAli3, mpmAli4, mpmAli5));

		mpmEspecieRepository.saveAll(Arrays.asList(mpmEsp1, mpmEsp2, mpmEsp3, mpmEsp4, mpmEsp5));
		
		mpmStatusRepository.saveAll(Arrays.asList(mpmSta1, mpmSta2, mpmSta3, mpmSta4, mpmSta5));

		mpmIdentificacaoRepository.saveAll(Arrays.asList(mpmIde1, mpmIde2, mpmIde3, mpmIde4));

		mpmTituloProtestadoRepository.saveAll(Arrays.asList(mpmTitPro1, mpmTitPro2, mpmTitPro3, mpmTitPro4,
															mpmTitPro5));

		mpmBancoRepository.saveAll(Arrays.asList(mpmBan1, mpmBan2, mpmBan3, mpmBan4));

		mpmEnderecoRepository.saveAll(Arrays.asList(mpmEnd1, mpmEnd2, mpmEnd3, mpmEnd4, mpmEnd5));
		
		mpmDevedorRepository.saveAll(Arrays.asList(mpmDev1, mpmDev2, mpmDev3, mpmDev4, mpmDev5));

		mpmApresentanteRepository.saveAll(Arrays.asList(mpmApr1, mpmApr2, mpmApr3, mpmApr4, mpmApr5));

		mpmPessoaTituloRepository.saveAll(Arrays.asList(mpmPet1, mpmPet2, mpmPet3, mpmPet4, mpmPet5));

		mpmObservacaoRepository.saveAll(Arrays.asList(mpmObs1));

		mpmTituloRepository.saveAll(Arrays.asList(mpmTit1, mpmTit2, mpmTit3));

		mpmTituloStatusRepository.saveAll(Arrays.asList(mpmTitSta1, mpmTitSta2, mpmTitSta3, mpmTitSta4,
														mpmTitSta5, mpmTitSta6));

		mpmAnoReferenciaRepository.saveAll(Arrays.asList(mpmAno1, mpmAno2, mpmAno3, mpmAno4));

		mpmCustasComposicaoRepository.saveAll(Arrays.asList(mpmCus1));
		
		mpmRemessaRepository.saveAll(Arrays.asList(mpmRem1, mpmRem2));

		mpmImportarControleRepository.saveAll(Arrays.asList(mpmImpC1, mpmImpC2));

		mpmMotivoEditalRepository.saveAll(Arrays.asList(mpmMotE1));

	}
	
	
}