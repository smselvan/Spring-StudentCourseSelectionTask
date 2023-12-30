package com.example.demo.classlist.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.student.model.StudentModel;


@Entity
@Table(name="Class_List")
public class ClassListModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int classId;
	String className;
	
	@OneToMany(mappedBy = "classListModel",cascade = CascadeType.ALL)
	private List<StudentModel> studentModels;
	
	public ClassListModel() {
		super();
	}

	public ClassListModel(int classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClass_Name(String className) {
		this.className = className;
	}
	
}
