package com.example.demo.course.model;

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
@Table(name="Course")
public class CourseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int courseId;
	String courseName;
	
	@OneToMany(mappedBy = "courseModel",cascade = CascadeType.ALL)
	 private  List<StudentModel> studentModels;
	
	
	public int getCourseId() 
	{
		return courseId;
	}
	public void setCourseId(int courseId) 
	{
		this.courseId = courseId;
	}
	public String getCourseName() 
	{
		return courseName;
	}
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
	public CourseModel(int courseId, String courseName) 
	{
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public CourseModel() 
	{
		super();
	}
	
	@Override
	public String toString() {
		return "CourseModel [courseId=" + courseId + ", courseName=" + courseName + ", studentModels=" + studentModels
				+ "]";
	}
	
	
	



}
