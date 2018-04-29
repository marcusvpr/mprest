package com.mpxds.mprest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class MpEntity implements Serializable {
	//
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Integer id;
		
	@Version
	@Column(columnDefinition = "integer DEFAULT 0", nullable = false)
	private Long version = 0L;

	// 
	
	public MpEntity() {
		//
	}
	
	public MpEntity(Integer id) {
		//
		super();
		
		this.id = id;
	}

	// 
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

    public Long getVersion() { return this.version; }
    public void setVersion(Long newVersion) { this.version = newVersion; }
	
	// ---

	@Override
	public int hashCode() {
		//
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		//
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MpEntity other = (MpEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		//
		return true;
	}

}
