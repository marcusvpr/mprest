package com.mpxds.mprest.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmAgencia;
//import com.mpxds.mprest.dto.MpmAgenciaDTO;
import com.mpxds.mprest.services.MpmAgenciaService;

@RestController
@RequestMapping(value="/mAgencias")
public class MpmAgenciaResource {
	//
	@Autowired
	private MpmAgenciaService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		MpmAgencia mpObj = mpService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
			
//	@RequestMapping(method=RequestMethod.GET)
//	public ResponseEntity<List<MpmAgenciaDTO>> findAll() {
//		List<MpmAgencia> list = mpService.findAll();
//		List<MpmAgenciaDTO> listDto = list.stream().map(obj -> 
//														new MpmAgenciaDTO(obj)).collect(Collectors.toList());  
//		return ResponseEntity.ok().body(listDto);
//	}
	
}
