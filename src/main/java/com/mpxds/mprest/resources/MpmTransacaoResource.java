package com.mpxds.mprest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmTransacao;
import com.mpxds.mprest.services.MpmTransacaoService;

@RestController
@RequestMapping(value="/mTransacaos")
public class MpmTransacaoResource {
	//
	@Autowired
	private MpmTransacaoService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		MpmTransacao mpObj = mpService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
		
}
