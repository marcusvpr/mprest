package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpSistemaConfig;

@Repository
public interface MpSistemaConfigRepository extends JpaRepository<MpSistemaConfig, Integer> {
	//
}
