package com.mpxds.mprest.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmCidade;
import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.model.dto.MpmCidadeDTO;
import com.mpxds.mprest.model.dto.MpmEstadoUfDTO;
import com.mpxds.mprest.services.MpmCidadeService;
import com.mpxds.mprest.services.MpmEstadoUfService;

@RestController
@RequestMapping(value="/mEstadoUfs")
public class MpmEstadoUfResource {
	//
	@Autowired
	private MpmEstadoUfService mpService;
	@Autowired
	private MpmCidadeService mpmCidadeService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		MpmEstadoUf mpObj = mpService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<MpmEstadoUfDTO>> findAll() {
		List<MpmEstadoUf> list = mpService.findAll();
		List<MpmEstadoUfDTO> listDto = list.stream().map(obj -> 
														new MpmEstadoUfDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}
		
	@RequestMapping(value="/{estadoId}/cidades", method=RequestMethod.GET)
	public ResponseEntity<List<MpmCidadeDTO>> findCidades(@PathVariable Integer estadoId) {
		List<MpmCidade> list = mpmCidadeService.findByMpmEstadoUf(estadoId);
		List<MpmCidadeDTO> listDto = list.stream().map(obj ->
														new MpmCidadeDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}
	
}
