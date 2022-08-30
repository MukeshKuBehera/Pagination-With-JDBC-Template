package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.IStudentService;


@RestController
public class StudentController {
	
	
	@Autowired
	private IStudentService stdservice;
	
	@GetMapping("student/{pageNo}/{pageSize}")
	public List<Student> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		
		
		return stdservice.findpaginated(pageNo,pageSize);
		
	}

}
