package com.planotech.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController 
{
	@GetMapping("/")
	public String loadHome()
	{
		return "Home";
	}
	@GetMapping("signup")
	public String loadSignup()
	{
		return "Signup";
	}
}
