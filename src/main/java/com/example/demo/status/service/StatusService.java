package com.example.demo.status.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.status.dao.StatusDao;
import com.example.demo.status.model.StatusModel;
@Service
public class StatusService implements StatusInterface{

	
	
	@Autowired
	StatusDao  statusDao;
	
	
	@Override
	public Iterable<StatusModel> getStatus() {

		return statusDao.findAll();
	}

	@Override
	public StatusModel addStatus(StatusModel statusModel) {

		return statusDao.save(statusModel);
	}
	

}
