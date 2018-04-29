package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Devedores")
public class MpmDevedorXML {
	//
	private String xDt_Protocolo;
	private String xNo_Protocolo;
	private String xCod_Identificacao;
	private String xCod_Devedor;
	private String xTp_Documento;
	private String xNo_Documento;
	private String xNome;
	private String xEndereco;
	private String xNumero;
	private String xComplemento;
	private String xBairro;
	private String xCidade;
	private String xUf;
	private String xCep;
	//
	
	@XmlElement(name="Dt_Protocolo")
	public String getxDt_Protocolo() {
		return xDt_Protocolo;
	}
	public void setxDt_Protocolo(String xDt_Protocolo) {
		this.xDt_Protocolo = xDt_Protocolo;
	}
	
	@XmlElement(name="No_Protocolo")
	public String getxNo_Protocolo() {
		return xNo_Protocolo;
	}
	public void setxNo_Protocolo(String xNo_Protocolo) {
		this.xNo_Protocolo = xNo_Protocolo;
	}
	
	@XmlElement(name="Cod_Identificacao")
	public String getxCod_Identificacao() {
		return xCod_Identificacao;
	}
	public void setxCod_Identificacao(String xCod_Identificacao) {
		this.xCod_Identificacao = xCod_Identificacao;
	}
	
	@XmlElement(name="Cod_Devedor")
	public String getxCod_Devedor() {
		return xCod_Devedor;
	}
	public void setxCod_Devedor(String xCod_Devedor) {
		this.xCod_Devedor = xCod_Devedor;
	}
	
	@XmlElement(name="Tp_Documento")
	public String getxTp_Documento() {
		return xTp_Documento;
	}
	public void setxTp_Documento(String xTp_Documento) {
		this.xTp_Documento = xTp_Documento;
	}
	
	@XmlElement(name="No_Documento")
	public String getxNo_Documento() {
		return xNo_Documento;
	}
	public void setxNo_Documento(String xNo_Documento) {
		this.xNo_Documento = xNo_Documento;
	}
	
	@XmlElement(name="Nome(")
	public String getxNome() {
		return xNome;
	}
	public void setxNome(String xNome) {
		this.xNome = xNome;
	}
	
	@XmlElement(name="Endereco")
	public String getxEndereco() {
		return xEndereco;
	}
	public void setxEndereco(String xEndereco) {
		this.xEndereco = xEndereco;
	}
	
	@XmlElement(name="Numero")
	public String getxNumero() {
		return xNumero;
	}
	public void setxNumero(String xNumero) {
		this.xNumero = xNumero;
	}
	
	@XmlElement(name="Complemento")
	public String getxComplemento() {
		return xComplemento;
	}
	public void setxComplemento(String xComplemento) {
		this.xComplemento = xComplemento;
	}
	
	@XmlElement(name="Bairro")
	public String getxBairro() {
		return xBairro;
	}
	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}
	
	@XmlElement(name="Cidade")
	public String getxCidade() {
		return xCidade;
	}
	public void setxCidade(String xCidade) {
		this.xCidade = xCidade;
	}
	
	@XmlElement(name="Uf")
	public String getxUf() {
		return xUf;
	}
	public void setxUf(String xUf) {
		this.xUf = xUf;
	}
	
	@XmlElement(name="Cep")
	public String getxCep() {
		return xCep;
	}
	public void setxCep(String xCep) {
		this.xCep = xCep;
	}
	
	@Override
	public String toString() {
		return "MpmDevedorXML [xDt_Protocolo=" + xDt_Protocolo + ", xNo_Protocolo=" + xNo_Protocolo
				+ ", xCod_Identificacao=" + xCod_Identificacao + ", xCod_Devedor=" + xCod_Devedor + ", xTp_Documento="
				+ xTp_Documento + ", xNo_Documento=" + xNo_Documento + ", xNome=" + xNome + ", xEndereco=" + xEndereco
				+ ", xNumero=" + xNumero + ", xComplemento=" + xComplemento + ", xBairro=" + xBairro + ", xCidade="
				+ xCidade + ", xUf=" + xUf + ", xCep=" + xCep + "]";
	}

}
