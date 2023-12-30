package com.example.demo.student.service;

import com.example.demo.student.model.StudentModel;

public interface StudentInterface {
	public Iterable<StudentModel > getStudents();
	public StudentModel saveStudents(StudentModel studentModel);
	public StudentModel updateStudents(StudentModel studentModel);
	public String deleteStudents(StudentModel studentModel);
}
