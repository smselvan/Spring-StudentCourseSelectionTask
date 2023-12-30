package com.example.demo.remarks.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.remarks.dao.RemarksDao;
import com.example.demo.remarks.model.RemarksModel;

@Service
public class RemarksService {

	
	@Autowired
	RemarksDao remarksDao;
	
	
	public RemarksModel  addRemarks(RemarksModel remarksModel)
	{
         return remarksDao.save(remarksModel);
	
	}
	
	
	
}
