package com.example.demo.status.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.student.model.StudentModel;
@Entity
@Table(name="status")
public class StatusModel {

	@Id
	private int statusId;
	private String stetusName;
	
	
	@OneToMany(mappedBy = "statusModel",cascade = CascadeType.ALL)
	private  List<StudentModel> studentModels;
	
	
	public StatusModel(int statusId, String stetusName) {
		super();
		this.statusId = statusId;
		this.stetusName = stetusName;
	}



	public StatusModel() {
		super();
	}



	public int getStatusId() {
		return statusId;
	}



	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}



	public String getStetusName() {
		return stetusName;
	}



	public void setStetusName(String stetusName) {
		this.stetusName = stetusName;
	}
	
	
	
	
}
