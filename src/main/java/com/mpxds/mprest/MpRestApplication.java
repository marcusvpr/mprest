package com.mpxds.mprest;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpxds.mprest.domain.MpCategoria;
import com.mpxds.mprest.domain.MpmTitulo;
import com.mpxds.mprest.repositories.MpCategoriaRepository;
import com.mpxds.mprest.repositories.MpmTituloRepository;

@SpringBootApplication
public class MpRestApplication implements CommandLineRunner {
	//
	@Autowired
	private MpCategoriaRepository mpCategoriaRepository;
	@Autowired
	private MpmTituloRepository mpmTituloRepository;

	public static void main(String[] args) {
		//
		SpringApplication.run(MpRestApplication.class, args);
	}
		
	@Override
	public void run(String... args) throws Exception {
		//
		this.trataMpCategoria();
		this.trataMpmTitulo();
	}
	
	private void trataMpCategoria() {
		//
		MpCategoria mpCat1 = new MpCategoria(null, "Informática");
		MpCategoria mpCat2 = new MpCategoria(null, "Escritório");
		
		mpCategoriaRepository.saveAll(Arrays.asList(mpCat1, mpCat2));
	}
	
	private void trataMpmTitulo() {
		//
		MpmTitulo mpmTit1 = new MpmTitulo();
		//
		Date dataX = new Date();
		
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
		//
		mpmTituloRepository.saveAll(Arrays.asList(mpmTit1));
	}
	
}
