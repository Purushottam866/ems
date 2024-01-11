package com.planotech.employeemanagement.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Component
@Data
@Entity
public class EmployeeManage 
{
	@Id
	@GeneratedValue(generator = "slno")
	private int id;
	private String username;
	private String email;
	private String password;
	private String conpassword;
	private long phone;
	private String gender;
	private LocalDate dob;
}
