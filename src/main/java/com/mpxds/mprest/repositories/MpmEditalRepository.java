package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmEdital;

@Repository
public interface MpmEditalRepository extends JpaRepository<MpmEdital, Integer> {
	//
}
