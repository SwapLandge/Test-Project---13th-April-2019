package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Employee;
import com.main.service.EmpService;

@RestController
public class MainController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("home")
	public String home()
	{
		return "Welcome to String Boot application";
	}
	
	@RequestMapping("getAll")
	public List<Employee> getAllEmp()
	{
		return empService.getAllEmployee();
	}
	
	@RequestMapping("getAllStatic")
	public List<Employee> getAllStatic()
	{
		return getAllEmpStatic();
	}
	private List<Employee> getAllEmpStatic()
	{
		List<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee(12,"Swapnali Landge",25000,"CSE");
		Employee e2 = new Employee(34,"Sonali Landge",64000,"IT");
		Employee e3 = new Employee(23,"Gaurav Tawale",34000,"Computer");
		Employee e4 = new Employee(87,"Komal Gaware",50000,"Mechanical");
		Employee e5 = new Employee(23,"Kavya Landge",67000,"Computer");
		emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);emp.add(e5);
		return emp;
	}

}
