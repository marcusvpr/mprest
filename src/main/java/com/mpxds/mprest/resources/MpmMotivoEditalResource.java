package com.mpxds.mprest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpxds.mprest.domain.MpmMotivoEdital;
import com.mpxds.mprest.services.MpmMotivoEditalService;

@RestController
@RequestMapping(value="/mMotivoEditals")
public class MpmMotivoEditalResource {
	//
	@Autowired
	private MpmMotivoEditalService mpService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findId(@PathVariable Integer id) {
		//
		MpmMotivoEdital mpObj = mpService.buscarId(id);
		//
		return ResponseEntity.ok().body(mpObj);
	}
		
}
