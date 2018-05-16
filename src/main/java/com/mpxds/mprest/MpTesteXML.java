package com.mpxds.mprest;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mpxds.mprest.domain.MpmAlinea;
import com.mpxds.mprest.domain.xml.MpmAlineaXML;
import com.mpxds.mprest.domain.xml.MpmAlineasXML;
import com.mpxds.mprest.domain.xml.MpmAtoComposicaoXML;
import com.mpxds.mprest.domain.xml.MpmAtoComposicaosXML;
import com.mpxds.mprest.domain.xml.MpmAtoXML;
import com.mpxds.mprest.domain.xml.MpmAtosXML;
import com.mpxds.mprest.domain.xml.MpmBancoXML;
import com.mpxds.mprest.domain.xml.MpmBancosXML;
import com.mpxds.mprest.domain.xml.MpmCustasComposicaoXML;
import com.mpxds.mprest.domain.xml.MpmCustasComposicaosXML;
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
import com.mpxds.mprest.domain.xml.MpmImportarControleXML;
import com.mpxds.mprest.domain.xml.MpmImportarControlesXML;
import com.mpxds.mprest.domain.xml.MpmMotivoEditalXML;
import com.mpxds.mprest.domain.xml.MpmMotivoEditalsXML;
import com.mpxds.mprest.domain.xml.MpmObservacaoXML;
import com.mpxds.mprest.domain.xml.MpmObservacaosXML;
import com.mpxds.mprest.domain.xml.MpmRemessaXML;
import com.mpxds.mprest.domain.xml.MpmRemessasXML;
import com.mpxds.mprest.domain.xml.MpmTituloXML;
import com.mpxds.mprest.domain.xml.MpmTitulosXML;
import com.mpxds.mprest.domain.xml.MpmTransacaoXML;
import com.mpxds.mprest.domain.xml.MpmTransacaosXML;
//
import com.mpxds.mprest.domain.xml.atox.Aluno;
import com.mpxds.mprest.domain.xml.atox.AlunoTurma;
//
import com.mpxds.mprest.domain.xml.atox.Xml;

public class MpTesteXML {
	//

