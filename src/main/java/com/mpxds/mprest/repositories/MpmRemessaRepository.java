package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmRemessa;

@Repository
public interface MpmRemessaRepository extends JpaRepository<MpmRemessa, Integer> {
	//
}
