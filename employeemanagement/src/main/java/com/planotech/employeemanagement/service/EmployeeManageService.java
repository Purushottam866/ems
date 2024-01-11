package com.planotech.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.planotech.employeemanagement.dao.EmployeeManageDao;
import com.planotech.employeemanagement.dto.EmployeeManage;

@Service
public class EmployeeManageService 
{
	@Autowired
	EmployeeManageDao manageDao;
	
	public String signup(EmployeeManage employeeManage,ModelMap map)
	{
		List<EmployeeManage> oldemp = manageDao.findByEmailAndPhone(employeeManage.getEmail(), employeeManage.getPhone());
		System.out.println(oldemp);
		if(!oldemp.isEmpty())
		{
			map.put("fail", "Account Already Exixst");
			return "Signup";
		}
		else
		{
			manageDao.save(employeeManage);
			return "Login";
		}
	}
}
