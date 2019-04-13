package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Employee;
import com.main.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	EmpRepository empRepo;
	
	public List<Employee> getAllEmployee()
	{
		return empRepo.findAll();
	}
	
}
