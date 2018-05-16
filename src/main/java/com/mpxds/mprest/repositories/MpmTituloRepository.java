package com.mpxds.mprest.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmTitulo;

@Repository
public interface MpmTituloRepository extends JpaRepository<MpmTitulo, Integer> {
	//
	Optional<MpmTitulo> findByDataProtocoloAndNumeroProtocolo(Date dataProtocolo, String numeroProtocolo);
}
