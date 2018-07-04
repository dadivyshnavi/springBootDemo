package com.charvikent.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charvikent.sample.model.Employee;



@RestController
public class HomeController {
	
	
	
	@RequestMapping(value ="/hi",method=RequestMethod.GET )  // or @GetMapping("/hi")
	public String sayHello()
	{
		
		String str="Hello";
		
		
		return str;
		
	}
	
	/*@GetMapping("/jsp") // or @GetMapping("/hi")
	public String showJsp()
	{
		//System.out.println("hello jsp block");
		
		return "home";
		
	}*/
	
	
	
	
	@GetMapping("*")
	public String error404()
	{
		
		String str="invalid url";
		
		
		return str;
		
	}
	
	@GetMapping("/employeedetails")
	public Employee showEmployee()
	{
		Employee emp1=new Employee();
		
		emp1.setId(1);
		emp1.setName("harsha");
		emp1.setSalary(10000);
		emp1.setDesignation("tester");
		
	
		
		
		return emp1;
		
		
		
		
	}
	
	@GetMapping("/employeelist")
	public List<Employee> showEmployeelist()
	{
		List<Employee> list=new ArrayList<Employee>();
		
Employee emp1=new Employee();
		
		emp1.setId(1);
		emp1.setName("harsha");
		emp1.setSalary(10000);
		emp1.setDesignation("tester");
		
Employee emp2=new Employee();
		
		emp2.setId(2);
		emp2.setName("reena");
		emp2.setSalary(11000);
		emp2.setDesignation("Developer");
		
		
Employee emp3=new Employee();
		
		emp3.setId(3);
		emp3.setName("manasa");
		emp3.setSalary(12000);
		emp3.setDesignation("Developer");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		return list;
		
		
		
		
	}
	
	
	

}
