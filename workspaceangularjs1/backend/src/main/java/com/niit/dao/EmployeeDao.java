package com.niit.dao;

import java.util.List;

import com.niit.model.Employee;

public interface EmployeeDao {
List<Employee> getAllEmployees();
public void addEmployee(Employee employee);
}