package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmTituloProtestado;

@Repository
public interface MpmTituloProtestadoRepository extends JpaRepository<MpmTituloProtestado, Integer> {
	//
	Optional<MpmTituloProtestado> findByNumeroLivroAndNumeroFolha(Integer numeroLivro, Integer numeroFolha);
}
