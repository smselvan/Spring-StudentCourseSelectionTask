package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.model.StudentModel;
import com.example.demo.student.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/get-students")
	public Iterable<StudentModel > getStudents() {
		return studentService.getStudents();
	}
	
	@PostMapping("/save-student")
	public StudentModel saveStudents(@RequestBody StudentModel studentModel) {
		return studentService.saveStudents(studentModel);
	}
	
	
	@PutMapping("/update-student")
	public StudentModel updateStudents(@RequestBody StudentModel studentModel) {
		return studentService.updateStudents(studentModel);
	}
	
	
	@DeleteMapping("/delete-student")
	public String deleteStudents(@RequestBody StudentModel studentModel) {
		return studentService.deleteStudents(studentModel);
	}
	
	
//	@GetMapping("/get-student-by-course")
//	public List<StudentModel> getUserByCourse(int courseId)
//	{
//		return studentService.getUserByCourse(courseId);
//		
//	}
//	
//	
//	@GetMapping("/get-student-by-class")
//	public List<StudentModel> getUserByClass(int classId)
//	{
//		return studentService.getUserByClass(classId);
//		
//	}
	
	
	@GetMapping("/find-by-course")
	public Iterable<StudentModel> FindByCourse(@RequestBody StudentModel studentModel)
	{
		return studentService.FindByCourse(studentModel);
		
	}
	
	@GetMapping("/find-by-class")
	public Iterable<StudentModel> FindByClass(@RequestBody StudentModel studentModel)
	{
		return studentService.FindByClass(studentModel);	 
	}

	
	@GetMapping("/find-by-status")
	public Iterable<StudentModel> FindByStatus(@RequestBody StudentModel studentModel)
	{
		return studentService.FindBystatus(studentModel);
	}
}
