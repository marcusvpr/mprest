package com.mpxds.mprest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmEndereco;

@Repository
public interface MpmEnderecoRepository extends JpaRepository<MpmEndereco, Integer> {
	//
	Optional<MpmEndereco> findByLogradouroAndNumeroAndComplementoAndCepAndBairroAndMpmCidade(
			String logradouro, String numero, String complemento, String cep,
			String bairro, MpmCidade mpmCidade);
}
