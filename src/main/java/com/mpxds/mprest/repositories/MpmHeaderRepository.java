package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmHeader;

@Repository
public interface MpmHeaderRepository extends JpaRepository<MpmHeader, Integer> {
	//
}
