package com.mpxds.mprest.domain.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Banco")
public class MpmBancoXML {
	//
	private String xCodigo;
	private String xAgencia;
	private String xNome;
	private String xTp_Documento;
	private String xNo_Documento;
	private String xEndereco;
	private String xNumero;
	private String xComplemento;
	private String xBairro;
	private String xCidade;
	private String xUf;
	private String xCep;
	private String xBco;
	private String xAntecipado;
	private String xPostecipado;
	private String xComissionado;
	
	//
	
	@XmlElement(name="Codigo")
	public String getxCodigo() {
		return xCodigo;
	}
	public void setxCodigo(String xCodigo) {
		this.xCodigo = xCodigo;
	}
	
	@XmlElement(name="Agencia")
	public String getxAgencia() {
		return xAgencia;
	}
	public void setxAgencia(String xAgencia) {
		this.xAgencia = xAgencia;
	}
	
	@XmlElement(name="Nome")
	public String getxNome() {
		return xNome;
	}
	public void setxNome(String xNome) {
		this.xNome = xNome;
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
	
	@XmlElement(name="Bco")
	public String getxBco() {
		return xBco;
	}
	public void setxBco(String xBco) {
		this.xBco = xBco;
	}
	
	@XmlElement(name="Antecipado")
	public String getxAntecipado() {
		return xAntecipado;
	}
	public void setxAntecipado(String xAntecipado) {
		this.xAntecipado = xAntecipado;
	}
	
	@XmlElement(name="Postecipado")
	public String getxPostecipado() {
		return xPostecipado;
	}
	public void setxPostecipado(String xPostecipado) {
		this.xPostecipado = xPostecipado;
	}
	
	@XmlElement(name="Comissionado")
	public String getxComissionado() {
		return xComissionado;
	}
	public void setxComissionado(String xComissionado) {
		this.xComissionado = xComissionado;
	}

	@Override
	public String toString() {
		return "MpmBancoXML [xCodigo=" + xCodigo + ", xAgencia=" + xAgencia + ", xNome=" + xNome + ", xTp_Documento="
				+ xTp_Documento + ", xNo_Documento=" + xNo_Documento + ", xEndereco=" + xEndereco + ", xNumero="
				+ xNumero + ", xComplemento=" + xComplemento + ", xBairro=" + xBairro + ", xCidade=" + xCidade
				+ ", xUf=" + xUf + ", xCep=" + xCep + ", xBco=" + xBco + ", xAntecipado=" + xAntecipado
				+ ", xPostecipado=" + xPostecipado + ", xComissionado=" + xComissionado + "]";
	}
	
}
