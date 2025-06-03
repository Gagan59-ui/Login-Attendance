package com.ihub.www.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihub.www.HomeRepo.Repo;
import com.ihub.www.Model.Employee;

@Service
public class HomeService 
{
	@Autowired
	Repo r;
	public Employee addEmp(Employee e)
	{
		return r.save(e);
	}
}
