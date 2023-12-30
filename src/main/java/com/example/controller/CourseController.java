package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.model.CourseModel;
import com.example.demo.course.service.CourseService;


@RestController
public class CourseController {

	
	@Autowired 
	CourseService courseService;
	
	@GetMapping("/get-all-course")
	public Iterable<CourseModel> getAllCourse() {
		return courseService.getAllCourse();
	}
	
	
	@PostMapping("/save-course")
	public CourseModel addCourse(@RequestBody CourseModel courseModel) {
		return courseService.addCourse(courseModel);
	}
	
	@DeleteMapping("/delete-course")
	public String daleteCourse(@RequestBody CourseModel courseModel) {
		return courseService.daleteCourse(courseModel);
	}	

	
	
}
