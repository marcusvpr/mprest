package com.mpxds.mprest.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmBancoSistema;
//import com.mpxds.mprest.dto.MpmBancoSistemaDTO;
import com.mpxds.mprest.services.MpmBancoSistemaService;

@RestController
@RequestMapping(value="/mBancoSistemas")
public class MpmBancoSistemaResource {
	//
	@Autowired
	private MpmBancoSistemaService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		MpmBancoSistema mpObj = mpService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
			
//	@RequestMapping(method=RequestMethod.GET)
//	public ResponseEntity<List<MpmBancoSistemaDTO>> findAll() {
//		List<MpmBancoSistema> list = mpService.findAll();
//		List<MpmBancoSistemaDTO> listDto = list.stream().map(obj -> 
//														new MpmBancoSistemaDTO(obj)).collect(Collectors.toList());  
//		return ResponseEntity.ok().body(listDto);
//	}
	
}
