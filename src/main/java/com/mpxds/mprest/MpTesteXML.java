package com.mpxds.mprest;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mpxds.mprest.domain.xml.MpmAlineaXML;
import com.mpxds.mprest.domain.xml.MpmAlineasXML;
import com.mpxds.mprest.domain.xml.MpmAtoComposicaoXML;
import com.mpxds.mprest.domain.xml.MpmAtoComposicaosXML;
import com.mpxds.mprest.domain.xml.MpmAtoXML;
import com.mpxds.mprest.domain.xml.MpmAtosXML;
import com.mpxds.mprest.domain.xml.MpmDevedorXML;
import com.mpxds.mprest.domain.xml.MpmDevedorsXML;
import com.mpxds.mprest.domain.xml.MpmIdentificacaoXML;
import com.mpxds.mprest.domain.xml.MpmIdentificacaosXML;
import com.mpxds.mprest.domain.xml.MpmEndossoXML;
import com.mpxds.mprest.domain.xml.MpmEndossosXML;

public class MpTesteXML {
	//
	public static void main(String[] args) {
		//
//		trataAlineasXML();
//		trataAtosXML();
//  	trataAtoComposicaoXML();
//		trataDevedorXML();
//		trataIdentificacaoXML();
		trataEndossoXML();
	}
	
	private static void trataAlineasXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Alinea.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmAlineasXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmAlineasXML mpmAlineasXML = (MpmAlineasXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmAlineasXML.getMpmAlineaXMLs().size());
	
			for (MpmAlineaXML mpmAlineaXML : mpmAlineasXML.getMpmAlineaXMLs()) {
				System.out.println(mpmAlineaXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	private static void trataAtosXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Atos.xml");
			
			File file = resource.getFile();

			JAXBContext jaxbContext = JAXBContext.newInstance(MpmAtosXML.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmAtosXML mpmAtosXML = (MpmAtosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmAtosXML.getMpmAtoXMLs().size());

			for (MpmAtoXML mpmAtoXML : mpmAtosXML.getMpmAtoXMLs()) {
				System.out.println(mpmAtoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void trataAtoComposicaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/AtosComposicao.xml");

			File file = resource.getFile();

			JAXBContext jaxbContext = JAXBContext.newInstance(MpmAtoComposicaosXML.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmAtoComposicaosXML mpmAtoComposicaosXML = (MpmAtoComposicaosXML) jaxbUnmarshaller.unmarshal(file);

			System.out.println(mpmAtoComposicaosXML.getMpmAtoComposicaoXMLs().size());

			//
			for (MpmAtoComposicaoXML mpmAtoComposicaoXML : mpmAtoComposicaosXML.getMpmAtoComposicaoXMLs()) {
				System.out.println(mpmAtoComposicaoXML);
				//
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataDevedorXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Devedores.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmDevedorsXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmDevedorsXML mpmDevedorsXML = (MpmDevedorsXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmDevedorsXML.getMpmDevedorXMLs().size());
	
			for (MpmDevedorXML mpmDevedorXML : mpmDevedorsXML.getMpmDevedorXMLs()) {
				System.out.println(mpmDevedorXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataIdentificacaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Identificacao.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmIdentificacaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmIdentificacaosXML mpmIdentificacaosXML = (MpmIdentificacaosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmIdentificacaosXML.getMpmIdentificacaoXMLs().size());
	
			for (MpmIdentificacaoXML mpmIdentificacaoXML : mpmIdentificacaosXML.getMpmIdentificacaoXMLs()) {
				System.out.println(mpmIdentificacaoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataEndossoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Endosso.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmEndossosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmEndossosXML mpmEndossosXML = (MpmEndossosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmEndossosXML.getMpmEndossoXMLs().size());
	
			for (MpmEndossoXML mpmEndossoXML : mpmEndossosXML.getMpmEndossoXMLs()) {
				System.out.println(mpmEndossoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}