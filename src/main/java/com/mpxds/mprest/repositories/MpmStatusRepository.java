package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmStatus;

@Repository
public interface MpmStatusRepository extends JpaRepository<MpmStatus, Integer> {
	//
	Optional<MpmStatus> findByCodigo(Integer codigo);
}
