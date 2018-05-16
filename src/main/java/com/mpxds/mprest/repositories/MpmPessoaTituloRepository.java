package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmPessoaTitulo;

@Repository
public interface MpmPessoaTituloRepository extends JpaRepository<MpmPessoaTitulo, Integer> {
	//
	Optional<MpmPessoaTitulo> findByNome(String nome);

	Optional<MpmPessoaTitulo> findByNomeAndIndFavorecido(String nome, Boolean indFavorecido);

	Optional<MpmPessoaTitulo> findByNomeAndIndSacador(String nome, Boolean indSacador);
}
