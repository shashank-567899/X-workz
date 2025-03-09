package com.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.GST;
import com.java.service1.GSTService;

@RestController
@RequestMapping("/api/GST")
public class GSTController {
	
	private GSTService gstService;

	public GSTController(GSTService gstService) {
		super();
		this.gstService = gstService;
	}
	
	@PostMapping
	public ResponseEntity<GST> save(@RequestBody GST gst)
	{
		return new ResponseEntity<GST>(gstService.save(gst),HttpStatus.CREATED);
	}
	
	
	

}
