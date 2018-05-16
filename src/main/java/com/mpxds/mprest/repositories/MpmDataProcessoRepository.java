package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmDataProcesso;

@Repository
public interface MpmDataProcessoRepository extends JpaRepository<MpmDataProcesso, Integer> {
	//
	Optional<MpmDataProcesso> findByDataProtocolo(Date dataProtocolo);
}
