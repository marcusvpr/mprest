package com.mpxds.mprest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpxds.mprest.domain.MpCategoria;
import com.mpxds.mprest.repositories.MpCategoriaRepository;

@SpringBootApplication
public class MpRestApplication implements CommandLineRunner {
	//
	@Autowired
	private MpCategoriaRepository mpCategoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MpRestApplication.class, args);
	}
		
	@Override
	public void run(String... args) throws Exception {
		
		MpCategoria mpCat1 = new MpCategoria(null, "Informática");
		MpCategoria mpCat2 = new MpCategoria(null, "Escritório");
		
		mpCategoriaRepository.saveAll(Arrays.asList(mpCat1, mpCat2));
	}
	
}
