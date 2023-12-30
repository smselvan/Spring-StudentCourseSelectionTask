package com.example.demo.classlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.classlist.dao.ClasslistDao;
import com.example.demo.classlist.model.ClassListModel;


@Service
public class ClassListService implements ClassListInterface{

	
	@Autowired
	ClasslistDao classlistDao;
	
	
	@Override
	public Iterable<ClassListModel> getClassList() {

		return classlistDao.findAll();
	}

	@Override
	public ClassListModel saveClass(ClassListModel classListModel) {

		return classlistDao.save(classListModel);
	}

	@Override
	public ClassListModel updateClass(ClassListModel classListModel) {

		return classlistDao.save(classListModel);
	}

	@Override
	public String deleteClass(ClassListModel classListModel) {

		classlistDao.delete(classListModel);
		
		return "RECORD DELETED";
	}

}
