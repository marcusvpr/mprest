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
import com.mpxds.mprest.model.dto.MpmCidadeDTO;
import com.mpxds.mprest.services.MpmCidadeService;

@RestController
@RequestMapping(value="/mCidades")
public class MpmCidadeResource {
	//
	@Autowired
	private MpmCidadeService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		MpmCidade mpObj = mpService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
			
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<MpmCidadeDTO>> findAll() {
		List<MpmCidade> list = mpService.findAll();
		List<MpmCidadeDTO> listDto = list.stream().map(obj -> 
														new MpmCidadeDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}
	
}
