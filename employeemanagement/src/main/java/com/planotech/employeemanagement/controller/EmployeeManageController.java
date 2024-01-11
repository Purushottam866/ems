package com.planotech.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.planotech.employeemanagement.dto.EmployeeManage;
import com.planotech.employeemanagement.service.EmployeeManageService;

@Controller
@RequestMapping("/employee")
public class EmployeeManageController 
{
	@Autowired
	EmployeeManageService manageService;
	
	@Autowired
	EmployeeManage employeeManage;
	
	@PostMapping("/signup")
	public String signup(EmployeeManage employeeManage,ModelMap map)
	{
		return manageService.signup(employeeManage, map);
	}
}
