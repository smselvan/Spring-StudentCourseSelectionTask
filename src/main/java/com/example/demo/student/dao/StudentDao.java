package com.example.demo.student.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.classlist.model.ClassListModel;
import com.example.demo.course.model.CourseModel;
import com.example.demo.status.model.StatusModel;
import com.example.demo.student.model.StudentModel;

@Repository
public interface StudentDao extends CrudRepository<StudentModel, Integer>{
	
	
	Iterable<StudentModel> findAllBycourseModel(CourseModel CourseModel );
	Iterable<StudentModel> findAllByclassListModel(ClassListModel ClassListModel);
	Iterable<StudentModel> findAllBystatusModel(StatusModel statusModel );
}

