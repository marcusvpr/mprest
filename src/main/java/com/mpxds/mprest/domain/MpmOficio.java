package com.mpxds.mprest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_oficio", indexes = {
		@Index(name = "index_mpadt_oficio_num_cart", columnList = "numero_cartorio", unique = true)})
public class MpmOficio extends MpEntity {
	//
	private static final long serialVersionUID = 1L;

	@Column(name = "numero_cartorio", nullable = true, length = 2)
	private String numerocartorio;

	@Column(nullable = true, length = 135)
	private String nome;

	@Column(nullable = true, length = 50)
	private String substituto1;
	
	@Column(nullable = true, length = 50)
	private String substituto2;

	@Column(nullable = true, length = 50)
	private String substituto3;
	
	@Column(name = "ind_sistema_principal", nullable = true)
	private boolean indSistemaPrincipal;
	
	@Column(name = "path_importacao_xml", nullable = true, length = 80)
	private String pathImportacaoXml;
	
	@Column(name = "path_importacao_txt", nullable = true, length = 80)
	private String pathImportacaoTxt;

	// 
	
	public MpmOficio() {
		//
	}

	public MpmOficio(Integer id, String numerocartorio, String nome, String substituto1, String substituto2, 
						String substituto3, boolean indSistemaPrincipal, String pathImportacaoXml,
						String pathImportacaoTxt) {
		//
		super();
		
		this.id = id;
		this.numerocartorio = numerocartorio;
		this.nome = nome;
		this.substituto1 = substituto1;
		this.substituto2 = substituto2;
		this.substituto3 = substituto3;
		this.indSistemaPrincipal = indSistemaPrincipal;
		this.pathImportacaoXml = pathImportacaoXml;
		this.pathImportacaoTxt = pathImportacaoTxt;
	}

	public String getNumerocartorio() {
		return this.numerocartorio;
	}
	public void setNumerocartorio(String numerocartorio) {
		this.numerocartorio = numerocartorio;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSubstituto1() {
		return this.substituto1;
	}
	public void setSubstituto1(String substituto1) {
		this.substituto1 = substituto1;
	}

	public String getSubstituto2() {
		return this.substituto2;
	}
	public void setSubstituto2(String substituto2) {
		this.substituto2 = substituto2;
	}

	public String getSubstituto3() {
		return this.substituto3;
	}
	public void setSubstituto3(String substituto3) {
		this.substituto3 = substituto3;
	}

	public boolean isIndSistemaPrincipal() {
		return this.indSistemaPrincipal;
	}
	public void setIndSistemaPrincipal(boolean indSistemaPrincipal) {
		this.indSistemaPrincipal = indSistemaPrincipal;
	}

	public String getPathImportacaoXml() {
		return this.pathImportacaoXml;
	}
	public void setPathImportacaoXml(String pathImportacaoXml) {
		this.pathImportacaoXml = pathImportacaoXml;
	}

	public String getPathImportacaoTxt() {
		return this.pathImportacaoTxt;
	}
	public void setPathImportacaoTxt(String pathImportacaoTxt) {
		this.pathImportacaoTxt = pathImportacaoTxt;
	}

}
