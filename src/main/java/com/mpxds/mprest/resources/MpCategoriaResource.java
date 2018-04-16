package com.mpxds.mprest.resources;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpCategoria;
import com.mpxds.mprest.services.MpCategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class MpCategoriaResource {
	//
	@Autowired
	private MpCategoriaService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		//
		MpCategoria obj = mpService.buscar(id);
		//
		return ResponseEntity.ok().body(obj);
	}
		
}
