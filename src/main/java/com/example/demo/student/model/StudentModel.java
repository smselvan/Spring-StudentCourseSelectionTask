package com.example.demo.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.classlist.model.ClassListModel;
import com.example.demo.course.model.CourseModel;
import com.example.demo.remarks.model.RemarksModel;
import com.example.demo.status.model.StatusModel;

@Entity
@Table(name="student")
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	@ManyToOne
	@JoinColumn(name="courseId")
	private CourseModel courseModel;
	
	@ManyToOne
	@JoinColumn(name="classId")
	private ClassListModel classListModel;
	
	@ManyToOne
	@JoinColumn(name="statusId")
	private StatusModel statusModel;
	
	@ManyToOne
	@JoinColumn(name="remarkId")
	private RemarksModel remarksModel;

	public StudentModel(int id, String name, CourseModel courseModel, ClassListModel classListModel,
			StatusModel statusModel, RemarksModel remarksModel) {
		super();
		this.id = id;
		this.name = name;
		this.courseModel = courseModel;
		this.classListModel = classListModel;
		this.statusModel = statusModel;
		this.remarksModel = remarksModel;
	}

	public StudentModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseModel getCourseModel() {
		return courseModel;
	}

	public void setCourseModel(CourseModel courseModel) {
		this.courseModel = courseModel;
	}

	public ClassListModel getClassListModel() {
		return classListModel;
	}

	public void setClassListModel(ClassListModel classListModel) {
		this.classListModel = classListModel;
	}

	public StatusModel getStatusModel() {
		return statusModel;
	}

	public void setStatusModel(StatusModel statusModel) {
		this.statusModel = statusModel;
	}

	public RemarksModel getRemarksModel() {
		return remarksModel;
	}

	public void setRemarksModel(RemarksModel remarksModel) {
		this.remarksModel = remarksModel;
	}
	
	
	
}