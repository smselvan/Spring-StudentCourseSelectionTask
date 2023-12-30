package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.status.model.StatusModel;
import com.example.demo.status.service.StatusService;

@RestController
public class StatusController {

	
	@Autowired
	StatusService statusService;
	
	@GetMapping("/get-status")
	public Iterable<StatusModel> getStatus() {
		return statusService.getStatus();
	}
	@PostMapping("/add-status")
	public StatusModel addStatus(@RequestBody StatusModel statusModel) {
		return statusService.addStatus(statusModel);
	}
}
