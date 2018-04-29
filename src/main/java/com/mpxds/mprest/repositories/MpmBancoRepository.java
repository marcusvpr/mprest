package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmBanco;

@Repository
public interface MpmBancoRepository extends JpaRepository<MpmBanco, Integer> {
	//
}