	public static void main(String[] args) {
		//
//		trataAlineasXML();
//		trataAtosXML();
//  	trataAtoComposicaoXML();
//		trataDevedorXML();
//		trataIdentificacaoXML();
//		trataEndossoXML();
//		trataEditalXML();
//		trataMotivoEditalXML();
//		trataObservacaoXML();
//		trataTransacaoXML();
//		trataEspecieXML();
//		trataTituloXML();
//		trataRemessaXML();
//		trataBancoXML();
//		trataCustasComposicaoXML();
//		trataImportarControleXML();
		trataLeituraAtoXML();
//		trataLeituraAlunoXML();
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
	
	private static void trataEditalXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Edital.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmEditalsXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmEditalsXML mpmEditalsXML = (MpmEditalsXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmEditalsXML.getMpmEditalXMLs().size());
	
			for (MpmEditalXML mpmEditalXML : mpmEditalsXML.getMpmEditalXMLs()) {
				System.out.println(mpmEditalXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataMotivoEditalXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/MotivoEdital.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmMotivoEditalsXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmMotivoEditalsXML mpmMotivoEditalsXML = (MpmMotivoEditalsXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmMotivoEditalsXML.getMpmMotivoEditalXMLs().size());
	
			for (MpmMotivoEditalXML mpmMotivoEditalXML : mpmMotivoEditalsXML.getMpmMotivoEditalXMLs()) {
				System.out.println(mpmMotivoEditalXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataObservacaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Observacoes.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmObservacaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmObservacaosXML mpmObservacaosXML = (MpmObservacaosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmObservacaosXML.getMpmObservacaoXMLs().size());
	
			for (MpmObservacaoXML mpmObservacaoXML : mpmObservacaosXML.getMpmObservacaoXMLs()) {
				System.out.println(mpmObservacaoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void trataTransacaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Transacao.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmTransacaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmTransacaosXML mpmTransacaosXML = (MpmTransacaosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmTransacaosXML.getMpmTransacaoXMLs().size());
	
			for (MpmTransacaoXML mpmTransacaoXML : mpmTransacaosXML.getMpmTransacaoXMLs()) {
				System.out.println(mpmTransacaoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataEspecieXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Especies.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmEspeciesXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmEspeciesXML mpmEspeciesXML = (MpmEspeciesXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmEspeciesXML.getMpmEspecieXMLs().size());
	
			for (MpmEspecieXML mpmEspecieXML : mpmEspeciesXML.getMpmEspecieXMLs()) {
				System.out.println(mpmEspecieXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataTituloXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Titulos.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmTitulosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmTitulosXML mpmTitulosXML = (MpmTitulosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmTitulosXML.getMpmTituloXMLs().size());
	
			for (MpmTituloXML mpmTituloXML : mpmTitulosXML.getMpmTituloXMLs()) {
				//
				System.out.println(mpmTituloXML);
				
				List<MpmAlinea> mpmAlineasX = new ArrayList<>();
				// Trata MpmAlinea ... Codigo = 11-12-XX ??? Vrf.Máximo Alineas com PRISCO ! 
				Integer contAlinea = 0;
				if (mpmTituloXML.getxCodigoAlinea().trim().length() == 2)
					contAlinea = 1;
				else
					if (mpmTituloXML.getxCodigoAlinea().trim().length() == 5)
						contAlinea = 2;
					else
						if (mpmTituloXML.getxCodigoAlinea().trim().length() == 8)
							contAlinea = 3;
						else 
							if (mpmTituloXML.getxCodigoAlinea().trim().length() > 8) {
								//
								System.out.println(" ( TrataCargaTituloXML() Error.NumCodAlinea = " +
										mpmTituloXML.getxCodigoAlinea().trim() + " Max.=3!");
								continue;
							}
				//
				System.out.println(" ( TrataCargaTituloXML() Entrou.000 = " + contAlinea + " /CodAlinea = " +
																	mpmTituloXML.getxCodigoAlinea().trim());
 				//
				if (contAlinea > 0) {
					//
			        for(int iX = 0; iX < contAlinea; iX++) {
			        	//
			        	Integer posX = (3 * (iX+1)) - 3; 
			        	System.out.println(" ( TrataCargaTituloXML() Alinea = " +
			        						mpmTituloXML.getxCodigoAlinea().trim().substring(posX, posX+2));
			        	//
			        }
				}
				System.out.println("TrataCargaTituloXML() (Alineas.Size = " + mpmAlineasX.size());
				
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataRemessaXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Remessa.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmRemessasXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmRemessasXML mpmRemessasXML = (MpmRemessasXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmRemessasXML.getMpmRemessaXMLs().size());
	
			for (MpmRemessaXML mpmRemessaXML : mpmRemessasXML.getMpmRemessaXMLs()) {
				System.out.println(mpmRemessaXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataBancoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/Bancos.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmBancosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmBancosXML mpmBancosXML = (MpmBancosXML) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmBancosXML.getMpmBancoXMLs().size());
	
			for (MpmBancoXML mpmBancoXML : mpmBancosXML.getMpmBancoXMLs()) {
				System.out.println(mpmBancoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataCustasComposicaoXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/CustasComposicao.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmCustasComposicaosXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmCustasComposicaosXML mpmCustasComposicaosXML = (MpmCustasComposicaosXML)
																			jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(mpmCustasComposicaosXML.getMpmCustasComposicaoXMLs().size());
	
			for (MpmCustasComposicaoXML mpmCustasComposicaoXML : mpmCustasComposicaosXML.
																				getMpmCustasComposicaoXMLs()) {
				System.out.println(mpmCustasComposicaoXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataImportarControleXML() {
		//
		try {
			Resource resource = new ClassPathResource("static/files/xml/ImportarControle.xml");
			
			File file = resource.getFile();
	
			JAXBContext jaxbContext = JAXBContext.newInstance(MpmImportarControlesXML.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MpmImportarControlesXML mpmImportarControlesXML = (MpmImportarControlesXML) jaxbUnmarshaller.
																							unmarshal(file);
			
			System.out.println(mpmImportarControlesXML.getMpmImportarControleXMLs().size());
	
			for (MpmImportarControleXML mpmImportarControleXML : mpmImportarControlesXML.
																			getMpmImportarControleXMLs()) {
				System.out.println(mpmImportarControleXML);
			}
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void trataLeituraAtoXML() {
		//
		SimpleDateFormat sdfDMY = new SimpleDateFormat("ddMMyyyy");

		Calendar calX = Calendar.getInstance();

		try {
			calX.setTime(sdfDMY.parse("21032018"));

			String pathX = "static/files/cartorio/of1/SeloDigital/Receber/" + calX.get(Calendar.YEAR) + 
					"/" + (calX.get(Calendar.MONTH)+1) + "/" + calX.get(Calendar.DAY_OF_MONTH) + "/" ;

			System.out.println("MpmCargaXMLResource.trataImportacao() - ( PathX : " + pathX + " / Data : " + 
						sdfDMY.format(calX.getTime()) +  " / " + calX.get(Calendar.MONTH));
			
			Boolean indAtoIni = false;
			Boolean indAtoFim = false;

			StringBuffer sbCX = new StringBuffer();
			//
			Resource resource = new ClassPathResource( pathX + "2018032101709661_AtoDigital.ATO");
			
			File file = resource.getFile();

			String conteudo = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
			
			StringTokenizer st = new StringTokenizer(conteudo, "\n");
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
			//
			System.out.println("capturarAtoXml() - ( sbCX = " + sbCX.toString());

			StringReader readerXML = new StringReader(sbCX.toString());
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Xml.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Xml xml = (Xml) jaxbUnmarshaller.unmarshal(readerXML);

			System.out.println("capturarAtoXml() - ( Xml = " + xml.toString());
			//
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
		
	private static void trataLeituraAlunoXML() {
		//
		String alunoX = "<Aluno>" + 
						" <nome>Marcus</nome>" +
						" <idade>50</idade>" +
						" <matricula>42314</matricula>" +
//						" <AlunoTurmas>" + 
						"  <AlunoTurma>" + 
						"    <nome>Matematica</nome>" +
						"  </AlunoTurma>" +
						"  <AlunoTurma>" + 
						"    <nome>Quimica</nome>" +
						"  </AlunoTurma>" +
//						" </AlunoTurmas>" + 
						"</Aluno>";
		
		StringReader readerXML = new StringReader(alunoX);
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Aluno.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Aluno aluno = (Aluno) jaxbUnmarshaller.unmarshal(readerXML);

			System.out.println("capturarAlunoXml() = " + aluno.toString());
			//
			List<AlunoTurma> alunoTurmasX = new ArrayList<>();
			
			AlunoTurma alunoTurma1 = new AlunoTurma("Matematica");
			alunoTurmasX.add(alunoTurma1);
			AlunoTurma alunoTurma2 = new AlunoTurma("Historia");
			alunoTurmasX.add(alunoTurma2);
			
			Aluno alunoY = new Aluno("Brunna", 30, 18041, alunoTurmasX);
			
			File file = new File("C:\\tmp\\alunoY.xml");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

//			jaxbMarshaller.marshal(alunoY, file);
			jaxbMarshaller.marshal(alunoY, System.out);
			//
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
}