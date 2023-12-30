package com.example.demo.remarks.model;

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
@Table(name="Remarks")
public class RemarksModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int remarkId;
	private String Remarks;
	
	
	
	@OneToMany(mappedBy = "remarksModel",cascade = CascadeType.ALL)
	 private  List<StudentModel> studentModels;
	
	
	public int getRemarkId() {
		return remarkId;
	}
	public void setRemarkId(int remarkId) {
		this.remarkId = remarkId;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	public RemarksModel(int remarkId, String remarks) {
		super();
		this.remarkId = remarkId;
		Remarks = remarks;
	}
	
	public RemarksModel() {
		super();
	}
	

	
	
}
