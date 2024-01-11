package com.planotech.employeemanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.planotech.employeemanagement.dto.EmployeeManage;
import com.planotech.employeemanagement.repository.EmployeeManageRepository;

@Component
public class EmployeeManageDao
{
	@Autowired
	EmployeeManageRepository manageRepository;
	
	public List<EmployeeManage> findByEmailAndPhone(String email,long phone)
	{
		return manageRepository.findByEmailAndPhone(email,phone);
	}
	
	public void save(EmployeeManage employeeManage)
	{
		manageRepository.save(employeeManage);
	}
}
