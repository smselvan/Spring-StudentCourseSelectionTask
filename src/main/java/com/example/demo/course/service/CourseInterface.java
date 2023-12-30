package com.example.demo.course.service;

import com.example.demo.course.model.CourseModel;

public interface CourseInterface {

	public Iterable<CourseModel> getAllCourse();
	public CourseModel addCourse(CourseModel courseModel);
	public String daleteCourse(CourseModel courseModel);
	
	
}
