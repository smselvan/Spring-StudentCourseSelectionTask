package com.example.demo.status.service;

import com.example.demo.status.model.StatusModel;

public interface StatusInterface {
	
	
	public Iterable<StatusModel> getStatus();
	public StatusModel addStatus(StatusModel statusModel);
	
}
