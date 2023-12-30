package com.example.demo.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.course.dao.CourseDao;
import com.example.demo.course.model.CourseModel;


@Service
public class CourseService implements CourseInterface{

	
	@Autowired
	CourseDao courseDao;
	
	
	@Override
	public Iterable<CourseModel> getAllCourse() {

		return courseDao.findAll();
	}

	@Override
	public CourseModel addCourse(CourseModel courseModel) {

		return courseDao.save(courseModel);
	}

	@Override
	public String daleteCourse(CourseModel courseModel) {
		courseDao.delete(courseModel);
		return "Course Deleted";
	}

}
