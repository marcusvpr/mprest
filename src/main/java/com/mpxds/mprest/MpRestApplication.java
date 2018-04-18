package com.mpxds.mprest;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpxds.mprest.domain.MpCategoria;
import com.mpxds.mprest.domain.MpmAlinea;
import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmDevedor;
import com.mpxds.mprest.domain.MpmEspecie;
import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.domain.MpmIdentificacao;
import com.mpxds.mprest.domain.MpmStatus;
import com.mpxds.mprest.domain.MpmTitulo;
import com.mpxds.mprest.domain.MpmTituloProtestado;
import com.mpxds.mprest.domain.MpmTituloStatus;
import com.mpxds.mprest.repositories.MpCategoriaRepository;
import com.mpxds.mprest.repositories.MpmAlineaRepository;
import com.mpxds.mprest.repositories.MpmCidadeRepository;
import com.mpxds.mprest.repositories.MpmDevedorRepository;
import com.mpxds.mprest.repositories.MpmEspecieRepository;
import com.mpxds.mprest.repositories.MpmEstadoUfRepository;
import com.mpxds.mprest.repositories.MpmIdentificacaoRepository;
import com.mpxds.mprest.repositories.MpmStatusRepository;
import com.mpxds.mprest.repositories.MpmTituloProtestadoRepository;
import com.mpxds.mprest.repositories.MpmTituloRepository;
import com.mpxds.mprest.repositories.MpmTituloStatusRepository;

@SpringBootApplication
public class MpRestApplication implements CommandLineRunner {
	//
	@Autowired
	private MpCategoriaRepository mpCategoriaRepository;
	@Autowired
	private MpmAlineaRepository mpmAlineaRepository;
	@Autowired
	private MpmEspecieRepository mpmEspecieRepository;
	@Autowired
	private MpmStatusRepository mpmStatusRepository;
	@Autowired
	private MpmTituloStatusRepository mpmTituloStatusRepository;
	@Autowired
	private MpmTituloProtestadoRepository mpmTituloProtestadoRepository;
	@Autowired
	private MpmIdentificacaoRepository mpmIdentificacaoRepository;
	@Autowired
	private MpmEstadoUfRepository mpmEstadoUfRepository;
	@Autowired
	private MpmCidadeRepository mpmCidadeRepository;
	@Autowired
	private MpmDevedorRepository mpmDevedorRepository;
	@Autowired
	private MpmTituloRepository mpmTituloRepository;

	public static void main(String[] args) {
		//
		SpringApplication.run(MpRestApplication.class, args);
	}
		
