package com.example.demo.student.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.dao.StudentDao;
import com.example.demo.student.model.StudentModel;

@Service
public class StudentService implements StudentInterface {

	
	@Autowired
	StudentDao studentDao;
	
	
	@Override
	public Iterable<StudentModel> getStudents() {

		return studentDao.findAll();
	}

	@Override
	public StudentModel saveStudents(StudentModel studentModel) {

		return studentDao.save(studentModel);
	}

	@Override
	public StudentModel updateStudents(StudentModel studentModel) {

		return studentDao.save(studentModel);
	}

	@Override
	public String deleteStudents(StudentModel studentModel) {
		studentDao.delete(studentModel);
		return "record deleted";
	}
		
//	public List<StudentModel> getUserByCourse(int courseId)
//	{
//		Iterable<StudentModel> selectedCourse =new ArrayList<>();
//		List<StudentModel> finalList=new ArrayList<>();
//		
//		selectedCourse=studentDao.findAll();
//		
//     	for(StudentModel studentModel:selectedCourse)
//	{
//			if(studentModel.getCourseModel().getCourseId()==(courseId))
//			{
//				finalList.add(studentModel);
//			}	
//  }
//  	  CourseModel courseModel =new  CourseModel();
//  	  System.out.println(courseModel.toString());
//  	  
//		return finalList;                      
//	}
//	public List<StudentModel> getUserByClass(int classId){
//		
//		Iterable<StudentModel> ClassSelectList =new ArrayList<>();
//		List<StudentModel> finalClassList=new ArrayList<>();
//		ClassSelectList=studentDao.findAll();
//		for(StudentModel studentModel:ClassSelectList)
//		{
//			if(studentModel.getClassListModel().getClassId()==(classId))
//			{
//				finalClassList.add(studentModel);
//			}
//		}
//		return finalClassList;
//	}
//-------------------------------------------------------------------------------//
	                                    
	public Iterable<StudentModel> FindByCourse(StudentModel studentModel)
	{   
	
		Iterable<StudentModel> courseIdDatas =new ArrayList<>();
	    courseIdDatas =studentDao.findAllBycourseModel(studentModel.getCourseModel());
		return courseIdDatas;		
	
	}
	
	public Iterable<StudentModel> FindByClass(StudentModel studentModel)
{
		Iterable<StudentModel> classIdDatas =studentDao.findAllByclassListModel(studentModel.getClassListModel());
		
		return classIdDatas;
	}
	
	public Iterable<StudentModel> FindBystatus(StudentModel studentModel)
	{
		Iterable<StudentModel> statusId=studentDao.findAllBystatusModel(studentModel.getStatusModel());
		
		return statusId;
		
	}
}
