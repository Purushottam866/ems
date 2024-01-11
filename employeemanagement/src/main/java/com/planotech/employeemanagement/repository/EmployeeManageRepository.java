package com.planotech.employeemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planotech.employeemanagement.dto.EmployeeManage;

@Repository
public interface EmployeeManageRepository extends JpaRepository<EmployeeManage, Integer>
{

	List<EmployeeManage> findByEmailAndPhone(String email, long phone);
	
}
