package com.example.demo.status.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.status.model.StatusModel;

@Repository
public interface StatusDao extends CrudRepository<StatusModel, Integer>{

}
