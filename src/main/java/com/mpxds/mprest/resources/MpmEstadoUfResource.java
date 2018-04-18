package com.mpxds.mprest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmEstadoUf;
import com.mpxds.mprest.services.MpmEstadoUfService;

@RestController
@RequestMapping(value="/mEstadoUfs")
public class MpmEstadoUfResource {
	//
	@Autowired
	private MpmEstadoUfService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		//
		MpmEstadoUf mpObj = mpService.buscar(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
		
}
