package com.example.demo.remarks.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.remarks.model.RemarksModel;

@Repository
public interface RemarksDao extends CrudRepository<RemarksModel, Integer>{

}
