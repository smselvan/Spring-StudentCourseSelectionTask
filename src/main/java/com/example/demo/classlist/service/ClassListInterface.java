package com.example.demo.classlist.service;

import com.example.demo.classlist.model.ClassListModel;

public interface ClassListInterface {

	public Iterable<ClassListModel> getClassList();
	public ClassListModel saveClass(ClassListModel classListModel);
	public ClassListModel updateClass(ClassListModel classListModel);
	public String deleteClass(ClassListModel classListModel);
}
