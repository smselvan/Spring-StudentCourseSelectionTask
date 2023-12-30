package com.example.demo.classlist.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.classlist.model.ClassListModel;

@Repository
public interface ClasslistDao extends CrudRepository<ClassListModel, Integer>{

}
