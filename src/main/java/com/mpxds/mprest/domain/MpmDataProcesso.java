package com.mpxds.mprest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mpadt_data_processo")
public class MpmDataProcesso extends MpEntity {
	//
	private static final long serialVersionUID = 1L;
		
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_protocolo", nullable = true)
	private Date dataProtocolo;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	@Temporal(TemporalType.DATE)
	@Column(name = "data_ate", nullable = true)
	private Date dataAte;

//	@Column(name = "protocolo_inicial", nullable = true, length = 6)
//	private String protocoloInicial;
//	
//	@Column(name = "protocolo_final", nullable = true, length = 6)
//	private String protocoloFinal;

	//
	
	public MpmDataProcesso() {
		//
	}
	
	public MpmDataProcesso(Integer id, Date dataProtocolo, Date dataAte) {
//			String protocoloInicial, String protocoloFinal) {
		//
		super();
		
		this.id = id;
		this.dataProtocolo = dataProtocolo;
		this.dataAte = dataAte;
//		this.protocoloInicial = protocoloInicial;
//		this.protocoloFinal = protocoloFinal;
	}

	public Date getDataProtocolo() { return this.dataProtocolo; }
	public void setDataProtocolo(Date dataProtocolo) { this.dataProtocolo = dataProtocolo; }

	public Date getDataAte() { return this.dataAte;	}
	public void setDataAte(Date dataAte) { this.dataAte = dataAte; }

//	public String getProtocoloInicial() { return this.protocoloInicial;	}
//	public void setProtocoloInicial(String protocoloInicial) { this.protocoloInicial = protocoloInicial; }
//
//	public String getProtocoloFinal() { return this.protocoloFinal; }
//	public void setProtocoloFinal(String protocoloFinal) { this.protocoloFinal = protocoloFinal; }

}