	@Override
	public void run(String... args) throws Exception {
		//
		// ========================
		// Trata MpCategoria ...
		// ========================
		MpCategoria mpCat1 = new MpCategoria(null, "Informática"); // Teste/Marcus???
		MpCategoria mpCat2 = new MpCategoria(null, "Escritório");
		
		mpCategoriaRepository.saveAll(Arrays.asList(mpCat1, mpCat2));

		// ========================
		// Trata MpmAlinea ...
		// ========================
		MpmAlinea mpmAli1 = new MpmAlinea(null, 11, "INSUFICIÊNCIA DE FUNDOS"); // Prisco???
		MpmAlinea mpmAli2 = new MpmAlinea(null, 2, "Alinea.02");
		MpmAlinea mpmAli3 = new MpmAlinea(null, 3, "Alinea.03");
		MpmAlinea mpmAli4 = new MpmAlinea(null, 4, "Alinea.04");
		MpmAlinea mpmAli5 = new MpmAlinea(null, 5, "Alinea.05");
		MpmAlinea mpmAli6 = new MpmAlinea(null, 6, "Alinea.06");
		MpmAlinea mpmAli7 = new MpmAlinea(null, 7, "Alinea.07");
		MpmAlinea mpmAli8 = new MpmAlinea(null, 8, "Alinea.08");
		MpmAlinea mpmAli9 = new MpmAlinea(null, 9, "Alinea.09");
		MpmAlinea mpmAli10 = new MpmAlinea(null, 10, "Alinea.10");

		// ========================
		// Trata MpmEspecie ...
		// ========================
		MpmEspecie mpmEsp1 = new MpmEspecie(null, "DM", "DUPLICATA MERCANTIL", 4); // Prisco???
		MpmEspecie mpmEsp2 = new MpmEspecie(null, "002", "Especie.002", 20);
		MpmEspecie mpmEsp3 = new MpmEspecie(null, "003", "Especie.003", 30);
		MpmEspecie mpmEsp4 = new MpmEspecie(null, "004", "Especie.004", 40);
		MpmEspecie mpmEsp5 = new MpmEspecie(null, "005", "Especie.005", 50);
		
		// ========================
		// Trata MpmStatus ...
		// ========================
		MpmStatus mpmSta1 = new MpmStatus(null, 1, "Status.001"); // Prisco???
		MpmStatus mpmSta2 = new MpmStatus(null, 2, "Status.002");
		MpmStatus mpmSta3 = new MpmStatus(null, 3, "Status.003");
		MpmStatus mpmSta4 = new MpmStatus(null, 4, "Status.004");
		MpmStatus mpmSta5 = new MpmStatus(null, 5, "Status.005");
		
		// ========================
		// Trata MpmIdentificacao ...
		// ========================
		MpmIdentificacao mpmIde1 = new MpmIdentificacao(null, 1, "Devedor"); // Prisco???
		MpmIdentificacao mpmIde2 = new MpmIdentificacao(null, 2, "Identif.02");
		MpmIdentificacao mpmIde3 = new MpmIdentificacao(null, 3, "Identif.03");
		MpmIdentificacao mpmIde4 = new MpmIdentificacao(null, 4, "Identif.04");
		
		// ========================
		// Trata MpmTitulo ...
		// ========================
		Date dataX = new Date();

		MpmTitulo mpmTit1 = new MpmTitulo();
		
		mpmTit1.setNomeArquivo("Z012103.181");
		mpmTit1.setFinsFAlimentares("?");
		mpmTit1.setAceite("?");
		mpmTit1.setNumeroTalao3oficio("?");
		mpmTit1.setConvenioNumeroLivro("?");
		mpmTit1.setTalaoNumeroLivro("?");
		mpmTit1.setAVista("?");
		mpmTit1.setNihil("?");
		mpmTit1.setDigital("?");
		mpmTit1.setObservacao("?");
		mpmTit1.setTotalPagar("10000");
		mpmTit1.setTotalDeposito("10000");
		mpmTit1.setValorDistribuicao("10000");
		mpmTit1.setSaldo("10000");
		mpmTit1.setValor("10000");
		mpmTit1.setAgenciaCedente("?");
		mpmTit1.setEndosso("?");
		mpmTit1.setNumeroBanco("?");
		mpmTit1.setNumeroTitulo("?");
		mpmTit1.setDataVencimento(dataX);
		mpmTit1.setDataEmissao(dataX);
		mpmTit1.setNumeroDistribuicao("?");
		mpmTit1.setDataDistribuicao(dataX);
		mpmTit1.setCodigoApresentante("?");
		mpmTit1.setDataAte(dataX);
		mpmTit1.setNumeroProtocolo("?");
		mpmTit1.setDataProtocolo(dataX);
		mpmTit1.setFaixa("?");

		mpmTit1.setMpmAlinea(mpmAli1);
		mpmTit1.setMpmEspecie(mpmEsp1);
		//
		MpmTitulo mpmTit2 = new MpmTitulo();
		
		mpmTit2.setNomeArquivo("Z012103.182");
		mpmTit2.setFinsFAlimentares("?");
		mpmTit2.setAceite("?");
		mpmTit2.setNumeroTalao3oficio("?");
		mpmTit2.setConvenioNumeroLivro("?");
		mpmTit2.setTalaoNumeroLivro("?");
		mpmTit2.setAVista("?");
		mpmTit2.setNihil("?");
		mpmTit2.setDigital("?");
		mpmTit2.setObservacao("?");
		mpmTit2.setTotalPagar("10000");
		mpmTit2.setTotalDeposito("10000");
		mpmTit2.setValorDistribuicao("10000");
		mpmTit2.setSaldo("10000");
		mpmTit2.setValor("10000");
		mpmTit2.setAgenciaCedente("?");
		mpmTit2.setEndosso("?");
		mpmTit2.setNumeroBanco("?");
		mpmTit2.setNumeroTitulo("?");
		mpmTit2.setDataVencimento(dataX);
		mpmTit2.setDataEmissao(dataX);
		mpmTit2.setNumeroDistribuicao("?");
		mpmTit2.setDataDistribuicao(dataX);
		mpmTit2.setCodigoApresentante("?");
		mpmTit2.setDataAte(dataX);
		mpmTit2.setNumeroProtocolo("?");
		mpmTit2.setDataProtocolo(dataX);
		mpmTit2.setFaixa("?");	

		mpmTit2.setMpmAlinea(mpmAli1);
		mpmTit2.setMpmEspecie(mpmEsp1);
		//
		MpmTitulo mpmTit3 = new MpmTitulo();
		
		mpmTit3.setNomeArquivo("Z012103.183");
		mpmTit3.setFinsFAlimentares("?");
		mpmTit3.setAceite("?");
		mpmTit3.setNumeroTalao3oficio("?");
		mpmTit3.setConvenioNumeroLivro("?");
		mpmTit3.setTalaoNumeroLivro("?");
		mpmTit3.setAVista("?");
		mpmTit3.setNihil("?");
		mpmTit3.setDigital("?");
		mpmTit3.setObservacao("?");
		mpmTit3.setTotalPagar("10000");
		mpmTit3.setTotalDeposito("10000");
		mpmTit3.setValorDistribuicao("10000");
		mpmTit3.setSaldo("10000");
		mpmTit3.setValor("10000");
		mpmTit3.setAgenciaCedente("?");
		mpmTit3.setEndosso("?");
		mpmTit3.setNumeroBanco("?");
		mpmTit3.setNumeroTitulo("?");
		mpmTit3.setDataVencimento(dataX);
		mpmTit3.setDataEmissao(dataX);
		mpmTit3.setNumeroDistribuicao("?");
		mpmTit3.setDataDistribuicao(dataX);
		mpmTit3.setCodigoApresentante("?");
		mpmTit3.setDataAte(dataX);
		mpmTit3.setNumeroProtocolo("?");
		mpmTit3.setDataProtocolo(dataX);
		mpmTit3.setFaixa("?");	

		mpmTit3.setMpmAlinea(mpmAli3);
		mpmTit3.setMpmEspecie(mpmEsp3);

		// =============================
		// Trata MpmTituloProtestado ...
		// =============================
		dataX = new Date();
		
		MpmTituloProtestado mpmTitPro1 = new MpmTituloProtestado(null, 11111111, 11111);
		MpmTituloProtestado mpmTitPro2 = new MpmTituloProtestado(null, 22222222, 22222);
		MpmTituloProtestado mpmTitPro3 = new MpmTituloProtestado(null, 33333333, 33333);
		MpmTituloProtestado mpmTitPro4 = new MpmTituloProtestado(null, 44444444, 44444);
		MpmTituloProtestado mpmTitPro5 = new MpmTituloProtestado(null, 55555555, 55555);

		// =========================
		// Trata MpmTituloStatus ...
		// =========================		
		MpmTituloStatus mpmTitSta1 = new MpmTituloStatus(null, dataX, "01", "Motivo TitulosStatus.001",
												"Obs.TitulosStatus1", false, mpmTit1, mpmTitPro1);
		MpmTituloStatus mpmTitSta2 = new MpmTituloStatus(null, dataX, "02", "Motivo TitulosStatus.002",
												"Obs.TitulosStatus2", false, mpmTit1, mpmTitPro1);
		MpmTituloStatus mpmTitSta3 = new MpmTituloStatus(null, dataX, "03", "Motivo TitulosStatus.003",
												"Obs.TitulosStatus3", false, mpmTit1, null);
		MpmTituloStatus mpmTitSta4 = new MpmTituloStatus(null, dataX, "04", "Motivo TitulosStatus.004",
												"Obs.TitulosStatus4", false, mpmTit2, null);
		MpmTituloStatus mpmTitSta5 = new MpmTituloStatus(null, dataX, "05", "Motivo TitulosStatus.005",
												"Obs.TitulosStatus5", false, mpmTit2, null);
		MpmTituloStatus mpmTitSta6 = new MpmTituloStatus(null, dataX, "06", "Motivo TitulosStatus.006",
												"Obs.TitulosStatus6", false, mpmTit3, mpmTitPro5);

		// =============================
		// Trata MpmEstadoUf ...
		// =============================
		MpmEstadoUf mpmEstRJ = new MpmEstadoUf(null, "RJ", "RIO DE JANEIRO");
		MpmEstadoUf mpmEstSP = new MpmEstadoUf(null, "SP", "SÃO PAULO");
		MpmEstadoUf mpmEstRS = new MpmEstadoUf(null, "RS", "RIO GRANDE DO SUL");

		// =============================
		// Trata MpmCidade ...
		// =============================
		MpmCidade mpmCid1 = new MpmCidade(null, "RIO JANEIRO", mpmEstRJ);
		MpmCidade mpmCid2 = new MpmCidade(null, "NITERÓI", mpmEstRJ);
		MpmCidade mpmCid3 = new MpmCidade(null, "SÃO GONÇALO", mpmEstRJ);
		MpmCidade mpmCid4 = new MpmCidade(null, "SÃO PAULO", mpmEstSP);
		MpmCidade mpmCid5 = new MpmCidade(null, "SANTA CATARINA", mpmEstRS);

		// =============================
		// Trata MpmDevedor ...
		// =============================
		MpmDevedor mpmDev1 = new MpmDevedor(null, 111, mpmIde1);
		MpmDevedor mpmDev2 = new MpmDevedor(null, 222, mpmIde1);
		MpmDevedor mpmDev3 = new MpmDevedor(null, 333, mpmIde3);
		MpmDevedor mpmDev4 = new MpmDevedor(null, 444, mpmIde4);
		MpmDevedor mpmDev5 = new MpmDevedor(null, 555, mpmIde4);

		// ==========================
		// Procede Relacionamentos:
		// ==========================
		mpmAli1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2));
		mpmAli3.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmEsp1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit2));
		mpmEsp3.getMpmTitulos().addAll(Arrays.asList(mpmTit3));

		mpmTit1.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta1, mpmTitSta2, mpmTitSta3));
		mpmTit2.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta4, mpmTitSta5));
		mpmTit3.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta6));

		mpmTitPro1.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta1, mpmTitSta2));
		mpmTitPro5.getMpmTituloStatuss().addAll(Arrays.asList(mpmTitSta6));
		
		mpmEstRJ.getMpmCidades().addAll(Arrays.asList(mpmCid1, mpmCid2, mpmCid3));
		mpmEstSP.getMpmCidades().addAll(Arrays.asList(mpmCid4));
		mpmEstRS.getMpmCidades().addAll(Arrays.asList(mpmCid5));
		
		mpmIde1.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev2));
		mpmIde3.getMpmDevedors().addAll(Arrays.asList(mpmDev3));
		mpmIde4.getMpmDevedors().addAll(Arrays.asList(mpmDev4, mpmDev5));

		// N to N:
		mpmTit1.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev2));
		mpmTit2.getMpmDevedors().addAll(Arrays.asList(mpmDev3, mpmDev4));
		mpmTit3.getMpmDevedors().addAll(Arrays.asList(mpmDev1, mpmDev3, mpmDev5));

		mpmDev1.getMpmTitulos().addAll(Arrays.asList(mpmTit1, mpmTit3));
		mpmDev2.getMpmTitulos().addAll(Arrays.asList(mpmTit1));
		mpmDev3.getMpmTitulos().addAll(Arrays.asList(mpmTit2, mpmTit3));
		mpmDev4.getMpmTitulos().addAll(Arrays.asList(mpmTit2));
		mpmDev5.getMpmTitulos().addAll(Arrays.asList(mpmTit3));
		//
		mpmAlineaRepository.saveAll(Arrays.asList(mpmAli1, mpmAli2, mpmAli3, mpmAli4, mpmAli5, mpmAli6,
													mpmAli7, mpmAli8, mpmAli9, mpmAli10));

		mpmEspecieRepository.saveAll(Arrays.asList(mpmEsp1, mpmEsp2, mpmEsp3, mpmEsp4, mpmEsp5));
		
		mpmStatusRepository.saveAll(Arrays.asList(mpmSta1, mpmSta2, mpmSta3, mpmSta4, mpmSta5));

		mpmIdentificacaoRepository.saveAll(Arrays.asList(mpmIde1, mpmIde2, mpmIde3, mpmIde4));

		mpmTituloProtestadoRepository.saveAll(Arrays.asList(mpmTitPro1, mpmTitPro2, mpmTitPro3, mpmTitPro4,
															mpmTitPro5));

		mpmEstadoUfRepository.saveAll(Arrays.asList(mpmEstRJ, mpmEstSP, mpmEstRS));

		mpmCidadeRepository.saveAll(Arrays.asList(mpmCid1, mpmCid2, mpmCid3, mpmCid4, mpmCid5));

		mpmDevedorRepository.saveAll(Arrays.asList(mpmDev1, mpmDev2, mpmDev3, mpmDev4, mpmDev5));

		mpmTituloRepository.saveAll(Arrays.asList(mpmTit1, mpmTit2, mpmTit3));

		mpmTituloStatusRepository.saveAll(Arrays.asList(mpmTitSta1, mpmTitSta2, mpmTitSta3, mpmTitSta4,
				mpmTitSta5, mpmTitSta6));

	}
	
		
}
