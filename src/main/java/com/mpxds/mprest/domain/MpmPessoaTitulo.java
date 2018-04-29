package com.mpxds.mprest.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mpadt_pessoa_titulo")
public class MpmPessoaTitulo extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@Column(nullable = true, length = 135)
	private String nome;
	
	@Column(name = "tipo_documento", nullable = true, length = 4)
	private String tipoDocumento;
	
	@Column(name = "numero_documento", nullable = true, length = 14)
	private String numeroDocumento;

	@Column(name = "ind_favorecido", nullable = true)
	private Boolean indFavorecido;

	@Column(nullable = true, length = 11)
	private Integer agencia;

	@Column(nullable = true, length = 1)
	private String convenio;
	
	@Column(name = "forma_repasse", nullable = true, length = 1)
	private String formaRepasse;

	@Column(name = "ind_cheque_adm_ted", nullable = true)
	private Boolean indChequeAdmTed;
	
	@ManyToOne
	@JoinColumn(name="mpmEndereco_id")
	private MpmEndereco mpmEndereco;

	@JsonIgnore
	@ManyToMany(mappedBy="mpmPessoaTitulos")
	private List<MpmTitulo> mpmTitulos = new ArrayList<>();

	//
	
	public MpmPessoaTitulo() {
		//
	}

	public MpmPessoaTitulo(Integer id, String nome, String tipoDocumento, String numeroDocumento, 
							Boolean indFavorecido, Integer agencia, String convenio, 
							String formaRepasse, Boolean indChequeAdmTed, MpmEndereco mpmEndereco) {
		//
		super();

		this.id = id;
		this.nome = nome;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.indFavorecido = indFavorecido;
		this.agencia = agencia;
		this.convenio = convenio;
		this.formaRepasse = formaRepasse;
		this.indChequeAdmTed = indChequeAdmTed;
		this.mpmEndereco = mpmEndereco;
	}


	//
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public String getTipoDocumento() { return tipoDocumento; }
	public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

	public String getNumeroDocumento() { return numeroDocumento; }
	public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }

	public Boolean getIndFavorecido() { return indFavorecido; }
	public void setIndFavorecido(Boolean indFavorecido) { this.indFavorecido = indFavorecido; }

	public List<MpmTitulo> getMpmTitulos() { return mpmTitulos; }
	public void setMpmTitulos(List<MpmTitulo> mpmTitulos) { this.mpmTitulos = mpmTitulos; }
	
	public MpmEndereco getMpmEndereco() { return mpmEndereco; }
	public void setMpmEndereco(MpmEndereco mpmEndereco) { this.mpmEndereco = mpmEndereco; }

}
