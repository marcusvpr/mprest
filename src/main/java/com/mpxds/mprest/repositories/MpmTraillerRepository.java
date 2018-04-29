package com.mpxds.mprest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmTrailler;

@Repository
public interface MpmTraillerRepository extends JpaRepository<MpmTrailler, Integer> {
	//
}
