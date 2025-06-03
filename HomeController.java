package com.ihub.www.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihub.www.HomeService.HomeService;
import com.ihub.www.Model.Employee;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee e)
	{
		return hs.addEmp(e);
	}
}
