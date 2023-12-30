package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classlist.model.ClassListModel;
import com.example.demo.classlist.service.ClassListService;

@RestController
public class ClassListController {

	@Autowired
	ClassListService classListService;
	
	
	@GetMapping("/get-all-class-List")
	public Iterable<ClassListModel> getClassList() {
		return classListService.getClassList();
	}
	@PostMapping("/save-class")
	public ClassListModel saveClass(@RequestBody ClassListModel classListModel) {
		return classListService.saveClass(classListModel);
	}
	@PutMapping("/update-class")
	public ClassListModel updateClass(@RequestBody ClassListModel classListModel) {
		return classListService.updateClass(classListModel);
	}
	@DeleteMapping("/delete-class")
	public String deleteClass(@RequestBody ClassListModel classListModel) {
		return classListService.deleteClass(classListModel);
	}
}
