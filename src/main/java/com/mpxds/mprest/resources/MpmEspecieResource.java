package com.mpxds.mprest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmEspecie;
import com.mpxds.mprest.services.MpmEspecieService;

@RestController
@RequestMapping(value="/mEspecies")
public class MpmEspecieResource {
	//
	@Autowired
	private MpmEspecieService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		//
		MpmEspecie mpObj = mpService.buscar(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
		
}
