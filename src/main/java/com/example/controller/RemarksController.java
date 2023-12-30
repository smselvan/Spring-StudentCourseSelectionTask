package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.remarks.model.RemarksModel;
import com.example.demo.remarks.service.RemarksService;


@RestController
public class RemarksController {

	@Autowired
	RemarksService remarksService;
	
	
	@PostMapping("/add-remarks")
	public RemarksModel  addRemarks( @RequestBody RemarksModel remarksModel)
	{
		return remarksService.addRemarks(remarksModel);
		
	}
}
