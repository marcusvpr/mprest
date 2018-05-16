package com.mpxds.mprest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mpadt_devedor", indexes = {
		@Index(name = "index_mpadt_devedor_nome", columnList = "nome", unique = true),
		@Index(name = "index_mpadt_devedor_codigo", columnList = "codigo", unique = true)})
public class MpmDevedor extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = true, length = 100)
	private String nome;
		
	@Column(nullable = true, length = 3) // ???? Prisco
	private Integer codigo;
	
	@Column(name = "tipo_documento", nullable = true, length = 4)
	private String tipoDocumento;
	
	@Column(name = "numero_documento", nullable = true, length = 14)
	private String numeroDocumento;
		
	@ManyToOne
	@JoinColumn(name="mpmIdentificacao_id")
	private MpmIdentificacao mpmIdentificacao;
	
	@JsonIgnore
	@ManyToMany(mappedBy="mpmDevedors")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="mpmEndereco_id")
	private MpmEndereco mpmEndereco;

	//
	
	public MpmDevedor() {
		//
	}

	public MpmDevedor(Integer id, String nome, Integer codigo, String tipoDocumento, String numeroDocumento, 
						MpmIdentificacao mpmIdentificacao, MpmEndereco mpmEndereco) {
		//
		super();
		
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.mpmIdentificacao = mpmIdentificacao;
		this.mpmEndereco = mpmEndereco;
	}

	//
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public Integer getCodigo() { return codigo; }
	public void setCodigo(Integer codigo) { this.codigo = codigo; }

	public String getTipoDocumento() { return tipoDocumento; }
	public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

	public String getNumeroDocumento() { return numeroDocumento; }
	public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }
	
	public MpmIdentificacao getMpmIdentificacao() { return mpmIdentificacao; }
	public void setMpmIdentificacao(MpmIdentificacao mpmIdentificacao) { 
																this.mpmIdentificacao = mpmIdentificacao; }
	
	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }
	
	public MpmEndereco getMpmEndereco() { return mpmEndereco; }
	public void setMpmEndereco(MpmEndereco mpmEndereco) { this.mpmEndereco = mpmEndereco; }

}
