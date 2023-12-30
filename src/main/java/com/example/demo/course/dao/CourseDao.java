package com.example.demo.course.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.course.model.CourseModel;

@Repository
public interface CourseDao extends CrudRepository<CourseModel, Integer>{

}
