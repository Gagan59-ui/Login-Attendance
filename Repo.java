package com.ihub.www.HomeRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihub.www.Model.Employee;

@Repository

public interface Repo extends CrudRepository<Employee, Integer>
{
	
}
